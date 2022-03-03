public class TestShape {
	public static void main(String[] args){
	//Shape
		Shape A = new Shape();
		System.out.println(A);
		Shape B = new Shape("purple",true);
		System.out.println(B);
		
	//Circle
		System.out.println();
		Circle C = new Circle(7.0);
		System.out.println(C);
		System.out.println("Luas: "+C.getArea());
		System.out.println("Keliling: "+C.getPerimeter());
		
	//Rectangle	
		System.out.println();
		Rectangle D = new Rectangle(4, 9, "black", false);
		System.out.println(D);
		System.out.println("Luas: "+D.getArea());
		System.out.println("Keliling: "+D.getPerimeter());
		
	//Square
		System.out.println();
		Square E = new Square(5);
		System.out.println(E);
		
}
}