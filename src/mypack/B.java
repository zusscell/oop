package mypack;
import pack.A;

public class B extends A{

    public static void main(String args[]){
        A a = new A();
        a.example();

        B b = new B();
        b.useMyName();
    }

}
