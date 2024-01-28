package Strings_P;

public class Strings {
	String x="  ";
	String a= "  India";
	String a1= "india";
	String b= "  My Country";
	String c= new String("I am an Indian");
	
	public void stringMethods() {
		
		System.out.println(b.length());
		System.out.println(a.concat(b));
		System.out.println(b.equals(a1));
		System.out.println(b.equalsIgnoreCase(a1));
		System.out.println(b.charAt(2));
		System.out.println(b.contains("My"));
		System.out.println(x.isEmpty());
		//System.out.println(x.isBlank());
		System.out.println(b.replace("My", "A"));
		System.out.println(a1.toUpperCase());
		System.out.println(b.toLowerCase());
		System.out.println(b.trim().length());

	}
	
	public static void main(String[] args) {
		
		Strings obj=new Strings();
		obj.stringMethods();
	}

}
