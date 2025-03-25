import java.util.*;
public class biggestandsmallest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int big, small;
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){ 
            arr[i]=sc.nextInt();
        }
        big=arr[n];
        small=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>big){
                big=arr[i];
            }
            if(arr[i]<small){
                small=arr[i];
            }
        }    
    }
}