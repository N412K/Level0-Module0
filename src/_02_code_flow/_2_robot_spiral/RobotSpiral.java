package _02_code_flow._2_robot_spiral;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */


import org.jointheleague.graphical.robot.Robot;

public class RobotSpiral {

	public static void main(String[] args) {
		
		// Create a new Robot
		Robot james = new Robot();
		// Set your robot's pen down 
		james.penDown();
		// SPEED. Set the robot to go at max speed (100)
		james.setSpeed(100);
		// COUNT. Create an int variable that will count how many lines of the spiral we have drawn.
			//        Start its value as zero.
		/*int pixels = 0;
		int angle = 1;
		int abc = (int) (Math.random()*100);
		for (int i = 0; i < 5; i++) {
			while (pixels < 10) {
				james.move(50);
				james.turn(abc);
				System.out.println(abc);
				abc = (int) (Math.random()*100);
				pixels += 1;
			}
		}
		james.hide();*/
		// LOOP. Start a while loop to repeat the COLOR, DRAW, TURN, and COUNT code below until 50 lines have been drawn
			for (int i = 0; i < 100; i++) {

			
			// COLOR.   Have the robot set a random pen color:      setRandomPenColor()
			james.setRandomPenColor();
			// DRAW.    Move the robot (5*count) pixels
			//          count is the name of the variable you created earlier
			james.move(5*i);
			// TURN.    Turn the robot (360/7) degrees to the right
			james.turn(360/6);
			// COUNT.   Increase the count of how many lines have been drawn so far ( count+=1 )
			james.setPenWidth(i);
			// Change the robot pen width to the current value of the count variable 


		//  End the while loop here
			}
		
		// Run the program. 
		// Check the pattern against the picture in the recipe. If it matches, you are done!
		
	}
}
