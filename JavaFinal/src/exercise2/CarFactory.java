package exercise2;

import java.util.HashMap;

public class CarFactory {
	
	private static CarFactory instance = new CarFactory();
	private HashMap<String, Car> carMap = new HashMap<String, Car>();
	private CarFactory(){} // 이 생성자를 생성함으로써 기본 생성자가 생성되지 않는다.
	
	public static CarFactory getInstance() {
		return instance;
	}
	
	public Car createCar(String name) {
		if (carMap.get(name) == null) {
			carMap.put(name, new Car(name));
		}
		
		return carMap.get(name);
	}

	
	
}
