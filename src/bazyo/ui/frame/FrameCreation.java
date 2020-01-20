/**
 * Written by BaZyO, all rights reserved
 * */

package bazyo.ui.frame;

import java.awt.Color;

import javax.swing.JFrame;

/**
 * @author BaZyO
 *
 */
@SuppressWarnings("serial")
public class FrameCreation extends JFrame {
	/*
	 * Description for mainFrame() & secondaryFrame()
	 * 		String title: contains the title of the Frame
	 * 		int locx: the location x on the screen
	 * 		int locy: the location y on the screen
	 * 		int width & int height: the size x & y from the Frame
	 * 		boolean resizable: contains if the Frame is resizeable. Values true or false
	 * 		Color bgColor: called with Color.[color]. the Backgroundcolor from the Frame
	 * 
	 * */

	public void mainFrame(String title, int locx, int locy, int width, int height, boolean resizable, Color bgColor) {
		setTitle(title);
		setLocation(locx, locy);
		setSize(width, height);
		setResizable(resizable);
		getContentPane().setBackground(bgColor);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
	}
	
	public void secondaryFrame(String title, int locx, int locy, int width, int height, boolean resizable, Color bgColor) {
		setTitle(title);
		setLocation(locx, locy);
		setSize(width, height);
		setResizable(resizable);
		getContentPane().setBackground(bgColor);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(null);
		setVisible(true);
	}
}
