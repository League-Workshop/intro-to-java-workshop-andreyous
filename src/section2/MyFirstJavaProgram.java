package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot thanos = new Robot();
	Robot noob = new Robot();
	Robot nerd = new Robot();
	Robot boomer = new Robot();
	thanos.setSpeed(100);
	noob.setSpeed(100);
	nerd.setSpeed(100);
	boomer.setSpeed(100);
	thanos.penDown();
	nerd.penDown();
	noob.penDown();
	boomer.penDown();
	noob.turn(90);
	nerd.turn(180);
	boomer.turn(270);
	thanos.turn(360);
	noob.move(100);
	nerd.move(100);
	boomer.move(100);
	thanos.move(100);
	noob.turn(90);
	nerd.turn(90);
	boomer.turn(90);
	thanos.turn(90);
	noob.move(100);
	nerd.move(100);
	boomer.move(100);
	thanos.move(100);
	}
}
