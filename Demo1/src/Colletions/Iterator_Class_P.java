package Colletions;

import java.util.Iterator;
import java.util.LinkedList;

public class Iterator_Class_P {

	public void display() {
		LinkedList<String> lt= new LinkedList<String>();
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
		
		Iterator<String> it= lt.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
	
	public static void main(String[] args) {
		Iterator_Class_P obj=new Iterator_Class_P();
		obj.display();
	}
}
