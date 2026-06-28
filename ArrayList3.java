package com.ishwari;
import java.util.ArrayList;
public class ArrayList3 {
	public static void main(String[] args) {
		ArrayList<String>Marks=new ArrayList<String>();
		Marks.add("90");
		Marks.add("88");
		Marks.add("80");
		Marks.add("95");
		Marks.add("98");
		Marks.set(2,"80");
		System.out.println("Updted final list:"+Marks);
		
	}

}
