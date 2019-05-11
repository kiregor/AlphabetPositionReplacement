package test.AlphabetPositionReplacement;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class App 
{
	JFrame window;
	
	public App() {
		window = new JFrame("Characters to Numbers");
		window.setLayout(new FlowLayout());
		JTextField tboxinput = new JTextField(25);
		JTextField tboxoutput = new JTextField(25);
		JButton button = new JButton("Transform");
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tboxoutput.setText(StringToNumber.stringToNumStringNoPunc(tboxinput.getText()));
			}
		});
		
		window.add(tboxinput);
		window.add(button);
		window.add(tboxoutput);
		
		window.setSize(350, 150);
		window.setVisible(true);
	}
	
    public static void main( String[] args )
    {
        new App();
    }
}
