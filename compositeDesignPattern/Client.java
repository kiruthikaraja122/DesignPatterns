package compositeDesignPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     CompositeAccount component = new CompositeAccount();
     component.addAccount(new DepositeAccount("0001",100));
     component.addAccount(new DepositeAccount("0004",500));
     component.addAccount(new DepositeAccount("0009",1000));

     float totalBalance = component.getbalance();
     System.out.println("TotalBalance:" + totalBalance);

     }

}
