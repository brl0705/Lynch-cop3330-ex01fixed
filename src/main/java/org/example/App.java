package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println( "What is your name?" );
        String str= sc.nextLine();
        System.out.print("Hello, " +str);
        System.out.print(", nice to meet you!");
    }
}
