package demo3;
import java.util.Scanner;
public class Areaofcircle {
	int r;
	int rSqure(int r)
	{
		return r*r;
	}
	void area(int r)
	{
		
		double area=3.14*rSqure(r);
		
		System.out.println("Area of Circle:"+area);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius value");
		int r=sc.nextInt();
		Areaofcircle a1= new Areaofcircle();
		a1.area(r);
		System.out.println();
		Areaofcircle a2= new Areaofcircle();
		a2.area(r);
		sc.close();
		
		
		
	}

}
