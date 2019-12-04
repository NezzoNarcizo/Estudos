pragma solidity ^0.4.25;

import "./zombiefeeding.sol";

contract ZombieHelper is ZombieFeeding {

//Define "levelUpFee" here

//levelUpFee variable declaration
uint levelUpFee = 0.001 ether;


  // Start here level checker
  modifier aboveLevel(uint _level, uint _zombieId){
    require(zombies[_zombieId].level >= _level);
    _;   
  }
  
  // Withdraw function here
  function withdraw() external onlyOwner {
		address _owner =  owner();
		_owner.transfer(address(this).balance);
  }
  
  
  // setLevelUpFee function here
  function setLevelUpFee(uint _fee) external onlyOwner{
	levelUpFee = _fee;
  }
  
  //Function levelUp (fee checker)
  function levelUp(uint _zombieId) external payable {
	require(msg.value == levelUpFee);
	zombies[_zombieId].level++;
}
  
  // Start here function to change name if level is equal or bigger than 2
  function changeName(uint _zombieId, string _newName) external aboveLevel(2, _zombieId) ownerOf(_zombieId){
	//Deleting the following line to add new modifier (ownerOf) to the function
    //require(msg.sender == zombieToOwner[_zombieId]);    
    zombies[_zombieId].name = _newName;
  }

  // Start here function to change DNA if level is equal or bigger than 20
  function changeDna(uint _zombieId, uint _newDna) external aboveLevel(20, _zombieId) ownerOf(_zombieId){
    //Deleting the following line to add new modifier (ownerOf) to the function
	//require(msg.sender == zombieToOwner[_zombieId]);
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

