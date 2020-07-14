package Java;

public class StringFunctions {
	
	
	public void reverseString(String a)
	{
		String b = "";
		for(int i=a.length()-1;i>=0;i--)
		{
			b += a.charAt(i);
		} 
		System.out.println("Reverse of "+a+ ": "+b);
		
	}
	
	public void palindrome(String a)
	{
		String b = "";
		for(int i=a.length()-1;i>=0;i--)
		{
			b += a.charAt(i);
			//System.out.print(a.charAt(i));
		}
		if(a.contentEquals(b))
		{
			System.out.println(a+" is a palindrome");
		}
		else
		{
			System.out.println(a+" is not a palindrome");
		}	
		
	}
	
	public void compare2Strings(String a , String b)
	{
		if(a==b)
		
			System.out.println("Equal");
		
		else
			System.out.println("Not Equal");
	}
	
	public void split(String b)
	{
		String splits[] = b.split(" ");
		for(int i=0;i<splits.length;i++)
		{
			System.out.println(splits[i]);
		}
	}
	

	public static void main(String[] args)
	{	
		String a = "divya";
		String b = "compare divya d divayvid";
		StringFunctions sf = new StringFunctions();
		sf.reverseString(a);
		sf.palindrome(a);
		sf.compare2Strings(a, b);
		System.out.println(b.replace("o", ""));//remove a character
		
		System.out.println(b.replace("div", "ape"));//replace substring with another substring
		System.out.println(b.toUpperCase());
		//System.out.println(b.contains("divya")); //search for string
		System.out.println(b.indexOf("divya"));
		
		
	}

}
