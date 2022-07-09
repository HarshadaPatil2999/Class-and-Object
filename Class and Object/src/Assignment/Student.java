package Assignment;
import java.util.Scanner;
public class Student {
	int id,mark1,mark2,mark3;
	float percentage;
	String name,department;
	void setData(int i,String n,String dept,int m1,int m2,int m3)
	{
		id=i;
		mark1=m1;
		mark2=m2;
		mark3=m3;
		name=n;
		department=dept;
		
	}
	void percentage()
	{
		 percentage=((mark1+mark2+mark3)*100)/300;
		System.out.println("percentage:"+percentage);
	}
	void result()
	{
		if(percentage>=75)
		     
		{
			System.out.println("student get distingtion");
		}
			else if(percentage>=60)
			{
				System.out.println("student get first class");
			}
				else if(percentage>=50)
				{
					System.out.println("student get second class");
				}
				else if(percentage>=40)
				{
					System.out.println("pass");
			}
				else
				{
					System.out.println("fail");
				}
	}
	public String toString()
	{
		return id+" "+name+" "+department+" "+mark1+" "+mark2+" "+mark3+" ";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id,mark1,mark2,mark3;
		float percentage;
		String name,department;
		Student s1=new Student();
		System.out.println("Enter id,name,dept,m1,m2,m3");
		 id=sc.nextInt();
		 name=sc.next();
		 department=sc.next();
		 mark1=sc.nextInt();
		 mark2=sc.nextInt();
		 mark3=sc.nextInt();
		s1.setData(id, name, department, mark1, mark2, mark3);
		System.out.println(s1);
		s1.percentage();
		s1.result();
		System.out.println();
		Student s2=new Student();
		System.out.println("Enter id,name,dept,m1,m2,m3");
		 id=sc.nextInt();
		 name=sc.next();
		 department=sc.next();
		 mark1=sc.nextInt();
		 mark2=sc.nextInt();
		 mark3=sc.nextInt();
		s2.setData(id, name, department, mark1, mark2, mark3);
		
		
		System.out.println();
		System.out.println(s2);
		s2.percentage();
		s2.result();
		
	}

}
