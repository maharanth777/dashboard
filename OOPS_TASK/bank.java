package OOPS_TASK;
public class bank {
    private int account_number ;
    protected double bank_balance;
    int minimum_balance = 1000 ;
    int amount;
    int withdraw_amount;
    public void setaccount_number(int account_number ){
        this.account_number = account_number;

    }
    public int getaccount_numbrer(){
        return account_number;

    }
    bank(){
        this.account_number=accoi;

    }
    public void check_balance(){
        if(amount>=0){
            amount_withdraw();
            System.out.println("the available balance is  :"+amount);
        }
        else{
            System.out.println("there is  insufficient available balance");
        }
    }
    public void  amount_withdraw(){
        if(amount>minimum_balance){
            amount = amount - minimum_balance;
        }
        else{
            System.out.println("you cannot withdraw the amount");
        }

    }
    public static void main(){
        bank a = new bank();
        a.account_number= 123456;
        a.amount=10;
        a.check_balance();
    }
}