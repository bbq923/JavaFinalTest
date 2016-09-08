package exercise7;

import java.util.ArrayList;

public class Company {
	private static Company instance = new Company();
	private ArrayList<Vehicle> vList = new ArrayList<Vehicle>();
	
	private Company(){} // 기본 생성자 생성 방지
	
	public static Company getCompany() {
		return instance;
	}
	
	public void addVehicle(Object v) {
		if (v instanceof Vehicle) {
			vList.add((Vehicle)v);
		} else {
			System.out.println("Vehicle에 속하는 객체가 아닙니다.");
		}
	}
	
	public ArrayList<Vehicle> getVehicleList() {
		return vList;
	}
	
}
