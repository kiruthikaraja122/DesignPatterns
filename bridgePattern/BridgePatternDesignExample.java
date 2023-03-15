package bridgePattern;

public class BridgePatternDesignExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BridgePatternDesign red = new RedColor();
		BridgePatternDesign blue = new BlueColor();
		
		Shape square = new Square(red);
		square.draw();
		
//	Shape circle  = new Circle(blue);
//		circle.draw();		
	}

	}


