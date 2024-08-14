
/*class Rectangle{
    public double length;
    public double bredth;
    public double Area(){
        return length*bredth;
    }
    public double Perimeter(){
        return 2*(length+bredth);
    }
    public static  void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value of length and bredth");
        Rectangle rect = new Rectangle();
        rect.length = scan.nextDouble();
        rect.bredth = scan.nextDouble();
        System.out.println(rect.Area());
        System.out.println(rect.Perimeter());
class Cylender {

    public double radius;
    public double height;
    public double lidArea(){
        return  Math.PI*(radius*radius);
    }
    public double surfaceArea(){
         return  2*Math.PI*radius*(radius+height);
    }
    public double volume(){
        return Math.PI*(radius*radius);
    }
    public static void main(String[]  args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the radius and height");
        Cylender c1 = new Cylender();
        c1.radius = scan.nextDouble();
        c1.height = scan.nextDouble();
        System.out.println(c1.lidArea());
        System.out.println(c1.surfaceArea());
        System.out.println(c1.volume());
    }
}*/
class Student{
    public int roll_no;
    public String Name;        //properties
    public String courses;
    public double m1;
    public double m2;
    public double m3;

    public double Total(){
        return (m1 + m2 + m3);
    }

    public double Average(){
        return ((m1 + m2 + m3) /3);
    }

    public char Grade() {
        if (Average() > 90)
            return 'A';
        else
            return 'B';
    }

    public String details() {
        return "roll_no:" + roll_no + "\n" + "Name:" + Name + "\n" + "courses:" + courses + "\n";
    }
    public  static void main(String[] args){
Student st = new Student();
st.roll_no=5;
st.Name="AanyaSingh";
st.courses="MBBS";
st.m1=78.5;
st.m2=80.231;
st.m3=95.999;
System.out.println(st.Total());
        System.out.println(st.Average());
        System.out.println(st.Grade());
        System.out.println(st.details());
}
}
