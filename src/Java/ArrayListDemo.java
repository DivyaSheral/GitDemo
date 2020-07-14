package Java;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String args[])
	{
		ArrayList<String> a = new ArrayList<String>(); //arraylist of typr string
		a.add("Divya");
		a.add("Urmila");
		a.add(1,"Kiara");
		System.out.println(a);
		//a.remove("Urmila");
		a.add("Divya");
		System.out.println(a);
		System.out.println(a.get(0));
		System.out.println(a.indexOf("Divya"));
		System.out.println(a.lastIndexOf("Divya")); //last index of the element if it is present more then once
	}

}
