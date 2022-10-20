package aaaaaa;

public class hierarchical {
	public static void main(String args[]) {
		Babys d = new Babys();
		d.eat();
		d.weep();
		Dogy c = new Dogy();
		c.bark();
		c.eat();
		  
	        }
	}

class Animala{
		void eat() {System.out.println("Eating...");
	   }
	}

class Dogy extends Animala{
		void bark() {System.out.println("Barking...");
	  }
	}	
class Babys extends Animala{
	     void weep() {System.out.println("Weeping...");
	
	}
}
