package interfacedemo;

public interface InterfaceADemo {

    public void methodA();

    public String methodB();

    public int methodC();

    // method with implementation is possible in interface but with default keyword
    default void testDisplay() {
        System.out.println("this is method with implementation from interfaceA");
    }
}
