package exercise6;

// 아래 코드는 컴파일 에러가 없는 코드입니다. (틀리다 X)
// 두 클래스 중 한 클래스는 Inner class라 접근 제어자가 없다고 생각할 수 있다. 
// 그러나 한 클래스 파일에서 적어도 한 클래스는 public 으로 선언되어야 한다. 
// 그밖에도 컴파일 에러는 아니지만 보통 public으로 선언되는 getName()을 default로 선언했다든지
// Student2의 생성자에서 클래스의 변수인 name을 this.으로 가리키지 않아 인자를 그냥 다시 인자에 할당하는 
// 의미없는 코드를 실행하고 있다든지 하는 문제가 있다.

class Student {
	private String myName;
	
	Student(String name) {
		myName = name;
	}
	
	String getName() {
		return myName;
	}
}

class Student2 {
	private String name;
	
	Student2(String name) {
		name = name;
	}
	
	String getName() {
		return name;
	}
}