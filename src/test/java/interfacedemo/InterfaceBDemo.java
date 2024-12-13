package interfacedemo;

public interface InterfaceBDemo extends InterfaceADemo{

    public void arithmeticOperation();


    default void display(){
        System.out.println("test default");
    }

}
