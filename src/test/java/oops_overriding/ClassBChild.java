package oops_overriding;

public class ClassBChild extends ClassAParent {

    public void arithmeticOperation(int a, int b) {
        int result = a * b;
        System.out.println("from child class multiplication : " + result);
    }

    public static void main(String[] args) {
//        ClassBChild classbchild1 = new ClassBChild();
        // the overrriding of the parent class by child class method
        ClassAParent objectdata = new ClassBChild();
        objectdata.arithmeticOperation(2, 3);

        // call only the parent class
        // then we need to declare the parent class a seprate object
        ClassAParent classaparent = new ClassAParent();
        classaparent.arithmeticOperation(2, 3);
    }
}
