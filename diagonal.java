import java.util.*;
public class diagonal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows, columns;
        System.out.println("Enter the size of rows and coloumns : ");
        rows = sc.nextInt();
        columns = sc.nextInt();
        if(rows!=columns){
            System.out.println("Matrix should be a square matrix");
            sc.close();
            return;
            
        }
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the matrix elements : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix elements : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Left diagonal matrix : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(i==j){
                    System.out.print(matrix[i][j]+"\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        System.out.println("Right diagonal matrix : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(j==columns-i-1){
                    System.out.print(matrix[i][j]+"\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        } 
        sc.close(); 
    }
}