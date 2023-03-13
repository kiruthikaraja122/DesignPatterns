package structuralDesignPattern;

public class PenAdapter implements Pen {
	
	pilotPen pp = new pilotPen();

	@Override
	public void write(String str) {

			pp.mark(str);
		}
	}


