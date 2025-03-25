import java.util.*;
public class fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int first=0,second=1,next=first+second,limit;
        System.out.println("Enter the limit : ");
        limit = sc.nextInt();
        for(int i=0;i<=limit;i++){
            System.out.println(first+"\n");
            next=first+second;
            first=second;
            second=next;
        }
        sc.close();
    }
}