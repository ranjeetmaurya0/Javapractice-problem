public class FinalandStatic {
    // here we are demonstrate the example of static method and static variable
    static int x =10;
    int y =10;
    void show(){
        System.out.println(x +" " + y);
    }
    static void display(){
        System.out.println(x ); // it is shows that we can't access non-static variable inside the static method
    }
    public static void main(String[] args){
        FinalandStatic fs = new FinalandStatic();
        FinalandStatic f1s1 = new FinalandStatic();
        fs.show();
        f1s1.show();
        display();
        FinalandStatic.display();
    }
}
