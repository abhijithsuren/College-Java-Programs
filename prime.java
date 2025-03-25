import java.util.*;
public class prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count=0, num, i;
        System.out.println("Enter a number : ");
        num = sc.nextInt();
        for(i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Entered number is prime");
        }else{
            System.out.println("Entered number is not prime");
        }
        sc.close();
    }
}