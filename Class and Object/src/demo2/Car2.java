package demo2;
import java.util.Scanner;
public class Car2 {
	int id, year,price;
	double discount,netamount;
	String name,brandname,methodeofpay,paymode;

void setData(int i,String n,String b,int y,int p,String mpay,String pay)
{
	id=i;
	name=n;
	brandname=b;
	year=y;
	price=p;
	methodeofpay=mpay;
    paymode=pay;
	
}void discount()
{
	if(methodeofpay.equals("fullpayment")&& paymode.equals("cash"))
			{	 
		    discount=(price*10)/100;
		    netamount=price-discount;
	System.out.println(" discount:"+discount);
	System.out.println("net amount:"+netamount);
}
	else if(methodeofpay.equals("fullpayment")&& paymode.equals("online")) 
			{
		discount=(price*8)/100;
		netamount=price-discount;
	System.out.println(" discount:"+discount);
	System.out.println("net amount:"+netamount);
	}
	else if(methodeofpay.equals("installment=2"))
			{
		discount=(price*3)/100;
		netamount=price-discount;
		System.out.println(" discount:"+discount);
		System.out.println("net amount:"+netamount);
			}
	else if(methodeofpay.equals("installment=3"))
	{
		discount=(price*2)/100;
		netamount=price-discount;
		System.out.println(" discount:"+discount);
		System.out.println("net amount:"+netamount);
	}
	else
		System.out.println("no discount");
	
	
	}
public String toString()
{
	return id+" "+name+" "+brandname+" "+year+" "+price+" "+methodeofpay+" "+paymode+" ";
}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int id, year,price;
	double discount,netamount;
	String name,brandname,methodeofpay,paymode;
	Car2 c1= new Car2();
	System.out.println("Enter id,name,brandname,year,price,methodofpay,paymode");
	id=sc.nextInt();
	name=sc.next();
	brandname=sc.next();
	year=sc.nextInt();
	price=sc.nextInt();
	methodeofpay=sc.next();
	paymode=sc.next();
	c1.setData(id,name,brandname,year,price,methodeofpay,paymode);
	System.out.println(c1);
	c1.discount();
	System.out.println();
	Car2 c2= new Car2();
	System.out.println("Enter id,name,brandname,year,price,methodofpay,paymode");
	id=sc.nextInt();
	name=sc.next();
	brandname=sc.next();
	year=sc.nextInt();
	price=sc.nextInt();
	methodeofpay=sc.next();
	paymode=sc.next();
	c2.setData(id,name,brandname,year,price,methodeofpay,paymode);
	System.out.println(c1);
	c2.discount();
	
}






}