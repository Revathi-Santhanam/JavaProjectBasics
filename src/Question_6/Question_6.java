package Question_6;

import java.util.Scanner;

public class Question_6 {
    void printFibonacciSeries ( ) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Enter a digit: " );
        int num = sc.nextInt ( );

        int digit1 = 0, digit2 = 1, temp;
        System.out.println ("Fibonacci series:\n" );
        System.out.print ( digit1 + " " + digit2 );

        for (int i = 2; i < num; ++i)
        {
            temp = digit1 + digit2;
            System.out.print ( " " + temp );
            digit1 = digit2;
            digit2 = temp;
        }
    }
}
