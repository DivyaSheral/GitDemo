package Java;

public class IndianTrafficRules implements TrafficRules {
	

	@Override
	public void greenGO() {
		System.out.println("Green lights");	
	}
	@Override
	public void redStop() {
		System.out.println("Red light");
		
	}
	
	public void walkingSignal()
	{
		System.out.println("walking signal of India");
	}
	
	public static void main(String args[])
	{
	
		IndianTrafficRules id = new IndianTrafficRules();
		id.greenGO();
		id.redStop();
		id.walkingSignal();
		
		
		/*
		 * TrafficRules tr = new IndianTrafficRules(); tr.greenGO(); tr.redStop();
		 */
		
		
		
	}
	
	

}
