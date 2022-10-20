package aaaaaa;

public class singleinheritance {
	public static void main(String args[]) {
	Dog d = new Dog();
	d.eat();
	d.bark();
	  
        }
}

class Animal{
	void eat() {System.out.println("Eating...");
   }
}

class Dog extends Animal{
	void bark() {System.out.println("Barking...");
  }
}	