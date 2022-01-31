package Map;
import java.util.*;
public class mapDemo {
		public static void main(String[] args) {
			//Hashmap
			HashMap<Integer,String> hm=new HashMap<Integer,String>();      
		      hm.put(1,"Tim");    
		      hm.put(2,"John");    
		      hm.put(3,"rosy");   
		       
		      System.out.println("\nThe elements of Hashmap are ");  
		      for(Map.Entry m:hm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }
		      
		     //HashTable
		       
		      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
		      ht.put(4,"Alex");  
		      ht.put(5,"Oliver");  
		      ht.put(6,"Lucas");  
		      ht.put(7,"Aarav");  

		      System.out.println("\nThe elements of HashTable are ");  
		      for(Map.Entry n:ht.entrySet()){    
		       System.out.println(n.getKey()+" "+n.getValue());    
		      }
		      
		      //TreeMap
		      
		      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		      map.put(8,"Annie");    
		      map.put(9,"Ryan");    
		      map.put(10,"Luis");       
		      
		      System.out.println("\nThe elements of TreeMap are ");  
		      for(Map.Entry l:map.entrySet()){    
		       System.out.println(l.getKey()+" "+l.getValue());    
		      }    
		      
		   }  
	}

