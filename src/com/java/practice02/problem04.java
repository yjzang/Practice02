package com.java.practice02;

import java.util.Scanner;

public class problem04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] unitArr = new int[10];
		int[] countArr = new int[10];

		int total = sc.nextInt();

		unitArr[0] = 50000;
		unitArr[1] = 10000;
		unitArr[2] = 5000;
		unitArr[3] = 1000;
		unitArr[4] = 500;
		unitArr[5] = 100;
		unitArr[6] = 50;
		unitArr[7] = 10;
		unitArr[8] = 5;
		unitArr[9] = 1;

		for (int i = 0; i < unitArr.length; i++) {

			countArr[i] = total / unitArr[i];

			total = total - unitArr[i] * countArr[i];

		}
		for (int i = 0; i < unitArr.length; i++) {

			System.out.println(unitArr[i] + "원: " + countArr[i] + "개");
		}
		sc.close();
	}

}
