package defaultpackage;
import java.sql.*;

public class Validate
 {
     public static boolean checkUser(String username,String password) 
     {
      boolean st = false;
      try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/db","root","magily2015");
         PreparedStatement ps =con.prepareStatement
                             ("select * from info where username=? and password=? ");
		ps.setString(1, username);
		ps.setString(2, password);
         ResultSet rs =ps.executeQuery();
        
         st = rs.next();
        
      }catch(Exception e)
      {
          e.printStackTrace();
      }
         return st;                 
  }   
}