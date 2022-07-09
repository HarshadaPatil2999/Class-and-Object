package demo2;

public class Student {

	void javaCourse() {
		System.out.println("J2SE+J2EE");
	}

	void pythonCourse() {
		System.out.println("Python+Database");
	}

	void frontEndCourse() {
		System.out.println("HTML+Angular+CSS");

	}

	void instituteName() {
		System.out.println("ThinkQuotient");
	}

	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.javaCourse(); 
		s2.pythonCourse();
		s3.frontEndCourse();
	}

}
