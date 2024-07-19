public class OOPS {
    /*public static void main(String[] args) {
        // Pen p1 = new Pen(); //created a pen class object
        // p1.setColor("Yellow");
        // System.out.println(p1.getColor());
        // p1.setTip(5);
        // System.out.println(p1.getTip());
        // p1.setColor("Blue");
        // System.out.println(p1.getColor());

        // BankAccount b1 = new BankAccount();
        // b1.username = "samruddhinadgouda";
        // b1.setPassword("SamuN@29");
        // System.out.println(b1.username);
        // //System.out.println(b1.password);

        //Constructor
        // Student s1 = new Student();
        // Student s2 = new Student(21);
        // Student s3 = new Student("Samruddhi");

        //Copy constructor
        // Student s1 = new Student();
        // s1.name = "Samruddhi";
        // s1.age = 21;
        // s1.password = "abcd";
        // s1.marks[0] = 100;
        // s1.marks[1] = 90;
        // s1.marks[2] = 80;
        // Student s2 = new Student(s1); //copy
        // s2.password = "xyz";
        // s1.marks[2] = 100; //even if copy done before, it changes the value of s2 when we changes s1 value in shallow constructor
        // //in deep copy constructor after copying content, if we change value of old one it will not show it in new one
        // for(int i=0; i<3; i++){
        //     System.out.println(s2.marks[i]);
        // }

        //simple Inheritance
        // Fish shark = new Fish();
        // shark.eat();

        //Multi-level Inheritance
        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);

        //hierarchial Inheritance
        // Mammal m1 = new Mammal();
        // m1.eat();
        // Bird b1 = new Bird();
        // b1.breathe();

        //hybrid Inheritance
        // Shark s1 = new Shark();
        // s1.swim();

        // Peacock p1 = new Peacock();
        // p1.fly();

        //Method Overloading
        // Calculator c1 = new Calculator();
        // System.out.println(c1.sum(2, 3));
        // System.out.println(c1.sum((float)3.5, (float)7.6));
        // System.out.println(c1.sum(1, 2, 3));

        //method Overriding
        // Deer d1 = new Deer();
        // d1.eat();
        
        //abstract class
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color); //first call parent constructor and then child constructor

        // Chicken c  = new Chicken();
        // c.eat();
        // c.walk();

        //Interfaces
        // Queen q = new Queen();
        // q.moves();
        
        //multiple inheritance
        // Deer d = new Deer();
        // d.eat();
        // d.walk();

        //static keyword
        Student s1 = new Student();
        s1.schoolName = "Jane";

        Student s2 = new Student();
        System.out.println(s2.schoolName); //->Jane

        Student s3 = new Student();
        s3.schoolName = "Samu";
        //System.out.println(s1.schoolName); // -> Samu

        //super keyword
        Horse h = new Horse();

    }*/
}
//Super keyword
class Animal{
    Animal(){
        System.out.println("Animal contructor is called..");
    }
}
class Horse extends Animal{
    Horse(){
        super();
        System.out.println("Horse constructor is called..");
    }
}
//Static keyword
class Student{
    static int returnPercentage(int math, int chem, int phy){
        return math+chem+phy;
    }
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
//Interfaces
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.err.println("up, down, left, right, diagonal");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.err.println("up, down, left, right");
    }
}
class Camel implements ChessPlayer{
    public void moves(){
        System.err.println("diagonal");
    }
}
//multiple inheritance
interface Herbivore{
    void eat();
}
interface Carnivore{
    void walk();
}
class Deer implements Herbivore, Carnivore{
    public void eat(){
        System.out.println("Eats grass..");
    }
    public void walk(){
        System.out.println("Walks on 4 legs..");
    }
}
//abstract classes
// abstract class Animal{
//     String color;
//     Animal(){
//         color = "brown";
//     }
//     void eat(){
//         System.out.println("animal eats");
//     }
//     abstract void walk(); //it gives only idea
// }
// class Horse extends Animal{
//     void changeColor(){
//         color = "Blue";
//     }
//     void walk(){
//         System.out.println("walks on 4 legs");
//     }
// }
// class Chicken extends Animal{
//     void walk(){
//         System.out.println("walks on 2 legs");
//     }
// }
//method overriding
// class Animal{
//     void eat(){
//         System.out.println("eats anything.");
//     }
// }
// class Deer extends Animal{
//     void eat(){
//         System.out.println("eats grass.");
//     }
// }
//method overloading
class Calculator{
    int num;

    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}
//Base Class
// class Animal{
//     String color;

//     void eat(){
//         System.out.println("eats");
//     }
//     void breathe(){
//         System.out.println("breathes");
//     }
// }
// //hierarchial
// class Mammal extends Animal{
//     void walk(){
//         System.out.println("Walks");
//     }
// }
// class Fish extends Animal{
//     void swim(){
//         System.out.println("Swims");
//     }
// }
// class Bird extends Animal{
//     void fly(){
//         System.out.println("fly");
//     }
// }
// //hybrid
// class Shark extends Fish{
//     int fins;
// }
// class Peacock extends Bird{
//     int legs;
// }
//multi-level
// class Mammals extends Animal{
//     int legs;
// }
// class Dog extends Mammals{
//     String breed;
// }
//Simple
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("Swims in water");
//     }
// }
//Constructor
// class Student{
//     String name;
//     int age;
//     String password;
//     int marks[];

    //Shallow copy constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = name;
    //     this.age = age;
    //     this.marks = s1.marks;
    // }
    //Deep copy constructor
//     Student(Student s1){
//         marks = new int[3];
//         this.name = name;
//         this.age = age;
//         for(int i=0; i<marks.length; i++){
//             this.marks[i] = s1.marks[i];
//         }
//     }
//     Student(){
//         marks = new int[3];
//         System.out.println("Constructor is called");
//     }
//     Student(int age){
//         marks = new int[3];
//         this.age = age;
//     }
//     Student(String name){
//         marks = new int[3];
//         this.name = name;
//     }
// }
class Pen{
    String color;
    int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int tip){
        this.tip = tip;
    }
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}
