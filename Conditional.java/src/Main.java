import java.lang.*;
class Conditional {
  public static void main(String[] args) {
    String num = "10101000";
    String str = "12457";
    String str1 = "12489";
    String st = "124AF";
    if (num.matches("[0-1]+"))
    {
      System.out.println("Radix is 2 and number is  binary ");
    }
    if (str.matches("[0-7]+"))
    {
      System.out.println("Radix is 8 and number is  octal ");
    }
    if (str1.matches("[0-9]+"))
    {
      System.out.println("Radix is 10 and number is  decimal ");
    }
    if(st.matches("[0-9A-F]+")) {
      System.out.println("Radix is 16 and number is  hexa deciaml ");
    }
    else{
      System.out.println("no");
    }
  }
}