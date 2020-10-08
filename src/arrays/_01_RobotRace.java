package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[]args){
	_01_RobotRace robotRace = new _01_RobotRace();
	robotRace.run();
}
public void run(){
	Random r = new Random();
int x= 40;
int y = 300;
boolean atTop=false;
	//2. create an array of 5 robots.
Robot[]robots=new Robot[7];
	//3. use a for loop to initialize the robots.
for (int i = 0; i < robots.length; i++) {
	robots[i]=new Robot();
	robots[i].penDown();
	robots[i].miniaturize();
	robots[i].setY(y);
	robots[i].setX(x);
	x+=50;
}
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	
while(!atTop) {
for (int i = 0; i < robots.length; i++) {
	robots[i].move(r.nextInt(75));
	if(robots[i].getY()<=0) {
		atTop = true;
		break;
	}
}
}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
for (int i = 0; i < robots.length; i++) {
	if(robots[i].getY()<=0) {
		JOptionPane.showMessageDialog(null, "Robot " + i + " is the winner and we are going to throw a party.");
	}
}

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}

}
