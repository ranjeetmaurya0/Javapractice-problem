// find the sum of all number using variable  arguments
/*import java.util.*;
import java.lang.*;
class  VarPractice{
     static int sum(int ...A) {
         int Add = 0;
         for(int i = 0; i < A.length; i++) {
             Add = Add + A[i];
         }
         return Add;
     }
     public static  void main(String[] args){
      System.out.println(sum(10,12,54,78,7,4,6,9,8,2,0,44));
     }
}

 */
/*class PrintNum{

   public static void PrintFib(int a, int b, int n){
        if(n==0){
            return;}
        int c = a+b;
        System.out.print(c + " , ");
        PrintFib(b,c,n-1);
        }
        public static void main(String[] args){
       int a=0,b=1;
       System.out.print(a + ", ");
       System.out.print(b + " , ");
       int n=7;
        PrintFib(a, b ,n-2);
    }
}*/
// print x to the power of n
import java.util.*;
 class PowerNUm{
     static int CalPower(int x , int n){
         if(n==0){
             return 1;
         }
         if(x==0){
             return 0;
         }
        CalPower(x,n-1);
         int pw = (x* CalPower(x,n-1)) ;
         return pw;
     }
     public static void main(String ...args){
         System.out.println(CalPower(2,5));
     }
 }