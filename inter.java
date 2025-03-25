interface A{
    void show();
}
class B implements A{
    public void show(){
        System.out.println("Hello from B class");
    }
}
public class inter{
    public static void main(String[] args){
        A obj = new B();
        obj.show();
    } 
}