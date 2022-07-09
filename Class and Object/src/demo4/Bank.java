package demo4;

public class Bank {
	
	void gPay(int amt,Account a)
	{
		int bal=a.getBalance();
		System.out.println("Avilable balance:"+bal);
		if(bal>amt) 
		{
			bal=bal-amt;
			a.setBalance(bal);
		System.out.println("Remaining balance:"+a.getBalance());
		}
		else
			System.out.println("balance is less....");
	}

}
