package com.wipro.pack.Command_Line_Args_System_Properties_ackaging.Automobile.TwoWheeler;

import com.wipro.pack.Command_Line_Args_System_Properties_ackaging.Automobile.Vehicle;

public class Hero extends Vehicle{

	@Override
	public String modelName() {
		// TODO Auto-generated method stub
		return "GTX-T";
	}

	@Override
	public String registrationNumber() {
		// TODO Auto-generated method stub
		return "2012286256789";
	}

	@Override
	public String ownerName() {
		// TODO Auto-generated method stub
		return "RATAN TATA";
	}

	public int speed(){
		return 70;
	} 
	public void radio(){
		System.out.println("The hero is playing now radio");
	} 
}
