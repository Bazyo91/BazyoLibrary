/**
 * Written by BaZyO, all rights reserved
 * */

package bazyo.ui.button;

import java.awt.*;
import java.awt.event.ActionListener;

import bazyo.ui.button.actions.ActionFromButton;

/**
 * @author BaZyO
 *
 */
@SuppressWarnings("serial")
public class ButtonCreation extends ActionFromButton {
	
	/*
	 * Description from the Buttons exitButton(), oneButton & connectionButton
	 * 		String text: set the text from the Button
	 * 		int x & y: the location from the Button at the Frame
	 * 		int width & height: the size from the Button
	 * 		Color foregroundColor: called with Color.[color]. Contains the font-color
	 * 		String font: contains the font-style: "Arial"...
	 * 		int fontStyle: called with Font.[BOLD, ITALIC,...]
	 * 		int fontSize: the size of the font
	 * 
	 * oneButton(ActionListener al): see Javaclass ActionFromButton.java
	 * 		ActionListener contains the action when button is clicked
	 * */

	public void exitButton(String text, int x, int y, int width, int height, Color foregroundColor, 
			String font, int fontStyle, int fontSize) {
		
		setText(text);
		setBounds(x, y, width, height);
		setForeground(foregroundColor);
		setFont(new Font(font, fontStyle, fontSize));
		exitButtonAction();
	}

	public void oneButton(String text, int x, int y, int width, int height, Color foregroundColor, 
			String font, int fontStyle, int fontSize, ActionListener al) {
		
		setText(text);
		setBounds(x, y, width, height);
		setForeground(foregroundColor);
		setFont(new Font(font, fontStyle, fontSize));
		addActionListener(al);
	}
	
	public void connectionButton(String text, int x, int y, int width, int height, Color foregroundColor, 
			String font, int fontStyle, int fontSize) {
		
		setText(text);
		setBounds(x, y, width, height);
		setForeground(foregroundColor);
		setFont(new Font(font, fontStyle, fontSize));
		connectToDatabase();
	}
}
