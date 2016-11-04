package source;

public class Student extends Human implements Comparable<Student>{
	private int grade;
	
	public Student(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	public Student(String firstName, String lastName, int grade) {
		super(firstName, lastName);
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [grade=" + grade + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.grade - o.grade;
	}
	

}
