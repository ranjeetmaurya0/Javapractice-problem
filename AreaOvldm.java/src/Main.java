// area using overloading method
import java.lang.*;
import java.util.*;
class AreaOvd{
 static   double Area(double l , double b) {
        double area = (l*b);
        return area;
    }
  static   float Area(float r){
     float pi =3.14f;
        float A = pi*(r*r);
        return A;
    }
    public  static void main(String[] args){
        System.out.println(Area(25.524f));
    }
}
