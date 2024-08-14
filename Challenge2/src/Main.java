import java.lang.*;
 class Challenge2 {
     public static void main(String[] args) {
         int d = 1248;
         String str = "Ran@jeetmau%$#rya";
         String str1 = "   Ra   n jee  t  Maur  y a    ";
         System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));
     System.out.println(str1.trim());
     System.out.println(str1.replaceAll("\\s+","").trim());
   System.out.println(); }
 }