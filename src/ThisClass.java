
public class ThisClass {

	void first(){
		this.second(this);
		ThisClass t2= new ThisClass();
		second(t2);
	}
	void second(ThisClass obj){
		System.out.println("taking class type as parameter");
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		ThisClass t= new ThisClass();
		t.first();
			
	}

}
