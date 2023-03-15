package flyWeightpattern;

public class Developer implements Employee{
	
	private final String JOB;
	private String skill;
	
	public Developer () {
		JOB="Fix the issue";
	}

	@Override
	public void assignSilk(String skill) {
		// TODO Auto-generated method stub
		this.skill =skill;
		
	}

	@Override
	public void task() {
		// TODO Auto-generated method stub
		System.out.println("Developer with skill:" + this.skill + "with job: " + JOB);
	}

}
