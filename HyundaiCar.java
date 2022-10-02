package oops;

public abstract class HyundaiCar implements Car{  
	// one or more methods is not implemented from the interface
	// Cannot create object of an abstract class

	public static void main(String[] args) {
		

	}

	@Override
	public void start() {
		System.out.println("start");
		
	}

	@Override
	public void stop() {
		System.out.println("stop");
		
	}

	@Override
	public void accel() {
		System.out.println("accel");
		
	}


}
