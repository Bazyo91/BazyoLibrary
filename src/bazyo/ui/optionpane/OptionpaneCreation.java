/**
 * Written by BaZyO, all rights reserved
 * */
package bazyo.ui.optionpane;

import javax.swing.JOptionPane;

import bazyo.database.DatabaseConnection;

/**
 * @author BaZyO
 *
 */
@SuppressWarnings("serial")
public class OptionpaneCreation extends JOptionPane implements DescriptionOptionpanes {
	DatabaseConnection dbConn = new DatabaseConnection();
	
	private String dbHostname;
	private String dbPort;
	private String dbName;
	private String dbUser;
	private String dbPass;
	
	public void connectingDatabase() {
		dbHostname = showInputDialog(null, dbHostnameDesc, title, JOptionPane.PLAIN_MESSAGE);
		dbPort = showInputDialog(null, dbPortDesc, title, JOptionPane.PLAIN_MESSAGE);
		dbName = showInputDialog(null, dbNameDesc, title, JOptionPane.PLAIN_MESSAGE);
		dbUser = showInputDialog(null, dbUserDesc, title, JOptionPane.PLAIN_MESSAGE);
		dbPass = showInputDialog(null, dbPassDesc, title, JOptionPane.PLAIN_MESSAGE);
		
		dbConn.connectDatabase(dbHostname, dbPort, dbName, dbUser, dbPass);
		
		showMessageDialog(null, messageDB, title, JOptionPane.INFORMATION_MESSAGE);
		
//		System.out.println(dbHostname + ", " + dbPort + ", " + dbName + ", " + dbUser + ", " + dbPass);
	}

	public String getDbHostname() {
		return dbHostname;
	}

	public void setDbHostname(String dbHostname) {
		this.dbHostname = dbHostname;
	}

	public String getDbPort() {
		return dbPort;
	}

	public void setDbPort(String dbPort) {
		this.dbPort = dbPort;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getDbUser() {
		return dbUser;
	}

	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}

	public String getDbPass() {
		return dbPass;
	}

	public void setDbPass(String dbPass) {
		this.dbPass = dbPass;
	}
}
