package com.wipro.pack.Object_Oriented_Concepts;


class Document 
{
	private String text;

	public Document(String text)
	{
		setText(text);
	}
	public void setText(String text) 
	{
		this.text = text;
	}
	public String toString()
	{
		return text;
	}
} 


class Email extends Document 
{
	private String sender;
	private String recipient;
	private String title;

	public Email(String text, String sender, String recipient, String title) 
	{

		super(text);
		this.sender = sender;
		this.recipient = recipient;
		this.title = title;
	}

	public String getSender()
	{
		return sender;
	}

	public String getRecipient() 
	{
		return recipient;
	}

	public String getTitle() 
	{
		return title;
	}

	public String gettext()
	{
		return super.toString();
	}

	public void setSender(String newSenderMsg)
	{
		sender = newSenderMsg;
	}

	public void setRecipient(String newRecMsg)
	{
		recipient = newRecMsg;
	}

	public void setTitle(String newTitleMsg) 
	{
		title = newTitleMsg;
	}

	public String toString() 
	{
		return "From: " + sender + "\nTo: " + recipient + "\n" + title + "\n" + super.toString();

	}
}



public class Assignment_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Email email = new Email ("My Name is Pranit.","Pranit","Joydeep","Journery Of Engineer");
		System.out.println("Details :\n"+email.toString());

	}

}
