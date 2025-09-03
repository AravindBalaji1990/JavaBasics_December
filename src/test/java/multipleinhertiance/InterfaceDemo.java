package multipleinhertiance;

public interface InterfaceDemo {

    public void demoMethod1();

    public void demoMethod2();

    public void demoMethod3();

    // inside a interface method with body does not mandatoryly
    // needs to be implemented in the class level
    public default void sampleMethod(){
        System.out.println("this is from method with body");
    }
}
