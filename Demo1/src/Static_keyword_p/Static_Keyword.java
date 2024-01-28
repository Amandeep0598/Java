package Static_keyword_p;

public class Static_Keyword {
	
	int a=5;
	int b=10;
	static int c= 20;
	
	public void nonStatic_Method() {
		System.out .println("Not Static method");
	}
	public static void Static_Method() {
		System.out .println("Static method");
	}
	public static void main(String[] args) {
		Static_Keyword obj= new Static_Keyword();
		obj.nonStatic_Method();
		System.out.println(obj.a);
		Static_Keyword.Static_Method();
		System.out.println(Static_Keyword.c);
		
	}

}
