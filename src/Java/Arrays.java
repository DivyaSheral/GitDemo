package Java;

public class Arrays
{
	public void oneDimentionalArray()
	{
		int a[]= new int[2];
		a[0]= 1;
		a[1]=2;	
		int b[]= {1,2,3,5,6};
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
	}
	
	
	///    1  2  3
	///    3  4  5   this is a matrix with 2 rows , 3 columns
	public void multiDimentionalArray()
	{
		//a[rows][columns]
		int a[][]= new int[2][3];
		//or
		///         1strow   2ndrow
		int b[][]= {{1,2,3},{3,4,5}};
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(b[i][j] +" ");
			}
			System.out.println();
		}
		
	}
	
	
	
	public void printLowestNumber()
	{
		int a[][] = {{3,3,4},{5,0,7},{9,17,1}};
		int Minnum=a[0][0];
		int col=0;
		int max=0;
		for(int i=0;i<3;i++)
		{
			for(int j =0;j<3;j++)
			{
				if(a[i][j]<Minnum)
				{
					Minnum =a[i][j];
					col=j;
				}
				
			}		
				
		}
		max=a[0][col];
		for(int i=0;i<3;i++)
		{
			
			if(max<a[i][col])
			{
				max=a[i][col];
				
			}
		}
		System.out.println("maximum number in the column ith min value is = "+max);
		
		System.out.println("lowest number = "+Minnum);
		//System.out.println("column = "+col);
		
		
	}
	
	public void printMaximumNumber()
	{
		int a[][] = {{3,5,1},{0,4,7},{95,15,3}};
		int Maxnum=a[0][0]; 
		
		for(int i=0;i<3;i++)
		{
			for(int j =0;j<3;j++)
			{
				if(a[i][j]>Maxnum)
				{
					Maxnum =a[i][j];
					
				}
				
			}
			
		}
		
		System.out.println("maximum number = "+Maxnum);
		
	}
	public static void main(String arg[])
	{
		Arrays ar = new Arrays();
		//ar.oneDimentionalArray();
		//ar.multiDimentionalArray();
		ar.printLowestNumber();
		//ar.printMaximumNumber();
	}

}
