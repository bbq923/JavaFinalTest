package exercise7;

public class FuelNeedsReport {
	private Company company = Company.getCompany();
	
	public void generateReport() {
		int fuelNeeds = 0; // 사실 double 값인게 맞지만 출력에서 소수점은 출력하고 있지 않으므로 기냥 int로....
		
		for(Vehicle v : company.getVehicleList()) {
			fuelNeeds += v.calcFuelNeeds();
		}
		
		System.out.println("Total Fuel Needs : " + fuelNeeds);
	}
}
