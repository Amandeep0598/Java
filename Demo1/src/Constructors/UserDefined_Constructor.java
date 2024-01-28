package Constructors;

public class UserDefined_Constructor {
	
	// user defined constructor
	
	public UserDefined_Constructor(){
		System.out.println("This is a contructor");
	}
	
	public void method() {
		System.out.println("This is a method");
	}
	public static void main(String[] args) {
		UserDefined_Constructor b=new UserDefined_Constructor();
		b.method();
	}

}
