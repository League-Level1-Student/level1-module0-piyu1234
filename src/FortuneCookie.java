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
JOptionPane.showMessageDialog(null, "चिंता मत करो, रिचु दीदी! अगले हफ्ते आपको शांति मिलेगी। मेरा वादा है तुमसे!");
}
if(rand == 1)  {
JOptionPane.showMessageDialog(null, "आपकी किस्मत एकदम सही है, रिचु दीदी!");
}
if(rand == 2)  {
JOptionPane.showMessageDialog(null, "\n" + 
		"आप किसी का दिल जीत लेंगे!\n" + 
		"रिचु दीदी! मेरा दिल, आपने पहले ही जीत लिया था");
}
if(rand == 3)  {
JOptionPane.showMessageDialog(null, "कठिन अध्ययन करें और आप अच्छा करेंगे! मैं तुमसे वादा करता हूँ रिचु दीदी !!");
}
if(rand == 4)  {
JOptionPane.showMessageDialog(null, "रिचु दीदी, तुम एक दिन महान बनोगी! मे वादा करता हु!");
}
}
}

	