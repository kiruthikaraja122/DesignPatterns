package singletonPattern;

public class SingletonMainClass {
	public static void main(String[] args) {
		//new keyword not allowed becoz construtor is private 
		
		Singleton singleton = Singleton.getsingletonInstance();
		System.out.println(singleton +  "Haii i am singleton method");
		
		Singleton singleton2 =Singleton.getsingletonInstance();
		System.out.println(singleton2);

	}

}
