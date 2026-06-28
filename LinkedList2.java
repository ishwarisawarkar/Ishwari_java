package com.ishwari;
import java.util.LinkedList;
public class LinkedList2 {
	public static void  main(String[] args) {
		LinkedList<String>Stations=new LinkedList<String>();
		Stations.add("New Delhi Railway station");
		Stations.add("Chatrapati Shivaji Maharaj Terminous");
		Stations.add("Badnera Railway Station");
		Stations.add("Howrah Junction,Kolkata");
		Stations.add("Chennai central");
		Stations.remove("Chatrapati Shivaji Maharaj Terminous");
		System.out.println("Display updated list:"+Stations);
	}
}
