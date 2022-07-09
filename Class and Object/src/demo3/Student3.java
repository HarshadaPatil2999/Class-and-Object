package demo3;
import java.util.Scanner;
public class Student3 {
	int rollno,mark;
	String name,dept,sports;
	void setData(int  rollno,String name,String dept,int mark) {
		rollno=rollno;
		name=name;
		dept=dept;
		mark=mark;
	
		
	}
	 public String toString()
			{
				return rollno+" "+name+" "+dept+" "+mark+" ";
			}
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student3 s1=new Student3();
		System.out.println("Enter rollno,name,dept,mark");
		int rollno,mark;
		String name,dept,sports;
		rollno=sc.nextInt();
		name=sc.next();
		dept=sc.next();
		mark=sc.nextInt();
		s1.setData( rollno,name,dept, mark);
		System.out.println(s1);
		
	}

}
