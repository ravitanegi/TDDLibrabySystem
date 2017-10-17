import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ImplementationTest {

	private Implementation obj;
	@Before
	public void setUp() throws Exception {
		obj = new Implementation();
	}

	@After
	public void tearDown() throws Exception {
		obj =null;
	}

	@Test
	public void testAdd() {
	
		long ans= 49 + (-27) + 13 + (-19);
		assertEquals(ans, obj.add(49,-27,13,-19));
		
		ans = 24+18+32;
		assertEquals(ans, obj.add(24,18,32));
		
		ans= 9;
		assertEquals(ans,obj.add(9));
	}

	@Test
	public void testSub() {
		
		long ans= 49 -16-13-2;
		assertEquals(ans, obj.add(49,-16,-13,-2));
		
		ans = 24-4-10;
		assertEquals(ans, obj.add(24,-4,-10));
		
		ans= 9;
		assertEquals(ans,obj.add(9));
	}
	
	@Test
	public void testSearch() throws ClassNotFoundException, SQLException
	{
		int BookId = 1;
		assertEquals("C",obj.search(BookId));
		
		//String check = "Java";
		//assertEquals("Java",obj.search(check));
		
		//check = "C";
		//assertEquals("C",obj.search(check));
		
		//check = "Ruby";
		//assertEquals("Ruby",obj.search(check));
				
		
		
	    
	}
	
	@Test
	public void testAddBook()
	{
		String BookTitle= "Python";
		
		ArrayList<String> expected = new ArrayList<String>();
		
		expected.add("C");
		expected.add("Java");
		expected.add("Ruby");
		expected.add("Python");
		assertEquals(expected,obj.addBook(BookTitle));

		expected.add("Javascript");
		expected.add("C++");
		expected.add("PHP");
		assertEquals(expected,obj.addBook("Python","Javascript","C++","PHP"));
	}
	
	@Test
	public void testDel()
	{
		String[] book = new String[] {"C" , "Java" , "Ruby"};
		String check = "C";
		String[] newBookList= new String[] {"Java", "Ruby"};
		assertEquals(newBookList,obj.del(check));
		
		check = "Java";
		
		newBookList= new String[] {"C", "Ruby"};
		assertEquals(newBookList,obj.del(check));
		
		
	    // check = "Java";
		//assertEquals("book",obj.del(check));	
	    
	}
}
