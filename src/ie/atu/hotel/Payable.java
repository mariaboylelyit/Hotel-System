/**
 * Class: B.Sc. in Computing
 * Instructor: Maria Boyle
 * Description: Payable Interface
 * Date: dd/mm/yyyy
 * @author Maria Boyle
 * @version 1.0
**/
package ie.atu.hotel;

public interface Payable {
	public abstract double calculatePay(double taxPercentage);
	// Don't have to put in public abstract
	double incrementSalary(double incrementAmount);
}

// A Java interface can contain only abstract 
// methods, i.e. methods without a body