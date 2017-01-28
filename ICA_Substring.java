

import java.io.*;

import java.util.Scanner;

public class ICA_Substring
{
    public static void main(String[] args) throws IOException
    {
        
        String groupedLine = "";
		int position = 0;
		int counter = -1;
        
        Scanner fromConsole = new Scanner(System.in); 
		
		while(fromConsole.hasNext())
		{

			groupedLine += fromConsole.nextLine();
			
		}
		
		groupedLine = groupedLine.toLowerCase();
        
		while(position != -1)
		{
			position = groupedLine.indexOf("the", position + 1);
			counter++;
		}
		
		
        System.out.println("Original Text: " + groupedLine);
		
		System.out.println("word 'the' appears : " + counter + " times in the text.");
		
        
        
        
    }
    
    
}