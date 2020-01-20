/**
 * Written by BaZyO, all rights reserved
 * */
package bazyo.ui.frame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import bazyo.database.LoginToProgram;
import bazyo.ui.button.ButtonCreation;
import bazyo.ui.inputfields.PasswordfieldCreation;
import bazyo.ui.inputfields.TextfieldCreation;
import bazyo.ui.label.LabelCreation;

/**
 * @author BaZyO
 *
 */
public class LoginformCreation implements DescriptionLoginform {
	int fontStyle = Font.ITALIC;
	FrameCreation loginFrame = new FrameCreation();
	ButtonCreation login = new ButtonCreation();
	ButtonCreation exit = new ButtonCreation();
	TextfieldCreation username = new TextfieldCreation();
	PasswordfieldCreation password = new PasswordfieldCreation();
	LabelCreation usernameLabel = new LabelCreation();
	LabelCreation passwordLabel = new LabelCreation();
	LabelCreation informationLabel = new LabelCreation();
	private static LabelCreation warningLabel = new LabelCreation();
	
	public void loginForm() {
		usernameLabel.oneLabel(textUL, xUL, yUL, widthUL, heightUL, foregroundColor, font, fontStyle, fontSize);
		username.standadInputField(xUI, yUI, widthUI, heightUI, foregroundColor, backgroundColor, font, fontStyle, fontSize);
		
		passwordLabel.oneLabel(textPWL, xPWL, yPWL, widthPWL, heightPWL, foregroundColor, font, fontStyle, fontSize);
		password.onePassword(xPW, yPW, widthPW, heightPW, foregroundColor, backgroundColor, font, fontStyle, fontSize);
		
		informationLabel.oneLabel(textIL, xIL, yIL, widthIL, heightIL, foregroundColor, font, fontStyle, 20);
		getWarningLabel().oneLabel(textW, xW, yW, widthW, heightW, foregroundColorW, font, fontStyle, 12);
		
		exit.exitButton(textE, xE, yE, widthE, heightE, foregroundColor, font, fontStyle, fontSize);
		login.oneButton(textLog, xLog, yLog, widthLog, heightLog, foregroundColor, font, fontStyle, fontSize, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LoginToProgram log = new LoginToProgram();
				
				String usernameInput = username.getText();
				@SuppressWarnings("deprecation")
				String passwordInput = password.getText();
				
				log.verifyDatas(usernameInput, passwordInput);
			}
		});
		
		loginFrame.mainFrame(titlef, locxf, locyf, widthf, heightf, resizable, backgroundColor);
		loginFrame.add(informationLabel);
		loginFrame.add(getWarningLabel());
		loginFrame.add(usernameLabel);
		loginFrame.add(passwordLabel);
		loginFrame.add(username);
		loginFrame.add(password);
		loginFrame.add(login);
		loginFrame.add(exit);
	}

	public static LabelCreation getWarningLabel() {
		return warningLabel;
	}

	@SuppressWarnings("static-access")
	public void setWarningLabel(LabelCreation warningLabel) {
		this.warningLabel = warningLabel;
	}
}
