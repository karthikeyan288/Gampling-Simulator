package com.GamplingSimulator;

public class Gampling {
	private static final int totalStake = 100;
	private static final int perDayBet =1; 
	private static  int playerRandom;

    static int remainingStake ;
    
    public static void game() {
    	System.out.println("The game starts with total shake of $"+totalStake);
        int dailyBet = (int) Math.floor(Math.random() * 10) % 2;
        if (dailyBet==0) {
			System.out.println("You lost ");
			playerRandom=0;
		} else {
			System.out.println("You Win");
			playerRandom=1;
		}
        remainingStake=totalStake+playerRandom;
        System.out.println(remainingStake);
    
    }
    public static void main(String[] args) {
    	game();
	
}
}
