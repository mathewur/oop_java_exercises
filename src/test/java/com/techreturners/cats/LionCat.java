package com.techreturners.cats;

public class LionCat extends AnyCat {


	public static int LION_AVG_HEIGHT = 1100;
	LionCat(){
		super.setAverageHeight(LION_AVG_HEIGHT);
	}

	@Override
	public String eat() {
		return "Roar!!!!";
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub

	}


}
