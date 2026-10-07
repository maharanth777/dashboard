import java.util.Scanner;
public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the speed of the vehicle:");
        int speed = sc.nextInt();
        String status = (speed > 100) ? "overspeed" : (speed > 60 )? "speed ":"normal";

        // variable = (condition) ? if_true : if_false

        //  speed > 60 status shld be "speed" , "normal"

        // if(speed > 60){
        //     status = "speed";
        // }
        // else{
        //     status = "normal";
        // }

        System.out.print("the vehicle is in "+ status);
    }
}
