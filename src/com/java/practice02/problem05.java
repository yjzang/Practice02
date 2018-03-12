package com.java.practice02;

public class problem05 {

	public static void main(String[] args) {

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {

			lotto[i] = (int) (Math.random() * 45) + 1;
		}

		for (int i = 0; i < lotto.length; i++) {			//2개의 for문을 써서 lotto[i]==lotto[k] 모든 조합 비교 

			for (int k = 0; k < lotto.length; k++) {

				{
					if (lotto[i] == lotto[k] && i != k) {

						for (int n = 0; n < lotto.length; n++) {

							lotto[n] = (int) (Math.random() * 45) + 1;		// 한 조합이라도 중복이면 다시 전체 랜덤
						}

						System.out.println("mix");		// 중복이 생겨 리셋 될때마다 mix 표시 
						i = 0;

						continue;					// continue는 자신이 속한 반복문을 다시 처음부터 반복 시킨다.(k=1부터) 
					}
				}
			}
		}

		for (int i = 0; i < lotto.length; i++) {

			System.out.print(lotto[i] + " ");

		}
	}
}
