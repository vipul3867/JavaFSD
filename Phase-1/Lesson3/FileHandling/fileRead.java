package FileHandling;
import java.io.FileReader; 
public class fileRead { 
  
    public static void main(String args[])throws Exception{    
          FileReader filereadObj=new FileReader("E:\\Simplilearn\\file.txt");    
          int iterator;    
          while((iterator=filereadObj.read())!=-1)    
          System.out.print((char)iterator);    
          filereadObj.close();    
    }    
}

