package Question_2;

import java.util.Arrays;
import java.util.Scanner;

public class Question_2 {
    Scanner sc = new Scanner ( System.in );

    void getArrLen ( ) {
        System.out.print ( "Enter length of array1: " );
        int arr1length = sc.nextInt ( );
        System.out.print ( "Enter length of array1: " );
        int arr2length = sc.nextInt ( );
        getArrays (arr1length,arr2length );

    }

    void getArrays (int length ,int length2) {
        int[] inputArr1 = new int[length];
        int[] inputArr2 = new int[length2];

        for (int i = 0; i < length; i++) {
            System.out.println ("enter values of array 1:" );
            inputArr1[i] = sc.nextInt ( );
        }
        for (int i = 0; i < length2; i++) {
            System.out.println ("enter values of array 2:" );
            inputArr2[i] = sc.nextInt ( );
        }
        System.out.println ( Arrays.toString ( inputArr1 ) );
        System.out.println ( Arrays.toString ( inputArr2 ) );
    }

    public boolean checkSubset (int arr1[], int arr2[]) {
        int j = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (j = 0; j < arr1.length; j++)
                if (arr2[i] == arr1[j])
                    break;

            if (j == arr1.length)
                return false;
        }
        return true;
    }
}
