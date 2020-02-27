package com.wipro.pack.Command_Line_Args_System_Properties_ackaging;

import com.wipro.pack.Command_Line_Args_System_Properties_ackaging.Automobile.TwoWheeler.Hero;
import com.wipro.pack.Command_Line_Args_System_Properties_ackaging.Automobile.TwoWheeler.Honda;

public class Assignment_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hero h1 = new Hero();
		System.out.println("Hero's model name is : "+h1.modelName());
		System.out.println("Hero's registration Number is : "+h1.registrationNumber());
		System.out.println("Hero's owner Number is : "+h1.ownerName());
		System.out.println("Hero's speed is : "+h1.speed());
		h1.radio();
		Honda h2 = new Honda();
		System.out.println("Honda's model name is : "+h2.modelName());
		System.out.println("Honda's registration Number is : "+h2.registrationNumber());
		System.out.println("Honda's owner Number is : "+h2.ownerName());
		System.out.println("Honda's speed is : "+h2.speed());
		h2.cdplayer();
		
	}

}
