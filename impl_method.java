interface  A {
    void method1();

    void method2();
}

interface B {
    void method3();

    void method4();
}


class Implementasi implements A, B {
    @Override
    public void method1() {
        System.out.println("Implementasi method1 dari interface A");
    }

    @Override
    public void method2() {
        System.out.println("Implementasi method2 dari interface A");
    }

    @Override
    public void method3() {
        System.out.println("Implementasi method3 dari interface B");
    }

    @Override
    public void method4() {
        System.out.println("Implementasi method4 dari interface B");
    }
}

public class impl_method {
    public static void main(String[] args) {
        Implementasi impl = new Implementasi();

        impl.method1();
        impl.method2();
        impl.method3();
        impl.method4();
    }
}
