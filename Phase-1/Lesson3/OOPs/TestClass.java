package OOPs;

public class TestClass {
	interface First 
	{  
	    default void show() 
	    { 
	        System.out.println("Default First"); 
	    } 
	} 
	interface Second 
	{  
	    default void show() 
	    { 
	        System.out.println("Default Second"); 
	    } 
	}  
	public class TestClass1 implements First, Second 
	{  
	    public void show() 
	    {  
	        First.super.show(); 
	        Second.super.show(); 
	    } 
	    public void main(String args[]) 
	    { 
	        TestClass1 ob = new TestClass1(); 
	        ob.show(); 
	    } 
	}
}
