package day3;

class Program1
		  String name="Divya";
		  // name -object into primivite type
		  int arr[]= {3,6,8,9,5};
		  
		  void display()
		  {
			  try //try should be followed by either catch or finally
			  {
				 String a=null;
			System.out.println(a.length());
			   System.out.println(arr[2]); //trying to access the value from index of 7
			   int num=Integer.parseInt(name); //trying to convert string to int
			   System.out.println(num);
			  }
			  catch(NumberFormatException e)// handle the exception
			  {
				  System.out.println(" We can't convert String into number");
			  }
			  catch(ArrayIndexOutOfBoundsException e)
			  {
				  System.out.println("Index outof bound exception");
			  }
			  catch(Exception e)
			  {
				  System.out.println(e.getMessage());
			  }
			  finally// if you want to execute the necessary code of the program
			  {
				  System.out.println("Thank you"); // it is executed  whether an exception is handled or not
			  }
		  }
	}
	public class ExcHandling {
	 
		public static void main(String[] args) {
			
			
			
//			  String name="Divya";
//			  // name -object into primivite type
//			  int arr[]= {3,6,8,9,5}; //   ArrayIndexOutOfBoundsException
//			  System.out.println(arr[8]); //trying to access the value from index of 7
//			   int num=Integer.parseInt(name); //trying to convert string to int //NumberFormatException
//			   System.out.println(num);
			Program1 obj=new Program1();
			obj.display();
			
		}
	 
	}

}
