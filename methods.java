public  class methods {

    static void add(int a, int b){ // Declaration, parameters(variables) 
       System.out.println(a+b);
    }
    static int add1(int a, int b){ // Declaration, parameters(variables) 
       return a+b;     // return to get value outside
    }

    public static void main(){
        
        System.out.println("hello");
        add(2,3); // calling , arguments(values)

        int res = add1(3,4);     
        System.out.println(res+5);
    }
 
} 