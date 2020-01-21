/**
 * Written by BaZyO, all rights reserved
 * */
package bazyo.database.requests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;


import bazyo.database.DatabaseConnection;

/**
 * @author BaZyO
 *
 */
public class ShowDatasFromDatabase {
	DatabaseConnection dbConn = new DatabaseConnection();
	
	Connection conn;
	ResultSet rs;
	Statement stm;
	Object data1[][];
	
	private String databaseName;
	private String field1;
	private String input1;
	
	private String selectAllFromDatabase = "SELECT * FROM " + databaseName + ";";
	@SuppressWarnings("unused")
	private String selectAllWhere = "SELECT * FROM " + databaseName + " WHERE " + field1 + " LIKE '" + input1 + "';";
	
	@SuppressWarnings("deprecation")
	public void selectAll(String databaseName, String field1, String input1) {
		this.databaseName = databaseName;
		this.field1 = field1;
		this.input1 = input1;
		
		if (!databaseName.isBlank() && field1.isBlank() && input1.isBlank()) {
			try {
				Class.forName("org.gjt.mm.mysql.Driver").newInstance();
				conn = DriverManager.getConnection(dbConn.url, dbConn.getDbUser(), dbConn.getDbPass());
				stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				rs = stm.executeQuery(selectAllFromDatabase);
				rs.last();
				int rows = rs.getRow();
				rs.beforeFirst();
				ResultSetMetaData metaData = rs.getMetaData();
				int columns = metaData.getColumnCount();
				
				Object[] colHeads = {};
				
				if (colHeads.length != columns) {
					
				}
				
				data1 = new Object[rows][colHeads.length];
				
				for (int i = 0; i < rows; i++) {
					rs.next();
					for (int j = 0; j < colHeads.length; j++) {
						data1[i][j] = rs.getString(j + 1);
					}
				}
				
				
			} catch (Exception e) {
				
			}
		}
	}
	
	public void selectColumsPane(String columns) {
		
	}
}
