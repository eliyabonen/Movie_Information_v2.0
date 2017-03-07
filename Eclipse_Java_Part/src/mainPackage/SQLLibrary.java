package mainPackage;

public class SQLLibrary
{
	static
	{
		System.loadLibrary("SQLLibrary");
	}
	
	private static SQLLibrary sqlLibraryObject;
	
	private SQLLibrary()
	{
		
	}
	
	public static SQLLibrary getInstance()
	{
		if(sqlLibraryObject == null)
			sqlLibraryObject = new SQLLibrary();
		return sqlLibraryObject;
	}
	
	public native String queryDataBase(String query);

}
