package oops;

public class ConstructorExample {
	
	// Constructor overloading
	
	// Constructor without parameter
	public ConstructorExample() {
		System.out.println("Constructor Example");
	}
	
	// Constructor with parameter
	public ConstructorExample(String st) {
		System.out.println(st);
	}

	public static void main(String[] args) {
		
		ConstructorExample ce1 = new ConstructorExample();
		ConstructorExample ce2 = new ConstructorExample();
		ConstructorExample ce3 = new ConstructorExample();
		ConstructorExample ce4 = new ConstructorExample();
		ConstructorExample ce5 = new ConstructorExample("Constructor with parameter");
		ConstructorExample ce6 = new ConstructorExample();
	}

}
