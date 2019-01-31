import java.time.LocalDate;
import java.time.Period;


/*
 * The DriversLicense class must include the following attributes:

First Name
Last Name
DOB
Height
Gender
Your DriversLicense class should have a getFullName() method that returns the full name by concatenating the first name and the last name attributes.

Your DriversLicenseclass should have a getAge() method that returns the age by based on the DOB attribute.
 */
public class DriversLicense {
	/**
	 * instantiating attributes of DL
	 */
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String height;
	private String gender;
	
	/**
	 * default constructor method that takes in no parameters
	 */
	protected DriversLicense() {
		
	}
	
	/**
	 * overloaded constructor that assigns all attributes of DL
	 * @param fn firstname
	 * @param ln lastname
	 * @param dob dateofbirth
	 * @param h height
	 * @param g gender
	 */
	protected DriversLicense(String fn, String ln, LocalDate dob, String h, String g) {
		firstName = fn;
		lastName = ln;
		dateOfBirth = dob;
		height = h;
		gender = g;
	}
	
	/**
	 * getters and setters
	 * @return first name
	 */
	protected String getFirstName() {
		return firstName;
	}
	
	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	protected String getLastName() {
		return lastName;
	}
	
	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	protected LocalDate getDOB() {
		return dateOfBirth;
	}
	
	protected void setDOB(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	protected String getHeight() {
		return height;
	}
	
	protected void setHeight(String height) {
		this.height = height;
	}
	
	protected String getGender() {
		return gender;
	}
	
	protected void setGender(String gender) {
		this.gender = gender;
	}
	
	protected String getFullName() {
		return firstName + " " + lastName;
	}
	
	public int getAge() {
		LocalDate currentDate = LocalDate.now();
        if ((dateOfBirth != null) && (currentDate != null)) {
            return Period.between(dateOfBirth, currentDate).getYears();
        } else {
            return 0;
        }
    }


}