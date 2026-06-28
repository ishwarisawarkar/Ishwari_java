package com.ishwari;
import java.util.Stack;
public class StackDemo {
	public static void main(String[] args) {
		Stack<String> books=new Stack<>();
		//add books
		books.push("java");
		books.push("python");
		books.push("C++");
		System.out.println("books in Stack:"+books);
		
		//Top books
		System.out.println("Top Stack:"+books.peek());
		
		//remove books
		System.out.println("Remove Book:"+books.pop());
		System.out.println("Rmove Book:"+books.pop());
		
		//Remaining Books
		System.out.println("Remaining Bokks:"+books);
}
}
