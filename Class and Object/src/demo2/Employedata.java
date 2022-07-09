package demo2;

public class Employedata {
	int id,salary;
	
	String name,department,designation,rating;
	void setData(int i,String n,String dept,int s,String d,String r) {
		id=i;
		name=n;
		department=dept;
		salary=s;
		designation=d;
		rating=r;
		
	}
void fillData() {
	System.out.println(id+" "+name+" "+department+" "+salary+" "+designation+" "+rating+" ");
	}
void bonus()
{
	if(rating.equals("A")) {
	  salary+=salary*20/100;
	
		System.out.println("bonus:"+salary);
	}
	else if(rating.equals("B")) {
		salary+=salary*15/100;
	
			System.out.println("bonus:"+salary);
	}
		
		else if(rating.equals("C")) {
			salary+=salary*10/100;
		
		System.out.println("bonus:"+salary);

		}
	else if (rating.equals("D"))
	{
	salary+=salary*5/100;
		
	
		System.out.println("  bonus:" +salary);
	}
	else if(rating.equals("E"))
	{
		

		System.out.println("no bonus:"+salary);
}
	}
public static void main(String[] args) {
	Employedata e1=new Employedata();
	e1.setData (01,"raj","elec",20000," junior engg","B");
	e1.fillData();
	e1.bonus();
	System.out.println();
	Employedata e2=new Employedata();
	e2.setData(02, "Riya", "civil", 30000,"junior engg","C");
	e2.fillData();
	e2.bonus();
	System.out.println();
Employedata e3=new Employedata();
e3.setData(30, "Shruti", "information technology", 45000,"software developer","A");
e3.fillData();
e3.bonus();
System.out.println();
Employedata e4=new Employedata();
e4.setData(15, "hardik", "Human Resources", 70000,"HR manager","D");
e4.fillData();
e4.bonus();
System.out.println();
Employedata e5=new Employedata();
e5.setData(15, "trupti", "mech", 20000,"design engg","E");
e5.fillData();
e5.bonus();
}

}
