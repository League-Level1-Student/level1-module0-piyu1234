import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
public static void main(String[] args) {
FortuneCookie fc = new FortuneCookie();
fc.showButton();
}
public void showButton() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JButton button = new JButton();
	frame.add(button);
	button.addActionListener(this);
    frame.pack();










}
@Override
public void actionPerformed(ActionEvent e) {
	
JOptionPane.showMessageDialog(null, "Woohoo!!");	
int rand = new Random().nextInt(5);
if(rand == 0)  {
JOptionPane.showMessageDialog(null, "Hi Mommy");
}
if(rand == 1)  {
JOptionPane.showMessageDialog(null, "You are the best!!");
}
if(rand == 2)  {
JOptionPane.showMessageDialog(null, "\n" + 
		"I love you so much\n" + 
		"Because of what you do for me");
}
if(rand == 3)  {
JOptionPane.showMessageDialog(null, "I can't express my feelings of gratitude I have for you!!");
}
if(rand == 4)  {
JOptionPane.showMessageDialog(null, "All I can say, is that YOU ARE THE BEST!");
}
}
}

	