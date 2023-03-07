package Prototype;

public class BookShopMainMethod {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		BookShop bs = new BookShop();
		bs.setShopName("Novel");
		bs.loadData();

		
		
		BookShop bs1 =bs.clone();
		bs.getBooks().remove(3);

		bs1.setShopName("ABC");
		
		System.out.println(bs);

		System.out.println(bs1);

	}

}
