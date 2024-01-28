package Keywords;

public class void_keyword {

	int a;
	int b;
	
	private void addition(int a, int b) {
		
		System.out.println(a+b);
	}
	private double substraction(int a, int b) {
		int c=a-b;
		//System.out.println(c);
		return c;
	}
	
public static void main(String[] args) {
		
	    void_keyword obj = new void_keyword();
		obj.addition(100, 50);
		double x= obj.substraction(5,2);
		System.out.println(x);
	}
}
