/**
 * Written by BaZyO, all rights reserved
 * */
package bazyo.ui.label;

import java.awt.*;

import javax.swing.*;

/**
 * @author BaZyO
 *
 */
@SuppressWarnings("serial")
public class LabelCreation extends JLabel {

	public void oneLabel(String text, int x, int y, int width, int height, Color foregroundColor, String font, int fontStyle, int fontSize) {
		
		setText(text);
		setBounds(x, y, width, height);
		setForeground(foregroundColor);
		setFont(new Font(font, fontStyle, fontSize));
	}
}
