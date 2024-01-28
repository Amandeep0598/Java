package Java_basics;

public class Local_Global_variables {
	
	int a= 50;
	int b= 60;

	public void add()
	{
		int c=a+b;
		System.out.println(c);

	}
	public void sub()
	{
	double c=a-b;
	System.out.println(c);

	}
		
	public static void main(String[] args) {
		
		Local_Global_variables obj = new Local_Global_variables();
		obj.add();
		obj.sub();
		
	}

}
