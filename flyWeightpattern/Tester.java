package flyWeightpattern;

public class Tester implements Employee{
	private final String JOB;
	private String skill;
	
	public Tester () {
		JOB="Test the issue";
	}

	@Override
	public void assignSilk(String skill) {
		
		this.skill= skill;
	}
		// TODO Auto-generated method stub
		
	

	@Override
	public void task() {
		// TODO Auto-generated method stub
		System.out.println("Tester with skill:" + this.skill + "with job:" +JOB);
	}

}
