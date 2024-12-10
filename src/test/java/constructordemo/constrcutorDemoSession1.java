package constructordemo;

public class constrcutorDemoSession1 {
    //global level variable
    String name ="global";
    int salary =50000;

    //default constructor
    public constrcutorDemoSession1() {
        // this is a keyword available in java to represen the instance of variable at that moment what it is holding
        this.name = name;
        this.salary = salary;
    }

    public void displayFunction(String name , int salary) {
        // local variables
//        name ="sample3";
//        salary =40000;
        System.out.println("my name is " + name + " and i have  " + salary);
    }

    public static void main(String[] args) {
        // constructor level variable
        constrcutorDemoSession1 obj = new constrcutorDemoSession1();
        obj.displayFunction("sample6",60000);
        constrcutorDemoSession1 obj1 = new constrcutorDemoSession1();
//        obj1.displayFunction();


    }
}
