/*import java.lang.*;

class Rectangle{
    private double length;
    private double bredth;
    public void setlength(double l){
        if(l>0)
            length =l;
        else
            length=0;
    }
    public void setbredth(double b)
    {
        if(b>0)
            bredth=b;
        else
            bredth=0;
    }
    public double getlength(){
        return length;
    }
    public double  getbredth(){
        return bredth;
    }



    public double AreaOfRectangle(){
        return (length*bredth);
    }
    public double PerimeterOfRectangle(){
        return (2*(length+bredth));
    }
    public static void main(String... args){

        Rectangle r = new Rectangle();
        r.length=10.005;
        r.bredth=15.003;
        System.out.println(r.AreaOfRectangle());
        System.out.println(r.PerimeterOfRectangle());
    }
}*/
/*class Rectangle{
    private double length; // properties
    private double bredth;

    public Rectangle(){
        length=bredth=1;
    }
    public Rectangle(double l, double b){
        setLength(l);
        setBredth(b);
    }
    public double getLength(){
        return length;
    }
    public double getBredth(){
        return length;
    }
    public void setLength(double l){
        if(l>0)
            length=l;
        else
            length=0;
    }
    public void setBredth(double b){
        if(b>0)
            bredth=b;
        else
            bredth=0;
    }
    public Rectangle(double s){
        length = bredth=s;
    }

    public double AreaofRectangle() {
        return getLength() * getBredth();
    }

        public static void main(String... args){
            Rectangle rect = new Rectangle(10.85,80.50);
            System.out.println(rect.AreaofRectangle());
        }
    }*/
/*class PatternRect{
    public static  void main(String... args){
        for(int i=0;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+ "*");
            }
         System.out.println(" ");
        }
    }
}*/
/*import java.lang.*;
import java.util.*;
class LinerSearch {
    public static void main(String[] args) {
        int Arr[] = {25, 56, 22, 44, 87, 8, 4, 2, 5, 7, 889, 65, 62, 5412, 45};
        Scanner scan = new Scanner(System.in);
        System.out.println("enter data which you want to search in arrray");
        int data = scan.nextInt();
        for (int i = 0; i < Arr.length; i++) {
            if (data == Arr[i])
                System.out.println(i);
        }
            //    System.out.println("data are not found");
        }
    }*/
/*class Person{
    public String Name;
    public int Age;
    public String PrintName() {
        return Name;
    }
        public int PrintAge(){
            return  Age;

        }
        public static  void main(String... arg){
        Person p1= new Person();
        p1.Name="Ranjeet";
        p1.Age=22;
        System.out.println(" name of person"  +  p1.PrintName());
            System.out.println(" Age of person" + p1.PrintAge());
    }
}
this problem also can be solved by private method
 */
/* class Person{
     private String Name;
     private int Age;
public Person(String Name,int Age){
    this.Name =Name;
    this.Age=Age;
}
    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }
    public static  void main(String... arg){
        Person p1 = new Person("Ranjeet",22);
        Person p2 = new Person("Aanya",21);
        System.out.println("Name is" +  p1.getName() + "Age is " + p1.getAge());
        System.out.println("Name is" +  p1.getName() + "Age is " + p1.getAge());
    }
}*/
/*mport java.lang.*;
class Dog{ private String  Name;private int Age;public Dog(String Name,int Age){
    this.Name=Name;
    this.Age=Age;
}public void setName(String Name){
    this.Name =Name;
}public String getName() {
        return Name;
    }public void setAge(int Age){
    this.Age=Age;
}public int getAge(){
    return  Age;
    }
    public static  void main(String... args){
    Dog d1= new Dog("Happy",3);
        Dog d2= new Dog("Lucy", 4);
        System.out.println("Name is"+ d1. getName()+" Age is " + d1.getAge());
        System.out.println("Name is"+ d2. getName()+" Age is " + d2.getAge());
        d1.setName("Moti");
        d1.setAge(6);
        d2.setName("chiku");
        d2.setAge(9);
        System.out.println("Name is"+ d1. getName()+" Age is " + d1.getAge());
        System.out.println("Name is"+ d2. getName()+" Age is " + d2.getAge());
    }
}*/
/*import java.lang.*;
  class Rectangle{
       private double length;
       private double bredth;

       public double AreaOfRectangle(){
           return  (length*bredth);
       }
       public Rectangle(){
           length=1;
           bredth=1;
       }
       public Rectangle(double l,double b){
           setLength(l);
           setBredth(b);
       }
       public Rectangle(double s){
           length=bredth=s;
       }

    public double getBredth() {
        return bredth;
    }
    public double getLength(){
           return  length;
    }

    public void setBredth(double bredth) {
        this.bredth = bredth;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public static void main(String... arg){
           Rectangle r = new Rectangle ();
           Rectangle r1= new Rectangle(10,5);
           Rectangle r2 = new Rectangle(20);
           System.out.println("Area of rectangle  without parameter is "+ r.AreaOfRectangle());
           System.out.println("Area of Rectangle with two parameter is "+ r.AreaOfRectangle());
           System.out.println("Area of rectangle is with one parameter is" + r2.AreaOfRectangle());
           r.setBredth(12);
           r.setLength(12);
        System.out.println("Area of rectangle  without parameter is "+ r.AreaOfRectangle());
    }

}*/
/* class Solution{
   static  int Binarysearch(int []a,  int target){
         int p=0;
         int r = a.length;
         while(p<r){
            int  mid =p+r/2;
             if(a[mid]==target) {
                 return mid;
             }
                 else if(a[mid]<target) {
                 return mid - 1;
             }
                 else{
                     return mid+1;
             }
         }
         return -1;
     }
     public static  void main(String... args){
         int arr[]={1,2,4,5,8,9,12,13};
        System.out.println("target element is" + Binarysearch(arr, 13));
     }
}*/
class Solution {
    int isPrimeNumber(int n) {
        int N = n / 2;
        for (int i = 2; i < N; i++)
            if (n > 0 && (n / i) == 0)
                return -1;
    }
        return 1;
public static void main(String... args) {
    Solution s = new Solution();
    System.out.println(s.isPrimeNumber(4));
}
}


