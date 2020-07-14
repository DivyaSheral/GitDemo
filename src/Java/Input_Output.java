package Java;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Input_Output {
	
	public void readScanner() throws IOException
	{
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner file = new Scanner(new File("D:\\JavaWorkspace\\RahulShettyTraining\\input.txt"));
		
		
		while(file.hasNext()){
			if (file.hasNextInt())
				{
					list.add(file.nextInt());
				}
			else file.next();
		}
		
	 Collections.sort(list); 
	 FileWriter filewrite = new FileWriter("D:\\JavaWorkspace\\RahulShettyTraining\\output.txt");
	 for(int i=0;i<list.size();i++)
	 {
		 filewrite.write(list.get(i)); 
		 
	 }
	 filewrite.flush();
	 
	
		for (Integer i: list) 
		System.out.println(i);
	}
	
	
	static int numLines = 0;
	public void readBuffered() throws IOException
	{
	        ArrayList<String> inputData = new ArrayList<String>();
	       
	        try {
	            Scanner in = new Scanner(new BufferedReader(new FileReader("D:\\JavaWorkspace\\RahulShettyTraining\\input.txt")));

	            /* Here we can read in the input file */
	            /* In this example, we're reading all the lines of file
	               `input.txt` and then ignoring them. 
	               You should modify this part of the
	               program to read and process the input as desired */
	            while(in.hasNextLine()) {
	                String line = in.nextLine();
	                if (!line.isEmpty())
	                    numLines++;
	            }

	            /* In this example, we're writing `num_lines` to
	               the file `output.txt`.
	               You should modify this part of the
	               program to write the desired output */
	            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("D:\\JavaWorkspace\\RahulShettyTraining\\output.txt")));
	            output.println("" + numLines);
	            output.close();
	        } catch (IOException e) {
	            System.out.println("IO error in input.txt or output.txt");
	        }
	    }
		
	public static void main(String[] args) throws IOException
	{
		Input_Output in = new Input_Output();
		in.readBuffered();
			
	}
		
	

}
