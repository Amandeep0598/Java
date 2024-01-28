package Methods_and_objects;

public class Java_method {

int a=100;
int b=20;
int c;

public void add()
{
	 c=a+b;
	System.out.println(c);

}
public void sub()
{
c=a-b;
System.out.println(c);

}
	
public static void main(String[] args) {
	
	Java_method obj = new Java_method();
	obj.add();
	obj.sub();
	
}


}


