package proxyDesignPattern;

public class ProxyPatternExmaple {

	 public static void main(String[]args) {
		 Internet internet = new ProxyInternet();
		 
		 try {
			 internet.connectTo("google.com");
			 internet.connectTo("yahoo.com");

		 }catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
	 }
}
