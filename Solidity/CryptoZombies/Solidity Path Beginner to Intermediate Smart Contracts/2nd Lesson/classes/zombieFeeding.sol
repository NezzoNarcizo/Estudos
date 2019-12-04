pragma solidity ^0.4.19;

//The keyword "import" serves is to use a specific file in this class
import "./zombiefactory.sol";

/*
	In order to do this we'll need to read the kittyDna from the CryptoKitties smart contract. 
	We can do that because the CryptoKitties data is stored openly on the blockchain. Isn't the blockchain cool?!
	
	Notice that this looks like defining a contract, with a few differences. For one, we're only declaring the functions we want to interact with — in this case getNum — 
	and we don't mention any of the other functions or state variables.
	Secondly, we're not defining the function bodies. Instead of curly braces ({ and }), we're simply ending the function declaration with a semi-colon (;).
	So it kind of looks like a contract skeleton. This is how the compiler knows it's an interface.
	By including this interface in our dapp's code our contract knows what the other contract's functions look like, how to call them, and what sort 
	of response to expect.
*/
contract KittyInterface {
	/*
		We've looked up the CryptoKitties source code for you, and found a function called getKitty that returns all the kitty's data, including its "genes" 
		(which is what our zombie game needs to form a new zombie!).
		The function looks like this:
		
		The function looks a bit different than we're used to. You can see it returns... a bunch of different values. If you're coming from a programming 
		language like Javascript, this is different — in Solidity you can return more than one value from a function.
	*/
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
	Rather than making one extremely long contract, sometimes it makes sense to split your code logic across multiple contracts to organize the code.
	
	Inheritance makes our code more manageable
	With the clause "is" we makes the contract "ZombieFeeding" inherit "ZombieFactory"
	
	Every public function in ZombieFactory can be use in ZombieFeeding, literally a subclass
	As cat is a subclass of animals, we made subclasses of a determined class
*/
contract ZombieFeeding is ZombieFactory {
  /*
	As following, we can interact with any other contract on the Ethereum blockchain using the number of the contract
	if the contract has function or functions that are declared as public or external
	
	In next, we're utilizing the contract of CryptoKitties
  */
  address ckAddress = 0x06012c8cf97BEaD5deAe237070F9587f8E7A266d;
  KittyInterface kittyContract = KittyInterface(ckAddress);

  /*
	In Solidity, there are two places you can store variables — in storage and in memory
	Storage refers to variables stored permanently on the blockchain. Memory variables are temporary, 
	and are erased between external function calls to your contract. Think of it like your computer's hard disk vs RAM
	
	First we'll create a function named feedAndMultiply() with two parameters, _zombieId a uint, and _targtDna a uint too
	The third arguments, named by _species, is the "genes" of our zombie, that make sure what type of zombies we will create
  */
  function feedAndMultiply(uint _zombieId, uint _targetDna, string _species) public {
	  
	/*
		This require make sure that we own this zombie. It compares the msg.sender address with that registered in the mapping zombieToOwner[]
		The order of the elements in the comparison does not matter
	*/
	require(msg.sender == zombieToOwner[_zombieId]);
	
	/*
		We're going to need to get this zombie's DNA
		So lets use a storage pointer
	*/
    Zombie storage myZombie = zombies[_zombieId];
	
	/*
		The formula for calculating a new zombie's DNA is simple: It's simply that average between the feeding zombie's DNA and the target's DNA.
		
		First we need to make sure that _targetDna isn't longer than 16 digits. To do this, we can set _targetDna equal to _targetDna % dnaModulus 
		to only take the last 16 digits.
	*/
    _targetDna = _targetDna % dnaModulus;
	
	/*
		Next our function should declare a uint named newDna, and set it equal to the average of myZombie's DNA and _targetDna (as in the example above).
	*/
    uint newDna = (myZombie.dna + _targetDna) / 2;
	//In this condition we verify if the genes is the kitties gene, if is true, we add the last two digits as 99
    if(keccak256(_species) == keccak256("kitty")){
      newDna = newDna - newDna % 100 + 99;
    }
	/*
		Calling the _createZombie(), with two parameters, the name, a string, and a dna, a uint
		For now our zombie do not have a name
	*/	
	
    _createZombie("NoName", newDna);
  }
  /*
	The next function gets the kitty genes to be use in our contract, that makes our zombies to "feed" of the kitties
	
	It receive two parameters, _zombieId a uint, and another uint, the _kittyId
	This function should be public
	
	Just as the function in the interface returns several values, we can take as many as we want
	
	Note: In our KittyInterface, genes is a uint256 — but if you remember back to lesson 1, uint is an alias for uint256 — they're the same thing.
  */
  function feedOnKitty(uint _zombieId, uint _kittyId) public {
    //Variable declaration to be use in the calling of getKitty()
	uint kittyDna;
	/*
		Here we call the getKitty() function inside the interface kittyContract{}, taking only the value that interests us, which is the kittyDna.
	*/
    (,,,,,,,,,kittyDna) = kittyContract.getKitty(_kittyId);
    /*
		And finally, we call the function feedAndMultiply() to merge the dna of our zombie with the kitties
		We'll send a string with the name "kitty" to the function feedAndMultiply() to knows that is a kitty gene
	*/
    feedAndMultiply(_zombieId, kittyDna, "kitty");
  }

}