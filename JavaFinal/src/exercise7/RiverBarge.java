package exercise7;

public class RiverBarge extends Vehicle {
	private double tripDistance;
	private double fuelEfficiency;
	
	public RiverBarge(double tripDistance, double fuelEfficiency) {
		this.tripDistance = tripDistance;
		this.fuelEfficiency = fuelEfficiency;
	}
	
	public double calcTripDistance() {
		return tripDistance;
	}
	
	public double calcFuelEfficiency() {
		return fuelEfficiency;
	}
}
