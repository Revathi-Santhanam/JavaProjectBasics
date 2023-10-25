package J_Collection;

import java.util.ArrayList;

public class J_ArrayList {
    public static void main (String[] args) {
        ArrayList<Student> arr1 = new ArrayList<> ();
        //using constructor
        Student std = new Student ("Jhansi",1);
        arr1.add ( std );
        //using setter
        Student stdSetter = new Student ();
        stdSetter.setName ( "Mithra" );
        stdSetter.setRollNo ( 2 );
        arr1.add ( stdSetter );
        arr1.add ( new Student ( "Revathi",3 ) );
        arr1.add ( new Student ( "Harry",4) );
        arr1.add ( new Student ( "Buji",5 ) );
        System.out.println ("Before update--------");
        for (Student stud : arr1){
            System.out.println (stud.getRollNo () +" "+stud.getName () );
        }
        //update
        arr1.set ( 4,new Student ( "Kitty",5) );
        System.out.println ("Before--------");
        for (Student stud : arr1){
            System.out.println (stud.getRollNo () +" "+stud.getName () );
        }
        //to remove
        arr1.remove ( 4 );
        System.out.println ("After--------");
        for (Student stud : arr1){
            System.out.println (stud.getRollNo () +" "+stud.getName () );
        }

    }
}
