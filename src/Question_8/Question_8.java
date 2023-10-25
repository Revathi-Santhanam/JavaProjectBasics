package Question_8;

import java.util.Scanner;

public class Question_8 {
    Scanner sc = new Scanner ( System.in );
    void occurencesOfStr(){
        System.out.println ("Enter a string: " );
        String inputStr = sc.nextLine ();
        System.out.println ("Enter a Substring to find : " );
        String findStr = sc.nextLine ();
        int tempStr = 0;
        int count = 0;
        while(tempStr != -1){
            tempStr = inputStr.indexOf(findStr,tempStr);
            if(tempStr != -1){
                count ++;
                tempStr += findStr.length();
            }
        }
        System.out.println("Occurence of String "+findStr+ " is:"+count);
    }
}
