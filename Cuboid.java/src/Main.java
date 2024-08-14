import java.lang.*;
import java.util.*;
class Cuboid{
    public  static void main(String arg[])
    {
        int l,b,h;
        float area,volume;
        System.out.println("enter length and bredth");
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        b = sc.nextInt();
        h= sc.nextInt();
      volume = (l*b*h);
      area = (2*volume);
      System.out.println(volume);
      System.out.println(area);
    }

}
