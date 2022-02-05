package FileHandling;
import java.io.FileWriter;
import java.io.IOException;
public class fileWrite {
	   public static void main(String[] args) throws IOException
	      {
	     try 
	     {
	          FileWriter fw=new FileWriter("E:\\Simplilearn\\file.txt");
	          fw.write("Welcome to the world of Java");
	          fw.close();
	       }
	     catch(Exception e)
	     {
	        System.out.println(e);
	        }
	     System.out.println("File Created Sucessfully");
	     }
	  }
