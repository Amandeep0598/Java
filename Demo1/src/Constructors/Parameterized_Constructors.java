package Constructors;

public class Parameterized_Constructors {
	
	public Parameterized_Constructors(int a, int b){
		System.out.println(a+b);
	}
	
	public void method() {
		System.out.println("This is a method");
	}
	public static void main(String[] args) {
		Parameterized_Constructors b=new Parameterized_Constructors(20, 10);
		b.method();
	}

}
