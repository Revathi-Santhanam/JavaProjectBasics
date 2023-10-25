package K_File;

import java.io.*;

public class FileClass {
    public static void main (String[] args) {
        String fileName="src/K_File/sample.txt";
        String copyFile = "src/K_File/copy.txt";
        File file=new File ( copyFile );
        try {
            InputStream inputStream=new BufferedInputStream ( new FileInputStream ( fileName ) );
            OutputStream outputStream=new BufferedOutputStream ( new FileOutputStream ( file ) );

        } catch (FileNotFoundException e) {


        }

        BufferedReader bufferedReader;
        try{
            bufferedReader = new BufferedReader ( new FileReader ( fileName ) );
            String currLine = bufferedReader.readLine ();
            System.out.println (currLine );
            bufferedReader.close ();

        }  catch (IOException e) {
            throw new RuntimeException ( e );
        }

        FileWriter fileWriter;
//        try {
//            fileWriter = new FileWriter (fileName,true);
//            fileWriter.write ( "added" );
//            fileWriter.close ();
//        } catch (IOException e) {
//            throw new RuntimeException ( e );
//        }
        try {
            fileWriter=new FileWriter ( fileName,true );
            BufferedWriter bufferedWriter=new BufferedWriter ( fileWriter );
            bufferedWriter.write ( "Adding a new value" );
            bufferedWriter.newLine ();
            bufferedWriter.close ();
        } catch (IOException e) {
            throw new RuntimeException ( e );
        }
    }
}
