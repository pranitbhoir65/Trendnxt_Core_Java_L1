package com.wipro.pack.Object_Oriented_Concepts;

class Book{
	
	private String isbn;
	private String title;
	private String author;
	private double price;
	
	public Book (String isbn, String title, String author, double price){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
		
	}
	
	void details (){
		System.out.println("The ISBN number of Book :"+isbn);
		System.out.println("The Title of the Book :"+title);
		System.out.println("The author of the book :"+author);
		System.out.println("The price of the book :"+price);
		
	}
	
	void discountedPrice(int percent){
		double percent_for_calculation = ((double)percent)/100;
		double discounted_price = (price)-(price*percent_for_calculation);
		System.out.println("The discounted price of the book :"+discounted_price);
			
	}
}



public class Assignment_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String isbn = "5678-8905-6789-9034";
		String title = "Journey of Life";
		String author = "Bill gates";
		double price = 10500.0;
		Book book = new Book(isbn,title,author,price);
		book.details();
		int discount_percent = 20;
		book.discountedPrice(discount_percent);

	}

}
