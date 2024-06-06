

public class ConstructorPlaysACrucialRole {
    public  ConstructorPlaysACrucialRole(){
        System.out.println("Iam a constroutor");
    }
    //defalut constroture

    public  ConstructorPlaysACrucialRole(String str){
        System.out.println(str);
    }
    //parameterized constroctor,ConstructorPlaysACrucialRole er mathome akta Strige parameter pass kora hoice.

    public  ConstructorPlaysACrucialRole(int c,int b,String text){
        //int a = c +b;
       // System.out.println(a);
        System.out.println(c+ ","+ b + ","+ text);
    }
//ConstructorPlaysACrucialRole parameterized constroctor tinta int parameter niche. c,b and text

    public  void method(){
        System.out.println("Iam the method");
    }

    public static void main(String[] args) {
        ConstructorPlaysACrucialRole  cd = new ConstructorPlaysACrucialRole();

        ConstructorPlaysACrucialRole cds= new ConstructorPlaysACrucialRole("Hello");
        ConstructorPlaysACrucialRole cdd= new ConstructorPlaysACrucialRole(3,5,"Hello!");



    }
}


/*


use in this key...........

public class MyClass {
    int d;
    int b;

    // Constructor
    public MyClass(int d, int b) {
        this.d = d;
        this.b = b;
        System.out.println("d: " + d + ", b: " + b);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(3, 4);
    }
}

 */




/*
use in super key......


class ParentClass {
    int x;

    // Parent class constructor
    public ParentClass(int x) {
        this.x = x;
        System.out.println("Parent x: " + x);
    }
}

public class ChildClass extends ParentClass {
    int y;

    // Child class constructor
    public ChildClass(int x, int y) {
        super(x); // Call parent class constructor
        this.y = y;
        System.out.println("Child y: " + y);
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass(10, 20);
    }
}

 */