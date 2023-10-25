package J_Collection;

import java.util.HashMap;
import java.util.Map;

public class J_Map {
    public static void main (String[] args) {
        Map<Integer,String> map = new HashMap<> ();
        map.put ( 1,"Rev" );
        map.put ( 2,"Hari" );
        map.put ( 3,"Buji" );

        System.out.println (map.values () );
        for(Map.Entry<Integer,String> val:map.entrySet ()){
            System.out.print (val.getKey ()+":" );
            System.out.println (val.getValue () );
        }
    }
}
