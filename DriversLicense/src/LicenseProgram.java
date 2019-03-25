import java.time.LocalDate;

/*
 * Create a DriversLicense Java project with two classes, DriversLicense and LicenseProgram.

You"ll use the LicenseProgram class to run your program and create DriversLicense instances.
The LicenseProgram class will contain one main method (and nothing else).
When run, LicenseProgram should create three different instances of a DriversLicense and print out the full name and age on each license.
Include comments in your code. At the minimum, include a comment for each method to explain what it does. If you submit code without any comments, 5 points will be subtracted from your assignment score.
 */
public class LicenseProgram {
	public static void main(String[] args) {
		
		/*
		 * creating each persons bday objects
		 */
		LocalDate person1BDay = LocalDate.of(1940, 10, 9);
		LocalDate person2Bday = LocalDate.of(1942, 6, 14);
		LocalDate person3BDay = LocalDate.of(1942, 2, 25);
		LocalDate person4BDay = LocalDate.of(1940, 7, 7);


		/*
		 * instantiating person1 driverlicense object using overloaded constructor
		 */
		DriversLicense person1 = new DriversLicense("John","Lennon",person1BDay,"5 10","Male");
		System.out.println(person1.getFullName());
		System.out.println(person1.getAge());
		
		/*
		 * instantiating person2 driver license object using default constructor
		 */
		DriversLicense person2 = new DriversLicense();

		/*
		 * using setters to set attributes to person2 object
		 */
		person2.setFirstName("Paul");
		person2.setLastName("McCartney");
		person2.setDOB(person2Bday);
		person2.setHeight("5 11");
		person2.setGender("Male");
		person2.getFullName();
		System.out.println(person2.getFullName());
		System.out.println(person2.getAge());
		
		DriversLicense person3 = new DriversLicense("George","Harrison",person3BDay,"5 10","Male");
		System.out.println(person3.getFullName());
		System.out.println(person3.getAge());
		
		DriversLicense person4 = new DriversLicense("Ringo","Star",person4BDay,"5 6","Male");
		System.out.println(person4.getFullName());
		System.out.println(person4.getAge());
		
		
	}
}
