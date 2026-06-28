package com.ishwari;
//collection framework topic
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String>queue=new LinkedList<>();
		
		queue.add("Rahul");
		queue.add("Sahil");
		queue.add("Adesh");
		System.out.println(queue);
	}

}
