package stringsInJava;

public class Example {

	public static void main(String[] args) {
		String s1 = "one";
		String s2 = "xyz";

		String s3 = new String("xyz");
		String s4 = new String("xyz");

		System.out.println(s2 == s3);
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));

		System.out.println(s3);
		System.out.println(s4);

		s1 = s1.concat("two");
		System.out.println(s1);
	}

}
