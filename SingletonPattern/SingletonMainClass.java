package SingletonPattern;

public class SingletonMainClass {
	public static void main(String[] args) {
		
		Singleton singleton = Singleton.getsingletonInstance();
		System.out.println(singleton);
		
		Singleton singleton2 =Singleton.getsingletonInstance();
		System.out.println(singleton2);

	}

}
