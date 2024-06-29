package introduction;

public class MethodDemo {

	public static void main(String[] args) {
		MethodDemo d= new MethodDemo();
		d.getData();
		String name=d.getData();
		System.out.println(name);
		MethodDemo1 d1= new MethodDemo1();
		d1.getUserData();
		

	}
	public String getData() {
		System.out.println("hello world");
		return "rahul";
	}

}
