
/*
 * what abstract means is could not instantiate object of that class type. you would remove bat mobile examples.
 * limitation is that you can not instantiate
 * benefit is that you can make method abstract.
 */
public abstract class Vehicle {
	//final: once it's set, it cannot be changed.
	private final int numWheels;
	private final int capacity;
	
	//this means that there is only one batmobile bc it's static. --commented out due to abstract addition
	/*
	 * private static Vehicle BATMOBILE = new Vehicle(6,2);
	 */
	
	//this says that a vehicle "type" must have honk method
	public abstract String honk();
	
	//rude knows that there is a honk method available to call.
	public String rude() {
		return "get off the rode!" + honk();
	}

	public int getNumWheels() {
		return numWheels;
	}

	public int getCapacity() {
		return capacity;
	}
	
	public Vehicle(int numWheels, int capacity) {
		this.numWheels = numWheels;
		this.capacity = capacity;
	}
	
	/*
	 * method below commented out due to class now being abstract
	 */
	/*
	 * public static Vehicle getBatMobile() {
		return BATMOBILE;
	}
	 */
	
	
	@Override
	public String toString() {
		return "Vehicle [numWheels=" + numWheels + ", capacity=" + capacity + "]";
	}
}
