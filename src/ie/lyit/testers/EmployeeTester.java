package ie.lyit.testers;

import java.text.DecimalFormat;
import java.util.ArrayList;

import ie.lyit.hotel.CreditCard;
import ie.lyit.hotel.Date;
import ie.lyit.hotel.Employee;
import ie.lyit.hotel.Guest;
import ie.lyit.hotel.Name;
import ie.lyit.hotel.Person;

public class EmployeeTester {

	public static void main(String[] args) {
		ArrayList<Employee> employees=new ArrayList<Employee>();

	    Name name = new Name("Ms","Faye","McGuire");
	    Employee e1 = new Employee(name, "087 1234567",
	    		                   new Date(7,12,2000),
	    		                   new Date(12,10,2020),24000.00);

	    name = new Name("Mr","Ben","Carson");
	    Employee e2 = new Employee(name, "086 1234567",
	    		                   new Date(20,10,1980), 
	    						   new Date(10,10,2012),42000.00);	
	    
	    name = new Name("Mr","Mark","Logan");
	    Employee e3 = new Employee(name, "087 9876543",
	    		                   new Date(1,1,1994), 
	    						   new Date(2,8,2018),28000.00);		    
	    
	    employees.add(e1);
	    employees.add(e2);
	    employees.add(e3);
	    		      
	    // Display Employee's
		System.out.println("LIST OF EMPLOYEES");
		for(Employee employee:employees)
			System.out.println(employee);

	    // Increment Employee's earning less than 30000
		System.out.println("");
		System.out.println("LIST OF EMPLOYEES AFTER INCREMENT");
		for(Employee employee:employees) {
			if(employee.getSalary() < 30000)
			    employee.incrementSalary(1000);
	        System.out.println(employee);
		}

		System.out.println("");
		System.out.println("EMPLOYEES TAKE HOME PAY");
		DecimalFormat df=new DecimalFormat("#.00");
		for(Employee employee:employees) {
			System.out.print(employee.getNumber() + "\t" + employee.getName());			
			System.out.println(employee.getSalary() < 35000 
			    ? "\t€" + df.format(employee.calculatePay(20))
			    : "\t€" + df.format(employee.calculatePay(40)));
		}
		// Polymorphic ArrayList
		ArrayList<Person> personsInHotel = new ArrayList<Person>();
		personsInHotel.add(e1);
		personsInHotel.add(e2);
		personsInHotel.add(e3);
		
		// Create a Guest object called g1 with initial values
		name=new Name("Mr", "Homer", "Simpson");
		CreditCard card=new CreditCard(1111222233334444L,new Date(31,12,2027),111);
		Guest g1 = new Guest(name, "087 1234567", "homer.simpson@atu.ie", card);	

		// Create a Guest object called g2 with initial values
		name=new Name("Mrs", "Marge", "Simpson");
		card=new CreditCard(5555666677778888L,new Date(31,12,2024),222);
		Guest g2 = new Guest(name, "086 1234567", "marge.simpson@atu.ie", card);	
	  
		personsInHotel.add(g1);
		personsInHotel.add(g2);	
		
		System.out.println("");
		System.out.println("ALL PEOPLE IN HOTEL, BOTH GUESTS AND EMPLOYEES");
		for(Person person : personsInHotel)
			System.out.println(person);
	}

}
