package aaaaaa;
import java.util.Scanner;

class Throw{
	public void divide() {
		 Scanner sc = new Scanner(System.in);
		  System.out.println("enter a = ");
		  int a = sc.nextInt();
		  System.out.println("enter b = ");
		  
		  int b = sc.nextInt();
		  System.out.println(a/b);
		  throw new ArithmeticException();
	}
}
public class exception {
	public static void main (String[] args) {
		
		try {
			Throw t = new Throw();
			t.divide();
		      	 
		}
		catch(ArithmeticException e) {
			System.out.println("not divide by zero");
		   e.printStackTrace();
		}
		finally {
			System.out.println("this will be execute everytime");
		}
	}
        
}
