package interfacedemo;

public class ClassBDemo implements InterfaceADemo{
    @Override
    public void methodA() {
        System.out.println("this is form ClassBDemo");
    }

    @Override
    public String methodB() {
        return "from ClassB";
    }

    @Override
    public int methodC() {
        return 2;
    }
}
