public class Booking {
    public static void main(String[] args) {

        final int price = 100;
        
        int person1_amount = caluclateFinalAmount(4,price,true);
        System.out.println(person1_amount);

        int person2_amount = caluclateFinalAmount(1,price,false);
        System.out.println(person2_amount);

    }


    static int caluclateFinalAmount(int count, int price, boolean coupan){
        int finalAmount = count * price;
        if(coupan){
            finalAmount-=50;
        }
        return finalAmount;
    }




}
