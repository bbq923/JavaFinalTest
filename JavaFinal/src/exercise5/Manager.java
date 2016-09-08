package exercise5;

public class Manager extends Employee{
	String department;
	
	// 아래 코드는 컴파일 코드가 있는 코드입니다. (맞다 O)
	// 컴파일 에러가 난다. Manager는 Employee를 상속하고 있는데 
	// 부모 클래스인 Employee에 다음 네 개의 인자를 받는 생성자가 정의되어있지 않기 때문이다.
	Manager(String name, int sabun, float salary, String department) {
		this.department = department;
	}
	
	String getDetails() {
		return super.getDetails() + ":" + department;
	}
}
