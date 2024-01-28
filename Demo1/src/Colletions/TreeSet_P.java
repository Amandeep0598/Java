package Colletions;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_P {
	
	public void display() {
		TreeSet<String> st= new TreeSet<String>();
		st.add("1");
		st.add("2");
		st.add("3");
		st.add("4");
		st.add("5");
		st.add("1");
		st.add("2");
		//st.add(null);
		//st.add(null);
		st.add("3");
		st.add("Aman");
		st.add("India");
		//st.remove(1);
		
		Iterator<String> it= st.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
	
	public static void main(String[] args) {
		TreeSet_P obj=new TreeSet_P();
		obj.display();
	}

}
