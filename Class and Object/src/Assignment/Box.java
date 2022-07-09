package Assignment;
import java.util.Scanner;
public class Box {
	float length,width,height;
	void setData(float l,float w,float h)
	{
		length=l;
		width=w;
		height=h;
		
	}
void volume()
{
	double volume=length*width*height;
	System.out.println("Volume of box:"+volume);
}
public String toString()
{
	return  length+" "+width+" "+height+" ";
}
public static void main(String[] args) {
	
	int length,width,height;
	Scanner sc=new Scanner(System.in);
	Box b1=new Box();
	System.out.println("Enter length,width and height");
	 length=sc.nextInt();
	width=sc.nextInt();
	height=sc.nextInt();
	b1.setData(length, width,height);
	System.out.println(b1);
	b1.volume();
}


}
