package extra;

import java.awt.Color;

import org.jointheleague.graphical.robot.KeyboardAdapter;
import org.jointheleague.graphical.robot.Robot;

public class Houses {
private static KeyboardAdapter adapter;
static Robot hi = new Robot();

public static void main(String[] args) {
	//1. Have a robot start on the left side of the window near the bottom.
	hi.setX(50);
	hi.setY(500);
	
	//2. Draw a flat-topped house of height 100 with grass after it (see picture). 
hi.penDown();
hi.setPenColor(Color.blue);
hi.setSpeed(500);
hi.miniaturize();
for (int i = 0; i < 10; i++) {
drawHouse(500);
}
	//3. Extract the piece of code that draws the house into a method. Draw 10 houses. 

	//4. Change the method to take (int height) as a parameter. Draw 9 houses of different heights 
int random 
	//5. Make the method take a String instead of an int. 

	       
	//6. Make the method take a color as well as a height. The houses are drawn in that color. 

	//[optional] Set the scene to night by setting the background to black 

	//7. Give the houses peaked roofs 

	//8. Extract that roof code into a method “drawPointyRoof” and create a new method: “drawFlatRoof”. 

	//9. Make large houses have flat roofs 
	
}
static void drawHouse(int height) {
hi.setAngle(0);	
hi.setPenColor(Color.blue);
	hi.move(height);
	hi.turn(90);
	hi.move(30);
	hi.turn(90);
	hi.move(height);
	hi.turn(-90);
	hi.setPenColor(Color.GREEN);
	hi.move(30);
}

}
