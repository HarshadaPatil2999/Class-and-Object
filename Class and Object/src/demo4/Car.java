package demo4;

public class Car {
	int id, year,price;
	double discount,netamount;
	String name,brandname, methodeofpay,paymode;

	int getId()
	{
		return id;
	}
void setId(int id)
{
	 this.id=id;
}
int getyear()
{
	return year;
}
void setyear(int year)
{
	this.year=year;
}
String getName()
{
	return name;
}
void setName(String name)
{
	this.name=name;
}
String getBrandname()
{
	return brandname;
}
void setBrandname(String brandname)
{
	this.brandname=brandname;
}
int getPrice()
{
	return price;
}
void setPrice(int price)
{
	this.price=price;
}
String getMethodeofpay()
{
	return methodeofpay;
}
void setMethodeofpay(String methodeofpay)
{
	this.methodeofpay=methodeofpay;
}
String getPaymode()
{
	return paymode;
}
void setPaymode(String paymode)
{
	this.paymode=paymode;
}
double getDiscount()
{
	return discount;
}
void setDiscount(double discount)
{
	this.discount=discount;
}
double getNetamount()
{
	return netamount;
}
void setNetamount(double netamount)
{
	this.netamount=netamount;
}
public String toString()
{
	return id+" "+name+" "+brandname+" "+year+" "+price+" ";
	 
}

}
