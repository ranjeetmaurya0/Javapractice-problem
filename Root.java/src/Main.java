import java.lang.*;
import java.util.*;
class Root{
    public static void main(String arg[])
    { System.out.println("enter the value of a band c");
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        double Square;
        float R1,R2;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        Square = Math.sqrt((b*b)-(4*a*c));
        R1 = (float) (-b-Square)/(2*a);
        R2 = (float) (-b+Square)/(2*a);
        System.out.println(R1);
        System.out.println(R2);
        System.out.println(Square);

    }
}