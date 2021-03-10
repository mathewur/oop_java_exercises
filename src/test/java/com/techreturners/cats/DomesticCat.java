package com.techreturners.cats;

import java.util.Random;

public class DomesticCat extends AnyCat {

	public static int DOMESTIC_AVG_HEIGHT = 23;
	DomesticCat(){
		super.setAverageHeight(DOMESTIC_AVG_HEIGHT);
		super.setSetting(Setting.DOMESTIC);

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}




	@Override
	public String eat() {
		/*
		DANGER potentially creating too many objects with new Random()
		Can NEVER be tested because its random */
		
	    Random random = new Random();
		
	    //randomly type message if random number is even
		 if (random.nextInt() % 2 == 0) { 
			  
			 return "It will do I suppose" ;
	        } 
			return "Purrrrrrr";

	}


}
