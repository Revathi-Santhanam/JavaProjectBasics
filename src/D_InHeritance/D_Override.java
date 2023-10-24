package D_InHeritance;

import java.util.Scanner;

public class D_Override {
    public static void main (String[] args) {
        Vehicle veh = new Vehicle ();
        veh.getColor ();
        veh.getPrice ();

        Car car = new Car ();
        car.getColor ();
        car.getPrice ();

        //upcasting
        Vehicle veh1 = new Car();
        veh1.getPrice ();
        veh1.getColor ();

        //downcasting
//        Vehicle veh2 = new Car ();
//        Car car2 = (Car) veh2;
        Car car2 = (Car) new Vehicle ();
        car2.getColor ();
        car2.getPrice ();
//      Scanner sc =null;
//        Scanner getSc(){
//            if(sc == null){
//                sc = new Scanner (System.in );
//                        return sc;
//            }
//        }

    }
}
