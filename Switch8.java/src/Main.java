import java.lang.*;
import java.util.*;


class Switch{
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int a = s.nextInt();
         /*if(n%2!=0)
         System.out.println("Weired");
         else if(n%2==0 &&  2<=n<=5 )
           System.out.println("Not Weired");
           else if(n%2==0 && 6<=n<=20)
           System.out.println("Weired");
           else if(n%2==0 && n>20)
           System.out.println("Not Weired");
           else
           system.out.println("enter another number");*/
        int b =s.nextInt();
       /* a = a+b;
        b = a-b;
        a = a-b;*/
        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println("a" + a);
        System.out.println("b" + b);
    }
}