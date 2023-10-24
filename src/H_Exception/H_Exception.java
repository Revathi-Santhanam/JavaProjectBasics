package H_Exception;

public class H_Exception {

    public static void main (String[] args) {
        try {
            new Test ().add ();
        } catch (Exception e) {
            throw new RuntimeException ( e );
        }
        try{
            int a = 12/0;
            System.out.println ("Exception" );
        }catch (Exception e){
            if(e instanceof ArithmeticException){
                System.out.println ("error" );
            }else {
                System.out.println (e );
            }
        }
    }
}

class Test{
    void add() throws Exception {
        throw new Exception ( "custom exception" );
    }
}
