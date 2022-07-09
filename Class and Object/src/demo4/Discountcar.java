package demo4;

public class Discountcar {
	double discount,netamount;
	int price;
	
	void discount(String methodeofpay,String paymode,Car a)
	{
		price=a.getPrice();
		if(methodeofpay.equals("fullpayment")&& paymode.equals("cash"))
				{	 
			    discount=(price*10)/100;
			    netamount=price-discount;
		System.out.println("discount:"+discount);
		System.out.println("net amount:"+netamount);
	}
		else if(methodeofpay.equals("fullpayment")&& paymode.equals("online")) 
				{
			discount=(price*8)/100;
			netamount=price-discount;
		System.out.println("discount:"+discount);
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

}
