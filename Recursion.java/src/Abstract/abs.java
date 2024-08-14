/*package Abstract;

/*abstract class abs {
    public abs(){System.out.println("constructor of abs");}
    public void meth1(){System.out.println("meth1 of abs class");}
  abstract   public void meth2();
}
 class sub extends abs{
     @Override
     public void meth2() {System.out.println("meth2 of sub class");}

     }
     class Abstract{
    public  static void main(String... args){
        abs s = new sub();
        s.meth1();
        sub s1 = new sub();
    }
 }
abstract class Shape{
  abstract   double  Area();
  public abstract double Perimeter();
        }
        class Circle extends Shape{
                   double radius;
            @Override
                   public  double Area(){
                      return  Math.PI*(radius*radius);
                   }
                    @Override
                  public double Perimeter(){
                     return Math.PI*radius;
                  }
        }
        class Rectangle extends Shape {
            double length;
            double bredth;

            @Override
            public double Area() {
                return length * bredth;

            }

            @Override
            public double Perimeter() {
                return 2 * (length * bredth);

            }
        }
        class Abstracts{
            public  static void main(String... args){
              Circle s1 = new Circle();
              Rectangle s2 = new Rectangle();
              s1.radius=10;
              s2.length=20;
              s2.bredth=15;
            System.out.println("Area of Circle  is" + s1.Area());
            System.out.println("Perimeter of Circle  is" + s1.Perimeter());
            System.out.println("Area of rectangle is" + s2.Area());
            System.out.println("Perimeter of Circle  is" + s1.Perimeter());
    }

        }*/


class SOD{
    int sumofdigits(int n){

        return n;
    }
}
