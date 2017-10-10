import static org.junit.Assert.*;

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
	public void testSearch()
	{
		String check = "Java";
		assertEquals("Java",obj.search(check));
		
		check = "C";
		assertEquals("C",obj.search(check));
		
		check = "Ruby";
		assertEquals("Ruby",obj.search(check));
				
		
		
	    
	}
	
	@Test
	public void testAddBook()
	{
		String check = "Python";
		assertEquals("Python",obj.addBook(check));
		
		
		check = "Dotnet";
		assertEquals("Dotnet",obj.addBook(check));
		
				
	    
	}
}
