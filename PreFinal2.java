import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;
import java.util.Base64;

class Decrypt
{
	public static void main(String args[]) throws IOException
	{
		//declare the object
		Scanner jb = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		//string input
		String input = "";
		
		do
		{
			input = jb.nextLine();
			words.add(input);
		}
		while (!input.equals(":q"));
		{
		
			for(String a : words)//for string
			{
				String base64 = Base64.getEncoder() .encodeToString(a.getBytes());
				System.out.println ("Save or Discard?");//
				String choose = jb.nextLine();
				
				if(choose.equals("save"))//if you choose save then it will save the file
				{
					FileWriter file = new FileWriter( base64+".jwu"); //This is for the file
					System.out.println("Input File name:");//input file name
					file.write(jb.nextLine());
					break; //simply it will stop if you are done in the first
				}	
				else 
				{
					//print when you`re done
					System.out.println("HOOOOOOOOOORAY");
				}
			}
			
		
				
		}
		
		
	}
}