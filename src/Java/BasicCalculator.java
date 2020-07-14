package Java;

public abstract class BasicCalculator {
	
	int i =10;
	public BasicCalculator()
	{
		System.out.println("Basic Calculator Constructor");
	}
	public void addition()
	{
		System.out.println("BasicCalculator addition");
	}
	public void subtraction()
	{
		System.out.println("BasicCalculator subtraction");
	}
	public abstract void multiplication();

}
