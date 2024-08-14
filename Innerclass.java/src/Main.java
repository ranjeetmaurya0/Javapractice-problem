// Nested Inner class
// A class inside another class is called Nested inner class
// Example... it is basically used to reduce the complexity of other class
/* class  Outer{
    int x = 10;
    class Inner{
        int y =20;
        void display() {
            System.out.println(x);
            System.out.println(y);
        }
    }
    void outerDisplay(){
        Inner in = new Inner();
        in.display();
    }
    public static void main(String... args){
        Outer o = new Outer ();
       Outer.Inner in = new Outer().new Inner();
       //o.outerDisplay();
       in.display();
    }
}*/

// local Inner class which defined inside the method of outer clasc
/*class outer{
     void Display(){
         class Inner{
             void innerdiplay(){
                 System.out.println("Hii Nayara");
             }
         }
         Inner in = new Inner();
         in.innerdiplay();
     }
     public static void main(String... args){
         outer oo = new outer();
         oo.Display();
         //outer.Inner i= new outer().new Inner(); it can't used in this program
     }
}*/
// Anonymous inner class , that is used in creating object of abstract class or interface
// it is defined at the time object creation

abstract class Anonymous{
     abstract void display();
}

public static  void main(String... args){
        outer o = new outer();
        o.meth1();
    }
}