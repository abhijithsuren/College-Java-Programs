public class exeptionhandling {
    public static void main(String[] args){
        int a= 10, b= 0, ans;
        try{
            ans = a/b;
        }catch(ArithmeticException e){
            System.out.println("Can't divide a number by 0");
        }finally{
            System.out.println("Execution completed");
        }
    }
}
