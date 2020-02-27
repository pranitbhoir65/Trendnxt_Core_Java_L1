package com.wipro.pack.Object_Oriented_Concepts;


class Payment {
	
	protected double amount;
	public Payment(double amount){
		
		setAmout(amount);
	}
	public void setAmout(double amount) {
		// TODO Auto-generated method stub
		
		this.amount=amount;
	}
	public double getAmount(){
		
		return amount;
	}
	public void paymentDetails(){
		
		System.out.println("The payment amount: " +amount);
	}
}

class CashPayment extends Payment{

	public CashPayment(double amount) {
		super(amount);
		// TODO Auto-generated constructor stub
		
	}
    public void paymentDetails(){
		
		System.out.println("The payment is in cash: " +this.amount);
	}
	
}

class CreditCardPayment extends Payment {

	public String name, expDate, number;
	
	public CreditCardPayment(double amount,String name,String expDate,String number) {
		super(amount);
		this.number = number;
		this.expDate = expDate;
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	
	public void paymentDetails() {
		System.out.println("The payment of " + this.amount + " through the card " + this.number
	        + ",  and expire date "	+ this.expDate + ", and the owner name: " + this.name + ".");
		}
	
	
}






public class Assignment_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CreditCardPayment x = new CreditCardPayment(2.12, "Pranit Bhoir","07/29", "567812341234");

		CashPayment p = new CashPayment(20.00);

        CreditCardPayment y = new CreditCardPayment(11.22, "Joydeep Maiti","11/29","678435698765");

		CashPayment q = new CashPayment(55.00);
		
		x.paymentDetails();
		p.paymentDetails();
		y.paymentDetails();
		q.paymentDetails();
		
		
	}

}
