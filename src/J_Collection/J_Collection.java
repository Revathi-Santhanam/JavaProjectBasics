package J_Collection;

import java.util.ArrayList;

public class J_Collection {
    public static void main (String[] args) {
        ArrayList<Integer> list = new ArrayList ( );

        for (int i = 1; i <= 5; i++) {
            list.add ( i );
        }

        System.out.println ( list );
    }
}
