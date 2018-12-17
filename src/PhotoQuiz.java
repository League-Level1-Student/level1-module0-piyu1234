/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
               String Image = "https://static1.bigstockphoto.com/7/5/7/large1500/75762676.jpg";
		// 2. create a variable of type "Component" that will hold your image
              Component Difference;
		// 3. use the "createImage()" method below to initialize your Component
             Difference =  createImage(Image);
		// 4. add the image to the quiz window
quizWindow.add(Difference);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image

String Answer = JOptionPane.showInputDialog("HOW MANY DIFFERENCES ARE IN THIS PICTURE? WRITE THE NUMBER!!!");
		// 7. print "CORRECT" if the user gave the right answer
int answer = Integer.parseInt(Answer);
if (answer== 10) {
JOptionPane.showMessageDialog(null, "YOU ARE CORRECT!!!");
}

	   // 8. print "INCORRECT" if the answer is wrong
else{ 	JOptionPane.showMessageDialog(null, "YOU ARE NOT CORRECT!!!");
}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
          quizWindow.remove(Difference);
		// 10. find another image and create it (might take more than one line of code)
          String Pic = "https://i.ytimg.com/vi/141DfKQhcEI/maxresdefault.jpg";
          Component Odd;
          Odd =  createImage(Pic);
		// 11. add the second image to the quiz window
          quizWindow.add(Odd);
		// 12. pack the quiz window
          quizWindow.pack();
		// 13. ask another question
          String Var = JOptionPane.showInputDialog("FIND THE ODD ONE OUT!!! WHAT COLUMN IS IT IN?");
		// 14+ check answer, say if correct or incorrect, etc.
          int var = Integer.parseInt(Var);
          if (var== 15 ) {
         JOptionPane.showMessageDialog(null, "YOU ARE CORRECT!!!");
	}
	else{ 	JOptionPane.showMessageDialog(null, "YOU ARE NOT CORRECT!!!");
	}
          
	}
	
          

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





