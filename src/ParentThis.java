/**
 * Created by Zusscell_Ruvalcaba on 10/15/2017.
 */
class ParentThis {

    // this is method not a constructor

    public void ParentThis() {

        System.out.println("inside parent without arguments");

    }

    // this is default constructor.

    public ParentThis() {

        super(); // hidden call to Object's default constructor

        System.out.println("inside parent's default constructor");

    }

    public ParentThis(int a) {

        super(); // hidden call to Object's default constructor

        System.out.println("inside parent's argument constructor");

    }

}

class ChildThis extends ParentThis {

    // this is a method

    public void ChildThis() {

        System.out.println("inside child without arguments");

    }

    // this is a default constructor

    public ChildThis() {

        super(); // hidden call to Parent's default constructor

        System.out.println("inside child's default constructor");

    }

    public ChildThis(int b) {

        super(b); // Case - 1 : call to Parent's argument constructor

        System.out.println("inside child's argument constructor");

    }

    public static void main(String[] args) {

        ChildThis child = new ChildThis();

        ChildThis child1 = new ChildThis(15);

    }

}


