package J_Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class J_Set {
    public static void main (String[] args) {
        Set<Integer> values = new HashSet<> ();
        values.add ( 1 );
        values.add ( 2 );
        values.add ( 1 );
        values.add ( 3 );
        System.out.println (values );
        for (int val:values){
            System.out.println (val );
        }

        System.out.println ("Iterator");
        Iterator<Integer> iterator=values.iterator ();
        while (iterator.hasNext ()){
            System.out.println (iterator.next () );
        }
    }
}
