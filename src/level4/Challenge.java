package level4;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;
	static int speed=500;
	void goStraight(int howLong){
		driveDirect(speed,speed);
		sleep(howLong);
	}
	public static void main(String[] args) {
		PApplet.main("level4.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * complete the MAZE
	 * Hint: use bump sensors
	 */
	
	
	public void initialize() {
	
	goStraight(4500);

	}

	public void loop() {
		if (isBumpedLeft()){
		driveDirect(10,speed);
		sleep(500);
		
		goStraight(5500);
		}

		if (isBumpedRight()){
		driveDirect(speed,10);
		sleep(500);
		
		goStraight(5500);
			}
	}
}
