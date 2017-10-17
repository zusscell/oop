package pack;

public class A{

    private int number=0;

    protected String name = "example of a name";

    public void example(){
        System.out.println("public method");
    }

    private int getMyNumber(){
        return number;
    }

    private void setMyNumber(int number){
        this.number = number;
    }

    public static void main(String args[]){
        A a = new A();
        a.setMyNumber(45);
        System.out.println(a.getMyNumber());
        System.out.println(a.useMyName());
    }

    protected String useMyName(){
        return name;
    }
}

class D {

    void displayMessage(){
        System.out.println("default method, from a default class");
    }
}
