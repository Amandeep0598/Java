package Looping_Statement;

public class Print_100to1 {
public void print() {
		
		/*for (int i=100; i>=1;i--) {
			System.out.println(i);
		}*/
		int i=100;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
	}
	public static void main(String[] args) {
		Print_100to1 obj = new Print_100to1();
		obj.print();
	}

}
