package com.ishwari;

public class Student2 {
	
     Student2(String name){
	   System.out.println("Name:"+name);
}
     Student2(int age){
	System.out.println("age:"+age);
}
     public static void main(String[]args) {
    	 Student2 obj1=new Student2("ishwari");
 		Student2 obj2=new Student2(22);
 		Student2 obj3=new Student2("Sahil");
 		Student2 obj4=new Student2(22);
     } 
}
