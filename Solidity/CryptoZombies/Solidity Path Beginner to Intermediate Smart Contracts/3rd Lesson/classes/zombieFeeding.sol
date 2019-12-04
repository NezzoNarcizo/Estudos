pragma solidity ^0.4.19;

import "./zombiefactory.sol";

contract KittyInterface {
  function getKitty(uint256 _id) external view returns (
    bool isGestating,
    bool isReady,
    uint256 cooldownIndex,
    uint256 nextActionAt,
    uint256 siringWithId,
    uint256 birthTime,
    uint256 matronId,
    uint256 sireId,
    uint256 generation,
    uint256 genes
  );
}

/*
	As our zombieFeeding class inherits zombieFactory, and zombie Factory inherits ownable, 
	consequently zombieFeeding will inherit ownable.
*/

contract ZombieFeeding is ZombieFactory {
	/*
		Adding a way to change the address of the contract if you discover errors after uploading the contract to the 
		blockchain, since we can not change the contract after it is already there.
	*/

  // 1. Remove this:
  //address ckAddress = 0x06012c8cf97BEaD5deAe237070F9587f8E7A266d;
  
  // 2. Change this to just a declaration:
  //KittyInterface kittyContract = KittyInterface(ckAddress);
  KittyInterface kittyContract;

  // 3. Add setKittyContractAddress method here
  function setKittyContractAddress(address _address) external onlyOwner{
    kittyContract = KittyInterface(_address);
  }

  // 1. Define `_triggerCooldown` function here
  function _triggerCooldown(Zombie storage _zombie) internal {
      _zombie.readyTime = uint32(now + cooldownTime);
  }   
  
  // 2. Define `_isReady` function here
  function _isReady(Zombie storage _zombie) internal view returns (bool){
      return (_zombie.readyTime <= now);
  }
  
  // 1. Make this function internal so that the contract is more secure. We don't want users to be able to call this function with any DNA they want.
  function feedAndMultiply(uint _zombieId, uint _targetDna, string _species) internal {
    require(msg.sender == zombieToOwner[_zombieId]);
    Zombie storage myZombie = zombies[_zombieId];
	
	// 2. Add a check for `_isReady` here
    require(_isReady(myZombie));
	
    _targetDna = _targetDna % dnaModulus;
    uint newDna = (myZombie.dna + _targetDna) / 2;
	
    if (keccak256(_species) == keccak256("kitty")) {
      newDna = newDna - newDna % 100 + 99;
    }
    _createZombie("NoName", newDna);
	
	// 3. Call `triggerCooldown`
    _triggerCooldown(myZombie);
  }

  function feedOnKitty(uint _zombieId, uint _kittyId) public {
    uint kittyDna;
    (,,,,,,,,,kittyDna) = kittyContract.getKitty(_kittyId);
    feedAndMultiply(_zombieId, kittyDna, "kitty");
  }

}