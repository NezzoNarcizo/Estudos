pragma solidity ^0.4.19;

/*
	We want only one person to be able to change the contract and allow that person to give permission to another 
	when he wants. Therefore, we have implemented a contract of the type "Ownable" and we use its methods, causing 
	the classes of our program to inherit.
*/

// 1. Import here
import "./ownable.sol";
// 2. Inherit here:
contract ZombieFactory is Ownable{

    event NewZombie(uint zombieId, string name, uint dna);

    uint dnaDigits = 16;
    uint dnaModulus = 10 ** dnaDigits;
	uint cooldownTime = 1 days;

	//We'll addict two new fields to our struct of zombies, the first is the level of zombie and the seconte is a cooldown to limit how often a zombie can feed
    struct Zombie {
        string name;
        uint dna;
		//add new data here
		uint32 level;
		uint32 readyTime;
		/*
			(uint32) 32 bits is more than enough to hold the zombie's level and timestamp
			This will save us some gas costs bu packing the data ore tightly tha using a regular uint (256-bits)
		*/
    }

    Zombie[] public zombies;

    mapping (uint => address) public zombieToOwner;
    mapping (address => uint) ownerZombieCount;

    function _createZombie(string _name, uint _dna) internal {
		 // 2. Update the following line with Zombie initial level and cooldownTime to feed or atack:
        uint id = zombies.push(Zombie(_name, _dna, 1, uint32(now + cooldownTime))) - 1;
        zombieToOwner[id] = msg.sender;
        ownerZombieCount[msg.sender]++;
        NewZombie(id, _name, _dna);
    }

    function _generateRandomDna(string _str) private view returns (uint) {
        uint rand = uint(keccak256(_str));
        return rand % dnaModulus;
    }

    function createRandomZombie(string _name) public {
        require(ownerZombieCount[msg.sender] == 0);
        uint randDna = _generateRandomDna(_name);
        randDna = randDna - randDna % 100;
        _createZombie(_name, randDna);
    }

}