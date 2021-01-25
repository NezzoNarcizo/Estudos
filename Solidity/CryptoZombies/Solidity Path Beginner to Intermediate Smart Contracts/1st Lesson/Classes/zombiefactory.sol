//The solidity version of our contract, this information is to prevent issues with another compiler version
pragma solidity ^0.4.19;

//Name of contract
contract ZombieFactory {

	/*
		Events are way to show messages communicate what happened on the blockchain
		to the front end of your application
		
		Your application front end could listen for the event
		
		We'll declare a event to show to the user(msg.sender) every time a new zombie was created
		
		Our event have 3 Attributes to identify the zombie haas been create
	*/
	event NewZombie(uint zombieId, string name, uint dna);

	/*
		The uint variables cannot be negative, they are "unsigned integer"
		Our Zombie is going to be determined by a 16-digit number
		Lets create a variable dnaDigits with value 16
	*/
	uint dnaDigits = 16;
    
	/*
		Solidity operations are the same as in most programming languages
		Exponencial operators can be represented by "^" or "**"
		
		To make sure our Zombie's DNA is only 16 characters, let's make another uint equal to 10^16. 
		That way we can later use the modulus operator % to shorten an integer to 16 digits.
	*/
	uint dnaModulus = 10 ** dnaDigits;

    
	/*
		Structs look like objects, they are more complex that allow create data types with multiple properties.
		
		Strings are UTF-8 data, Strings are used for arbitrary-length
		
		We want create some zombies, thats why we are use the Struct
		Our zombies may have two attributes, name and dna
	*/
	struct Zombie {
		string name;
		uint dna;
	}
	
    
	/*
		There are two types of array in Solidity: fixed and Dynamic
		In the first we decided the length of him, in the second we can continue increasing as we need
		If declare him as public another contracts can read it but not change the array and Solidity will automatically create a getter
		
		We want an army of zombies and show our zombies to another contracts
		So lets create a public array of Zombie (struct)
		
	*/
	Zombie[] public zombies;

    
	/*
		Functions in Solidity are public by default
		A function declaration in solidity looks like the following
		
		We can call the function like so: _createZombie(string, uint)
		
		Inside the function we call the Function NewZombie to create a zombie
		
		We'll see how add zombies to our array
		
		Note thet array.push() will add new zombie to the end of the array
		
		If our function has a return must be declare after the acessibility and 
		the typ of return too
		
		arrayPush() returns a uint with the new length of array
		
		In the body of function we add a new attribute to make every zombie a unique zombie and call the event "NewZombie()"
	*/
	function _createZombie(string _name, uint _dna) private {
        
		uint id = zombies.push(Zombie(_name, _dna)) - 1;

    		NewZombie(id, _name, _dna);
	} 

    
	/*
	When the function doesnt change anything in your contract you may declare it as "view"
	As following, this function only shows a information, so has been declared as view
	
	Functions can be declare as "pure" in place of "view" too, it means that we will not access nor read any data in contract
	it is a function just to external use
	
	The following is a function that create a zombie based on name that we choose
	it generate a random dna 
	
	The Ethereum has the hash function keccak256() that maps an input string into a random 256-bit hexidecimal number
	
	If you change any character in the string it will change drastically the number that function will generate
	
	The function keccak256() is inside the uint() to casting
	
	After this we'll make send a return, and we want a dna with 16 digits only, so we can use modulus to exclude the leftover
	*/
	function _generateRandomDna(string _str) private view returns (uint) {
        
		uint rand = uint(keccak256(_str));
        
		return rand % dnaModulus;
    
	}	

    
	/*
		The Following function call the _generateRandomDna() with the name that owner(msg.sender) choose
		The return we put into a variable tha will be use to create the new zombie with the dna generated based on name
		Using the private function _createZombie(string, uint)
	*/
	function createRandomZombie(string _name) public {
        
		uint randDna = _generateRandomDna(_name);
        
		_createZombie(_name, randDna);
    
	}


}

//Link permanente do meu Zombie: https://share.cryptozombies.io/en/lesson/1/share/Marlon?id=YXV0aDB8NWIyODBhNGZjMWFlODQyYTQ1NDkyYzIx