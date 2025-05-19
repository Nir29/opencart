package pratice;

public class Rectangle implements Shape {
	@Override
	public void areaRectangle() {
		System.out.println(length*width);
		
	}

	@Override
	public void perimeter() {
		System.out.println(2*(length+width));
		
	}
	void add() {
		System.out.println(length+width);
	}

	public static void main(String[] args) {
		Shape sh=new Rectangle();
		sh.areaRectangle();
		sh.perimeter();
		 
		
		Rectangle rc=new Rectangle();
		rc.areaRectangle();
		rc.perimeter();
		rc.add();
		
		

	}

	

}
