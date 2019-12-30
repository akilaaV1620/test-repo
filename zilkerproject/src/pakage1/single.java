package pakage1;

public class single {
	private single()
	{
		System.out.println("constructor");
	}
	
private static single ob;
public static single create()
{
	if(ob==null)
	{
		ob=new single();
		return ob;
	}
	else {
		return ob;
	}
	
		
	
}

}
