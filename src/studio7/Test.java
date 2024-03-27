package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Test {

	public static void main(String[] args) {
		Rectangle a = new Rectangle(0.8,0.7,"R1");
		Rectangle b = new Rectangle(1.9,2.9,"R2");
		
		if ((a.getlength()*a.getwidth()) > ((b.getlength()*b.getwidth()))){
			System.out.println(a.getname()+" is larger than "+b.getname());
		} else {
			System.out.println(a.getname()+" is smaller than "+b.getname());
		}
		
		boolean flag = compare(a);
		System.out.println(flag);
		
		StdDraw.rectangle(0.5, 0.5, a.getlength()/2, a.getwidth()/2);
	
	}
	
	public static boolean compare(Rectangle test) {
		if(test.getlength() == test.getwidth()) {
			return true;
		}
		return false;
	}

}
