import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		Vehicle subie = new Car(4, 5, 4);
		
		System.out.println("Showing toString print of an object and that it will receive the honk method from it's class (not parent).");
		System.out.println(subie);
		System.out.println(subie.honk());
		
		System.out.println("Now same thing but with motorbike.");
		Vehicle moto1 = (Vehicle)new Motorbike(2, "cruiser");
		System.out.println((Vehicle)moto1);

		System.out.println(moto1.honk());
		
		List<Vehicle> vehicleList = new ArrayList<>();
		vehicleList.add(subie);
		vehicleList.add(moto1);
		
		System.out.println("Showing that the object will print instance that it is including superclass parent");
		printClass(subie);
		printClass(moto1);
		
		System.out.println("Showing that casting a more generic super class has no meaning.");
		//just showing that casting as superclass does not change it
		printClass((Vehicle)moto1);
		
		System.out.println("Now showing example that casting is being used to make the object more specific thus being able to access that class' method from just generic passed value.");
		printDescription(subie);
		printDescription(moto1);
		
		for(Vehicle v: vehicleList) {
			System.out.println(v.rude());
		}
		
	}
	
	public static void printClass(Vehicle v) {
		if(v instanceof Car) {
			System.out.println("it's a car");
		}
		
		if(v instanceof Motorbike) {
			System.out.println("it's a moto");
		}
		
		if(v instanceof Vehicle) {
			System.out.println("it's a vehicle");
		}
	}
	
	public static void printDescription(Vehicle v) {
		if(v instanceof Car) {
			System.out.println("it's a car");
			System.out.println("It has "+((Car)v).getNumWheels()+" doors");
		}
		
		if(v instanceof Motorbike) {
			System.out.println("it's a moto");
			System.out.println("It is "+((Motorbike)v).getType()+" type of motorbike");
		}
		
		if(v instanceof Vehicle) {
			System.out.println("it's a vehicle");
		}
	}
}
