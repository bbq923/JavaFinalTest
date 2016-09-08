package exercise5;

public class Employee {
	
	String name;
	int sabun;
	float salary;
	
	Employee(String name, int sabun, float salary) {
		this.name = name;
		this.sabun = sabun;
		this.salary = salary;
	}
	
	String getDetails() {
		return name + ":" + sabun + ":" + salary;
	}
}
