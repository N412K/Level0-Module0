package _02_code_flow._4_flaming_ninja_star;

import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;

public class FlamingNinjaStar {
	public static void main(String[] args) {

		int baseSize = 200;		//the size of the black part of the star
		int flameSize = 130;		//the length of the flaming arms
		
		// Make a new robot, and set it's pen down.
		Robot robot = new Robot();
		robot.penDown();
		// Set the robot speed to 100
		robot.setSpeed(100);
		// Set the robot window size to 800 x 800
		robot.setWindowSize(800, 800);
		//  COUNT. Make another int variable to count how many times the loop has repeated
		//         Set its start value to zero.

	       //  LOOP. Start a while loop to repeat all of the code below ONE time (we will change this later)
			for (int i = 0; i < 25; i++) {

				robot.setRandomPenColor();
			   // TURN RIGHT     Turn the robot 1/8 of a circle (hint: 360 degrees will turn a full circle)
				robot.turn(360/8);
			   // MOVE           Move the robot 64 pixels
				robot.move(64);
			   // TURN LEFT      Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
				robot.turn(-40);
			   // DRAW FLAME     Move the robot the distance in the variable flameSize
				robot.setPenColor(Color.ORANGE);
				robot.move(flameSize);
				//               Turn the robot 170 degrees
				robot.turn(170);
				//               Move the robot the distance in the variable flameSize (again)
				robot.move(flameSize);
			   // TURN RIGHT     Turn the robot 64 degrees to the right
				robot.turn(64);
				// MOVE         Move the robot the distance in the variable baseSize
				robot.setRandomPenColor();
				robot.move(baseSize);
				//  INCREASE COUNT. Increase the count by 1
			}
			robot.hide();
		//  End the while loop here
		
		// TEST   Run the program. Check that your shape is the same as the first picture in the recipe. 
		//        This is one arm of the ninja star.
		
		// COLOR  Change the Robot's pen color so that the flame is a different color to the rest of the star.
		//        Run the program again. Check the second picture in the recipe.

		// LOOP   When you have one arm looking right, change your loop to repeat 25 times and run the program.
		
	}
}
