/**
 * Class: B.Sc. in Computing
 * Instructor: Maria Boyle
 * Description: Models a Guest
 * Date: dd/mm/yyyy
 * @author Maria Boyle
 * @version 1.0
**/
package ie.lyit.hotel;

public class Guest extends Person {
	// Guest inherits name and phoneNo from Person
	// NEVER PUT IN SUPER CLASS INSTANCE VARIABLES AGAIN
	// & it has additional properties emailAddress and creditCard
	private String emailAddress;
	private CreditCard creditCard;

	// Default Constructor
	// Called when a Guest object is created like this ==> 
	//   Guest g1 = new Guest();	
	// We can't create a default CreditCard so leave it out
	public Guest() {
		super();
		emailAddress="";
	}

	// Overloaded initialization constructor
	// Called when a Guest object is created like this ==>
	//    Name name=new Name("Mr","Joe","Bloggs");
	//    CreditCard joesCard=new CreditCard("1111222233334444L",
	//                                        new Date(31,12,2024),
	//                                        123);
	//    Guest joe=new Guest(name,"087 1234567", 
	//                        "joe@gmail.com",joesCard);
	public Guest(Name name,String phoneNo,String email,
			     CreditCard creditCard){
		super(name,phoneNo);
		this.emailAddress=email;
		this.creditCard=creditCard;
	}
	
	// toString()
	// Calls super.toString() to display Person fields,
	// then displays Guest fields
	@Override
	public String toString() {
		return super.toString() + "\t" + emailAddress +".";
	}

	// no equals() method because the super class equals() is sufficient
	// We can compare two Guest objects using their name and phoneNumber only
	// if(g1.equals(g2))
	//    given that there is no equals method in Guest it will call Persons equals
	//    and compare g1's name and phoneNumber with g2's name and phoneNumber		
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public CreditCard getCreditCard() {
		return creditCard;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
}
