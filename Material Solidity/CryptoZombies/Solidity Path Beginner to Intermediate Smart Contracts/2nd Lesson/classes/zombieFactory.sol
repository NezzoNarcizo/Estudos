pragma solidity ^0.4.19;

/*
	The Ethereum blockchin is made up of accounts, and each account has an address, for example: 0x0cE446255506E92DF41614C46F1d6df9Cc969183 (Crypto Zombies Account)
	We can usa every address in the blockchain as a identify users, becausa they are unique
*/
contract ZombieFactory {

    event NewZombie(uint zombieId, string name, uint dna);

    uint dnaDigits = 16;
    uint dnaModulus = 10 ** dnaDigits;

    struct Zombie {
        string name;
        uint dna;
    }

    Zombie[] public zombies;
	
	/*
		Mapping is another way to store data
		We can look up data through a key
		The first argument is the key, the second is the value
		
		As following the first mapping is a map to relate zombies to a addresses
		the second map is to know how many zombies each addresses have
	*/
    mapping (uint => address) public zombieToOwner;
    mapping (address => uint) ownerZombieCount;

	/*
		msg.sender refers to a account of a real user, this global variable receive the address of user in the blockchain
		
		Note: In Solidity, function execution always needs to start with an external caller. A contract will just sit on the blockchain 
		doing nothing until someone calls one of its functions. So there will always be a msg.sender
		
		In addition to public and private, Solidity has two more types of visibility for functions: internal and external.
		internal is the same as private, except that it's also accessible to contracts that inherit from this contract. (Hey, that sounds like what we want here!).
		external is similar to public, except that these functions can ONLY be called outside the contract — they can't be called by other functions inside that contract. 
		We'll talk about why you might want to use external vs public later.
	*/
    function _createZombie(string _name, uint _dna) internal {
		//Here we receive a id for each one zombie was created
        uint id = zombies.push(Zombie(_name, _dna)) - 1;
		//Now we give a this zombie a owner whos call the function createZombie
        zombieToOwner[id] = msg.sender;
		//In next line we add "more one" for the total of zombies that this owner has
        ownerZombieCount[msg.sender]++;
		//Now we call the event to inform to the front end that a new zombie was created
        NewZombie(id, _name, _dna);
    }

    function _generateRandomDna(string _str) private view returns (uint) {
        uint rand = uint(keccak256(_str));
        return rand % dnaModulus;
    }
	
	/*
		The metod require() is a pre condition
		If this condition is not met the function will throw an error and stop executing
	*/
    function createRandomZombie(string _name) public {
		//In this case to create a zombie the msg.sender cannot have any other in your account
        require(ownerZombieCount[msg.sender] == 0);
        uint randDna = _generateRandomDna(_name);
        randDna = randDna - randDna % 100;
        _createZombie(_name, randDna);
    }

}
