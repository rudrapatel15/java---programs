package aaaaaa;

public class multiple {
	public static void main(String args[]) {
		Baby d = new Baby();
		d.eat();
		d.bark();
		d.weep();
		
		  
	        }
	}

class Anima{
		void eat() {System.out.println("Eating...");
	   }
	}

class Do extends Anima{
		void bark() {System.out.println("Barking...");
	  }
	}	
class Baby extends Do{
	     void weep() {System.out.println("Weeping...");
	
	}
}
