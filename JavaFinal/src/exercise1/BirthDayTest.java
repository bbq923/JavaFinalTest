package exercise1;

public class BirthDayTest {

	public static void main(String[] args) {

		BirthDay bd = new BirthDay();
		
		// bd.(변수명) 으로 직접 접근하지 않고 setter 메서드를 이용한다.
		bd.setDay(8); 
		bd.setMonth(9);
		bd.setYear(2016);
		
		/*
		 *  클래스가 가진 멤버 변수들을 private으로 생성하고 외부에서의 해당 변수에 대한 접근을
		 *  public한 getter와 setter로 정의해 놓으면 변수에 대한 직접적이고 무분별한 접근을
		 *  막을 수 있어 information hiding 측면에서 좋다. 프로그래머가 변수에 대한 접근성을
		 *  관리하기에도 명시적으로 getter와 setter가 있는 것이 관리가 편하다.
		 */
	}

}
