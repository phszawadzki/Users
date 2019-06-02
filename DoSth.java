package Database.App;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DoSth {

	public void SelectAllFromUsers() throws SQLException {
		DbManager dbManager = DbManager.getInstance();

		Statement statement = dbManager.getConnection().createStatement();
		
		String sqlQuery = "SELECT * FROM USERS";

        ResultSet rs = statement.executeQuery(sqlQuery);
		
        int counter = 0;
        while(rs.next()) {
                System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
                counter++;
        }
	}
	
	public void AddUser () throws SQLException {
		System.out.println("Wpisz imiê: ");
		Scanner reader = new Scanner(System.in);
		String firstName = reader.nextLine(); 
		reader.close();
		
		System.out.println("Wpisz nazwisko: ");
		Scanner reader2 = new Scanner(System.in);
		String lastName = reader2.nextLine(); 
		reader.close();
		
		DbManager dbManager = DbManager.getInstance();

		Statement statement = dbManager.getConnection().createStatement();
		
		String sqlQuery = "INSERT INTO USERS (FIRSTNAME, LASTNAME) VALUES (\"" +
				firstName + "\", \"" + lastName + "\")";

        statement.executeUpdate(sqlQuery);		
		
	}
	
public void DeleteUser (int id) throws SQLException {
		
		DbManager dbManager = DbManager.getInstance();

		Statement statement = dbManager.getConnection().createStatement();
		
		String sqlQuery = "DELETE FROM USERS WHERE ID=" + id;

        statement.executeUpdate(sqlQuery);		
		
	}
	
}
