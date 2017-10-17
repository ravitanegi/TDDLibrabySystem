import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.*;

public class Implementation implements Addition, Subtraction, Library {
	public long add(long... ls)
	{
		long result=0;
		for (long temp :ls)
		{
			result+=temp;

		}
		return result;
	}
  
	public long sub(long... ls)
	{
		long result = ls[0];
		for(int i=1; i<ls.length; i++)
		{
			result-= ls[i];
		}
		return result;
	}
	
	
	/* search function/
	 * (non-Javadoc)
	 * @see Library#search(int)
	 */
	public String search(int ls ) throws ClassNotFoundException, SQLException
	{
	    String book= null;
		Connection myconn;
		
			 String dbUrl= "jdbc:mysql://localhost:3306/library";
			 String user = "root";
			 String password = "";
			 Class.forName("com.mysql.jdbc.Driver");
			 myconn = DriverManager.getConnection(dbUrl,user,password);
			// System.out.println("Initializing the database..");
			 Statement myStmt = myconn.createStatement();
			 ResultSet rs = myStmt.executeQuery("select * from bookdetails where BookId='"+ls+"'");
			  if(rs.next())
			  {
				 book= rs.getString("BookName");
			  }
			  return book;
		//String[] book = new String[] {"C" , "Java" , "Ruby"};
		//String result = "";
		//for(int i=0;i<book.length;i++)
		//{
		// if(ls == book[i])
		// {
		//	 result = book[i];
		// }
		 
		//}
		//return result;
	
	}
    
	public ArrayList addBook(String... ls )
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("C");
		list.add("Java");
		list.add("Ruby");
		
		for(int i=0;i<ls.length;i++) {
			list.add(ls[i]);
		}
		
		return (list);
		
	
	}
	
	public String[] del(String ls )
	{
		String[] book = new String[] {"C" , "Java" , "Ruby"};
		String[] newBook = new String[book.length - 1];
		String delBook="null";
		int count = 0;
		for(int i=0; i<book.length;i++)
		{
			if(book[i]!=ls)
			{
				newBook[count] = book[i];
				count++;
			}
		
			
		}
	    return newBook;
	}
	


}
