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
//drawHouse(500);
}
	//3. Extract the piece of code that draws the house into a method. Draw 10 houses. 

	//4. Change the method to take (int height) as a parameter. Draw 9 houses of different heights 
//drawHouse(10);
//drawHouse(20);
//drawHouse(30);
//drawHouse(40);
//drawHouse(50);
//drawHouse(60);
//drawHouse(70);
//drawHouse(80);
//drawHouse(90);
	//5. Make the method take a String instead of an int. 
//drawHouse("EXSMALL");
//drawHouse("SMall");
//drawHouse("MEDIUM");
//drawHouse("BIG");
//drawHouse("superbig");
//drawHouse("humongous");
//drawHouse("universalbig");
//drawHouse("universaldoublebig");
//drawHouse("INFINITY");

drawTop(80);

	//6. Make the method take a color as well as a height. The houses are drawn in that color. 

	//[optional] Set the scene to night by setting the background to black 

	//7. Give the houses peaked roofs 

	//8. Extract that roof code into a method “drawPointyRoof” and create a new method: “drawFlatRoof”. 

	//9. Make large houses have flat roofs 
	
}
static void drawHouse(int height) {
hi.setAngle(0);	
hi.setRandomPenColor();
	hi.move(height);
	hi.turn(90);
	hi.move(30);
	hi.turn(90);
	hi.move(height);
	hi.turn(-90);
	hi.setPenColor(Color.GREEN);
	hi.move(30); }  

static void drawTop(int height) {
	hi.move(height);
	hi.turn(45);
	hi.move(30);
	hi.turn(45);
	hi.turn(45);
	hi.move(30);
	hi.turn(45);
	hi.move(30);
	hi.move(30);
	hi.move(20);
	hi.turn(-90);
	hi.setPenColor(Color.GREEN);
	hi.move(30);


	
	
	


}
static void drawHouse(String height) {
	if(height.equals("EXSMALL")) {
		drawHouse(1); }
		
	if(height.equals("SMall")) {
			drawHouse(5); }

	if(height.equals("MEDIUM")) {
		drawHouse(250);  }
	
	if(height.equals("BIG")) {
		drawHouse(500);  }
		
	if(height.equals("superbig")) {
			drawHouse(800);  }
	
	if(height.equals("humongous")) {
				drawHouse(1000);  }
				
	if(height.equals("universalbig")) {
					drawHouse(1200);  }
					
	if(height.equals("universaldoublebig")) {
				    drawHouse(1400);  }
				    
    if(height.equals("INFINITY")) {
				    drawHouse(1800);
    }
}
}


    
	


