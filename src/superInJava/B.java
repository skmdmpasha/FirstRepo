package superInJava;

public class B extends A {
	void run(){
		System.out.println("child Run method");
		super.run();
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.run();
		
	}
}
