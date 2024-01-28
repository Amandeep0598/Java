package Access_Modifiers;

public class Acc_1 {

	public void public_method() {
		System.out.println("This is public method");
	}
	private void private_method() {
		System.out.println("This is private method");
	}
	protected void protected_method() {
		System.out.println("This is protected method");
	}
    void default_method() {
		System.out.println("This is default method");
	}
    public static void main(String[] args) {
    	Acc_1 obj = new Acc_1();
    	obj.public_method();
    	obj.private_method();
    	obj.protected_method();
    	obj.default_method();
    	
    }
}
