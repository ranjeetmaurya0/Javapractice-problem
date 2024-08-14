import java.lang.*;
import java.util.*;
class NumToword {
    public static void main(String[] args) {
      int num,digit,rev,dig;
      rev=0;
      Scanner scan=new Scanner(System.in);
      System.out.println("enter the number");
      num = scan.nextInt();
      while (num>0)
      {
          dig =num%10;
          num =num/10;
          rev = (rev*10)+dig;
      }
     // System.out.println(rev);
      while(rev>0)
      {
          digit=rev%10;
          rev=rev/10;
          switch(digit)
          {
              case 0:System.out.print("Zero");
              break;
              case 1:System.out.print("One");
                  break;
              case 2:System.out.print("Two");
                  break;
              case 3:System.out.print("Three");
                  break;
              case 4:System.out.print("Four");
                  break;
              case 5:System.out.print("Five");
                  break;
              case 6:System.out.print("Six");
                  break;
              case 7:System.out.print("Seven");
                  break;
              case 8:System.out.print("Eight");
                  break;
              case 9:System.out.print("Nine");
                  break;
          }
      }
    }
}