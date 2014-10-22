package Simple;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class Clicked implements ActionListener {
	public void actionPerformed(ActionEvent e){
		// Получаем источник события
		JButton clickedButton= (JButton)e.getSource();
		// Получаем надпись на кнопке
		String clickedButtonLabel = clickedButton.getText();
		// Добавляем надпись на кнопке к тексту окна сообщения
		JOptionPane.showConfirmDialog(null,"You pressed " +
		clickedButtonLabel,
		"Just a test", JOptionPane.PLAIN_MESSAGE);
	}
}