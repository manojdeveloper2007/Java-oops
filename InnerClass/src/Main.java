
//Inner class depends on outer class
class Outer {
    class Inner {
        String name;
        Inner (String name) {
            this.name = name;
        }
    }
}

class A {
    static class B {
        String name;
        B(String name) {
            this.name = name;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner obj2 = obj.new Inner("Manoj");
        System.out.println(obj2.name);

        A.B b = new A.B("Kumar");
        System.out.println(b.name);
    }
}
