package BuilderPatternMethod;

public class Mobile1 {
	
	public static void main(String[] args) {
		Mobile mobile = new Mobile.Builder("samsung").setColor("blue").setRam("16GB").build();
		
		Mobile mobile1=new Mobile.Builder("oppo").setColor("goldish").setRam("8GB").setProcessor("dual-core").build();
		System.out.println(mobile);
		System.out.println(mobile1);

	}

}
