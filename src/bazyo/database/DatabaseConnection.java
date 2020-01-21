/**
 * Written by BaZyO, all rights reserved
 * */
package bazyo.database;

import java.sql.Connection;

import javax.swing.JOptionPane;

/**
 * @author BaZyO
 *
 */
public class DatabaseConnection {
	private final static String message = "The connection to SQL failed!";
	private final static String title = "Connection failed!";
	
	private static String dbHostname;
	private static String dbPort;
	private static String dbName;
	private static String dbUser;
	private static String dbPass;
	
	public String url = "jdbc:mysql://" + dbHostname + ":" + dbPort + "/" + dbName;
	
	public void connectDatabase(String dbHost, String dbPort, String dbName, String dbUser, String dbPass) {
		DatabaseConnection.dbHostname = dbHost;
		DatabaseConnection.dbPort = dbPort;
		DatabaseConnection.dbName = dbName;
		DatabaseConnection.setDbUser(dbUser);
		DatabaseConnection.setDbPass(dbPass);
		
//		System.out.println(dbHostname + this.dbPort + this.dbName + this.dbUser + this.dbPass);
	}
	
	@SuppressWarnings("deprecation")
	public void tryToConnect() {
		@SuppressWarnings("unused")
		Connection conn = null;
		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
			System.out.println("Connection failed: \n" + e);
		}
	}

	public String getDbUser() {
		return dbUser;
	}

	public static void setDbUser(String dbUser) {
		DatabaseConnection.dbUser = dbUser;
	}

	public String getDbPass() {
		return dbPass;
	}

	public static void setDbPass(String dbPass) {
		DatabaseConnection.dbPass = dbPass;
	}
}
