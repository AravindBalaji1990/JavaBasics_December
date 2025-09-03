package oops_inheritance_1;

public class ChildDemo extends ParentDemo {

    String name = "data_child";

    public void arithmeticOperation() {
        String data = "from child";
        System.out.println(data);
    }
    //super - keyword in java
    // it cannot be a static since its a keyword
    public void callingForParent(){
        System.out.println(super.name);
        super.arithmeticOperation();
    }
    public static void main(String[] args) {
        ChildDemo childdemo = new ChildDemo();
        childdemo.arithmeticOperation();
        System.out.println(childdemo.name);
        childdemo.callingForParent();
    }
}
