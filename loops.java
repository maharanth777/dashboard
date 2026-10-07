import java.util.Scanner;
public class loops {
    public static void main(){
        String a = "abc";
        String b = "efg";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the movie name:");
        String moviename =  sc.next();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("enter the number of people:");
        int  people = sc2.nextInt();
        switch(moviename){
            case "abc":
            System.out.println("movie 1");
            break;
            case "efg":
            System.out.println("movie 2");
            default:
                System.out.println("movie is not available");
        }
        for( int i=1 ;i <= people ;i++ ){
            Scanner sc3 = new Scanner(System.in);
            System.out.println("enter the age");
            int age = sc3.nextInt();
            if(age>=18){
                System.out.print("eligible to view");
            }
            else{
                System.out.print("not eligible to view");
            }

            }
        }
        
            


        }
        