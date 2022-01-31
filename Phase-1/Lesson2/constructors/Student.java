package com.simplilearn.methods;

public class Student {
	    //class level variables
	    int id;
	    String name;
	    String dept;
	    
	    //default constructor
	    public Student()
	    {
	        id=20;
	        name="Vipul";
	    }
	    public Student(int id,String name,String dept)
	    {
	        this.id=id;
	        this.name=name;
	        this.dept=dept;
	    }
	    
	    public static void main(String[] args) {
	        
	        //when you create object automatically it calls default constructor
	        //if no default constructor then compiler will create that
	        Student obj=new Student();
	        System.out.println("User 1");
	        System.out.println("Id: "+obj.id);
	        System.out.println("Name: "+obj.name);
	        
	        Student obj2= new Student(42,"Vikas","Science");//parameterized constructor
	        System.out.println("User 2");
	        System.out.println("Id: "+obj2.id);
	        System.out.println("Name: "+obj2.name);
	        System.out.println("Dept: "+obj2.dept);
	        
	        
	    }
	}



