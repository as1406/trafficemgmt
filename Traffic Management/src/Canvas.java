/* This class will be responsible for drawing the grid 
 * Layouting the streets, avenues, entry points
 * and traffic signals
 */

import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;

public class Canvas extends JPanel {

	private JTextArea textArea;
	
	public Canvas() {
		textArea = new JTextArea();
		setLayout(new BorderLayout());
		add(textArea, BorderLayout.CENTER);
	}
	
	public void appendText(String text) {
		textArea.append(text);
	}
}
