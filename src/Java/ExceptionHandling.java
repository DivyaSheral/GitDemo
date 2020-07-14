package Java;

public class ExceptionHandling 
{

	public static void main(String[] args) 
	{
		try
		{
		int a=10,b=0;
		int res=a/b;
		System.out.println(res);
		}

		catch(ArithmeticException et)
		{
			System.out.println("Cannot divide by zero -Arithmatic");
		}
		
		catch(NumberFormatException et)
		{
			System.out.println("Cannot divide by zero-NumberFormatException");
		}
		
		catch(Exception e)
		{
			System.out.println("Cannot divide by zero - Exception");
		}
		

	}
}
