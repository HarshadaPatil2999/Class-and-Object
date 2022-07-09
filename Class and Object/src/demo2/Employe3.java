package demo2;
import java.util.Scanner;
public class Employe3 {
	int id, salary;
	String name, department, designation, rating;

	void setData(int i, String n, String dept, int s, String d, String r)
	{
		id = i;
		name = n;
		department = dept;
		salary = s;
		designation = d;
		rating = r;

	}

	void bonus()
	{
		if (rating.equals("A")) {
			salary += salary * 20 / 100;
            System.out.println("bonus:" + salary);
		}
		else if (rating.equals("B"))
		{
			salary += salary * 15 / 100;
			System.out.println("bonus:" + salary);
		}
        else if (rating.equals("C"))
        {
			salary += salary * 10 / 100;
            System.out.println("bonus:" + salary);

		}
        else if (rating.equals("D"))
        {
			salary  += salary * 5 / 100;
            System.out.println(" bonus:" + salary);
		}
        else if (rating.equals("E")) 
        {
     
			System.out.println("no bonus:" + salary);
		}
	}

	public String toString()
	{
		return id+" "+name+" "+department+" "+ salary+" "+designation+" "+rating+" ";
	}

	public static void main(String[] args) 
	{
		int id, salary;
		String name, department, designation, rating;
		Scanner sc = new Scanner(System.in);

		Employe3 e1 = new Employe3();
		System.out.println("id,name,department,salary,designation,rating");
		id = sc.nextInt();
		name = sc.next();
		department = sc.next();
		salary = sc.nextInt();
		designation = sc.next();
		rating = sc.next();
		e1.setData(id, name, department, salary, designation, rating);
		System.out.println();

		Employe3 e2 = new Employe3();
		System.out.println("id,name,department,salary,designation,rating");
		id = sc.nextInt();
		name = sc.next();
		department = sc.next();
		salary = sc.nextInt();
		designation = sc.next();
		rating = sc.next();
		e2.setData(id, name, department, salary, designation, rating);

		System.out.println(e1);
		e1.bonus();
		System.out.println();
		System.out.println(e2);
		e2.bonus();

	}

}
