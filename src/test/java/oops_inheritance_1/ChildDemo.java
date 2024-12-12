package oops_inheritance_1;

public class ChildDemo extends ParentDemo {

    String name ="data_child";

    public void arithmeticOperation(){
        String data = "from child" ;
        System.out.println(data);
    }

    public void dataFromParent(){
        System.out.println(super.name);
        super.arithmeticOperation();

    }

    public static void main(String[] args) {
        ChildDemo childdemo = new ChildDemo();
        System.out.println(childdemo.name);
        childdemo.arithmeticOperation();
        childdemo.dataFromParent();
    }
}
