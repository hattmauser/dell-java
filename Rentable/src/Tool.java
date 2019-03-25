
public class Tool implements Rentable {

	public String name;
	public double hourlyRate;
	
	public Tool(String name, double hourlyRate) {
		this.name = name;
		this.hourlyRate = hourlyRate;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public double getDailyRate() {
		// TODO Auto-generated method stub
		return (double)(hourlyRate * 24);
	}

	@Override
	public double getPrice(double days) {
		// TODO Auto-generated method stub
		return (double)(hourlyRate * 24 * days);
	}

}
