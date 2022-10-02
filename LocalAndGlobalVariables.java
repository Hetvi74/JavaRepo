package oops;

public class LocalAndGlobalVariables {
	
	static int b=20; // global variable

	public static void main(String[] args) {

		// Variable used inside must be static
		// Only static global variable can be used in static method
		
		System.out.println(b);
		LocalAndGlobalVariables lag = new LocalAndGlobalVariables();
		lag.add();
		

	}
	
	public void add() {
		int a=10; // local variable
		System.out.println("Value of a is : " + a);
		System.out.println("Value of b is : " + b);
	}

}
