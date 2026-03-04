class Student {
    private int age; 
    public void setAge(int a) { 
    age = a;
    }

    public void showAge() {
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(20);
        s.showAge();
    }
}