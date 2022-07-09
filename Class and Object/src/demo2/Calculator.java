package demo2;

public class Calculator {
	void addition() {
		int a=10;
	    int b=20;
		
		System.out.println("Addition:"+(a+b));
	}

	void substraction() {
		int a=20;
		int b=10;
		System.out.println("Substraction:"+(a-b));
	}

	void multiplication() {
		int a=3;
		int b=6;
		System.out.println("Multiplication:"+(a*b));

	}

	void division() {
		int a=25;
		int b=5;
		System.out.println("Division:"+(a/b));
	}

	public static void main(String[] args) {

		Calculator c1 = new Calculator();
		c1.addition(); 
		c1.substraction();
		c1.multiplication();
		c1.division();
	}

}
