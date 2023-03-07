package DesignPattern;

public class OperatingFactory {
   public OperatingSystem getInstance(String str) {
	   if(str.equals("open")) 
		   return new Android();
	   else if(str.equals("close"))
		   return new IOS();
	   else 
		   return new Windows();
		   
	   }
   }

