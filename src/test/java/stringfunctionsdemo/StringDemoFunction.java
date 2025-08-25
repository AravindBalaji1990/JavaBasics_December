package stringfunctionsdemo;

public class StringDemoFunction {

    public static void main(String[] args) {
        String name1 = "123";
        System.out.println(name1.getClass().getSimpleName());

        String name2 = "a";
        System.out.println(name2);

        String name3 = "SESSION";
        System.out.println(name3);

        System.out.println(name1.replace("1","a"));
        System.out.println(name3.toLowerCase());
        System.out.println(name3.toUpperCase());
        System.out.println("abc123abc".matches("([0-9]+)([a-z]{3})([0-9]+)"));
        System.out.println("123abc123".matches("([0-9]+)([a-z]{3})([0-9]+)"));
        System.out.println("aravind_test@gmail.com".matches("([a-z]+)(\\_)([a-z]+)(\\@)(\\bgmail.com\\b)"));

    }
}
