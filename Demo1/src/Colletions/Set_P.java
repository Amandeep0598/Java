package Colletions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Set_P {
	
	public void display() {
		Set<String> st= new HashSet<String>();
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
		Set_P obj=new Set_P();
		obj.display();
	}

}
