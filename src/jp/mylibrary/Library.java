package jp.mylibrary;

public class Library {
	private Book book;
	private User user;
	private Lending lending;
	
	Library() {
		
	}
	
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public Lending getLending() {
		return lending;
	}
	public void setLending(Lending lending) {
		this.lending = lending;
	}
	
}
