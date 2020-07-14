package Java;



public class ChildClass extends ParentClass {
	
	String name = "kiara";
	
	public ChildClass()
	{
		super();
		System.out.println("In child Constructor");
	}
	public void getdata()
	{
		System.out.println(name);
		System.out.println(super.name);
		System.out.println("child class getdata");
		super.getdata();
		
	}
	public void thisfunction()
	{
		this.getdata(); //calls the getdata of current i.e child class
	}
	
	//public void demo()  //this methos is declared as final in parent class so canot override it
	//{
		
	//}

	public static void main(String[] args) {
		
		ChildClass d = new ChildClass();
		d.getdata();
		d.thisfunction();
		
		
	}

}
