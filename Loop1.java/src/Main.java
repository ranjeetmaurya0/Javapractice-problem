import java.lang.*;
import java.util.*;
 class Loop1 {
    public static void main(String[] args) {
       /* int n,m, digit,Arm=0;
        int count=0,rev=0;*/
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the String what you want check even a string is palindrome or not");
       str  = scan.nextLine();
       int l,i;
         l =str.length();
         String str1=str.substring(l,0);
          System.out.println(str1);

       /* while(n>0) {
            digit = n % 10;
            n = n / 10;
          rev=(rev*10)+digit;
        }
        System.out.println( rev);
     if (rev==m)
        {
            System.out.println("palindrome");
        }
     else{
         System.out.println("number is not palindrome");
     }*/

    }
}