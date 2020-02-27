package com.wipro.pack.Command_Line_Args_System_Properties_ackaging.Automobile.TwoWheeler;

import com.wipro.pack.Command_Line_Args_System_Properties_ackaging.Automobile.Vehicle;

public class Honda extends Vehicle{

	@Override
	public String modelName() {
		// TODO Auto-generated method stub
		return "GTX-L";
	}

	@Override
	public String registrationNumber() {
		// TODO Auto-generated method stub
		return "2012286256717";
	}

	@Override
	public String ownerName() {
		// TODO Auto-generated method stub
		return "Joydeep Maiti";
	}

	public int speed(){
		return 80;
	} 
	public void cdplayer(){
		System.out.println("The honda is playing now cdplayer");
	} 
	
	
}
