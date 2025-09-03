package oops_abstraction;

public abstract class AbstracitonwithConstrcutors {

    String name;

    AbstracitonwithConstrcutors(String name) {
        this.name = name;
    }

    abstract void sampleMethod();

    void testData(){
        System.out.println("this is test data method : " +this.name);
    }
}
