package entities;

public class OutSourcedEmployee extends Employee {

	private double additionalCharge;
	
	public OutSourcedEmployee() {
		super();
	}

	public OutSourcedEmployee(String name, Integer hour, double valuePerHour, double additionalCharge) {
		super(name, hour, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return hour * valuePerHour + 1.1 * additionalCharge;
	}
	
	
}
