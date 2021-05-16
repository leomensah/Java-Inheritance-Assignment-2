
class Author{
	private String name;
	private String email;
	private char gender;
	
	
	Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "\"" + this.getName() + " (" +this.getGender()+") at "+ this.getEmail()+ "\"";
	}
	
}


class Book{
	private String name;
	private Author author;
	private double price;
	private int quantity;
	
	Book(String name, double price, int quantity, Author author){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.author = author;
	}
	
	//The public getters and setters: getName(), getAuthor(), getPrice(), setPrice(), getQty(),setQty().
	
	public String getName() {
		return name;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQty() {
		return quantity;
	}
	
	public void setQty(int quantity) {
		this.quantity = quantity;
	}
	
	public String toString() {
		return this.getName() + " by " + author.toString();
	}
}

public class Q1 {

	public static void main(String[] args) {
		Author author = new Author("Tan ah Tek", "ahTeck@somewhere.com", 'f');
		System.out.println(author.toString());
		
		
		Book bk = new Book("Effective Java", 200.45, 123, author);
		System.out.println(bk.toString());
	}
}
