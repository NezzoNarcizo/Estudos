pragma solidity ^0.4.25;

import "./zombiehelper.sol";

contract ZombieAttack is ZombieHelper {
  //The parameter that makes the function randMod() brings differents outcomes each turn
  uint randNonce = 0;
  //attackVictoryProbability here
  uint attackVictoryProbability = 70;

  //Random number function
  function randMod(uint _modulus) internal returns(uint){
      randNonce = randNonce.add(1);
      return uint(keccak256(abi.encodePacked(now, msg.sender, randNonce))) % _modulus;
  }
  
  // Function attack that calculate the probability of win or lose
  // The 'ownerOf' is making sure the caller owns _zombieId.
  function attack(uint _zombieId, uint _targetId) external ownerOf(_zombieId){
	//Storage pointer to both zombies so we can more easily interact with them
    Zombie storage myZombie = zombies[_zombieId];
	Zombie storage enemyZombie = zombies[_targetId];
	//To define the outcome of our battle
	uint rand = randMod(100);
	
	//if statment that checks if rand is less than or equal to attackVictoryProbability
	if(rand <= attackVictoryProbability){
		myZombie.winCount = myZombie.winCount.add(1);
		myZombie.level = myZombie.level.add(1);
		enemyZombie.lossCount = enemyZombie.lossCount.add(1);
		feedAndMultiply(_zombieId, _enemyZombie.dna, "zombie");
	} else {
		myZombie.lossCount = myZombie.lossCount.add(1);
		enemyZombie.winCount = enemyZombie.winCount.add(1);
		_triggerCooldown(myZombie);
	}
  }
}