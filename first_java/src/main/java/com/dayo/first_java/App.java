package com.dayo.first_java;

/**
 * Hello world!00
 */
public class App 
{
    public static void main( String[] args )
    {
        
     //change
        /*
        int discountedPrice = 0;
        int totalPrice;
        int costPerItem = 7;
        int quantity =3;
        
        totalPrice = costPerItem * quantity;
        if( totalPrice > 17 )
        {
        	totalPrice -= costPerItem;
        	 discountedPrice = totalPrice;
        }
        System.out.println("discountedPrice :" + totalPrice );
        System.out.println(discountedPrice);
        */
    
    // Assignment 1//
    {
    	int discountedPrice = 0;
        int totalPrice;
        int costPerItem = 3;
        int quantity = 8;
        
        totalPrice = costPerItem * quantity;
        System.out.println("Original Price:" + totalPrice);
        if( totalPrice > 20 )
        {
        	discountedPrice= totalPrice-(2* costPerItem);
        	 
        }
        System.out.println("The Discounted Price is "+ discountedPrice + " and the Price before discount is "+  totalPrice );
        
    }
//Practice//
    {
    /* 
    System.out.println("Exercise=" +  50/3);
    System.out.println(-5 +8*6);
    System.out.println((55+9) % 9);
    System.out.println(20+ -3*5/8);
    System.out.println(5+15/3*2-8%3);
  
    int InputfirstNumber = 25;
    int InputsecondNumber = 5;
    int ExpectedOutput;
    ExpectedOutput = InputfirstNumber * InputsecondNumber;
    System.out.println("ExpectedOutput=" + ExpectedOutput);
    
    int n1= 125;
    int n2 = 24;
    int Expectedoutput;
    int sum = n1+n2;
    int multiply = n1*n2;
    int divide = n1/n2;
    int subtract = n1-n2;
    
    
    System.out.println("Expected sum output=" + sum);
    System.out.println("Expected multiply output=" + multiply);
    System.out.println("Expected divide output=" + divide);
    System.out.println("Expectedsubtract output=" + subtract);
   
    /*confused
    int in1 = 8;
    System.out.println("input1=" +in1);
    int i;
    for ( int i<=10); */
    	
    
    }
    
    
    }
    
    
}
