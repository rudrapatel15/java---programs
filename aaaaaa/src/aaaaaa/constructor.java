package aaaaaa;

class AA{
	int i,j;
	 AA(){
		 System.out.println("default constructor");
	}
	 AA(int i,int j){
		 this.i = i;
		 this.j = j;
		 System.out.println("para constructor"+i+j);
	}
	AA(String i){
		 System.out.println("stirng para constructor");
	}
	public void call() {
		System.out.println("i = "+i+"j = "+j);
	}
}
class A{
	int i,j;
	A(AA a){
		this.i = a.i;
		this.j = a.j;
		System.out.println("copy cons");
	}
	public void calling() {
		System.out.println("i = "+i+" j = "+j);
	}
}
public class constructor {
	public static void main(String[] args) {
		AA a = new AA(10,90);
		a.call();
		A a1 = new A(a);
		a1.calling();
	}
}






