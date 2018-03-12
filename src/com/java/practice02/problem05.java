package com.java.practice02;

public class problem05 {

	public static void main(String[] args) {

		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {

			lotto[i] = (int) (Math.random() * 45 ) + 1;

		}

		for (int i = 0; i < lotto.length; i++) {

			
			for (int k = 1; k <= lotto.length; k++) {

				{
			
					if (lotto[i] == lotto[(lotto.length - k)]  &&  i!=(lotto.length-k) ) {

						for (int n = 0; n < lotto.length; n++) {

							lotto[n] = (int) (Math.random() * 45) + 1;
							
						}
						
						System.out.println("mix");
						i=0;
						
						continue;
						
					}
				}
			}
		}
		
		for (int i = 0; i < lotto.length; i++) {

			System.out.print(lotto[i] + " ");

		}
	}
}
