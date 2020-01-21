/**
 * Written by BaZyO, all rights reserved
 * */
package bazyo.database.requests;

import javax.swing.JOptionPane;

import bazyo.ui.optionpane.SelectDatabaseColumn;
import bazyo.ui.table.OutputFromDatabase;

/**
 * @author BaZyO
 *
 */
public class ChooseDatabaseSize {
	static SelectDatabaseColumn sd = new SelectDatabaseColumn();
	static OutputFromDatabase out = new OutputFromDatabase();
	
	public static void selectedColumn(String column) {
		if (column.equals("choose one")) {
			sd.selectOneData();
		}if (column.equals("2 Columns")) {
			Object[] colOptionOne = {"Attribute 1", "Attribute 2"};
			out.outputDatas(colOptionOne);
		}if (column.equals("3 Columns")) {
			Object[] colOptionTwo = {"Attribute 1", "Attribute 2", "Attribute 3"};
			out.outputDatas(colOptionTwo);
		}if (column.equals("4 Columns")) {
			Object[] colOptionThree = {"Attribute 1", "Attribute 2", "Attribute 3", "Attribute 4"};
			out.outputDatas(colOptionThree);
		}if (column.equals("5 Columns")) {
			Object[] colOptionFout = {"Attribute 1", "Attribute 2", "Attribute 3", "Attribute 4", "Attribute 5"};
			out.outputDatas(colOptionFout);
		}if (column.equals("6 Columns")) {
			Object[] colOptionFive = {"Attribute 1", "Attribute 2", "Attribute 3", "Attribute 4", "Attribute 5", "Attribute 6"};
			out.outputDatas(colOptionFive);
		}if (column.equals("7 Columns")) {
			Object[] colOptionSix = {"Attribute 1", "Attribute 2", "Attribute 3", "Attribute 4", "Attribute 5", "Attribute 6", "Attribute 7"};
			out.outputDatas(colOptionSix);
		}if (column.equals("8 Columns")) {
			Object[] colOptionSeven = {"Attribute 1", "Attribute 2", "Attribute 3", "Attribute 4", "Attribute 5", "Attribute 6", "Attribute 7", "Attribute 8"};
			out.outputDatas(colOptionSeven);
		}if (column.equals("9 Columns")) {
			Object[] colOptionEight = {"Attribute 1", "Attribute 2", "Attribute 3", "Attribute 4", "Attribute 5", "Attribute 6", "Attribute 7", "Attribute 8", "Attribute 9"};
			out.outputDatas(colOptionEight);
		}if (column.equals("10 Columns")) {
			Object[] colOptionNine = {"Attribute 1", "Attribute 2", "Attribute 3", "Attribute 4", "Attribute 5", "Attribute 6", "Attribute 7", "Attribute 8", "Attribute 9", "Attribute 10"};
			out.outputDatas(colOptionNine);
		}if (column.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Please check!");
		}
	}
}
