public class string_pg {
    public static void main(String[] args) {
        // non-primitive
        // + in string is concat
        // immutable and how ?
        // index [] -- > starts with 0 but why???????

        // string pool

        // String a =" maharanth"; // addr : xcd009
        // a = a + " is my name"; // addr : xvb654

        // System.out.println(a);

        // int s = 90;
        // s = 80;

        // int x = s;

        // s = 78;

        // String m = "sad"; // h14 + 0 , h14+1
        // m = m+"d"; // I14

        String v = "sadd"; // string pool

        String b = new String("sadd"); // ---> ignore now

        // System.out.println(v==m);

        // System.out.println(m.charAt(0));
        // System.out.println(m.contains("dsd")); // sadd
        // System.out.println(m.codePointAt(1,4));
        // StringBuffer example
        StringBuffer sb1 = new StringBuffer("Hello");
        sb1.append(" World");
        System.out.println(sb1); // Output: Hello World

        // StringBuilder example
        StringBuilder sb2 = new StringBuilder("Hi");
        sb2.append(" Everyone");
        System.out.println(sb2); // Output: Hi Everyone

    }
}
