package com.ishwari;

public class Student {
	Student(){
		System.out.println("Hello i am student");
		
	}
	Student(String name){
		System.out.println("Hello:"+name);
	}
	Student(int age){
		System.out.println("age:"+age);
	}
	public static void main(String[]args)
	{
		Student obj1=new Student();
		Student obj2=new Student("ishwari");
		Student obj3=new Student(22);
		
	}

}
