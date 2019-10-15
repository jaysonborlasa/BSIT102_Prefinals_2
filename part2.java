import java.io.*;
import java.io.File;
import java.util.Scanner;


 class Files
{
		public static void main(String[]args) throws Exception
		{
			//print file name
			System.out.println("Enter the file name :");
			//declare the object
			Scanner jb = new Scanner(System.in);
			
			//new file
			File file = new File(jb.nextLine() + ".jwu");
			jb = new Scanner(System.in);
			
			//string line
			String lines = jb.nextLine();
			//print lines
			System.out.println(lines);					
									
		}
}