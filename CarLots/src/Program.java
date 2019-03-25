import java.util.ArrayList;
import java.util.List;

/*
 * Create a CarLotProgram class that will contain your main method and act as a "driver" for your program.

For this assignment you do not have to build an interactive program.

In your main method:
You should instantiate 2 different car lots, and add various vehicles to the car lots.
Print out the inventory for each of the car lots, showing the details for each vehicle.
When printing out the details, print the appropriate info for a car, or a truck accordingly.
 */
public class Program {
	
	public static void main(String[] args) {
		
		/**
		 * instantiating car lots
		 */
		List<Vehicle> mattsCarsForSale = new ArrayList<Vehicle>();
		CarLot lot1 = new CarLot("Matt's used cars for less", mattsCarsForSale);
		List<Vehicle> ravensCarsForSale = new ArrayList<Vehicle>();
		CarLot lot2 = new CarLot("Raven's Cars Depot", ravensCarsForSale);
		
		/**
		 * creating vehicle objects of various sub types
		 */
		Vehicle subaru = new Car("FJ3DK03","Subaru","Crosstrek",22000,CarType.HATCHBACK,4);
		Vehicle jeep = new Car("DKE3L0D","Jeep","Patriot",17000,CarType.HATCHBACK,4);
		Vehicle honda = new Car("F23DB03","Honda","Civic SI",26000,CarType.COUPE,2);
		Vehicle f150 = new Truck("FJ3DK03","Ford","F-150",22000,6);
		Vehicle tacoma = new Truck("FJ3DK03","Toyota","Tacoma",22000,4);
		
		/**
		 * adding vehicle objects to lots
		 * adds the vehicle object to list array
		 */
		lot2.addVehicle(jeep);
		lot2.addVehicle(subaru);
		lot1.addVehicle(honda);
		lot1.addVehicle(f150);
		lot2.addVehicle(tacoma);
		
		lot1.printLot();
		lot2.printLot();


		
	}

}
