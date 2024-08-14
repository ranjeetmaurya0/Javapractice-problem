import java.lang.*;
import java.util.*;
 class AirtSeries {
    public static void main(String[] args) {
         int n1, n2,n,N;
            Scanner s= new Scanner(System.in);
         System.out.println("enter the length of series n");
         n = s.nextInt();
        System.out.println("enter the first number of series");
        n1= s.nextInt();
       System.out.println("enter the second number os series");
        n2 = s.nextInt();
       /* for(int i=1;i<=n;i++)
        {
            series = a+((i-1) *d);
            System.out.print(series +",");
        }
        for(int i=1;i<=n;i++)
        {
            a = a*m;
            System.out.print(a +",");*/
        System.out.print(n1 + ",");
        System.out.print(n2 + ",");
        for(int i=3;i<=n;i++)
        {
           N = n1+n2;
           n1=n2;
           n2=N;
           System.out.print(N + ",");
        }

        }
    }