
public class Implementation implements Addition, Subtraction, Library{
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
	
	
	
	public String search(String ls )
	{
		String[] book = new String[] {"C" , "Java" , "Ruby"};
		String result = "";
		for(int i=0;i<book.length;i++)
		{
		 if(ls == book[i])
		 {
			 result = book[i];
		 }
		 
		}
		return result;
	
	}
    
	public String addBook(String ls )
	{
		String[] book = new String[] {"C" , "Java" , "Ruby"};
		String[] result = new String[book.length + 1];
		int i;
		for(i=0;i<book.length;i++)
		{
		 result[i] = book[i];
		 
		}
		result[book.length]= ls;
		
		return (result[book.length]);
		
	
	}
	
	public String del(String ls )
	{
		String[] book = new String[] {"C" , "Java" , "Ruby"};
		String[] newBook = new String[book.length - 1];
		String delBook="null";
		int count = 0;
		for(int i=0; i<book.length;i++)
		{
			if(book[i]==ls)
			{
				delBook= book[i];
				newBook[i] = book[i+1];
			}
		
			
		}
	    return delBook;
	}
	


}
