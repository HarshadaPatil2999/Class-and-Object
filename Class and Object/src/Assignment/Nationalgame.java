package Assignment;
import java.util.Scanner;
public class Nationalgame {
	
          String countryname;

void setData(String cn)
{
	countryname=cn;
}

void choice()
{
	switch(countryname)
	{
	case"India":
		System.out.println("National game is Hockey");
		break;
	case "China":
		System.out.println("National game is Table Tennis");
		break;
	case "Bangladesh":
		System.out.println("National game is Kabbadi");
		break;
	case"Italy":
		System.out.println("National game is Football");
		break;
	case"UnitedStates":
		System.out.println("National game is Baseball");
		break;
		default:
			System.out.println("Invalid country name");
	}
}
public String toString()
{
	return countryname+" ";
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 String countryname;
	 Nationalgame n1=new Nationalgame();
	 System.out.println("Enter country name");
	 countryname=sc.next();
	 n1.setData(countryname);
	 System.out.println();
	 Nationalgame n2=new Nationalgame();
	 System.out.println("Enter country name");
	 countryname=sc.next();
	 n2.setData(countryname);
	 
	 System.out.println(n1);
	 n1.choice();
	 System.out.println();
	 System.out.println(n2);
	 n2.choice();
	 
}









}