package Colletions;

import java.util.LinkedList;

public class LikedList_P {
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
		
		for(int i=0; i<=lt.size()-1;i++)
		{
			System.out.println(lt.get(i));
		}
		
	}
	
	public static void main(String[] args) {
		LikedList_P obj=new LikedList_P();
		obj.display();
	}

}
