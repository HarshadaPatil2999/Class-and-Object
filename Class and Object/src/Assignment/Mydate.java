package Assignment;
import java.util.Scanner;
public class Mydate {
	int date,month,year;

	void setData(int dd,int mm,int yy )
	{
		date=dd;
		month=mm;
		year=yy;
	}public String toString()
	{
		
		return date+""+"/"+month+""+"/"+year+"";
		
	}public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int date,month,year;
		
		Mydate m1=new Mydate();
		System.out.println("Enter date,month and year");
		date=sc.nextInt();
		month=sc.nextInt();
		year=sc.nextInt();
		m1.setData(date, month, year);
		System.out.println();
		Mydate m2=new Mydate();
		System.out.println("Enter date,month and year");
		date=sc.nextInt();
		month=sc.nextInt();
		year=sc.nextInt();
		m2.setData(date, month, year);
		
		System.out.println(m1);
		System.out.println();
		System.out.println(m2);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
} 
