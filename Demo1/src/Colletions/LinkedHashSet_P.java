package Colletions;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_P {
	
	public void display() {
		LinkedHashSet<String> st= new LinkedHashSet<String>();
		st.add("Amandeep");
		st.add("Sahoo");
		st.add("Ramu");
		st.add("Aman");
		st.add("India");
		st.add("Amandeep");
		st.add("Sahoo");
		st.add(null);
		st.add(null);
		st.add("Ramu");
		st.add("Aman");
		st.add("India");
		st.remove(1);
		
		Iterator<String> it= st.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
	
	public static void main(String[] args) {
		LinkedHashSet_P obj=new LinkedHashSet_P();
		obj.display();
	}

}
