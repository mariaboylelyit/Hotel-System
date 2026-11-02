package ie.atu.testers;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import ie.atu.hotel.Date;
import ie.atu.hotel.Employee;
import ie.atu.hotel.Guest;
import ie.atu.hotel.Name;
import ie.atu.hotel.PaymentCard;
import ie.atu.hotel.Person;

public class ExceptionHandlerDemo {

   public static void main(String[] args) {
         /////////////
         // Polymorphic ArrayList
         /////////////
         // It is of the super class type, and so it 
         // can hold Guest or Employee objects! 
         ArrayList<Person> evacuationList = new ArrayList<Person>();
		
         // Add 2 Guests and 2 Employees
         evacuationList.add(new Guest(new Name("Mr","John","Jones"),
                            "087 7654321",
                            "johnjones@gmail.com",
                            new PaymentCard(1111222233334444L,new Date(31,12,2029),111)));
				
         evacuationList.add(new Guest(new Name("Mrs","Sara","Jones"),
                            "087 1234567",
                            "sara.jones@atu.ie",
                            new PaymentCard(2222333344445555L,new Date(31,12,2028),222)));	

         evacuationList.add(new Employee(new Name("Mr","Henry","Smyth"),
                            "086 1234567",
                            new Date(20,10,1980), 
                            new Date(10,10,2012),
                            42000.00));
					
         evacuationList.add(new Employee(new Name("Ms","Lizzie","Swan"),
		                    "087 1234567",
		                    new Date(18,11,1999),
		                    new Date(1,1,2020),
		                    2500000.00));

        // Polymorphism means 'many forms'
        // tmpPerson is taking on Employee objects and Guest objects
        // The toString() from either Employee or Guest will get called
        // Which toString() gets called will be decided at runtime
        //  depending in the object tmpPerson references
        //  This is called runtime binding!
	    System.out.println("CURRENTLY IN EVACUATION LIST ARE:");
        for(Person tmpPerson : evacuationList)
            System.out.println(tmpPerson);

        boolean goodInput=false;
        do {
            // try - signifies my intention to handle any exceptions
            try {
                // RISKY CODE, might throw an exception
                String numberAsString=JOptionPane.showInputDialog(null,
			                  "Enter Person to View ("+1+" to "+ evacuationList.size()+")");
                int numberToView=Integer.parseInt(numberAsString);
                JOptionPane.showMessageDialog(null,evacuationList.get(numberToView-1));
                // At this point the required Employee will
                // be displayed with no Exceptions thrown
                // So set goodInput to true
                goodInput=true;
            }
            catch(NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null,"Invalid number, re-enter.");
            }
            catch(IndexOutOfBoundsException iobe) {
                JOptionPane.showMessageDialog(null,
                            "Enter number between 1 and "+evacuationList.size());	    	
             }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null,"Invalid number, re-enter.");
            }
         }while(!goodInput);				
	}
}

