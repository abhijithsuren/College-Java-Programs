class Animal{
    public void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("Dog barks");
    }
}
public class overriding{
    public static void main(String[] args){
        Animal a = new Animal();
        Dog d = new Dog();
        a.sound();
        d.sound();
    }
}