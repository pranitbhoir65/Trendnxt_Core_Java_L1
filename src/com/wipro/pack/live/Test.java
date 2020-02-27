package com.wipro.pack.live;

import com.wipro.pack.music.Playable;
import com.wipro.pack.music.string.Veena;
import com.wipro.pack.music.wind.Saxophone;

public class Test {

	public static void main (String args[]){
		
		Playable v = new Veena();
		v.play();
		
		Playable s = new Saxophone();
		s.play();
		
		
	}

	
	
}
