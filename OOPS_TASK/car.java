package OOPS_TASK;

public class car {
    private String brand ;
    String model;
    int speed;
     void display_details(){
        System.out.println("the brand name is:"+brand);
        System.out.println("the car model is:"+model);
        System.out.println("the car`s speed is:"+speed);
    }
        public void  set_speed(){
            speed = speed +50;

        }
    public static void main(){
        car car1= new car();
        car1.brand = "honda";
        car1.model ="extreme";
        car1.speed = 46;
        car1.set_speed();
        car1.display_details();



    
    }    

    }

    

    
    

