package com.java.practice02;

import java.util.Scanner;

public class problem02 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int[] arr= new int[5];
			
		int sum = 0;
		
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			sum= sum + arr[i];
			
		}
		
		int avg= sum/arr.length;
		System.out.println("평균은 " + avg + " 입니다.");
		
		
		
		sc.close();
		
		
				
		
		
		
		
		
	}

}
