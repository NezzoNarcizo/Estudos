pragma solidity ^0.4.25;

import "./zombiefeeding.sol";

contract ZombieHelper is ZombieFeeding {

  // Start here
  modifier aboveLevel(uint _level, uint _zombieId){
    require(zombies[_zombieId].level >= _level);
    _;   
  }
  
  // Start here function to change name if level is equal or bigger than 2
  function changeName(uint _zombieId, string _newName) external aboveLevel(2, _zombieId){
    require(msg.sender == zombieToOwner[_zombieId]);    
    zombies[_zombieId].name = _newName;
  }

  // Start here function to change DNA if level is equal or bigger than 20
  function changeDna(uint _zombieId, uint _newDna) external aboveLevel(20, _zombieId){
    require(msg.sender == zombieToOwner[_zombieId]);
    zombies[_zombieId].dna = _newDna;
  }
  
  // Create your function getZombiesByOwner here
  function getZombiesByOwner(address _owner) external view returns (uint[]){
	// Start here the body of function
    uint[] memory result = new uint[](ownerZombieCount[_owner]);
	
	/* Start here syntax of loop function by writing a for loop that iterates through all the zombies in our DApp, compares their owner to see if we have a match,
    and pushes them to our result array before returning it.*/
	uint counter = 0;
    for(uint i = 0; i < zombies.length; i++){
      if(zombieToOwner[i] == _owner){
        result[counter] = i;
		counter++;
	  }
    }
	
    return result;
  }
  
}

