import java.util.*;
public class sorting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int temp, i,j,n;
        System.out.println("Enter the size of the array : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements : ");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Sorted array : ");
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++){
                if(arr[j+1]<arr[j]){
                    temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}