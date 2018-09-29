package overridingInJava;

public class Example2 extends Example1{
	public void test1() {
		System.out.println("child class test1 method");
	}
	public static void main(String[] args) {
		Example1 obj1 = new Example2();
		obj1.test1();

}
}
