
public class Condo implements Rentable {
	public String name;
	public double weeklyRate;
	
	/**
	 * constructor for condo, similar to room
	 * @param name will be description of Condo
	 * @param w price for condo
	 */
	public Condo(String name, double weeklyRate){
		this.name = name;
		this.weeklyRate = weeklyRate;
	}
	
	/**
	 * auto generated metods from rentable interface contract
	 */
	@Override
	public String getDescription() {
		return name;
	}

	@Override
	public double getDailyRate() {
		// TODO Auto-generated method stub
		return (double)(weeklyRate / 7.00);
	}

	@Override
	public double getPrice(double days) {
		// TODO Auto-generated method stub
		return (double)((weeklyRate / 7) * days);
	}

}
