package oops_encapsulation;

public class EncapsulationGetterSetter {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name.replace("m", "xx");
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private int salary;
    private String name;

    public static void main(String[] args) {
        EncapsulationGetterSetter encapsulationgettersetter = new EncapsulationGetterSetter();
        encapsulationgettersetter.setName("samthomas jr");
        encapsulationgettersetter.setSalary(10000);

        System.out.println(encapsulationgettersetter.getName());
        System.out.println(encapsulationgettersetter.getSalary());
    }
}


