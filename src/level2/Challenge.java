package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;
	static int speed=500;
	
	
	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
	driveDirect(speed, speed);
	sleep(3000);
	
	driveDirect(10, speed);
	sleep(500);
	
	driveDirect(speed, speed);
	sleep(5000);
	
	driveDirect(speed, 10);
	sleep(500);
	
	driveDirect(speed, speed);
	sleep(1000);
	
	
	
	
	}

	public void loop() {
	
	}
}
