package flyWeightpattern;

import java.util.Random;

public class Engineering {
	
	private static String employee[]= {"Developer", "Tester"};
	private static String skills[]= {"java","c++","python"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i =0;i<10;i++) {
			Employee e = EmployeeFactory.getEmployee(getRandEmployee());
			e.assignSilk(getRandskill());
			e.task();
		}

	}

	
	public static String getRandEmployee() {
		Random r= new Random();
		int randInt = r.nextInt(employee.length);
		
		return employee[randInt];
	}
	
	public static String getRandskill() {
		Random r = new Random();
		int randInt = r.nextInt(skills.length);
		
		return skills[randInt];
	}
}
