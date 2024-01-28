package Static_Variable;

public class Student {
	int rollNo;
	String name;
	static String School_Name = "Abc";
	
	public Student(int r, String n) {
		
		rollNo=r;
		name=n;
		
	}
	
	public void display() {
		System.out.println(rollNo+" "+name+" "+ School_Name);
	}
	
	public static void main(String[] args) {
		
		Student S1=new Student(100,"Amandeep");
		Student S2=new Student(101,"Amardeep");
		Student S3=new Student(102,"Bharat");
		Student S4=new Student(103,"Sameer");
		Student S5=new Student(104,"Hemant");
		
		S1.display();
		S2.display();
		S3.display();
		S4.display();
		S5.display();
		
	}

}
