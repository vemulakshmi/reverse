import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectRecord {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

             Class.forName("oracle.jdbc.driver.OracleDriver");
             Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","chaitu");
             Statement st = con.createStatement();
     		// execute the statement
     		PreparedStatement pst =  con.prepareStatement("insert into lakshmidata values(?,?,?,?)");
     		pst.setInt(1, 1);
     		pst.setString(2, "laksmi");
     		pst.setInt(3, 87895894);
     		pst.setString(4, "dallas");
     		int n = pst.executeUpdate();
     	
     		if (n!=0)

     		{
     			System.out.println("record is inserted");
     		}else
     		{
     			System.out.println("record is not inserted ");
     		}
             // execute the query
            ResultSet rs=  st.executeQuery("select * from lakshmidata");
            while(rs.next())
            {
            	System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
            }
	}

}
