import java.sql.*;

public class PersonDBMethods{
	Connection con = null;
	String sql;
	Statement stmt = null;
	ResultSet rs = null;

	public void connect(){
		try{
 		 if (con==null)
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		    con = DriverManager.getConnection("jdbc:odbc:Person"," ", " ");
		}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}

	public void disconnect(){
		try{
			if(con!=null)
				con.close();
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}

	public void insertRecord(String name, int age){
		try{
			stmt = con.createStatement();
			sql = ("Insert into profile (name,age) values('"+name+"',"+age+")");
	   		stmt.executeUpdate(sql);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}

	public boolean deleteRecord(String name){
		boolean del = false;
		try{
			stmt = con.createStatement();	
			sql = "Select * from profile where name = '" + name + "' ";
			rs = stmt.executeQuery(sql);
			if(rs.next()){
				sql = "Delete from profile where name = ' "+ name + " ' ";
				stmt.executeUpdate(sql);
				del = true;
			}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}finally{
			return del;
		}
	}

	public ResultSet searchRecord(String name){
		try{
			stmt = con.createStatement();
			sql = "Select * from profile where name = '" + name + "' ";
			rs = stmt.executeQuery(sql);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}finally{
			return rs;
		}
	}


	public static void main(String[] args)throws Exception{
		PersonDBMethods p = new PersonDBMethods();
		java.util.Scanner s = new java.util.Scanner(System.in);
		ResultSet rs = null;
		try{
	   		p.connect();
		   	System.out.println("connected");

		   	System.out.println("Enter name:");
		   	String n = s.next();
		   	System.out.println("Enter age:");
		   	int a = s.nextInt();
		   	p.insertRecord(n,a);
		   	System.out.println("record inserted");

			System.out.println("Enter name to be searched:");
		   	String name = s.next();
			rs = p.searchRecord(name);

			System.out.println("NAME" + "\t" + "AGE");
			while(rs.next()){
					String na = rs.getString("name");
					int ag = rs.getInt("age");
					System.out.println(na + "\t" + ag);
	   		}

	   		System.out.println("Enter name to be deleted:");
			String nam = s.next();
			if(p.deleteRecord(nam))
				System.out.println("Record deleted");
			else
				System.out.println("Name not found");

		}catch(Exception ex){
		}finally{
			p.disconnect();
		}
	}
}