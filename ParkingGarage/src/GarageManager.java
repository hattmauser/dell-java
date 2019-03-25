/*
 * Requirements
Your program should implement a Car class, a ParkingGarage class, and a GarageManager class.
The GarageManager Class and the Main method
The GarageManager class will contain the main(String[] args) method for your program. It doesn't need to contain anything else.

Your main() method will act as the "driver" for this program.

In your main() method, you should:

Instantiate a few ParkingGarage instances with different capacities.
Instantiate a few cars, and proceed to park them and unpark them from the garages.
Guidelines
Your implementation should be broken down into different methods.

Each method should have a well defined "job".

Include comments in your code. At the minimum, include a comment for each method to explain what it does. If you submit code without any comments, 5 points will be subtracted from your assignment score.
 */
public class GarageManager {
	public static void main(String args[]) {
		/*
		 * instantiate a few different garages. two different ways constructor and overloaded
		 */
		ParkingGarage garage1 = new ParkingGarage();
		ParkingGarage garage2 = new ParkingGarage(4);
		
		/*
		 * instantiating some cars
		 */
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car("white","DJK4LDK","Subaru","Crosstrek");
		Car car4 = new Car("silver","WOD3K5D","Honda","Civic");
		Car car5 = new Car("tan","FJ9DLKS","Toyota","4Runner");
		Car car6 = new Car("purple","SDHF3D","Hyundai","Elantra");
		Car car7 = new Car("green","FJD3DL","Subaru","WRX");
		
		/*
		 * assigning attributes to parking garage
		 */
		
		garage1.setCapacity(1);
		
		/*
		 * assigning attributes to cars
		 */
		
		car1.setColor("red");
		car1.setLicenseNum("DJEL4K4");
		car1.setMake("Jeep");
		car1.setModel("Patriot");
		
		car2.setColor("black");
		car2.setLicenseNum("DFJDS3");
		car2.setMake("Nissan");
		car2.setModel("Maxima");
		
		garage1.park(car1, 0);
		garage1.park(car2, 0);
		garage2.park(car3, 1);
		garage2.park(car4, 2);
		garage2.park(car5, 3);
		garage2.park(car6, 3);
		garage2.park(car7, 4);
		
		System.out.println("");
		
		garage1.printInventory();
		garage2.printInventory();
		
		System.out.println("");
		
		garage2.vacate(0);
		garage2.vacate(0);
		garage2.vacate(1);
		garage2.vacate(2);
		garage2.vacate(3);
		garage2.vacate(10);

		
		
	}
}
