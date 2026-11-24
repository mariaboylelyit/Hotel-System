/**
 * Class: Software Implementation
 * Instructor: Maria Boyle
 * Description: Class Room - Developed for the Hotel System
 * Date: dd/mm/yyyy
 * @author Software Implementation Students
 * @version 1.0
 */
package ie.atu.hotel;

public class Room{
    /* 
     * A Room has a roomNumber, a roomType such as DOUBLE or KING or FAMILY, 
     * a nightlyRate, and a boolean allocated which is set to true when the Room is booked.
     * 
     * SAMPLE Rooms INCLUDE : 101, DOUBLE, 180.00, false.
     *                        108, KING, 190.00, true.
     *                        111, FAMILY, 210.00, true.
     */

    private int roomNumber;
    private String roomType;
    private double nightlyRate;
    private boolean allocated;

    /**************************/
    /* TODO-WRITE CONSTRUCTOR */
    /**************************/
	
    @Override
    public String toString() {
        return roomNumber + " " + roomType + " Room @ " + String.format("%.2f", nightlyRate) + " per night " + (allocated ? "BOOKED" : "FREE");
    }
	
    @Override
    public boolean equals(Object obj){
        Room rObject;
        if (obj instanceof Room)
            rObject = (Room)obj;
        else
            return false;
	 
        return this.roomNumber == (rObject.roomNumber);
    }

    // You shouldn't be able to setNumber() as it is unique, 
    // so don't provide a setNumber() method
    
    public void setRoomType(String roomType){
        this.roomType=roomType;
    }
    public void setNightlyRate(double nightlyRate){
        this.nightlyRate=nightlyRate;
    }
    public void setAllocated(boolean allocated) {
        this.allocated=allocated;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
    public String getRoomType() {
        return roomType;
    }
    public double getNightlyRate() {
        return nightlyRate;
    }
    public boolean getAllocated() {
        return allocated;
    }
}