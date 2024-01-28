package Colletions;

import java.util.ArrayList;
import java.util.List;

public class List_P2 {
	public void display() {
		List<String> lt= new ArrayList<String>(3);
		lt.add("Amandeep");
		lt.add("Sahoo");
		lt.add("Ramu");
		lt.add("Aman");
		lt.add("India");
		lt.add(null);
		lt.add(null);
		lt.remove(1);
		
		for(int i=0; i<=lt.size()-1;i++)
		{
			System.out.println(lt.get(i));
		}
		
	}
	
	public static void main(String[] args) {
		List_P2 obj=new List_P2();
		obj.display();
	}

}
