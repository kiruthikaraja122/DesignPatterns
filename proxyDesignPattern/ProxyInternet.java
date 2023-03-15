package proxyDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
  private Internet internet =new RealInternet();
  
  private static List<String> bannedSites;
  
  static {
	  bannedSites = new ArrayList<String>();
	  bannedSites.add("www.com");
	  bannedSites.add("zzz.com");
  }
	@Override
	public void connectTo(String serverHost) throws Exception {
      if(bannedSites.contains(serverHost.toLowerCase())) {
    	  throw new Exception("Access Deined");
      }
      
      internet.connectTo(serverHost);
	}

}
