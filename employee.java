import java.util.Scanner;

public class employee {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the employee type");
        String worker = sc.nextLine();
        // sc.nextLine();
        Scanner  sc1 = new Scanner(System.in);
        System.out.print("enter the basic salary: ");
         int salary = sc1.nextInt();
        int performancescore = 10000;
        switch(worker){
            case "regular":
            int totalsalary = performancescore + salary;
            System.out.print(totalsalary);
            break;
            case  "parttime":
            int totalsalary1 = salary;
            System.out.print(totalsalary1);
            break;

        }

    }
    
}
