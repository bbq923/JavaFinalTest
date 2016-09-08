package exercise4;

import java.util.HashSet;

public class StudentTest {

	public static void main(String[] args) {

		HashSet<Student> set = new HashSet<Student>();
		set.add(new Student("100", "고금성"));
		set.add(new Student("200", "김대훈"));
		set.add(new Student("300", "장우현"));
		set.add(new Student("400", "권용재"));
		set.add(new Student("100", "한재엽"));
		
		System.out.println(set);
	}

}
