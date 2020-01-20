/**
 * Written by BaZyO, all rights reserved
 * */

package bazyo.ui.button.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import bazyo.ui.optionpane.OptionpaneCreation;

/**
 * @author BaZyO
 *
 */
@SuppressWarnings("serial")
public class ActionFromButton extends JButton {

	public void exitButtonAction() {
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public void connectToDatabase() {
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				OptionpaneCreation db = new OptionpaneCreation();
				db.connectingDatabase();
			}
		});
	}
}
