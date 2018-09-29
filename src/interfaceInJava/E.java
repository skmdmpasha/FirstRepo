package interfaceInJava;

public class E implements D {

	@Override
	public void test1() {
		System.out.println("overriding method in class E");
		
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// E e = new E();
		// e.test1();

		A a = new E();
		a.test1();
		a.newMethod();

	}	

}
