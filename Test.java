import java.util.Scanner;
class Teest{
    void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the fruit");
        String fruit  =  sc.next() ;
        switch(fruit){
            case "orange":
                System.out.print("fruit is orange");
                break;
            case "apple":
                System.out.print("fruit is apple");
                break;
            default:
                System.out.print("fruit is not available");
        }
    }
}