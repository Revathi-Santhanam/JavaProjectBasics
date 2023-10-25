package Question_5;

import java.util.Scanner;

public class Question_5 {
    Scanner sc = new Scanner ( System.in );

    void removeVowels ( ) {
        System.out.println ("Enter a String or Sentence: " );
        String inputStr = sc.nextLine ( );
        String updatedStr = "";

        for (int i = 0; i < inputStr.length ( ); i++) {
            char c = inputStr.charAt ( i );
            if (c == 'A' || c == 'E' || c == 'I' || c == '0' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                continue;
            }
            updatedStr += c;
        }
        System.out.print ( updatedStr );
    }
}


