/*
 In java constructor has two type
 1. non argument constructo
 2. parameterized argument
 */
// demonstion of default constructor
/*class Student{
    int id;
    String Name;
     void display(){
         System.out.println("Name "+ Name +" id "+ id);
     }
     public static void main(String... args){
         Student s= new Student();
         Student s1 = new Student();
         s.display();
         s1.display();
     }

}*/
// no arg constructor
/*lass Student1{
    int id;
    String Name;
    Student1(){

        }
        void display(){
        System.out.println("name"+ Name + "id is " + id);
        }
        public static void main(String... args){
        Student1 s = new Student1();
        s.display();


        }

        }*/
// parmetrized argument
/*class Student{
    int id;
    String Name;
    Student(int i, String n){
        id = i;
        Name = n;
    }
     void display(){
        System.out.println(" Name is" + Name + "id is" + id);
     }
     public static void main(String... args){
         Student s = new Student(101,"Ranjeet");
         s.display();
     }

}*/
// constructor overloading id done by create different constructor with different number of parameter list and with same  name
/*class Student{
    int id,age;
    String Name;
    Student(int i , String n) {
        id = i;
        Name = n;
    }
    Student (int i , int a, String n ) {
        id = i;
        Name = n;
        age = a;
    }
    void display() {
        System.out.println("Name " + Name + " id " + id + "age " + age);
    }
    public static void main(String... args){
        Student s = new Student(101,"Ranjeet");
        Student s1= new Student(101,22,"Aanya");
        s.display();
        s1.display();

    }
}
*/

/* condtructor in Inheritance
 in INHERITANCE all the constructor are excuted on level wise (top to buttom )
 child class object   first call their parent class and parent class excuted first and after their child excuted  but if
  the object are created of their parent class then only parent class are excuted
 */
// EXAMPLE
//package inheritcost;
 /*class Parent { //  class Parent
    public Parent() { // parent constructor
        System.out.println("Parent class Constructor");
    }
}
class Child extends Parent{
     public Child(){
         System.out.println("Child class Constructor");
     }
}
class Grandchild extends Child {
    public Grandchild() {
        System.out.println("Grandchild class Constructor");
    }

}
class InheritConst{
public static void main(String... args){
 Child c =  new Child();
 }
}*/
/* parameterized and non - parameterized constructor are call depends on  in object any value/parameter are pass or not

 */