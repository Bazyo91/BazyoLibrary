/**
 * Written by BaZyO, all rights reserved
 * */
package bazyo.ui.inputfields;

import java.awt.*;

import javax.swing.*;


/**
 * @author BaZyO
 *
 */
@SuppressWarnings("serial")
public class TextfieldCreation extends JTextField {

	public void standadInputField(int x, int y, int width, int height, Color foregroundColor, 
			Color backgroundColor, String font, int fontStyle, int fontSize) {
		
		setBounds(x, y, width, height);
		setForeground(foregroundColor);
		setBackground(backgroundColor);
		setFont(new Font(font, fontStyle, fontSize));
	}
}
