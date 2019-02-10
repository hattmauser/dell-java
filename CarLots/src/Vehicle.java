/*
 * Vehicle should have the following fields:
license number
make
model
price
Vehicle should have methods to do the following actions:
print a description of the vehicle, including license number, make, model, and price
 */
public abstract class Vehicle {
	private String licenseNum;
	private String make;
	private String model;
	private double price;
	
	public Vehicle(String licenseNum, String make, String model, double price) {
		this.licenseNum = licenseNum;
		this.make = make;
		this.model = model;
		this.price = price;
	}
	
	/**
	 * abstract method that every subclass will need to have
	 * will have specifics details for each subclass not specific to vehicle
	 * @return
	 */
	public abstract String basicDetails();
	
	/**
	 * print vehicle method that uses the basicdetails abstract that every subclass of vehicle will have
	 * 
	 * @return basic details plus attributes of every vehicle
	 */
	public String printVehicle() {
		return basicDetails() + "\n" + getLicenseNum() + " " + getMake() + " " + getModel() + " " + getPrice() + "\n" + "\n";
	}
	
	/**
	 * getters and setters
	 * @return
	 */
	public String getLicenseNum() {
		return licenseNum;
	}
	public void setLicenseNum(String licenseNum) {
		this.licenseNum = licenseNum;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
