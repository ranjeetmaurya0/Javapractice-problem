import java.lang.*;
import java.util.*;
class Validation{
    static int max(int...A) {
        int Max = A[0];
        for (int i = 0; i < A.length; i++) {
            if (Max < A[i])
                Max = A[i];
        }
        return Max;
    }
    public static void main(String[] args){
        System.out.println(max(10,20,3,4,5,8,7,6,91,1258,6,3));
    }
}
  /* static void showList(int start,String ...x){
        for (int i =0;i<x.length;i++)
        {
            System.out.println(start +"."+ x[i]);
            start++;
        }

    }
    public  static void main(String ...args){
        showList(10,"ranjeet","ram","Ayushi","Shejal","Kirti");
    }
}
 /* static   boolean isValidate(String name){
        return  name.matches("[a-zA-Z]+");
    }
static    boolean isValidate(int age){
        return  age>=3 && age<=18;
    }
    public  static void main(String[] args){
        System.out.println(isValidate("46Ranjeet"));
    }
}*/
