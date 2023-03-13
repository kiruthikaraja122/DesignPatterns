package structuralDesignPattern;

public class School {
	public static void main(String[] args) {
		//pilotPen pp = new pilotPen();
		Pen p = new PenAdapter();
		AssignmentWork aw = new AssignmentWork();
		aw.setP(p);
		aw.writeAssignment("i'm bit tired to write an assignment");
	}

}
