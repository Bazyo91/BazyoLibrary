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
public class PasswordfieldCreation extends JPasswordField {

	public void onePassword(int x, int y, int width, int height, Color foregroundColor, 
			Color backgroundColor, String font, int fontStyle, int fontSize) {
		
		setBounds(x, y, width, height);
		setForeground(foregroundColor);
		setBackground(backgroundColor);
		setFont(new Font(font, fontStyle, fontSize));
	}
}
