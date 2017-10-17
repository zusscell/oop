package OOPI;

/**
 * Created by Zusscell_Ruvalcaba on 10/16/2017.
 */
class B implements A {

    public void a(){
        System.out.println("implementing method a");
    }

//    public void example(){
//        System.out.println("implementing default method example");
//    }

    public static void main(String args[]){
        B b = new B();
        b.example();
    }
}