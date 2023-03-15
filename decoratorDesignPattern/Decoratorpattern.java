package decoratorDesignPattern;

public class Decoratorpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Shape circle = new Circle();
     Shape redCircle = new RedShapeDecarator(new Circle());
     Shape redRectangle = new RedShapeDecarator(new Rectangle());
     System.out.println("circle with normal border ");
     circle.draw();
     System.out.println("/n circle of red border");
     redCircle.draw();
     System.out.println("/n Rectangle red color ");
     redRectangle.draw();
	}

}
