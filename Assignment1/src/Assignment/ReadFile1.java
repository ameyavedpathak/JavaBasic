package Assignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile1 {

	static String fileName = ("C:\\Users\\arved\\FileHandling\\2727.txt");    // Location of file
	  private String StartingURL;				//Declared Private and used encapsulation														
	  static int traversedurlcount;				// Static Variable to keep the record
	  
	  public ReadFile1()              ///Constructor Used
	  {
		  traversedurlcount = 0;
		  StartingURL = getStartingURL();
		  
	  }
	  
	  
	  public static String getStartingURL()
	  {
		  
		  try {
			  	String line;
	            // FileReader reads text files in the default encoding.
	            FileReader fileReader = 
	                new FileReader(fileName);

	            // Always wrap FileReader in BufferedReader.
	            BufferedReader bufferedReader = 
	                new BufferedReader(fileReader);

	            while((line = bufferedReader.readLine()) != null) {
	                System.out.println(line);
	                
	                return line;
	            }   
	           
	            // Always close files.
	            bufferedReader.close();         
	        }
  
		  catch(FileNotFoundException ex) {					///Use of Exception handling
	            System.out.println(
	                "Unable to open file '" + 
	                fileName + "'");                
	        }
	        catch(IOException ex) {
	            System.out.println(
	                "Error reading file '" 
	                + fileName + "'");                  
	            // Or we could just do this: 
	            // ex.printStackTrace();
	        }
		  
		return null;
		  		  
	  }
	  
	  
	  
	public void crawler(String URL){
		
		ArrayList<String> listOfPendingURLs = new ArrayList<>();
		ArrayList<String> listOfTraversedURLs = new ArrayList<>();
		
		listOfPendingURLs.add(URL);		
		while (!listOfPendingURLs.isEmpty() &&
				traversedurlcount < 100)
		{
			String urlString = listOfPendingURLs.remove(0);
			if (!listOfTraversedURLs.contains(urlString))
			{
				listOfTraversedURLs.add(urlString);
				traversedurlcount++;
				System.out.println("Craw " + urlString);
				System.out.println("Counter :"+traversedurlcount);
				for (String s: getSubURLs(urlString)) 
				{
				if (!listOfTraversedURLs.contains(s))
				listOfPendingURLs.add(s);
		        }
			}
	  	}
		System.out.println("Done with 100 Count");
	}
	
	public static ArrayList<String> getSubURLs(String urlString) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		try {
			java.net.URL url = new java.net.URL(urlString);
			Scanner input = new Scanner(url.openStream());
			int current = 0;
			while (input.hasNext()) {
			String line = input.nextLine();
			current = line.indexOf("http:", current);
			while (current > 0) {
			int endIndex = line.indexOf("\"", current);
			if (endIndex > 0) { // Ensure that a correct URL is found
			list.add(line.substring(current, endIndex));
			current = line.indexOf("http:", endIndex);
			}
			else
				current = -1;
			 }
		 }
	}
		catch (Exception ex) {
		System.out.println("Error: " + ex.getMessage());
	}
		
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReadFile1 obj = new ReadFile1();
		obj.crawler(obj.StartingURL);
		
		
	}

}
