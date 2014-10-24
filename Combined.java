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
		JPanel PanelUno = new JPanel();

		GridLayout NumGrid = new GridLayout(4, 3);
		PanelUno.setLayout(NumGrid);
		for (int i = 0; i < 10; i++) {
			String digits = new Integer(i).toString();
			numButton[i] = new JButton(digits);
			PanelUno.add(numButton[i]);
		}
		PanelUno.add(buttonPoint);
		PanelUno.add(buttonEqual);
		windowContent.add("Center", PanelUno);

		JPanel ops = new JPanel();
		GridLayout ActionGrid = new GridLayout(4, 1);
		ops.setLayout(ActionGrid);
		ops.add(buttonPlus);
		ops.add(buttonMinus);
		ops.add(buttonMulti);
		ops.add(buttonDiv);

		windowContent.add("East", ops);
		JFrame frame = new JFrame("Calculator");
		frame.setContentPane(windowContent);

		// making window size enough to show all the components
		frame.pack();

		// making the window visible
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