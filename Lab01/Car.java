import java.lang.System;
import java.util.Scanner;

class Car
{
  public static void main(String[] args)
  {
    Scanner in;  
    in = new Scanner(System.in); 
    
    System.out.println("Please enter the number of gallons then press enter: ");
    float fuel = in.nextFloat();
    
    System.out.println("Please enter the fuel efficiency (miles/gallon) then press enter:");
    float effi = in.nextFloat();
    
    System.out.println("Please enter the price per gallon, then press enter:");
    float pric = in.nextFloat();
    
    System.out.println("With the gas in the tank you can go " + (fuel * effi) +" miles, at a cost of " + (pric / effi * 100) + " per 100 miles.");
  }
}