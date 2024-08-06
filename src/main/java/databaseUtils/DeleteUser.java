package databaseUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteUser {
	public static void main(String[] args) throws SQLException{
		try {
			DeleteUser dr = new DeleteUser();
			dr.deleteUser("9844267177");
		} 
		catch (SQLException e){
			System.err.println("SQLException: " + e.getMessage());
		}  
	}


	public void deleteUser(String phNo) throws SQLException{
		try(Connection con = DriverManager.getConnection("jdbc:mysql://pensionbox-qa-database.clvkkb0owtsr.ap-south-1.rds.amazonaws.com/pensionbox_qa", "admin", "qa12345678");
				Statement state = con.createStatement()){

			String query = "SELECT userid FROM `pensionbox_qa`.`users` WHERE contactNumber = '" + phNo + "'";
			ResultSet result = state.executeQuery(query);

			String userId = ""; 
			while (result.next()) {
				userId = result.getString("userid");
			}

			int resultCount = state.executeUpdate("DELETE FROM `pensionbox_qa`.`nps_registration` WHERE `userid` = '" + userId + "'");
			if (resultCount == 1) {
				System.out.println("User "+phNo+" is deleted");
			} else {
				System.out.println("User "+phNo+" is not found");
			}
		}
	}
}
