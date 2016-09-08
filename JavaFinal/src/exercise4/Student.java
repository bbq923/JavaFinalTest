package exercise4;

public class Student {
	public String studentId;
	public String name;
	
	public Student(String studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return new Integer(studentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			return this.hashCode() == obj.hashCode();		
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return studentId + ":" + name;
	}
	
	
}
