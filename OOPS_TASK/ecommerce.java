package OOPS_TASK;

abstract class Payment {
   void intrest() {
      System.out.println("2.5 %");
   }

   abstract void pay();
}

interface Payment1 {
   static void pay() {
      System.out.println("demo");
   }
}

// default method
// Func@anno

class gpay1 implements Payment1 {

}

class Gpay extends Payment {
   @Override
   void pay() {
      System.out.println("Payment proccessing...");
      System.out.println("Gpay Payment done");
   }
}

class CreditCard extends Payment {
   @Override
   void pay() {
      System.out.println("Payment proccessing..");
      System.out.println("Creditcard Payment done");
   }
}

class Phonepay extends Payment {
   @Override
   void pay() {
      System.out.println("Payment proccessing..");
      System.out.println("Phonepay Payment done");
   }
}

public class ecommerce {
   String[] products = { "laptop", "mobile", "headphones" };
   double[] price = { 5000, 20000, 2000 };
   private String mobile_number;
   double total = 0;

   ecommerce() {
      this.products = products;
      this.price = price;
      this.mobile_number = mobile_number;
      this.total = total;
   }

   void setmobile_number(String mobile_number) {
      this.mobile_number = mobile_number;

   }

   void getmobile_number() {
      System.out.println("mobile number is:" + mobile_number);
   }

   void addproduct(String product) {
      for (int i = 0; i < products.length; i++) {
         if (products[i].equalsIgnoreCase(product)) {
            total = total + price[i];
            System.out.println(product + " added,price:" + price[i]);
            return;
         } else {
            System.out.println("the product is not available");
            break;

         }

      }
   }

   boolean checkproducts(String prd) {
      if (!prd.equalsIgnoreCase("mobile") && !prd.equalsIgnoreCase("laptop") && !prd.equalsIgnoreCase("headphone")) {
         return false;

      }
      return true;
   }

   void addproduct(String product, int quantity) {
      for (int j = 0; j < products.length; j++) {
         if (products[j].equalsIgnoreCase(product)) {
            double amount = price[j] * quantity;
            total = total + amount;
            System.out.println(product + "added.quantity:" + quantity + "  amount:" + amount);
            return;
         } else {
            System.out.println("the product is not available");
            break;
         }

      }
   }

   void displaytotal() {
      System.out.println("------------------------");
      System.out.println("total Amount" + total);

   }

   void displaydetails() {
      System.out.println("E-Commerce Product Details");
      System.out.println("--------------------");
      for (int i = 0; i < products.length; i++) {
         System.out.println(products[i] + ":" + price[i]);
      }
   }
}