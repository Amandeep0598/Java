package Constructors;

public class Constructor_Overloading {
	
	public Constructor_Overloading(int a) {
		
		System.out.println("This is a integer "+a);
		
	}
    public Constructor_Overloading(int a, int b) {
		
		System.out.println("This is a integer with 2parameters "+a+b);
		
	}
    public Constructor_Overloading(int x, int y, int c) {
    	
    	int z= x+y+c;
		System.out.println("This is the 3parameters "+z);
		
	}
    public Constructor_Overloading(double a) {
		
		System.out.println("This is a double "+a);
		
	}
    
    public void method() {
		System.out.println("This is a method");
	}
	public static void main(String[] args) {
		//Constructor_Overloading obj =new Constructor_Overloading(20, 10);
		//Constructor_Overloading obj =new Constructor_Overloading(20,30, 10);
		Constructor_Overloading obj =new Constructor_Overloading(210.2);
		//Constructor_Overloading obj =new Constructor_Overloading(210);
		obj.method();
	}


}
