package ie.atu.testers;

import java.util.ArrayList;

import ie.atu.hotel.Room;

public class RoomTester {
    public static void main(String[] args) {	
		// Create an ArrayList of Rooms called rooms  
		ArrayList <Room> rooms=new ArrayList<Room>();

		// Handle any potential exceptions.  Don’t recover from them! 
		try {
			// Add some Rooms 
			//   - 5 DOUBLE Rooms numbered from 101 to 105 costing €180.00 per night 
			//   - 5 KING Rooms numbered from 106 to 110 costing €190.00 per night 
			//   - 3 FAMILY Rooms numbered from 111 to 113 costing €210.00 per night
			for(int i=1; i<=5; i++)
				rooms.add(new Room("DOUBLE", 180.00));
			for(int i=1; i<=5; i++)
				rooms.add(new Room("KING", 190.00));
			for(int i=1; i<=3; i++)
				rooms.add(new Room("FAMILY", 210.00));
		}
		catch(IllegalArgumentException e) {
			System.out.println("Invalid details when creating Room.");
		}
		
		
		// Display all the Rooms in the rooms ArrayList. 
		
		// Display all the FAMILY Rooms in the rooms ArrayList, with a count
    }
	
}
