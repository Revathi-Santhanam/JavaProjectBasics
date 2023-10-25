package Question_9;

import java.util.Scanner;

public class Question_9 {
    Scanner sc=new Scanner(System.in);
    void getInputArray(){
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt();
        int array[][] = new int[row][col];
        System.out.println("Enter the elements of the array one-by-one : ");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++)
                array[i][j] = sc.nextInt();
        }
        System.out.println("Elements of the array are: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
