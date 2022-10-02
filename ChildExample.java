package oops;

public class ChildExample extends ParentExample{  // inheritance example, no multiple inheritance

	public static void main(String[] args) {
		
		ChildExample ce = new ChildExample();
		ce.flat();
		ce.bankLoan();
		
		ce.bankBalance();
		ce.car();
		ce.house();
		
		ParentExample pe = new ParentExample();
		pe.house();
		pe.car();
		pe.bankBalance();
		
	}
	
	public static void flat() {
		System.out.println("flat");
	}

	public static void bankLoan() {
		System.out.println("Bank loan");
	}

}
