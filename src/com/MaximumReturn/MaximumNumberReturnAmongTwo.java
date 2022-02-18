package com.MaximumReturn;


import java.util.Scanner;
// public class initialized as name MaximumNumberReturnAmongTwo
public class MaximumNumberReturnAmongTwo{
    // main method
    public static void main(String[] args) {

        // Lambda Expression for Returning Maximum  integer :
        Interface_of_MaximumNumberReturnAmongTwo result=(FirstNum, SecondNum) -> Math.max(FirstNum,SecondNum);
        Scanner sc = new Scanner(System.in);

        // User Input for Above function's Implementation
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("\n Enter second number:");
        int num2 = sc.nextInt();

        // Showing Result of Maximum among 2 integers
        System.out.println("Maximum of above number is:");
        System.out.println(result.max(num1,num2));
    }
}
