package com.wipro.pack.Object_Oriented_Concepts;

abstract class Instrument{
	
	public abstract String play();
	//Piano, Flute, Guitar
}

class Piano extends Instrument{

	@Override
	public String play() {
		return "Piano is playing  tan tan tan tan ";
		// TODO Auto-generated method stub
			
	}
}

class Flute extends Instrument{

	@Override
	public String play() {
		return "Flute is playing  toot toot toot toot ";
		// TODO Auto-generated method stub
			
	}
}


class Guitar extends Instrument{

	@Override
	public String play() {
		return "Guitar is playing  tin  tin  tin ";
		// TODO Auto-generated method stub
			
	}
}


public class Assignment_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instrument ins[]=new Instrument[10]; 
		for(int i=0;i<10;i++) 
		{ 
			if(i==1 || i==5 || i==9) 
				ins[i]=new Piano(); 
		
		    else if(i==3 || i==4 || i==7) 
			ins[i]=new Flute(); 
		
		    else 
			ins[i]=new Guitar(); 
				
			System.out.println(ins[i].play()); 
			
			if(ins[i] instanceof Piano) 
				System.out.println("InstanceOf Piano"); 
			else if(ins[i] instanceof Flute) 
				System.out.println("InstanceOf Flute"); 
			else 
				System.out.println("InstanceOf Guitar"); 
		        
			    System.out.println();
		
		
		}

	}

}
