/**
 * Written by BaZyO, all rights reserved
 * */
package bazyo.ui.optionpane;

import javax.swing.JOptionPane;

import bazyo.database.requests.ChooseDatabaseSize;

/**
 * @author BaZyO
 *
 */
@SuppressWarnings("serial")
public class SelectDatabaseColumn extends JOptionPane implements DescriptionOptionpanes {
	
	private String[] databases = {"choose one", "2 Columns", "3 Columns", "4 Columns", "5 Columns",
			"6 Columns", "7 Columns", "8 Columns", "9 Columns", "10 Columns"};
	
	public void selectOneData() {
		String chooseDatabase = (String) JOptionPane.showInputDialog(null, chooseColumns, title, JOptionPane.QUESTION_MESSAGE, null, databases, databases[0]);
		
		ChooseDatabaseSize.selectedColumn(chooseDatabase);
	}
}
