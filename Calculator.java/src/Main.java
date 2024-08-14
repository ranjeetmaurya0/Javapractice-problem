import java.util.*;
import java.lang.*;
 class Calculator {
    public static void main(String[] args) {
        int choice;
        float a,b,Add,Sub,Mul,Div;
        Scanner s = new Scanner(System.in);
        System.out.println("enter choice \n 1:ADD\n2:SUB\n3:MUL\n4:DIV\n");
        choice = s.nextInt();
        System.out.println("enter the value of a and b");
        a = s.nextFloat();
        b = s.nextFloat();
        switch (choice)
        {
            case 1: Add = a+b;
               System.out.println(Add);
                   break;
            case 2: Sub = a-b;
                System.out.println(Sub);
                break;
            case 3: Mul = a*b;
                System.out.println(Mul);
                break;
            case 4: Div = a/b;
                System.out.println(Div);
                break;
            default:
                System.out.println("wrong choice");
                break;
        }
    }
}