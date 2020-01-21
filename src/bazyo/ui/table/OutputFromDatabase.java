/**
 * Written by BaZyO, all rights reserved
 * */
package bazyo.ui.table;

import javax.swing.JTable;

import bazyo.database.requests.ChooseDatabaseSize;
import bazyo.ui.frame.FrameCreation;

/**
 * @author BaZyO
 *
 */
@SuppressWarnings("serial")
public class OutputFromDatabase extends JTable {
	ChooseDatabaseSize chooseColumns = new ChooseDatabaseSize();
	FrameCreation showAllFromDatabase = new FrameCreation();
	
	public void outputDatas(Object[] cols) {
		System.out.println(cols);
	}
}
