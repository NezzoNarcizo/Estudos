// Start here
//Declaration of solidity version
pragma solidity ^0.4.25;

import "./zombieattack.sol";
import "./erc721.sol";
import "./safeMath.sol";

/// @title E.g. A contract that manages transfering zombie ownership
/// @author Marlon A. N. Narcizo
/// @dev E.g. Compliant with OpenZeppelin's implementation of the ERC721 spec draft

//Multiple Inheritance separated with a comma
contract ZombieOwnership is ZombieAttack, ERC721{
	
	//Define mapping 'zombieApprovals' here
	mapping (uint => address) zombieApprovals;
	
	//The keyword 'using' which automatically tacks on all of the library's methods to another data type
	using SafeMath for uint256;
	
	function balanceOf(address _owner) external view returns (uint256) {
		//Return the number of zombies `_owner` has here
		return ownerZombieCount[_owner];
	}

	function ownerOf(uint256 _tokenId) external view returns (address) {
		//Return the owner of `_tokenId` here
		return zombieToOwner[_tokenId];
	}

	// Define _transfer() here
	function _transfer(address _from, address _to, uint256 _tokenId) private {
		//increment ownerZombieCount for the person receiving the zombiefire
		ownerZombieCount[_to] = ownerZombieCount[_to].add(1);
		//decrease the ownerZombieCount for the person sending the zombie
		ownerZombieCount[_from] = ownerZombieCount[from].sub(1);
		//mapping for this _tokenId so it now points to _to
		zombieToOwner[_tokenId] = _to;
		/*The ERC721 spec includes a Transfer event. The last line of this function should fire Transfer with the correct information.
		The Keyword to fire the event is 'emit'*/
		emit Transfer(_from, _to, _tokenId);
	}
	
	
	function transferFrom(address _from, address _to, uint256 _tokenId) external payable {
		//Add the require statement here verifying if who calls 'transferFrom' is the ownership or the approved address
		require (zombieToOwner[_tokenId] == msg.sender  || zombieApprovals[_tokenId] == msg.sender);
		//Call the function _transfer to finalize the transaction
		_transfer(_from, _to, _tokenId);
	}

	//Making sure that only the owner of token can give someone approval to take it with the call of modifier
	function approve(address _approved, uint256 _tokenId) external payable onlyOwnerOf(_tokenId){
		//Defining the approval to take the token/zombie
		zombieApprovals[_tokenId] = _approved;
		//Fire the event Approval, another native method of erc721 spec
		emit Approval(msg.sender, _approved, _tokenId);
	}

}