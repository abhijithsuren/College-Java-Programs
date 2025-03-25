import java.util.*;
public class employee{
    int emp, bs;
    String name;
    double hra, da, pf, netsal;
    Scanner sc = new Scanner(System.in);
    public employee(){
        hra=da=pf=netsal=0;
    }
    public employee(int e, String n, int b){
        emp = e;
        name= n;
        bs = b;
    }
    public void accept(){
        System.out.println("--Enter the details--");
        System.out.println("Enter the employee number : ");
        emp = sc.nextInt();
        System.out.println("Enter the employee name : ");
        name = sc.next();
        System.out.println("Enter the basic pay : ");
        bs = sc.nextInt();
        System.out.println("------------------");
    }
    public void calc(){
        hra = (70.0/100.0)*bs;
        da = (50.0/100.0)*bs;
        pf = (20.0/100.0)*bs;
        netsal = (hra + da + bs) - pf;
    }
    public void display(){
        System.out.println("Employee number : "+emp);
        System.out.println("Employee name : "+name);
        System.out.println("Employee  basic pay : "+bs);
        System.out.println("Employee net salary : "+netsal);
    }
    public static void main(String[] args){
        employee e1 = new employee();
        employee e2 = new employee(002,"Alok",100000);
        e1.accept();
        e1.calc();
        e2.calc();
        System.out.println("Employee 1 : ");
        e1.display();
        System.out.println("Employee 2: ");
        e2.display();
    }
}