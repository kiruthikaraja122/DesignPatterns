package singletonPattern;

public class Singleton {
	private static volatile Singleton singleton;
	//doble checking singleton
	private Singleton() { //constructor
		
	if(singleton!=null) {
		throw new RuntimeException("get your object by getsingletonInstance");
		}

}
	public static Singleton getsingletonInstance() {//object return method 
		
		if(singleton==null)
		synchronized(Singleton.class) {
				if(singleton==null) {
					singleton = new Singleton(); //only access  class methods in constructor
				}
			}
			
		//singleton = new Singleton();
		return singleton;
	}

}