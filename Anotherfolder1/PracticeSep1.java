package Anotherfolder1;
import Anotherfolder.PracticeSep;

class PracticeSep_dem extends PracticeSep{
    void printpo(){
        // System.out.println(de);
        System.out.println(age);
    }
}

public class PracticeSep1{
    public static void main(String[] args) {
        PracticeSep_dem o = new PracticeSep_dem();
        o.printpo();
        o.getage();
    }
}




