package Database.App;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) throws SQLException {
		
		System.out.println("Naciœnij \n"
				+ "1. Aby pokazaæ wszystkich u¿ytkowników\n"
				+ "2. Aby dodaæ nowego u¿ytkownika\n"
				+ "3. Aby usun¹æ u¿ytkownika\n");
		
		Scanner reader = new Scanner(System.in);
		int number = reader.nextInt(); 
//		reader.close();
		
	
		switch (number) {
		    case 1:
		    	new DoSth().SelectAllFromUsers();
		    	break;
		    case 2:
		    	new DoSth().AddUser();
		    	break;
		    case 3:
		    	System.out.println("Insert User's ID");
		    	
				int userId = reader.nextInt(); 
				reader.close();
				new DoSth().DeleteUser(userId);
				break;
		    	
		}
		
		new DoSth().SelectAllFromUsers();
		
		

	}

}
