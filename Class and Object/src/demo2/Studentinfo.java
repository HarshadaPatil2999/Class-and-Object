package demo2;

public class Studentinfo {
	int rollno,mark;
	String name,dept,sports;
	void setData(int r,String n,String d,int m,String s) {
		rollno=r;
		name=n;
		dept=d;
		mark=m;
		sports=s;
		
	}
void fillData() {
	System.out.println(rollno+" "+name+" "+dept+" "+mark+" "+sports+" ");
	}
void sports()
{
	if(sports.equals("badminton")) {
		mark=mark+5;
	
		System.out.println("new marks:"+mark);
	}
	else if(sports.equals("hokey")) {
		mark=mark+3;
	
			System.out.println("new marks:"+mark);
	}
		
		else if(sports.equals(" khokho")) {
			mark=mark+2;
		
		System.out.println("new marks:"+mark);

		}
	else if (sports.equals("no"))
	{
	
		mark=mark;
	
		System.out.println("new marks:" +mark);
	}
	else
		System.out.println("invalid sport name");
}
public static void main(String[] args) {
	Studentinfo s1=new Studentinfo();
	s1.setData(101, "Raj", "elec", 70,"hokey");
	s1.fillData();
	s1.sports();
	System.out.println();
	Studentinfo s2=new Studentinfo();
	s2.setData(201, "Riya", "comp", 60, "no");
	s2.fillData();
	s2.sports();
	System.out.println();
Studentinfo s3=new Studentinfo();
s3.setData(301, "Shruti", "civil", 75,"badminton");
s3.fillData();
s3.sports();
}
}