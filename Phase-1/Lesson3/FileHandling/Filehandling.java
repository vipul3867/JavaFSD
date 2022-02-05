package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Filehandling {
			public static List<String> readFile(String fileName)
			{
            return null;
			}
        public static void main(String args[]){     
         Scanner sc=new Scanner(System.in);
      	 String choice;
      	 
      	 System.out.println("File Handling");
      	 System.out.println("1.Read");
      	 System.out.println("2.Write");
      	 System.out.println("3.Append");
      	 
      	 System.out.println("Enter your choice");
      	 choice=sc.nextLine();
      	 
      	 if(choice.equals("1"))
      	 {
           List<String> list=Collections.emptyList();
      	   try{
      		 list=Files.readAllLines(Paths.get("E:\\Simplilearn\\file.txt"),StandardCharsets.UTF_8);
      		 Iterator<String> it =list.iterator();
         	while(it.hasNext())
         	{
         	System.out.println(it.next());
         	}
      	 }catch (Exception e)
      	 {
      	 e.printStackTrace();
      	 }
      	 
      	 }
      	 else if(choice.equals("2"))
      	 {
      		   try {
      		         FileWriter fw = new FileWriter("E:\\Simplilearn\\file.txt");
      		         fw.write("Welcome to Java programming");
      		         fw.close();
      		         System.out.println("File Write Done");
      		      }
      		      catch (Exception e) {
      		    	  System.out.println("There are some Exception");
      		      }
      		   }
      	 else if(choice.equals ("3")) 
      	 {
      		try {
     	         String data = "Happy Learning!";
     	         File f = new File("E:\\Simplilearn\\file.txt");
     	         if(!f.exists()) {
     	            f.createNewFile();
     	         }

     	         FileWriter fileWritter = new FileWriter(f.getName(),true);
     	         BufferedWriter out = new BufferedWriter(fileWritter);
     	         out.write(data);
     	         out.close();
     	         System.out.println("Done");
     	            } catch(Exception e){
     	            e.printStackTrace();
     	            }
     	 }
     	 
     	   }

        
        }
		
