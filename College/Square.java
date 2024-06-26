public class Square extends Rectangle {
    
	public Square(){
		super();
	}

	public Square(double side){
		super(side,side);
	}

	public Square(String color, boolean filled, double side){
		super(side, side, color, filled);
	}

	public double getSide(){
		return getLength();
	}

	public void setSide(double side){
		setWidth(side);
		setLength(side);
	}
	
	public void setWidth(double side){
		setWidth(side);
		setLength(side);
	}

	public void setLength(double side){
		setWidth(side);
		setLength(side);
	}

	@Override
	public String toString(){
		return "Square["+ super.toString() +"]]";
	}
}	