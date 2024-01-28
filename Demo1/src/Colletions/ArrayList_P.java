package Colletions;

import java.util.ArrayList;

public class ArrayList_P {
	
	public void display() {
		ArrayList<String> lt= new ArrayList<String>(3);
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
		ArrayList_P obj=new ArrayList_P();
		obj.display();
	}

}
