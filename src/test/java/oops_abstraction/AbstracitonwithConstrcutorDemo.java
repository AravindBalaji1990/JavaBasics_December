package oops_abstraction;

public class AbstracitonwithConstrcutorDemo extends AbstracitonwithConstrcutors {
    AbstracitonwithConstrcutorDemo(String name) {
        super(name);
    }

    @Override
    void sampleMethod() {
        System.out.println("this is for the method from non abstract class");
    }

    public static void main(String[] args) {
        AbstracitonwithConstrcutors obj = new AbstracitonwithConstrcutorDemo("samplename");
        obj.sampleMethod();
        obj.testData();
    }
}
