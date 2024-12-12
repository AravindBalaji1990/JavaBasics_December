package oops_inheritance;

public class InheritcanceDemoChild extends InheritanceDemoParent{

    public String namechild = "child";

    public void multiplyOperation(){
        int a =1;
        int b =2;
        int result = a*b;
        System.out.println("result of multiply operation : " + result);
    }

    public static void main(String[] args) {
        InheritcanceDemoChild childobj = new InheritcanceDemoChild();
        childobj.multiplyOperation();// child
        childobj.additionOperation();// parent
        System.out.println(childobj.namechild);// child
        System.out.println(childobj.name);// parent
    }
}
