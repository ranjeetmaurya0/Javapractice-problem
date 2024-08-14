import java.lang.*;
import java.util.*;
class LeapYear {
    public static void main(String[] args) {
       // System.out.println("enter year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                {
                    System.out.println("year is Leap Year");
                }
                else
                {
                    System.out.println("year is not a leap year");
                }
            }
        }
    }
}