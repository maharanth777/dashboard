public class BusMain {
    public static void main(String[] args) {
        Bus bus1 = new Bus("rahul",345,6);
        Bus bus2 = new Bus("anbu",444,6);
        Bus.age = 22;
        System.out.println(bus1.age);
        System.out.println(bus2.age);



    }
}