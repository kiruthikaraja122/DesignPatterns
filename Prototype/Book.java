package Prototype;

public class Book {
  
	private int bookid;
	private String bname;

	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bname=" + bname + "]";
	}
	
	
	
}
