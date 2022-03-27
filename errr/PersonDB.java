import java.sql.*;
public class PersonDB{
	public static void main(String[] args)throws Exception{
		Connection con = null;
		String sql;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			//establishing database connection
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		    con=DriverManager.getConnection("jdbc:ucanaccess://Y:/Leah V. Barbaso/PROGRAMS/JAVA/JAVADB/person.mdb");
		   // con = DriverManager.getConnection("jdbc:odbc:Person32"," ", " "); //Data Source Name: Person
			System.out.println("connection established...");

			//inserting a record
/*			stmt = con.createStatement();
			String n = "James1";
			int a= 45;
			sql = "Insert into profile values('"+n+"',"+a+")";
	   		stmt.executeUpdate(sql);
	   		System.out.println("record added...");
*/
			//retrieving records
//			String sql1 = "Select * from profile";
//			rs = stmt.executeQuery(sql1);

//			System.out.println("NAME" + "\t" + "AGE");
//			System.out.println(rs.toString());

			//deleting a record
/*			String sql2 = "Delete from profile where name = 'James1'";
			stmt.executeUpdate(sql2);
*/
		}catch(Exception ex){
		}finally{
		//	con.close();
		}
	}
}