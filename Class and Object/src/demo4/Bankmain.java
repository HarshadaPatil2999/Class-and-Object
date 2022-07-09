package demo4;
import java.util.Scanner;
public class Bankmain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter:accno,name,contact,balance");
		int accno=sc.nextInt();
		String name=sc.next();
		String contact=sc.next();
		int balance=sc.nextInt();
		Account a1=new Account();
		a1.setAccno(accno);
		a1.setName(name);
		a1.setContact(contact);
		a1.setBalance(balance);
		
		System.out.println(a1);
		
		Bank b1 =new Bank() ;
		System.out.println("enter amount ");
		int amt=sc.nextInt();
	    b1.gPay(amt, a1);
	
	    
	    
	    
	    
	}

}
