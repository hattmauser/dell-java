/*
 * bed size
 */
public class Truck extends Vehicle {
	private int bedSize;
	
	public Truck(String licenseNum, String make, String model, double price, int bedSize) {
		super(licenseNum, make, model, price);
		this.setBedSize(bedSize);
	}

	public int getBedSize() {
		return bedSize;
	}

	public void setBedSize(int bedSize) {
		this.bedSize = bedSize;
	}

	@Override
	public String basicDetails() {
		return "Truck with bed size of " + Integer.toString(getBedSize());
	}
}
