package genericsdemo;

public class SampleMain {

    public static void main(String[] args) {
        SampleClassDemo<String> sampleclassobject = new SampleClassDemo<>();
        sampleclassobject.setValue("value data as a string");
        System.out.println(sampleclassobject.getValue());

        SampleClassDemo<Integer> sampleclassobject1 = new SampleClassDemo<>();
        sampleclassobject1.setValue(123);
        System.out.println(sampleclassobject1.getValue());

    }

}
