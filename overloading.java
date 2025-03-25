public class overloading {
    void Add(int a, int b){
        System.out.println("Sum of "+a+" and "+b+" integers are : "+(a+b));
    }
    void Add(int a, int b, int c){
        System.out.println("Sum of "+a+" , "+b+" , "+c+" integers are : "+(a+b+c));
    }
    public static void main(String[] args){
        overloading o = new overloading();
        o.Add(1,2);
        o.Add(1,2,3);
    }
}
