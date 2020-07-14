package Java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String args[])
	{
		HashMap<String ,String> map = new HashMap<String ,String>();
		map.put("URL", "www.google.com");
		map.put("username", "divya");
		map.put("password", "divya123");
		map.put("password", "divya123"); //no duplicates 
		map.put(null, "kaira");  //only 1 null key is accepted
		//map.put(null, "urmi");
		map.put("name", "null");
		map.put("city", "null");
		
	
		//System.out.println(map);
		System.out.println(map.get("URL"));
		//map.remove("username");
		//System.out.println(map);
		
		Set<Entry<String, String>> setmap = map.entrySet();
		Iterator<Entry<String, String>> i = setmap.iterator();
		while(i.hasNext())
		{
			///////first method//////////
			
			  /*String[] words = i.next().toString().split("="); 
			  for(int t=0;t<words.length;t++) 
			  {
				  System.out.println(words[t]+ "  ");
			  }*/
			
			/////////////////////second method///////////
			  Map.Entry mp = (Map.Entry)i.next(); 
			  System.out.println(mp.getKey() +" = "+ mp.getValue());
			 
			 
			////////third method----but cannot get all keys and all values at the same time
			//System.out.println(i.next().getKey());
			//System.out.println(i.next().getValue());
				
		}
		
		  
		
		
		
	}

}
