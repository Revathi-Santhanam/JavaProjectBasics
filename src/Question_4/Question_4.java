package Question_4;

import java.util.Scanner;

public class Question_4 {
    Scanner sc = new Scanner ( System.in );

    void isPalindrome ( ) {
        System.out.println ( "Enter a String: " );
        String str = sc.next ( );
        str = str.toLowerCase ( );
        String orgStr = str;
        String rev = "";
        char[] strArr = str.toCharArray ( );
        for (int i = strArr.length - 1; i >= 0; i--) {
            rev = rev + strArr[i];
        }
        if (orgStr.equals ( rev )) {
            System.out.println ( "The given String " + str + " is a palindrome:" );
        } else {
            System.out.println ( "The given String " + str + " is not a palindrome:" );
        }
    }
}
