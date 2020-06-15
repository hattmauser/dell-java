
public class Motorbike extends Vehicle{

	private String type;
	
	public Motorbike(int capacity, String type) {
		super(2, capacity);
		this.type = type;
	}

	@Override
	public String toString() {
		return "Motorbike [type=" + type + ", getNumWheels()=" + getNumWheels() + ", getCapacity()=" + getCapacity()
				+ "]";
	}
	
	public String getType() {
		return type;
	}
	
	public String honk() {
		return "TOOOOOOOOT! TOOOOOOOOT!";
	}
	
	

}
