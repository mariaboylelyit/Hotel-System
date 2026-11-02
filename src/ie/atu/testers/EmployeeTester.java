/**
 * Class: B.Sc. in Computing
 * Instructor: Maria Boyle
 * Description: Tester for the Employee class
 * Date: dd/mm/yyyy
 * @author Maria Boyle
 * @version 1.0
 **/
package ie.atu.testers;

import java.text.DecimalFormat;
import java.util.ArrayList;

import ie.atu.hotel.Date;
import ie.atu.hotel.Employee;
import ie.atu.hotel.Name;

public class EmployeeTester {
	public static void main(String[] args) {
		// Create an ArrayList of Employees called employees
		ArrayList<Employee> employees=new ArrayList<Employee>();

		// Add 3 Employees to employees 
		Name name = new Name("Ms","Faye","McGuire");
		Employee e1 = new Employee(name, "087 1234567",
		    		               new Date(7,12,2000),
		    		               new Date(12,10,2020),
		    		               24000.00);

		name = new Name("Mr","Ben","Carson");
		Employee e2 = new Employee(name, "086 1234567",
		    		               new Date(20,10,1980), 
		    					   new Date(10,10,2012),
		    					   42000.00);	
		    
		name = new Name("Mr","Mark","Logan");
		Employee e3 = new Employee(name, "087 9876543",
		    		               new Date(1,1,1994), 
		    					   new Date(2,8,2018),
		    					   28000.00);		    
		    
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		    		      
		// Display all the Employee's in employees
		System.out.println("LIST OF EMPLOYEES");
		for(Employee employee:employees)
			System.out.println(employee);

		// Increment Employee's earning less than 30000
		System.out.println("");
		System.out.println("LIST OF EMPLOYEES AFTER SALARY INCREMENT");
		for(Employee employee:employees) {
			if(employee.getSalary() < 30000)
				employee.incrementSalary(1000);
		    System.out.println(employee);
		}

		// Display Employee's take home pay
		System.out.println("");
		System.out.println("EMPLOYEES TAKE HOME PAY");
		DecimalFormat df=new DecimalFormat("#.00");
		for(Employee employee:employees) {
			System.out.print(employee.getNumber() + "\t" + employee.getName());			
			System.out.println(employee.getSalary() < 35000 
				               ? "\t€" + df.format(employee.calculatePay(20))
				               : "\t€" + df.format(employee.calculatePay(40)));
		}
	}
}