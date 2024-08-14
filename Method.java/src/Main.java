import java.lang.*;

class Method {
    public static void main(String arg[]) {
         /*String str = "java";
         String str1 = "java";
         String str2 = new String("java");
         System.out.println(str1.equals(str));
         System.out.println(str == str1);
         System.out.println(str1.equals(str2));
         System.out.println(str == str2);*/
        String str = "programmer@gmail.com";
        int Index = str.indexOf("@");
        int l = str.length();
        System.out.println(Index);
        System.out.println(str.substring(0, Index));
        System.out.println(str.substring(Index, l));
    }
}