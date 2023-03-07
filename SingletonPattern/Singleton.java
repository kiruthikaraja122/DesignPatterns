package SingletonPattern;

public class Singleton {
	private static volatile Singleton singleton;
	//doble checking singleton
	private Singleton() {
		
	if(singleton!=null) {
		throw new RuntimeException("get your object by getsingletonInstance");
		}

}
	public static Singleton getsingletonInstance() {
		
		if(singleton==null)
		synchronized(Singleton.class) {
				if(singleton==null) {
					singleton = new Singleton();
				}
			}
			
		//singleton = new Singleton();
		return singleton;
	}

}