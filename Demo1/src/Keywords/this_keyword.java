package Keywords;

public class this_keyword {

	int a;
	int b;
	
	private void addition(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println(this.a+this.b);
		this.substraction(300,500);
	}
	private void substraction(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println(this.a-this.b);
	}
	
public static void main(String[] args) {
		
	    this_keyword obj = new this_keyword();
		obj.addition(100, 50);
		
	}
}
