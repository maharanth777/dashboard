package OOPS_TASK;

public class job{
    private double salary;
    protected String department = "IT";
    int employee_id ;
    public String name  ;
    public void setsalary(double s){
        this.salary = s;
    }
    public double getsalary(){
        return salary;
    }
    class manager extends job{
        public  void  displaymanagerdetails(){
            System.out.println("the manager name is:"+name);
            System.out.println("department"+department);
            System.out.println("employee id:"+employee_id);

    }
}
    public void main(){
        manager m = new manager();
        m.displaymanagerdetails();
        System.out.println("the salary is:"+m.getsalary());
    }
}
