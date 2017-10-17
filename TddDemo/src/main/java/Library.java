import java.sql.SQLException;
import java.util.ArrayList;

public interface Library {
	public String search(int ls) throws ClassNotFoundException, SQLException;
	public ArrayList addBook(String... ls);
	public String[] del(String ls);
}
