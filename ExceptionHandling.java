package day3;
 
public class ExceptionHandling {
// unchecked
// try , catch and finally
	
	public static void main(String[] args) {
		
		try // try cant be there without catch or finally
		{
			   String name ="Divya";
			    System.out.println(name.length()); // null pointer
			    
			    int  num=20;
			    System.out.println(num/10); // divide by zero
			    
			    int arr[]=new int[4];
			    System.out.println(arr[7]); // Arrayoutofbound
			    
		}
		catch(Exception e)
		{
			 System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Thank you");
			
		}
		
		 // instead of a exception - give as message
		    
		    
		
	}
 
}