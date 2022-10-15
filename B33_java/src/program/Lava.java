package program;

public class Lava {
	void display1()
	{
		System.out.println("I am the Grandfather");
		
	}

}
class Rama extends Lava
{
	void display2()
	{
		System.out.println("I am the Father");
	}
}
class Dasatha extends Rama{
	void display3()
	{
		System.out.println("I am the Grandson");
		
	}
}
