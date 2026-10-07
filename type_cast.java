public class type_cast {
    public static void main(String[] args) {
        // implicit -> wideninig (smaller to bigger data type) automaticly done by java

        int a = 10;
        float b = a;

        float c = a+b;

        System.out.println(a);
        System.out.println(b);

        // explicit -> narrowing ,, done manually

        float d = 98.89f;
        // int e = d;
        int e = (int)d;

        System.out.println(d);
        System.out.println(e);


        byte f = (byte)130;

        System.out.println(f);



     }
}
