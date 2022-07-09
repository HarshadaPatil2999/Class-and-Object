package demo4;
import java.util.Scanner;
public class Carmain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id, year,price;
		double discount,netamount;
		String name,brandname,methodeofpay,paymode;
		
		Car c1=new Car();
		System.out.println("Enter id,name,brandname, year,price");
	     id=sc.nextInt();
		 name=sc.next();
		 brandname=sc.next();
		year=sc.nextInt();
		price=sc.nextInt();
		
		c1.setId(id);
		c1.setName(name);
		c1.setBrandname(brandname);
		c1.setyear(year);
		c1.setPrice(price);
		System.out.println(c1);
		
		System.out.println();
		
		Discountcar d1=new Discountcar();
		System.out.println("Enter methodeofpay,paymode");
		methodeofpay=sc.next();
		paymode=sc.next();
		d1.discount(methodeofpay,paymode,c1);
		
	}

}
