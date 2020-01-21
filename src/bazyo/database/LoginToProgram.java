/**
 * Written by BaZyO, all rights reserved
 * */
package bazyo.database;

import bazyo.ui.frame.LoginformCreation;

/**
 * @author BaZyO
 *
 */
public class LoginToProgram extends LoginformCreation {
	String uName = "Bazyo";
	String pw = "abc";
	
	public void verifyDatas(String username, String password) {
		if (username.equals(uName) && password.equals(pw)) {
			System.out.println("jo");
		}else {
			LoginformCreation.getWarningLabel().setText(loginFail);
		}
	}
}
