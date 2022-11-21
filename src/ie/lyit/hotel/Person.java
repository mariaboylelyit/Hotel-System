/**
 * Class: B.Sc. in Computing
 * Instructor: Maria Boyle
 * Description: Models a Date
 * Date: dd/mm/yyyy
 * @author Maria Boyle
 * @version 1.0
**/
package ie.lyit.hotel;

public abstract class Person {
	protected Name name; // COMPOSITION - Person HAS-A name
	protected String phoneNo;
	
	// Default Constructor
	// Called when object is created like this 
	//   ==> Person pObj = new Person();
	//   NOTE-This won't work because Person is abstract
	//        But it is important for the subclasses
	public Person(){
		name=new Name();
		phoneNo="";
	}	

	// Overloaded Initialization Constructor
	// Called when object would have been created like this (not possible cos abstract!)
	//    ==> Name name = new Name("Mr","Joe","Bloggs");
	//        Person pObj = new Person(name, "087 1234567");
	public Person(Name name, String phoneNo) {
		this.name=name;
		this.phoneNo=phoneNo;
	}

	// toString() method
	// ==> Calls Name's toString() to display name and
	//		then displays phoneNumber
	@Override  // Overrides Object toString()	
	public String toString() {
		return name + "\t" + phoneNo;
	}

	// equals() method
	// ==> Called when comparing an object with another object, 
	//     e.g. - if(p1.equals(p2))				
	// ==> Calls Name's equals() to compare name to personIn's name, and
	//		compares phoneNumber to personIn's phoneNumber
	@Override  // Overrides Object equals()
	public boolean equals(Object obj) {	
		Person pObj;
		if(obj instanceof Person)
			pObj=(Person)obj;
		else
			return false;

		return name.equals(pObj.name)&&
			   phoneNo.equals(pObj.phoneNo);
	}

	// get() methods
	public Name getName() {
		return this.name;
	}
	public String getPhoneNumber() {
		return phoneNo;
	}
		
	// set() methods
	public void setName(Name name) {
		this.name=name;
	}
	public void setPhoneNo(String phoneNoIn) {
		phoneNo=phoneNoIn;
	}

}
