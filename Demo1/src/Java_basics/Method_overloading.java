package Java_basics;

public class Method_overloading {
	
	public void add(int a, float b) {
		float c= a+b;
		System.out.println(c);
	}
	public void add(float a, float b) {
		float c= a+b;
		System.out.println(c);
	}
	
	public void sub(int a, int b) {
		double c= a-b;
		System.out.println(c);
	}
	public void sub(int x, int y, int z) {
		int c= z*(x-y);
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		Method_overloading object =new Method_overloading();
		object.add(10, 20);
		object.sub(30,5);
		object.sub(32,30, 5);
		object.add(10, 210);
	}

}
