package Java;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectiomDempProgram {

	public static void main(String[] args) 
	{
	
				int a[]= {2,2,3,4,4,5,3,3,6,6,6,1,1};
				
				ArrayList<Integer> list = new ArrayList<Integer>();
				
				
				for(int i=0;i<a.length;i++)
				{
					int cnt=0;
					if(!list.contains(a[i]))
					{
						list.add(a[i]);
						cnt++;
						
						for(int j=i+1;j<a.length;j++)
						{
							if(a[i]==a[j]) 
							{
							cnt++;	
							}
						}
						System.out.println("Repeated "+a[i] +"=" +cnt);
		
					}
					if(cnt==1)
					{
						System.out.println(a[i] +"is unique number");
					}
					
				}
				
				System.out.println(list);
				
				
				
				
				
				
				
				
				
				
				
				
				/*Iterator it = list.iterator();
				while(it.hasNext())
				{
					if(it.next().equals(a[i]))
					{
						cnt++;
					}
				}
				System.out.println("number of times repeated" +a[i] +"=" +cnt);*/
				
				
				
	}
}
