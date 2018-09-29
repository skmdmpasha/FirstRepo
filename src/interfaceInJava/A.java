package interfaceInJava;

public interface A {
 void test1();
	
default void newMethod() {
	 System.out.println("newlyy added in parent class A");
 }
}
