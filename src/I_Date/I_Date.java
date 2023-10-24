package I_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class I_Date {
    public static void main (String[] args) {
        Date date = new Date ( );
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat ( "dd/MM/yyyy" );
        System.out.println ( simpleDateFormat.format ( date ) );

    }
}
