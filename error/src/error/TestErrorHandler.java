package error;
import java.io.IOException;
public class TestErrorHandler {

	public TestErrorHandler()  //constructor 
	{

	}

	public void run()
	{
		testCatch();
	}
	
	
	
	public void testCatch()
	{
	try {  //This method causes problems
		testError(1);
	
	} 
	catch (IOException e) {
		
		System.out.println("IO error caught");
		e.printStackTrace();
	}
	
	catch (IllegalArgumentException e ) {
		
		System.out.println("IA error caught");
		e.printStackTrace();
	}finally {
			System.out.println("Final cleanup");
	
	}}  
	
	
	public void testError(int value) throws IOException
	{
	if(value > 5)
	throw new IOException("This is an IO error");
	if(value < 2)
		throw new IOException("This is an IA error");
	
	}
	
	
	public static void main(String[] args) 
	{
	TestErrorHandler teh = new TestErrorHandler();
	teh.run();
	}

}
