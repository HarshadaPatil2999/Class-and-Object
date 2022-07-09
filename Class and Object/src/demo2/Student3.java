package demo2;

import java.util.Scanner;

public class Student3 {
	int rollno,mark;
	String name,dept,sports;
	
	void setData(int r,String n,String d,int m,String s)
	{
		rollno=r;
		name=n;
		dept=d;
		mark=m;
		sports=s;
		
	}

void sports()
{
	if(sports.equals("badminton")) 
	{
		mark=mark+5;
	
		System.out.println("new marks:"+mark);
	}
	else if(sports.equals("hokey"))
	{
		mark=mark+3;
	
			System.out.println("new marks:"+mark);
	}
		
		else if(sports.equals(" khokho")) 
		{
			mark=mark+2;
		
		System.out.println("new marks:"+mark);

		}
	else if (sports.equals("no"))
	{
	
		mark=mark;
	
		System.out.println("new marks:" +mark);
	}
	else
		System.out.println(" ");
     } 
        public String toString()
		{
			return rollno+" "+name+" "+dept+" "+mark+" "+sports+" ";
		}
	
public static void main(String[] args) 
{
	int rollno,mark;
	String name,dept,sports;
	Scanner sc=new Scanner(System.in);

	//Student3 s1=null;
	for(int i=1;i<=2;i++)
	{
		System.out.println("rollno,name,dept,mark,sports");
		rollno=sc.nextInt();
		name=sc.next();
		dept=sc.next();
		mark=sc.nextInt();
		sports=sc.next();
		Student3 s1 = new Student3();
		s1.setData(rollno,name,dept,mark,sports);
		System.out.println(s1);
		s1.sports();
	}
	
	
	
	
	
}

}



