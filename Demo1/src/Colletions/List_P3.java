package Colletions;

import java.util.ArrayList;
import java.util.List;

public class List_P3 {
	public void display() {
		List<String> lt= new ArrayList<String>(3);
		lt.add("Amandeep");
		lt.add("Sahoo");
		lt.add("Ramu");
		lt.add("Aman");
		lt.add("India");
		lt.add("Amandeep");
		lt.add("Sahoo");
		lt.add(null);
		lt.add(null);
		lt.add("Ramu");
		lt.add("Aman");
		lt.add("India");
		lt.remove(1);
		lt.add(2, "Hi");
		
		for(int i=0; i<=lt.size()-1;i++)
		{
			System.out.println(lt.get(i));
		}
		
	}
	
	public static void main(String[] args) {
		List_P3 obj=new List_P3();
		obj.display();
	}

}
