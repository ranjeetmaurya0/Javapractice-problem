import java.lang.*;
 class Loop {
     public static void main(String[] args) {
         int i = 1;
         while (i < 100)
             System.out.println(i);
             i = i * 2;

         int j=1;
         do {
             System.out.println(i);
             j = j * 2;
         } while (j < 100);
     }
 }