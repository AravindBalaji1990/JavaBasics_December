package stringfunctionsdemo;

public class ConvertObjects {

    public static void main(String[] args) {
        String str = "123";
        Integer data = Integer.parseInt(str);
        System.out.println(data.getClass().getSimpleName());

        Integer intdata = 345;

        String datatest = intdata.toString();
        System.out.println(datatest.getClass().getSimpleName());

//        casting
        double d = 12.45;
        Integer num = (int) d;
        System.out.println(num.getClass().getSimpleName());
    }

}
