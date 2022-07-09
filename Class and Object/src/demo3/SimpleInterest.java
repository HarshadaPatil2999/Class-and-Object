package demo3;
import java.util.Scanner;
public class SimpleInterest {
     
	int setData(int p,int r,int t)
	{
		return p*r*t;
	}
	void simpleInterest(int p,int r,int t)
	{
		int value=setData(p,r,t);
		double SI=value/100;
		
		System.out.println("Simple Interest:"+SI);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter p,r,t value");
		int p=sc.nextInt();
		int r=sc.nextInt();
		int t=sc.nextInt();
		SimpleInterest s1= new SimpleInterest();
		s1.simpleInterest(p,r,t);
		System.out.println();
		
		sc.close();
		
		
		
	}

}


