package Constructors;

// Constructor with different access modifiers
public class Cons_p {
	Cons_p(){
		System.out.println("Default constructor");
	}
	public Cons_p(int a){
		System.out.println("public constructor");
	}
	private Cons_p(int a, int b){
		System.out.println("private constructor");
	}

	protected Cons_p(int a, int b, int c){
		System.out.println("protected constructor");
	}
	public static void main(String[] args) {
		Cons_p object1= new Cons_p();
		Cons_p object2= new Cons_p(10);
		Cons_p object3= new Cons_p(20, 30);
		Cons_p object4= new Cons_p(10, 20, 30);
		
	}


}
