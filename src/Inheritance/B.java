package Inheritance;

interface I1{
    void fun1();
    void fun();

}
interface I2{
    void fun2();
    void fun();
}

interface I extends I1,I2 {
}

public class B implements I {
    public static void main(String[] args) {

    }
    public void fun1() {
        System.out.println("fun1");
    }
    public void fun2() {
        System.out.println("fun2");
    }
    public void fun() {
        System.out.println("fun");
    }
}
