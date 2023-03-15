package facadeDesingPattern;

import java.sql.Driver;

public class WebExploreHelperFacade {
	public static void generateReports(String explorer, String report, String test) {
		Driver driver = null;
		switch(explorer) {
		case "firefox":
			driver = Firefox.getFirefoxDriver();
		case "html":
			Firefox.genarterHTMLReport(test, driver);
		break;
		case "junit":
			Firefox.genarteJunitReport(test, driver);
			break;
		case "chrome":
			driver = Chrome.getChromeDriver();
			switch(report) {
		case "html":
			Chrome.genarterHTMLReport(test, driver);
		break;
		case "junit":
			Chrome.genarteJunitReport(test, driver);
			break;
		}
	}
}

	
	

}
