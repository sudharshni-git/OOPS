class Animal {
protected void sound() { 
System.out.println("Animal makes a sound");
}
}
class Dog extends Animal {
public void bark() {
sound();   
}
}
public class Home{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
    }
}