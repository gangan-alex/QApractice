package Simple;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class Clicked implements ActionListener {
	public void actionPerformed(ActionEvent e){

		// getting source of action
		JButton clickedButton= (JButton)e.getSource();

		// getting string from the button
		String clickedButtonLabel = clickedButton.getText();

		// adding the string we've got to the text of window
		JOptionPane.showConfirmDialog(null,"You pressed " +
		clickedButtonLabel,
		"Just a test", JOptionPane.PLAIN_MESSAGE);
	}
}