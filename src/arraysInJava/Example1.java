package arraysInJava;

public class Example1 {
	//static int[] copytoArr;
	
	public static int[] oneDArray() {
		return new int[]{10,20,30};
	}
	
	
	public static void main(String[] args) {
		//Example1 arr1 = new Example1();
		int[] rArr = Example1.oneDArray();
		
		System.out.println(rArr.length);
		for (int i = 0; i <= rArr.length-1; i++) {
			System.out.println(rArr[i]);
		}
		int[] copytoArr=new int[3];
		//System.arraycopy(rArr, 0, Example1.copytoArr, 0, Example1.copytoArr.length);
		System.arraycopy(rArr, 0, copytoArr, 0, copytoArr.length);
		
		for (int i = 0; i <= copytoArr.length-1; i++) {
			System.out.println(copytoArr[i]);
		}
	}

}
