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
	JButton numButton0 = new JButton("0");
	JButton numButton1 = new JButton("1");
	JButton numButton2 = new JButton("2");
	JButton numButton3 = new JButton("3");
	JButton numButton4 = new JButton("4");
	JButton numButton5 = new JButton("5");
	JButton numButton6 = new JButton("6");
	JButton numButton7 = new JButton("7");
	JButton numButton8 = new JButton("8");
	JButton numButton9 = new JButton("9");

	Combined() {
		JPanel windowContent = new JPanel();
		BorderLayout bl = new BorderLayout();
		windowContent.setLayout(bl);
		displayField.setHorizontalAlignment(JTextField.RIGHT);
		windowContent.add("North", displayField);
		JPanel p1 = new JPanel();
		GridLayout gl = new GridLayout(4, 3);
		p1.setLayout(gl);

		p1.add(numButton0);
		p1.add(numButton1);
		p1.add(numButton2);
		p1.add(numButton3);
		p1.add(numButton4);
		p1.add(numButton5);
		p1.add(numButton6);
		p1.add(numButton7);
		p1.add(numButton8);
		p1.add(numButton9);
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
		// отображаем окно
		frame.setVisible(true);

		Clicked calcEngine = new Clicked();
		buttonPlus.addActionListener(calcEngine);
		buttonMinus.addActionListener(calcEngine);
		buttonMulti.addActionListener(calcEngine);
		buttonDiv.addActionListener(calcEngine);
		numButton0.addActionListener(calcEngine);
		numButton1.addActionListener(calcEngine);
		numButton2.addActionListener(calcEngine);
		numButton3.addActionListener(calcEngine);
		numButton4.addActionListener(calcEngine);
		numButton5.addActionListener(calcEngine);
		numButton6.addActionListener(calcEngine);
		numButton7.addActionListener(calcEngine);
		numButton8.addActionListener(calcEngine);
		numButton9.addActionListener(calcEngine);
		buttonPoint.addActionListener(calcEngine);
		buttonEqual.addActionListener(calcEngine);
	}

	public static void main(String[] args) {
		Combined calc = new Combined();
	}
}