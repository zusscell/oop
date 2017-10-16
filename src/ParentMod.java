/**
 * Created by Zusscell_Ruvalcaba on 10/15/2017.
 */
class ParentMod {

    // this is method not a constructor

    public void ParentMod() {

        System.out.println("inside parent without arguments");

    }

    // this is default constructor.

    public ParentMod() {

        super(); // hidden call to Object's default constructor

        System.out.println("inside parent's default constructor");

    }

    public ParentMod(int a) {

        super(); // hidden call to Object's default constructor

        System.out.println("inside parent's argument constructor");

    }

}

class ChildMod extends ParentMod {

    // this is a method

    public void ChildMod() {

        System.out.println("inside child without arguments");

    }

    // this is a default constructor

    public ChildMod() {

        super(); // hidden call to Parent's default constructor

        System.out.println("inside child's default constructor");

    }

    public ChildMod(int b) {

        super(b); // Case - 1 : call to Parent's argument constructor

        System.out.println("inside child's argument constructor");

    }

    public static void main(String[] args) {

        ChildMod child = new ChildMod();

        ChildMod child1 = new ChildMod(15);

    }

}