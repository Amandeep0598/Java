package Colletions;

import java.util.List;
import java.util.ArrayList;

public class List_P {
	public void display() {
		List lt= new ArrayList(3);
		lt.add("Amandeep");
		lt.add("Sahoo");
		lt.add(20);
		lt.add('c');
		lt.add(true);
		lt.add(false);
		lt.remove(1);
		
		for(int i=0; i<=lt.size()-1;i++)
		{
			System.out.println(lt.get(i));
		}
		
	}
	
	public static void main(String[] args) {
		List_P obj=new List_P();
		obj.display();
	}

}
