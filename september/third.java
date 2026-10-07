package september;
import august.second;

class third_one extends second {
    void printrun(){
        System.out.println(runs);
    }
    
    
}
public class third{
    public static void main(String[]args){
        third_one r = new third_one();
        r.printrun();
        r.Setplayer_name("dhoni");
        
    }
}