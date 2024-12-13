package oops_overriding;

public class ClassBChild extends ClassAParent{

    public void arithmeticOperation(int a , int b) {
        int result = a * b;
        System.out.println("from parent class : " + result);
    }

    public static void main(String[] args) {
//        ClassBChild classbchild1 = new ClassBChild();
        ClassAParent classbchild = new ClassBChild();
        classbchild.arithmeticOperation(2,3);
        ClassAParent classaparent = new ClassAParent();
        classaparent.arithmeticOperation(2,3);
    }
}
