package Constructors;

public class Default_Constructor {
	// Default constructor is created by the compiler itself
	
	public Default_Constructor() {
		super();
	}
	
	public void method() {
		System.out.println("This is a method");
	}
	public static void main(String[] args) {
		Default_Constructor b=new Default_Constructor();
		b.method();
	}

}
