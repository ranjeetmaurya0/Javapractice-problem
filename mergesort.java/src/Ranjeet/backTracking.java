/*package Ranjeet;

import java.util.Arrays;

public class backTracking {
  /*  public static  void ChangeArray(int []arr, int i , int val) {
        // base case
        if (i == arr.length) {
            Printarray(arr);
            return;
        }
        // recursive case
        else {
            arr[i] = val;
            ChangeArray(arr, i + 1, val + 1);
            arr[i] -= 2;
        }
    }
    public static void Printarray(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public  static void main(String... args){
        int arr[] = new int [5];
        ChangeArray(arr,0,1);
        Printarray(arr);
    }
}
/*public static void Substring(String p, String up){
    if(up.isEmpty()){
        System.out.println(p);
        return;
    }
    char ch = up.charAt(0);
    Substring(p,up.substring(1));
    Substring(p+ch, up.substring(1));
    }
    public static void main(String... args){
    Substring(" " , "abc");
}
}*/
/*public static void findSubstring(String str, String ans , int i){
    if(i== str.length()){
        if(ans.length()==0){
            System.out.println("null");
        }
        else{
            System.out.println(ans);
        }
        return;
    }
    findSubstring(str, ans+str.charAt(i),i+1);
    findSubstring(str, ans, i+1);
}
public static void main(String... args){
    String str = "abc";
    findSubstring(str, " ", 0);
}
}*/
interface Member {
    public  void Callback();
}
class Store {
    Member mem[] = new Member[100];
    int count =0;
    void register(Member m){
        mem [count++]= m;
    }
    void InviteSale(){
        for(int i =0;i<count;i++){
            mem[i].Callback();
        }
    }
}
class Customer implements Member {
    String name;

    Customer(String n) {
        name = n;
    }

    public void Callback() {
        System.out.println(name + "ok , I will visit Early");
    }
}




