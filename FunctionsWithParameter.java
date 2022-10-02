package oops;

public class FunctionsWithParameter {

	public static void main(String[] args) {
		
		FunctionsWithParameter fwp = new FunctionsWithParameter();
		fwp.add(10, 20);
		fwp.add(23);
		fwp.add(34, 45);
		fwp.add(45, 67);
		fwp.add(56, 57);

	}
	
	// method overloading examples
	public void add(int a, int b) {
		
		System.out.println(a+b);
	}
	
	public void add(int a ) {
		
		System.out.println(a);
	}

}
