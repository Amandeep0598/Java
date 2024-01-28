package Java_basics;

public class Parameters {

	public void add(int a, float b) {
		float c= a+b;
		System.out.println(c);
	}
	
	public void sub(int a, int b) {
		double c= a-b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Parameters object =new Parameters();
		object.add(10, 20);
		object.sub(30,5);
		object.sub(32, 5);
		object.add(10, 210);
	}
}
