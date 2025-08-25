package stringfunctionsdemo;

public class StringBuilderBufferDemo {
    public static void main(String[] args) {
        StringBuilderBufferDemo sg = new StringBuilderBufferDemo();
        sg.sampleStringBuilder();
        // mutable
        // threadsafe multiple threads can access it as a synchronised way
//        StringBuffer sbuffer = new StringBuffer("Hello");
//        sbuffer.append(" world");
//        System.out.println(sbuffer.reverse());
//        System.out.println(sbuffer.delete(0,1));
//        System.out.println(sbuffer);

        // mutable
        // not threadsafe multiple threads cannot access it as a synchronised way
//        StringBuilder sbuilder = new StringBuilder("Hello");
//        sbuilder.append(" world");
//        System.out.println(sbuilder.reverse());
//        System.out.println(sbuilder.delete(0,1));
//        System.out.println(sbuilder);
    }

    public void sampleStringBuilder() {
        StringBuilder sb = new StringBuilder("my value");

        Runnable task1 = () -> {
            for (int i = 0; i < 5; i++) {
                sb.append(" my data");
            }
            System.out.println(sb);
        };

        // 2 threads trying to access the same string builder
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task1);

        t1.start();
        t2.start();
    }

    public void sampleStringBuffer() {
        StringBuffer sb = new StringBuffer("my value");

        Runnable task1 = () -> {
            for (int i = 0; i < 5; i++) {
                sb.append(" my data");
            }
            System.out.println(sb);
        };

        // 2 threads trying to access the same string builder
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task1);

        t1.start();
        t2.start();
    }
}
