/**
 * Class: B.Sc. in Computing
 * Instructor: Maria Boyle
 * Description: Models a CreditCard
 * Date: dd/mm/yyyy
 * @author Maria Boyle
 * @version 1.0
**/
package ie.lyit.hotel;

public class CreditCard {
	private long number;
	private Date expiryDate;
	private int securityCode;

	// No default constructor to prevent user creating a null CreditCard

	// Initialization Constructor
	// ==> Called when a CreditCard object is created as follows - 
	//       CreditCard cc = new CreditCard(1111222233334444L,
	//                                      new Date(30,9,2025),
	//                                      123);	
	public CreditCard(long number, Date expiryDate, int securityCode){
	   this.number = number;
	   this.expiryDate = expiryDate;
	   this.securityCode = securityCode;
	}

	// toString()-returns number only
	@Override
	public String toString() {
		return "" + number;
	}

	// equals()-compares numbers only
	@Override
	public boolean equals(Object obj) {
		CreditCard ccObject;
		if (obj instanceof CreditCard)
		   ccObject = (CreditCard)obj;
		else
		   return false;

		return number == ccObject.number;
	}
	
	// No set() methods-prevents user re-setting instance variables
	// You shouldn't be able to reset a CreditCard number for example
	
	// get() methods
	public long getNumber() {
		return number;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public int getSecurityCode() {
		return securityCode;
	}
}