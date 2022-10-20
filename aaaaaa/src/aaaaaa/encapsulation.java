package aaaaaa;

public class encapsulation {
	public static void main(String[] args) {
		ENc e = new ENc(23, 2);
		e.getencapsulation();
	}
	
}
  class ENc{
	  int length;
		int breadth;
		
		ENc(int length,int breadth){
			this.length=length;
			this.breadth= breadth;
		}
	    
		public void getencapsulation() {
			int encapsulation = length*breadth;
			System.out.println("encapsulation : " + encapsulation);
		}
  }
