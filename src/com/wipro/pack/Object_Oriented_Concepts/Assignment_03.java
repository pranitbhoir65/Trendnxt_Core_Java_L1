package com.wipro.pack.Object_Oriented_Concepts;


class Book1 {
	
	String isbn;
	String title;
	double price;
}

class Magazine extends Book1 {
	
	String type;
	Magazine (String type,String isbn,String title,double price ){
		this.type=type;
		this.isbn=isbn;
		this.title=title;
		this.price=price;
	}
	
	public void details (){
		System.out.println("The magazine type : "+type);
		System.out.println("The magazine ISBN code : "+isbn);
		System.out.println("The magazine title : "+title);
		System.out.println("The magazine price : "+price);

	}
	

}


class Novel extends Book1 {
	
	String author;
	Novel (String author,String isbn,String title,double price ){
		this.author=author;
		this.isbn=isbn;
		this.title=title;
		this.price=price;
	}
	
	public void details (){
		System.out.println("The magazine type : "+author);
		System.out.println("The magazine ISBN code : "+isbn);
		System.out.println("The magazine title : "+title);
		System.out.println("The magazine price : "+price);

	}
	

}


public class Assignment_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Magazine m = new Magazine("ABC","8672-8605-5281-9032","EFG",2000);
		m.details();
		Novel n = new Novel("Bill Gates","9372-5605-5421-7823","EFG",2000);
		n.details();
		
	}

}
