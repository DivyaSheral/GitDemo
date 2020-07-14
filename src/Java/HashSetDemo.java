package Java;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<Integer> h = new HashSet<Integer>();
		h.add(1);
		h.add(100);
		h.add(300);
		h.add(250);
		h.add(50);
		h.add(null);
		h.add(100);  //duplicate value 100 is just added once
		
		System.out.println(h);
		h.remove(100);
		System.out.println(h);
		System.out.println(h.contains(280));
		/*
		 * String a = h.toString();//integer set is converted to string se
		 * System.out.println(a); System.out.println(a.charAt(2));
		 */
		Iterator<Integer> i = h.iterator();
		System.out.println(i.next());
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
