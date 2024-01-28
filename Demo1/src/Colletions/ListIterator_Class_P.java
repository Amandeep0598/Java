package Colletions;

import java.util.ListIterator;
import java.util.LinkedList;

public class ListIterator_Class_P {
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
		
		ListIterator<String> it= lt.listIterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
	
	public static void main(String[] args) {
		ListIterator_Class_P obj=new ListIterator_Class_P();
		obj.display();
	}

}
