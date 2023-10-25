package Question_1;

public class Main_1 {
    public static void main (String[] args) {
        int inputArray1[] = {-5, 1, -40, 20, 6, 8, 7};
        int key1 = 15;
        int inputArray2[] = {-5, 4, -2, 16, 8, 9};
        int key2=15;
        Question_1 obj = new Question_1 ( );
        boolean arr1Val = obj.checkSumPairIsEqual ( inputArray1, key1 );
        System.out.println ("Array1: "+arr1Val );
        boolean arr2Val = obj.checkSumPairIsEqual ( inputArray2, key2 );
        System.out.println ("Array2: "+arr2Val );
    }
}
