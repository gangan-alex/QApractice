package Simple;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class Clicked implements ActionListener {
	public void actionPerformed(ActionEvent e){
		// �������� �������� �������
		JButton clickedButton= (JButton)e.getSource();
		// �������� ������� �� ������
		String clickedButtonLabel = clickedButton.getText();
		// ��������� ������� �� ������ � ������ ���� ���������
		JOptionPane.showConfirmDialog(null,"You pressed " +
		clickedButtonLabel,
		"Just a test", JOptionPane.PLAIN_MESSAGE);
	}
}