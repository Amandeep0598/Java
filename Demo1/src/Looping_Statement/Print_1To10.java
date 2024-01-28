package Looping_Statement;

public class Print_1To10 {
	
	/*public void print() {
		
		for (int i=1; i<=10;i++) {
			System.out.println(i);
		}
	}*/
	public void print() {
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void main(String[] args) {
		Print_1To10 obj = new Print_1To10();
		obj.print();
	}

}
