package BootCamp.OOPS;

class Test1 {
    int x,y;
    Test1() {
//        super();
        x = 100;
        y = 200;
    }
    Test1(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Test2 extends  Test1 {
    int a,b;

    Test2() {
        this(9,99);
        a = 300;
        b = 400;
    }

    Test2(int a, int b) {
//        super();
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println(a + " " + b + " " + x + " "+ y);
    }
}
public class InheritanceExampleWithThisAndSuper {
    public static void main(String[] args) {
        Test2 t = new Test2(9,99);
        t.display();
    }
}
