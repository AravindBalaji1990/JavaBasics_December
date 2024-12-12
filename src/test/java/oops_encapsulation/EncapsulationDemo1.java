package oops_encapsulation;

public class EncapsulationDemo1 {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.name = name;
    }

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<18){
            throw new IllegalArgumentException("age cannot be less than 18");
        }
        this.age = age;
    }

    private int age;


    public static void main(String[] args) {
        EncapsulationDemo1 encapsualtiondemo1 = new EncapsulationDemo1();
        encapsualtiondemo1.setName("appium");
        System.out.println("the name : " +encapsualtiondemo1.getName());

        encapsualtiondemo1.setAge(17);
        System.out.println("the age : " +encapsualtiondemo1.getAge());
    }
}
