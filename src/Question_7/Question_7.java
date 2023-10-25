package Question_7;

import java.util.Scanner;

public class Question_7 {
    Scanner sc = new Scanner ( System.in );
    void occurencesOfChar(){
        System.out.println ("Enter a String Or Sentence:" );
        String str = sc.nextLine ();
        System.out.println ("Enter the letter to get count: " );
        char letter = sc.next ().charAt ( 0 );
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        System.out.println ("Count of "+letter+" is: "+count );

    }
}
