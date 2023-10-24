package E_Interface;

public class Car implements I_Vehicle {
    public void color(){
        System.out.println ("Blue color");
    }
    public void Run(){
        System.out.println ("Running....");
    }
    public void Stop(){
        System.out.println ("Stopped....");
    }
}
