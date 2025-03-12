=class Base {
    public void method1() {
        System.out.println("Base class method1");
    }
}

class Derived extends Base {
    public void method2() {
        System.out.println("Derived class method2");
    }
}

class Test {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.method1();  
        d.method2();  
    }
}
