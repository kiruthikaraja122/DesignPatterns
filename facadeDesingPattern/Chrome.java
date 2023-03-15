package facadeDesingPattern;

import java.sql.Driver;

public class Chrome {
	public static Driver getChromeDriver() {
		return null;
	}
	public static void genarterHTMLReport(String test, Driver driver) {
		System.out.println("Generating HTML report for chrome Driver");
	}

	
	public static void genarteJunitReport(String test, Driver driver) {
		System.out.println("Generating Junit report for chrome Driver");
}
}
