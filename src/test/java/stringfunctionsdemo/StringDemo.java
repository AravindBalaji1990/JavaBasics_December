package stringfunctionsdemo;

public class StringDemo {

    public static void main(String[] args) {
        // how to combine
        String firstname ="first sample";
        String lastname ="last sample";
        System.out.println(firstname + lastname);

        String concatdata = firstname.concat(lastname);
        System.out.println(concatdata);

        String data = new String("java");
        System.out.println(data.length());
        System.out.println(data.startsWith("j"));
        System.out.println(data.endsWith("a"));
        System.out.println(data.contains("a"));
        System.out.println(data.substring(0,2));
         data = data.replace("a","e");// reassigning the data value
        System.out.println(data.replace("a","e"));
        System.out.println(data.indexOf("e"));
        System.out.println(data.indexOf("j"));

    }
}
