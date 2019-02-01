
public class Car {
	private String color;
	private String licenseNum;
	private String make;
	private String model;
	
	protected Car() {
		
	}
	
	protected Car(String myColor, String myLicenseNum, String myMake, String myModel) {
		color = myColor;
		licenseNum = myLicenseNum;
		make = myMake;
		model = myModel;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
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
	
	
}
