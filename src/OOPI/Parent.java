package OOPI;

/**
 * Created by Zusscell_Ruvalcaba on 10/15/2017.
 */
class Parent {

    public void Parent() {

        System.out.println("inside parent without arguments");

    }

    public Parent(int a) {

        System.out.println("inside parent with argument");

    }

}

class Child extends Parent {

    public void Child() {

        System.out.println("inside child without arguments");

    }

    public Child(int b) {

        System.out.println("inside child with argument");

    }

    public static void main(String[] args) {

        Child child = new Child();

        Child child1 = new Child(15);

    }

}
