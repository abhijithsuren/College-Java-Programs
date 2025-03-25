import java.util.*;
public  class armstrong{ 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rem=0, arm, a, b, n;
        System.out.println("Enter the range of limit between 100 and 999 : ");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>=100 && a<=999 || b<=999 && b>=100){
            for(int i=a;i<b;i++){
                n=i;
                arm=0;
                while (n>0) {
                    rem=n%10;
                    arm=(arm+rem*rem*rem);
                    n=n/10;
                }if(i==arm){
                    System.out.println(i+" ");
                }
            }
        }else{
            System.out.println("Enter a 3 digit number");
        }
        sc.close();
    }
}