import java.util.Date;

public class Person {

	String FirstName;
	String LastName;
	Date DateOfBirth;
	
	//constructor defines code that you want to run when class instantiates
	
	//Builder pattern in java
	
	Person(String x, String y){
		FirstName = x;
		LastName = y;
	}
	
	//utility method
	static String getFullName(String fname, String lname) {
		return FirstName+" "+LastName;
	}
	
	//this value specific to person instance
	String getFullName() {
		//return FirstName+" "+LastName;
		return getFullName(FirstName, LastName);
	}
		
	
}
