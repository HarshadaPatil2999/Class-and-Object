package demo2;

public class Car {
	void wheelNo()
	{
		System.out.println("4 wheels");
	}

	void dashBorad()
	{
		System.out.println("Dashboard is compulsary for each car");
	}

	void engineCapacity()
	{
		System.out.println("Average engine capacity:1100cc ");

	}

	void milage() 
	{
		System.out.println("milage :20km/1 ltr");
	}

	public static void main(String[] args)
	{

		Car c1 = new Car();
		Car c2=new Car();
		Car c3=new Car();
		System.out.println("First Car");
		c1.engineCapacity();
		System.out.println("Second Car");
		c2.dashBorad();
		c2.milage();
		System.out.println("Third Car");
		c3.milage();
		c3.engineCapacity();
	}

}
