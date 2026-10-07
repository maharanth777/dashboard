package OOPS_TASK;

import java.util.Scanner;

import java.util.ArrayList;

public class ecommercemain {
    public static void main() {

        // gpay1 g1 = new gpay1();

        ecommerce ec = new ecommerce();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the mobile numnber:");
        String ph = sc.nextLine();
        while (true) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("eneter the product : ");
            String prd = sc1.nextLine();
            if (!ec.checkproducts(prd)) {
                System.out.println("wrong product");
                continue;
            }
            Scanner sc2 = new Scanner(System.in);
            System.out.println("enter the number of products:");
            int num = sc2.nextInt();
            ec.addproduct(prd, num);
            Scanner sc3 = new Scanner(System.in);
            System.out.println("enter 1 to continue :");
            int res = sc3.nextInt();
            if (res == 1) {
                System.out.println("continue");
            } else {
                System.out.println("stop");
                break;
            }
        }
        ec.displaytotal();
        Scanner sc4 = new Scanner(System.in);
        System.out.println("enter the payement method 1-googlepay,2-creditcard,3-Phonepay :");
        int ch = sc4.nextInt();
        Payment G;
        switch (ch) {

            case 1:
                G = new Gpay();
            case 2:
                G = new CreditCard();
            case 3:
                G = new Phonepay();
            default:
                G = new Gpay();
        }
        G.pay();
        ArrayList<ecommerceuser> c = new ArrayList<>();
        ecommerceuser user1 = new ecommerceuser();

        System.out.println(user1.username);

        c.add(user1);
        c.add(user1);
        c.add(user1);

        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i).username);
            System.out.println(c.get(i).passsword);
        }

    }
}