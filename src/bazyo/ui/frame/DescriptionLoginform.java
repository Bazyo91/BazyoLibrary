/**
 * Written by BaZyO, all rights reserved
 * */
package bazyo.ui.frame;

import java.awt.Color;

/**
 * @author BaZyO
 *
 */
public interface DescriptionLoginform {
	// Constants
	String font = "Comic Sans MS";
	int fontSize = 16;
	Color foregroundColor = Color.BLACK;
	Color backgroundColor = Color.DARK_GRAY;
	
	// Frame
	String titlef = "";
	int locxf = 400, locyf = 300;
	int widthf = 400, heightf = 400;
	boolean resizable = false;
	
	// exitButton
	String textE = "Exit";
	int xE = 80, yE = 300;
	int widthE = 100, heightE = 30;
	
	// loginButton
	String textLog = "LogIn";
	int xLog = 200, yLog = 300;
	int widthLog = 100, heightLog = 30;
	
	// usernameInput
	int xUI = 200, yUI = 100;
	int widthUI = 150, heightUI = 30;
	
	// passwordInput
	int xPW = 200, yPW = 150;
	int widthPW = 150, heightPW = 30;
	
	// usernameLabel
	String textUL = "*Username:";
	int xUL = 50, yUL = 100;
	int widthUL = 150, heightUL = 30;
	
	// passwordLabel
	String textPWL = "*Password:";
	int xPWL = 50, yPWL = 150;
	int widthPWL = 150, heightPWL = 30;
	
	// informationLabel
	String textIL = "Please enter your login datas";
	int xIL = 50, yIL = 10;
	int widthIL = 300, heightIL = 30;
	
	// warningLabel			textW, xW, yW, widthW, heightW, foregroundColorW
	String textW = "";
	int xW = 50, yW = 220;
	int widthW = 250, heightW = 25;
	Color foregroundColorW = Color.RED;
	// if login failed
	String loginFail = "*Please check your username and password!";
	
}
