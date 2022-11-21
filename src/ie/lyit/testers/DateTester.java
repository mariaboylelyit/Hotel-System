/**
 * Class: B.Sc. in Computing
 * Instructor: Maria Boyle
 * Description: Tester for the Date class
 * Date: dd/mm/yyyy
 * @author Maria Boyle
 * @version 1.0
**/
package ie.lyit.testers;

import java.util.Scanner;

import ie.lyit.hotel.Date;

public class DateTester{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		boolean goodInput=false;
		int setDayTo=62;int setMonthTo=15;int setYearTo=10;
		do {
			try {
				Date myDate2 = new Date(setDayTo,setMonthTo,setYearTo);
			}
			catch(IllegalArgumentException iEA){
				System.out.println("Incorrect day, month or year.");
				
				System.out.print("Enter day [1-31]:");
				setDayTo = keyboard.nextInt();
				System.out.print("Enter month [1-12]:");
				setMonthTo = keyboard.nextInt();
				System.out.print("Enter Year [above 1900]:");
				setYearTo = keyboard.nextInt();				
			}
		}while(!goodInput);
		
		Date myDate1 = new Date();

		goodInput=false;
		setDayTo=32;setMonthTo=13;setYearTo=-2009;
		
		do {
			try {
				myDate1.setDay(setDayTo);
				myDate1.setMonth(setMonthTo);
				myDate1.setYear(setYearTo);
				goodInput=true;
			}
			catch(IllegalArgumentException iAE){
				System.out.println("Invalid Day/Month/Year.");
				
				System.out.print("Re-enter Day:");
				setDayTo = keyboard.nextInt();
				System.out.print("Re-enter Month:");
				setMonthTo = keyboard.nextInt();
				System.out.print("Re-enter Year:");
				setYearTo = keyboard.nextInt();				
			}
		}while(!goodInput);

		
		Date d1 = new Date();
        System.out.println(d1);      

	   d1.setDay(4);
		d1.setMonth(6);
		d1.setYear(1941);
		
		System.out.println(d1);
      
		Date d2 = new Date(28, 12, 1982);
      System.out.println(d2);
      
		if(d1.equals(d2))
			System.out.println("Date's are equal.");
		else
			System.out.println("Date's are not equal.");
   }
}

