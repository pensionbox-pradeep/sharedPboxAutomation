package databaseUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteCorporateAdmin {
	
	public static void main(String[] args) throws SQLException {
		
		try {
			DeleteCorporateAdmin dca = new DeleteCorporateAdmin();
			dca.deleteAdmin("deletethis@pensionbox.in");
		} catch (SQLException e) {
			System.err.println("SQLException: " + e.getMessage());
		}
	}

	public void deleteAdmin(String email) throws SQLException {
		try(Connection con = DriverManager.getConnection("jdbc:mysql://pensionbox-qa-database.clvkkb0owtsr.ap-south-1.rds.amazonaws.com/pensionbox_qa", "admin", "qa12345678");
				Statement state = con.createStatement()){

			// Verify if the email exists in the corporate_admin_master table
			String query = "SELECT corporateAdminUserid FROM `pensionbox_qa`.`corporate_admin_master` WHERE email = '" + email + "'";
			ResultSet result = state.executeQuery(query);

			String adminId = "";
			while (result.next()) {
				adminId = result.getString("corporateAdminUserid");
			}

			if (!adminId.isEmpty()) {
				// Delete the entry
				int resultCount = state.executeUpdate(
						"DELETE FROM `pensionbox_qa`.`corporate_admin_master` WHERE `corporateAdminUserid` = '" + adminId + "'");
				if (resultCount > 0) {
					System.out.println("Admin with email " + email + " is deleted successfully.");
				} else {
					System.out.println("Failed to delete admin with email " + email + ".");
				}
			} else {
				System.out.println("Admin with email " + email + " not found.");
			}
		}
	}
}
