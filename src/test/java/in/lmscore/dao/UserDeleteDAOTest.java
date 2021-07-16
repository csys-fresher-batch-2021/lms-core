package in.lmscore.dao;
import in.lmscore.util.Logger;
public class UserDeleteDAOTest {
	
	
	public static void delete(String empId) {
		String sql = "delete from products where id = '" + empId + "';";
		Logger.debug(sql);
		
		Logger.debug("Deleted this employee Code " + empId );
		
	}
	public static  boolean checkAdminPermission(String userName1) throws Exception {
		if(userName1.equals("Admin")) {
			return true;
		}
		else {
			throw new Exception("You Cannot have a permission to delete.");
			
		}
	}
	public static void main(String[] args) {
		String userName = "Admin";
		
		try {
			checkAdminPermission(userName);
			delete("E1013");
			
		} catch (Exception e) {
			Logger.debug("Error:"+ e.getMessage());
			e.printStackTrace();
		}
				
			
	}

}
