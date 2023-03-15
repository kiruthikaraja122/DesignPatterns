package facadeDesingPattern;

import java.sql.Driver;

public class Firefox {
	public static Driver getFirefoxDriver() {
		return null;
	}
	
	public static void genarterHTMLReport(String test, Driver driver) {
		System.out.println("Generating HTML report for firefox Driver");
	}

	
	public static void genarteJunitReport(String test, Driver driver) {
		System.out.println("Generating Junit report for firefox Driver");
}
	
	}

