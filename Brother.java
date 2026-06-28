package com.ishwari;
//Hierarchical inheritance
class parent{
	public void house() {
		System.out.println("2bhk");
	}
}
class sister extends parent{
}

public class Brother extends parent{
	public static void main(String[]args)
	{
		Brother obj=new Brother();
		obj.house();
		sister obj2=new sister();
		obj2.house();
	}

}
