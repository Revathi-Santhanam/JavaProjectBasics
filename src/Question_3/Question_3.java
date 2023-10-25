package Question_3;

import java.util.Scanner;

public class Question_3 {
    Scanner scanner = new Scanner ( System.in );

    void primeNumbersAre ( ) {
        int i = 0;
        int num = 0;
        String primeNumbers = "";
        System.out.println ( "Enter the value of n:" );
        int n = scanner.nextInt ( );
        for (i = 1; i <= n; i++) {
            int count = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    count = count + 1;
                }
            }
            if (count == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println ( "Prime numbers from 1 to " + n + " are :" );
        System.out.println ( primeNumbers );
    }
}


