import java.util.*;
public class nCr{
    public static int factorial(int n){
        int f=1,i=1;
        for(i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int nCr(int n, int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, r, result;
        System.out.println("Enter the n and r : ");
        n = sc.nextInt();
        r = sc.nextInt();
        if(n>r){
            result = nCr(n, r);
            System.out.println("The value of "+n+" choose "+r+" is "+result);
        }else{
            System.out.println("Invalid choice: n should be greater than r");
        }
        sc.close();
    }
}