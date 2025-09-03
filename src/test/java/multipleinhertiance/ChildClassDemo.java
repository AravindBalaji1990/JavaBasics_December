package multipleinhertiance;

public class ChildClassDemo  extends  ParentClassDemo implements InterfaceDemo{

    public void demoSampleChild(){
        System.out.println("this is from child class");
    }

    @Override
    public void demoMethod1() {
        System.out.println("this is from child class but from interface method");
    }

    @Override
    public void demoMethod2() {

    }

    @Override
    public void demoMethod3() {

    }

    public static void main(String[] args) {
        ChildClassDemo childclassdemo = new ChildClassDemo();
        childclassdemo.demoSampleChild();
        childclassdemo.demoMethod1();
    }
}
