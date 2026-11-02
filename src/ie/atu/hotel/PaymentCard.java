/**
 * Class: Software Implementation
 * Instructor: Maria Boyle
 * Description: Class PaymentCard - Developed for the Hotel System
 * Date: dd/mm/yyyy
 * @author Software Implementation Students
 * @version 1.0
 */
package ie.atu.hotel;

public class PaymentCard {
   private long number;
   private Date expiryDate; 	// Composition
   private int securityCode;
	    
   // NO DEFAULT CONSTRUCTOR - prevents user creating a null PaymentCard

   // Initialization constructor
   // Called when a PaymentCard object is created like this ==>
   //    PaymentCard bensCard=new PaymentCard(1111222233334444L,
   //                                    new Date(31,12,2029),999);
   public PaymentCard(long number, Date expiry, int secCode) {   
      this.number=number;
      this.expiryDate=expiry;
      this.securityCode=secCode;
   }
	
    // toString() method
    // ==> Called when a String of the class is used, e.g. - 
    //       System.out.print(joesCard);
    //		 or System.out.print(bensCard.toString());
    @Override
    public String toString(){
       return "Card Number:" + number;
   }
    
   // equals() method
   // ==> Called when comparing an object with another object, e.g. -
   //       if(bensCard.equals(new PaymentCard(1111222233334444L,
   //                          new Date(31,12,2025),999));
   @Override
   public boolean equals(Object obj){
      PaymentCard pcObject;
      if (obj instanceof PaymentCard)
         pcObject = (PaymentCard)obj;
      else
         return false;
 	 
      return this.number==pcObject.number;
   }

   public long getNumber() {
      return number;
   }
   public Date getExpiryDate() {
      return expiryDate;
   }
   public int getSecurityCode() {
      return securityCode;
   }    

   // NO set() METHODS - prevents user re-setting instance variables
   // You shouldn't be able to reset a PaymentCard number for example
}