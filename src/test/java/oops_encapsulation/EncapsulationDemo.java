package oops_encapsulation;

public class EncapsulationDemo {
    private String orderid;
    private int mobilenumber;


    public int getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(int mobilenumber) {
        mobilenumber =1234567;
        this.mobilenumber = mobilenumber;
    }


    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }


}
