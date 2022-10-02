package oops;

public class FunctionsExample {

	public static void main(String[] args) {
		
		FunctionsExample fe = new FunctionsExample();
		
		// static function can be called following 2 ways
		FunctionsExample.musicPlayer(); 
		musicPlayer();
		
		// non static functions to be called only by object reference
		fe.horn();
	}
	
	public static void musicPlayer() {
		System.out.println("Play the music");
	}
	
	public void horn() {
		System.out.println("Horn");
	}

}
