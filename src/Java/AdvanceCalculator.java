package Java;

public class AdvanceCalculator extends BasicCalculator {

	int i=20;
	public AdvanceCalculator()
	{
		super(); //this referes to basic class constructor
		System.out.println("Advance Calculator Constructor");
	}
	public void addition()
	{
		
		//System.out.println(super.getClass()); //get tye current class name
		//super.addition(); //this will call basicclass additon
		System.out.println("AdvanceCalculator: addition");
	}
	
	@Override
	public void multiplication() {
		System.out.println("AdvanceCalculator: multiplication");
		
	}
	
	public static void main(String args[])
	{
		AdvanceCalculator ad = new AdvanceCalculator();
		ad.addition();
		ad.subtraction();
		ad.multiplication();
		
		//BasicCalculator b = ne BasicCalculator();
		BasicCalculator b = new AdvanceCalculator();
		System.out.println(b.i);
		b.addition();
		
		
		
		
	}
	

}
