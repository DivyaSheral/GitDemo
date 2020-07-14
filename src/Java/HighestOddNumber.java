package Java;

import java.util.ArrayList;
import java.util.Scanner;

public class HighestOddNumber 
{
	public static int processArray(ArrayList<Integer> array, int index)
    {
        if(index ==array.size()-1 && array.get(index)% 2!=0 )
        {
        	return array.get(index);
        }
        else if (index == array.size()-1)
		{
			return Integer.MIN_VALUE;
		}
		int high = processArray(array,index+1);
		
		if(array.get(index)%2!=0)
		{
			high=high>array.get(index)?high:array.get(index);
		}
		return high;
		
       
    }

    @SuppressWarnings("deprecation")
	public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int index = 0;
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0) 
                break;
            arrayList.add(new Integer(num));
        }
        int result = processArray(arrayList,index);
        System.out.println(result);
    }
}


