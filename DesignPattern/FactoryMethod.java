package DesignPattern;

public class FactoryMethod {
    public static void main(String[] args) {
//    	OpeartingSystem obj= new Android();
    	OperatingFactory os= new OperatingFactory();
    	 OperatingSystem obj=os.getInstance("open");
    	 obj.spec();
    }
}

