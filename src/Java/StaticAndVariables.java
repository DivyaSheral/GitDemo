package Java;



public class StaticAndVariables {
	
	String name ;    //
	String address;  //instance variables tied to instance like s1,s2
	static String city; // class variable tied to class, shared with objects
	static int i;               //
	
	static         //all the static variables are instantiated in this block
	{             //this block is only called once and thats before constructor
		city="Solapur";
		i=0;
		System.out.println("Static Block");
	}
	
	
	public StaticAndVariables(String name ,String address) //constructor is called for every ne object
	{
		this.name = name;
		this.address = address;
		i++; //for evry new object it is incremented
		System.out.println("Constructor");
	}
	
	public void printdata()
	{
		System.out.println("Name :" +name);
		System.out.println("Address :" +address);
		System.out.println("City :" +city);
		System.out.println("i value :" +i);
		System.out.println("method");
		
	}
	
	
	public static void main(String args[])
	{
		StaticAndVariables s1 = new StaticAndVariables("divya","new paccha peth");
		s1.printdata();
		
		StaticAndVariables s2 = new StaticAndVariables("kiara","badravati");
		s2.printdata();
		
		StaticAndVariables s3 = new StaticAndVariables("kiara","badravati");
		s2.printdata();
	}
	

}
