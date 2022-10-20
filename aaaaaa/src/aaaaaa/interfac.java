package aaaaaa;

interface printable{
		void print();
		}

class interfac implements printable{
public void print(){System.out.println("Hello");}

public static void main(String args[]){
 interfac obj = new interfac();
obj.print();
}
}
