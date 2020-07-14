package Java;

public class LoopsPrograms {
	
	public void increasingPyramid()
	{
		int k=1;
		for(int i=0;i<4;i++)
		{
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(k +" ");
				//System.out.print("\t"); //for space
				k++;
			}
		 System.out.println();
		}
	}
	
	public void decreasingPyramid()
	{
		int k=1;
		for(int i=1;i<6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k +" ");
				k++;
			}
			System.out.println("");
		}
	}
	
	public void diamond()
	{
		 
	      int i, j, k, space=4;
	      for(i=1;i<5;i++)
	      {
	    	  for(k=0;k<space;k++)
	    	  {
	    		  System.out.print(" ");
	    	  }
	    	  for(j=1;j<=i;j++)
	    	  {
	    		  System.out.print("* ");
	    	  }
	    	  System.out.println();
	    	  space--;
	      }
	}
	
	public static void main(String[] args)
	{	
		LoopsPrograms lp = new LoopsPrograms();
		lp.increasingPyramid();
		lp.decreasingPyramid();
		
		lp.diamond();
		
	}

}
