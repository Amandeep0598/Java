package Constructors;

public class Constructor_Chaining {
	 public Constructor_Chaining() {
			
			//System.out.println("This a constructor");
			
		}
    public Constructor_Chaining(int a, int b) {
    	
		this();
		System.out.println(a+b);
		
	}
    public Constructor_Chaining(int x, int y, int c) {
    	this(10,30);
    	int z= x+y+c;
		System.out.println(z);
		
	}
    public Constructor_Chaining(double a) {
		this(10, 20,30);
		System.out.println(a);
		
	}
    
    public void method() {
		System.out.println("This is a method");
	}
	public static void main(String[] args) {
		Constructor_Chaining obj =new Constructor_Chaining(210.2);
		obj.method();
	}

}
