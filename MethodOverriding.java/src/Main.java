/* Method overriding are totally different from method overloading in Method overriding the method
is called based on object not reference

 */
//  EXAMPLE
/*class Super{
     void Display() {
         System.out.println("Hello Java super class");
     }
}
class Sub extends Super{
    void Display(){
        System.out.println("hello java this is a sub class");
    }
}
class Solution {
    public static void main(String... args) {
        Super  su = new Super();
        Sub sb = new Sub();
        Super s = new Sub(); /* it called the sub class because here method called based on object not
                                  reference
        su.Display();
        sb.Display();
        s.Display();
    }
}*/
class Super {
    void meth1() {
        System.out.println("this is a first method of super class");
    }

    void meth2() {
        System.out.println("this is a second method of super class");
    }
}
    class Sub extends Super {
        void meth2() {
            System.out.println("this is second method of sub class");
        }

        void meth3() {
            System.out.println("this is the third method of sub class");
        }
    }
    class DynamicOverriding{
    public static void main(String... args) {
        Sub su = new Sub();
        su.meth1();
        su.meth2();
        su.meth3();


    }
}
