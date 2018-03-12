package com.java.practice02;


public class problem05 {

	public static void main(String[] args) {

	
	
		int[] lotto = new int[6];
		
		
		for(int i=0; i<lotto.length; i++) {
		
			lotto[i]= (int)(Math.random()*45) + 1;
			
		}
		
		
		for(int k=0; k<lotto.length; k++)
			
			if(lotto[k]==lotto[k+1]) {
			
			  
			}
		  
	
	}

}
