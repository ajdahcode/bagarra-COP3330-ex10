/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 alden bagarra
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnN = new Scanner(System.in);
        System.out.print( "Enter the price of item 1: " );
        int price1 = scnN.nextInt();
        System.out.print( "Enter the quantity of item 1: " );
        int quantity1 = scnN.nextInt();
        System.out.print( "Enter the price of item 2: " );
        int price2 = scnN.nextInt();
        System.out.print( "Enter the quantity of item 2: " );
        int quantity2 = scnN.nextInt();
        System.out.print( "Enter the price of item 3: " );
        int price3 = scnN.nextInt();
        System.out.print( "Enter the quantity of item 3: " );
        int quantity3 = scnN.nextInt();
        double subt = (price1*quantity1)+(price2*quantity2)+(price3*quantity3);
        System.out.format("Subtotal: $%.2f\n", subt);
        double tax = subt*0.055;
        System.out.format("Tax: $%.2f\n", tax);
        double total = tax+subt;
        System.out.format("Total: $%.2f", total);
    }
}
