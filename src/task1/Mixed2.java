package task1;

public class Mixed2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();

        c.m1();
        c.m2();
        c.m3();
    }
}

// 1) 2
// 2) 4
// 3) 7
// 4) 4