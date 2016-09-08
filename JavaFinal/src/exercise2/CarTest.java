package exercise2;

public class CarTest {

	public static void main(String[] args) {

		// CarFactory factory3 = new CarFactory(); 오류 남. private constructor가 있어서 기본 생성자가 생성되지 않았기 때문.
		
		CarFactory factory = CarFactory.getInstance();
		
		Car sonata1 = factory.createCar("우현차");
		Car sonata2 = factory.createCar("우현차");
		System.out.println(sonata1 == sonata2); // true
		
		Car avante1 = factory.createCar("용재차");
		Car avante2 = factory.createCar("용재차");
		System.out.println(avante1 == avante2); // true
		
		System.out.println(sonata1 == avante1); // false
		
	}

}
