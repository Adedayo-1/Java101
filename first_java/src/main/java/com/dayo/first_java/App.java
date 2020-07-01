package com.dayo.first_java;

import java.util.Scanner;

/**
 * Hello world!00
 */
public class App {
	public static void main(String[] args) {

		// changes
		/*
		 * int discountedPrice = 0; int totalPrice; int costPerItem = 3; int quantity =
		 * 3;
		 * 
		 * totalPrice = costPerItem * quantity; if (totalPrice > 17) { totalPrice -=
		 * costPerItem; discountedPrice = totalPrice; }
		 * System.out.println("discountedPrice :" + totalPrice);
		 * System.out.println(discountedPrice);
		 */
		// Assignment 1//
		{
			/*
			 * int discountedPrice = 0; int totalPrice; int costPerItem = 3; int quantity =
			 * 8;
			 * 
			 * totalPrice = costPerItem * quantity; System.out.println("Original Price:" +
			 * totalPrice); if( totalPrice > 20 ) { discountedPrice= totalPrice-(2*
			 * costPerItem);
			 * 
			 * } System.out.println("The Discounted Price is "+ discountedPrice +
			 * " and the Price before discount is "+ totalPrice );
			 * 
			 * } //Practice// { /* System.out.println("Exercise=" + 50/3);
			 * System.out.println(-5 +8*6); System.out.println((55+9) % 9);
			 * System.out.println(20+ -3*5/8); System.out.println(5+15/3*2-8%3);
			 * 
			 * int InputfirstNumber = 25; int InputsecondNumber = 5; int ExpectedOutput;
			 * ExpectedOutput = InputfirstNumber * InputsecondNumber;
			 * System.out.println("ExpectedOutput=" + ExpectedOutput);
			 * 
			 * int n1= 125; int n2 = 24; int Expectedoutput; int sum = n1+n2; int multiply =
			 * n1*n2; int divide = n1/n2; int subtract = n1-n2;
			 * 
			 * 
			 * System.out.println("Expected sum output=" + sum);
			 * System.out.println("Expected multiply output=" + multiply);
			 * System.out.println("Expected divide output=" + divide);
			 * System.out.println("Expectedsubtract output=" + subtract);
			 * 
			 * /*confused int in1 = 8; System.out.println("input1=" +in1); int i; for ( int
			 * i<=10);
			 */

			int row = 2;
			int col = 2;
			int m = 0;
			int n = 0;
			int o = 0;
			int p = 0;
			int[][] A = new int[row][col];
			int[][] B = new int[row][col];
			int[][] C = new int[row][col];

			for (int i = 0; i < row; i++) {
				System.out.println("Current Matrix is A ");

				for (int j = 0; j < col; j++) {
					System.out.println("row=" + (i + 1) + " ,col=" + (j + 1));
					Scanner input = new Scanner(System.in);

					System.out.println("Enter value of row " + (i + 1) + ", col " + (j + 1));
					A[i][j] = input.nextInt();

				}
			}
			for (int i = 0; i < row; i++) {
				System.out.println("Current Matrix is B ");

				for (int j = 0; j < col; j++) {
					System.out.println("row=" + (i + 1) + " ,col=" + (j + 1));
					Scanner input = new Scanner(System.in);

					System.out.println("Enter value of row " + (i + 1) + ", col " + (j + 1));
					B[i][j] = input.nextInt();

				}
			}
			System.out.println("*************Matrix A**********");
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					 

				System.out.println("|" + A[i][0] + "         " + A[i][1] + "|");

			}

			System.out.println("*************Matrix B**********");
			for (int i = 0; i < row; i++) {

				System.out.println("|" + B[i][0] + "         " + B[i][1] + "|");

			}
			/*
			for (int i = 0; i < row; i++) {
				m = (A[i][0] * B[i][0]) + (A[i][1] * B[i + 1][0]);
				n = (A[i][0] * B[i][1]) + (A[i][1] * B[1][i + 1]);
				o = (A[i + 1][0] * B[i][0]) + (A[1][i + 1] * B[i + 1][0]);
				p = (A[i + 1][0] * B[i][1]) + (A[1][i + 1] * B[1][i + 1]);

				System.out.println("|Final Matrix|");
				System.out.println("|" + m + "         " + n + "|");
				System.out.println("|" + o + "         " + p + "|");
			}*/
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					for(int k=0; k<row; k++) {
						C[i][j] +=  A[i][k]*B[k][j];
					}
				}
			}
			System.out.println("|Final Matrix|");
			System.out.println("|" + C[0][0] + "         " + C[0][1] + "|");
			System.out.println("|" + C[1][0] + "         " + C[1][1] + "|");
		}
	}
}
