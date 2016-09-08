package exercise2;

public class Car {
	String name;
	
	public Car() {} // default constructor
	
	public Car(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return (this.hashCode() == obj.hashCode());
	}
	
	
}
