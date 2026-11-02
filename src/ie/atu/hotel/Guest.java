/**
 * Class: Software Implementation
 * Instructor: Maria Boyle
 * Description: Class Guest-Developed for the Hotel System
 * Date: dd/mm/yyyy
 * @author Software Implementation Students
 * @version 1.0
 */
package ie.atu.hotel;

import java.util.Scanner;

public class Guest extends Person {	//INHERITANCE-Guest IS-A Person
	// Guest has name & phoneNumber from Person
	private String emailAddress;    // AND an emailAddress
	private PaymentCard paymentCard;  // AND a paymentCard	

	// Default Constructor
	// Called when a Guest object is created like this ==> 
	//   Guest g1 = new Guest();	
	public Guest() {
		super();	// Don't need to call super() explicitly.
		emailAddress="";
	}
	
	// Overloaded initialization constructor
	// Called when a Guest object is created like this ==>
	//    Name name=new Name("Mr", "Joe", "Bloggs");
	//    PaymentCard paymentCard=new PaymentCard(5555666677778888,new Date(31,12,2026),123);
	//    Guest g2 = new Guest(name, "087 1234567", "joe@gmail.com" =, paymentCard);
	public Guest(Name name, String phoneNumber, String emailAddress, PaymentCard paymentCard) {
		super(name,phoneNumber);
		this.emailAddress=emailAddress;
		this.paymentCard=paymentCard;
	}

	// OVERRIDING the Person toString() method!
	// Calling Persons toString() method, and adding emailAddress
	@Override
	public String toString() {
		return super.toString() + "\t " + emailAddress + ".";
	}
	
	// no equals() method because the super class equals() is sufficient
	// We can compare two Guest objects using their name and phoneNumber only
	// if(g1.equals(g2))
	//    given that there is no equals method in Guest it will call Persons equals
	//    and compare g1's name and phoneNumber with g2's name and phoneNumber

	// get() and set() methods
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public PaymentCard getPaymentCard() {
		return paymentCard;
	}
	public void setPaymentCard(PaymentCard paymentCard) {
		this.paymentCard = paymentCard;
	}
}
