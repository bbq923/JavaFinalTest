package exercise7;

// Vehicle은 Truck과 RiverBarge에서 상속하여 구현할 abstract class로 선언한다.
public class Vehicle {
	private double tripDistance;
	private double fuelEfficiency;
	
	public Vehicle(){} // Vehicle을 상속받는 클래스에서 호출할 필요가 있으므로 기본 생성자 정의
	
	public Vehicle(int tripDistance, int fuelEfficiency) {
		this.tripDistance = tripDistance;
		this.fuelEfficiency = fuelEfficiency;
	}
	
	public double calcTripDistance() {
		return tripDistance;
	}
	
	public double calcFuelEfficiency() {
		return fuelEfficiency;
	}
	
	public final double calcFuelNeeds() {
		return calcTripDistance()/calcFuelEfficiency();
	}
}
