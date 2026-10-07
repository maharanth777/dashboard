package OOPS_TASK;

public class vehicle {
    protected int speed;
}
class tvs extends vehicle{
    public void display(){
    for(int i=0;i<=5;i++){
        speed = speed + 10;
        System.out.println(speed);

    }
}
public static void main(){
    tvs c  = new tvs();
    c.display();
}
}
    

