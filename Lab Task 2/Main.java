//import java.util.Scanner;
//class student{
    String name;
//    String rollno;
//
//    student (String x,String y){
//        name=x;
//        rollno=y;
//    }
//    public void info(){
//        System.out.println("Your name:"+name+" "+"Your rollno:"+rollno);
//    }
//    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("what's your name:");
//        String x= sc.nextLine();
//        System.out.println("what's your roll no:");
//        String y = sc.nextLine();
//        student s1= new student(x,y);
//        s1.info();
//    }
//}
//class rectangle{
//    int length,width;
//    int calculatearea(){
//        return (length*width);
//
//    }
//}
//class runner{
//    public static void main(String[]args){
//        rectangle r1 = new rectangle();
//        r1.length=10;
//        r1.width=5;
//        System.out.println(r1.calculatearea());
//    }
//}
//class rectangle{
//    int length,width;
//    rectangle (){
//        length=5;
//        width=10;
//    }
//    public rectangle(int l, int w){
//        length = l;
//        width = w;
//    }
//    public int calculatearea(){
//        return (length *width);
//    }
//}
//class runner{
//    public static void main(String[]args){
//        rectangle r1= new rectangle();
//        System.out.println(r1.calculatearea());
//        rectangle r2= new rectangle(2,5);
//        System.out.println(r2.calculatearea());
//    }
//}
//LAB TASK 1:
    class Circle {

        double radius;
        double pi;

        Circle() {
            radius = 2;
            pi = 3.14;
        }

        Circle(double r, double p) {
            radius = r;
            pi = p;
        }

        double circumference() {
            return 2 * pi * radius;
        }

        public static void main(String[] args) {

            Circle c1 = new Circle();
            Circle c2 = new Circle(5, 3.14);

            System.out.println("Circumference of Circle 1: " + c1.circumference());
            System.out.println("Circumference of Circle 2: " + c2.circumference());
        }
    }
    //LAB TASK 2:

class Account {

    double balance;

    Account() {
        balance = 0;
    }

    Account(double b) {
        balance = b;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[] args) {

        Account a1 = new Account();
        Account a2 = new Account(5000);

        a1.deposit(2000);
        a1.withdraw(500);

        a2.deposit(1000);
        a2.withdraw(2000);

        System.out.println("Account 1 Balance: " + a1.balance);
        System.out.println("Account 2 Balance: " + a2.balance);
    }
}
LAB TASK 3:

class Distance {

    int feet;
    int inches;

    Distance() {
        feet = 0;
        inches = 0;
    }

    Distance(int f, int i) {
        feet = f;
        inches = i;
    }

    void display() {
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);
    }

    public static void main(String[] args) {

        Distance d1 = new Distance();
        Distance d2 = new Distance(5, 8);

        d1.display();
        System.out.println();

        d2.display();
    }
}
//LAB TASK 4:

class Marks {

    int mark1;
    int mark2;
    int mark3;

    Marks() {
        mark1 = 0;
        mark2 = 0;
        mark3 = 0;
    }

    Marks(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    int sum() {
        return mark1 + mark2 + mark3;
    }

    public static void main(String[] args) {

        Marks m1 = new Marks();
        Marks m2 = new Marks(80, 75, 90);

        System.out.println("Sum of Marks 1: " + m1.sum());
        System.out.println("Sum of Marks 2: " + m2.sum());
    }
}
//LAB TASK 5:

class Time {

    int hr;
    int min;
    int seconds;

    Time() {
        hr = 0;
        min = 0;
        seconds = 0;
    }

    Time(int h, int m, int s) {
        if (h >= 0 && h < 24) {
            hr = h;
        } else {
            hr = 0;
        }

        if (m >= 0 && m < 60) {
            min = m;
        } else {
            min = 0;
        }

        if (s >= 0 && s < 60) {
            seconds = s;
        } else {
            seconds = 0;
        }
    }

    void display() {
        System.out.println("Time: " + hr + ":" + min + ":" + seconds);
    }

    public static void main(String[] args) {

        Time t1 = new Time();
        Time t2 = new Time(10, 30, 45);

        t1.display();
        t2.display();
    }
}