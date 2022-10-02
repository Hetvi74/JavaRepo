package oops;

public class BMWCar extends HyundaiCar {
	// creating a class from the abstract class. Now you can create an object from this class
	
	public static void main(String[] args) {
		
		BMWCar bm = new BMWCar();
		bm.start();
		bm.stop();
		bm.accel();
		bm.music();
		
		Car ca = new BMWCar();
		ca.accel();
		ca.start();
		ca.stop();
		ca.music();
	}
	
	@Override
	public void music() {
		System.out.println("music");
		
	}
	
	// Method overwritten
	public void start() {
		System.out.println("new starting of car");
	}

}
