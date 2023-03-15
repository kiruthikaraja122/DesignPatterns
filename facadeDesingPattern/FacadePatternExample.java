package facadeDesingPattern;

public class FacadePatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "CheckElementPresent";
		
		WebExploreHelperFacade.generateReports("firefox","html",test);
		WebExploreHelperFacade.generateReports("firefox","junit",test);
		WebExploreHelperFacade.generateReports("chrome","html",test);
		WebExploreHelperFacade.generateReports("chrome","html",test);
	}

}
