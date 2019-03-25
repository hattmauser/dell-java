import java.util.List;

/*
 * CarLot should have the following fields:
name
a list of vehicles
CarLot should have methods to do the following actions:
add a vehicle to the lot
print the inventory of the car lot, including number of vehicles and details about each vehicle
 */
public class CarLot {
	private String name;
	private List<Vehicle> vehicleList;
	
	/*
	 * creating constructors
	 */
	public CarLot() {
		
	}
	
	public CarLot(String name, List<Vehicle> vehicleList) {
		this.setName(name);
		this.vehicleList = vehicleList;
	}
	
	/*
	 * print lot method that prints lot details then uses print vehicle method for each vehicle in lot
	 */
	public void printLot() {
		System.out.println("Lot: " + getName() + " has " + vehicleList.size() + " cars in it.");
		for(Vehicle v: vehicleList) {
			System.out.print(v.printVehicle());
		}
		System.out.println("");
	}
	
	/**
	 * method to add vehicle object to vehicle list array
	 * @param vehicleAdding object being added
	 */
	public void addVehicle(Vehicle vehicleAdding) {
		vehicleList.add(vehicleAdding);
	}
	
	/*
	 * getters and setters
	 */
	public List<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public void setVehicleList(List<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
