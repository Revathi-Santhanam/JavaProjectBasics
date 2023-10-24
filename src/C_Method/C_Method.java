package C_Method;

public class C_Method {
   void method(){
       System.out.println ("without argument" );
   }
   void method(int a,int b){
       System.out.println ("with arguments" );
       System.out.println (a+b );
   }
   void method(String firstName,String lastName){
       System.out.println ("with different arguments" );
       System.out.println (firstName+" "+lastName );
   }

    public static void main (String[] args) {
        C_Method obj = new C_Method ();
        obj.method ();
        obj.method ( 5,5 );
        obj.method ( "Revathi","Santhanam" );
        obj.method ( "Moon","Light" );
    }
}
