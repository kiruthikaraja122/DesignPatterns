package flyWeightpattern;

import java.util.HashMap;

public class EmployeeFactory {     //hashmap basically put the object as per the type 

	private static HashMap<String,Employee> m = new HashMap<String,Employee>();
	
	public static Employee getEmployee(String type) {
		Employee p = null;
		if(m.get(type)!= null) {
			p=m.get(type);
		}else {
			switch(type) {
			case "Developer":
			System.out.println("developer created");
			p = new Developer();
			break;
			case "Tester":
			System.out.println("Tester creater");
			p = new Tester();
			break;
			default:
			System.out.println("No such Employee");
			}
			m.put(type, p);
		}
		return p;
	}

}
