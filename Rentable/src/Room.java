
public class Room implements Rentable {

	public String name;
	public double dailyRate;
	
	public Room(String name, double dailyRate) {
		this.name = name;
		this.dailyRate = dailyRate;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public double getDailyRate() {
		// TODO Auto-generated method stub
		return dailyRate;
	}

	@Override
	public double getPrice(double days) {
		// TODO Auto-generated method stub
		return (double)(dailyRate * days);
	}

}
