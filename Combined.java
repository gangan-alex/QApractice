package Simple;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Combined {
	JTextField displayField = new JTextField();
	JButton buttonPoint = new JButton(".");
	JButton buttonEqual = new JButton("=");
	JButton buttonPlus = new JButton("+");
	JButton buttonDiv = new JButton("/");
	JButton buttonMinus = new JButton("-");
	JButton buttonMulti = new JButton("x");
	JButton numButton[] = new JButton[10];

	Combined() {
		JPanel windowContent = new JPanel();
		BorderLayout bl = new BorderLayout();
		windowContent.setLayout(bl);
		displayField.setHorizontalAlignment(JTextField.RIGHT);
		windowContent.add("North", displayField);
		JPanel p1 = new JPanel();
		GridLayout gl = new GridLayout(4, 3);
		p1.setLayout(gl);

		for (int i = 0; i < 10; i++) {
//			String digits = new Integer(i).toString();
			Integer digits = i;
			digits.Integer.toString(i)
			numButton[i] = new JButton(digits);
			p1.add(numButton[i]);
		}
		p1.add(buttonPoint);
		p1.add(buttonEqual);
		windowContent.add("Center", p1);

		JPanel ops = new JPanel();
		GridLayout g2 = new GridLayout(4, 1);
		ops.setLayout(g2);
		ops.add(buttonPlus);
		ops.add(buttonMinus);
		ops.add(buttonMulti);
		ops.add(buttonDiv);
		windowContent.add("East", ops);
		JFrame frame = new JFrame("Calculator");
		frame.setContentPane(windowContent);
		// делаем размер окна достаточным
		// для того, чтобы вместить все компоненты
		frame.pack();
		// Наконец, отображаем окно
		frame.setVisible(true);

		Clicked calcEngine = new Clicked();
		buttonPlus.addActionListener(calcEngine);
		buttonMinus.addActionListener(calcEngine);
		buttonMulti.addActionListener(calcEngine);
		buttonDiv.addActionListener(calcEngine);
		for (int i = 0; i < 10; i++) {
		numButton[i].addActionListener(calcEngine);}
		buttonPoint.addActionListener(calcEngine);
		buttonEqual.addActionListener(calcEngine);
	}

	public static void main(String[] args) {
		Combined calc = new Combined();
	}
}