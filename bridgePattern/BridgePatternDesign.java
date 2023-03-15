package bridgePattern;

public interface BridgePatternDesign {
	public void applycolor();

}

class RedColor implements BridgePatternDesign{

	@Override
	public void applycolor() {
		// TODO Auto-generated method stub
		System.out.println("Applying red color");
	}
	
}

class BlueColor implements BridgePatternDesign{

	@Override
	public void applycolor() {
		// TODO Auto-generated method stub
		System.out.println("Applying blue  color");
	}
	
}
abstract class Shape{
	protected BridgePatternDesign color;
	
	public Shape(BridgePatternDesign color) {
		this.color = color;
	}
	public abstract void draw();
}

class Square extends Shape{

	public Square(BridgePatternDesign color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw a square ");
		color.applycolor();
	}
	class Circle extends Shape{

		public Circle(BridgePatternDesign color) {
			super(color);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void draw() {
			// TODO Auto-generated method stub
			System.out.println("draw a circle ");
			color.applycolor();

		}
	}
}
	
	


