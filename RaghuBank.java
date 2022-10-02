package oops;

public class RaghuBank implements Bank{  //you cannot create an object of an interface

	public static void main(String[] args) {
		RaghuBank rb = new RaghuBank();
		rb.credit();
		rb.debit();
		rb.savings();
		rb.loans();
		
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		Bank b = new RaghuBank(); //you can do this. But you cannot create an object of an interface
		// only methods are common to Bank and RaghuBank can be accessed
		b.credit();
		b.debit();
		b.savings();
	}

	@Override
	public void debit() {	
		System.out.println("debit");
	}

	@Override
	public void credit() {		
		System.out.println("credit");
		
	}

	@Override
	public void savings() {		
		System.out.println("savings");
	}
	
	public void loans() {
		System.out.println("loans");
	}

}
