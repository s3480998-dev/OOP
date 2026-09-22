class student{
    String name;
    float gpa;
    int id;
public void info(){
    System.out.println(name+" "+gpa+" "+id);
}
public static void main(String[]args){
    student c1= new student();
    c1.name="khubaib";
    c1.gpa= 2.80f;
    c1.id= 153;
    c1.info();

}

}
class time{
    int hour;
    int min;
    int sec;
    public void display(){
        System.out.println(hour+" "+ min+" "+ sec);
    }
    public static void main(String[]args){
        time t1 = new time();
        t1.hour= 6;
        t1.min=45;
        t1.sec=27;
        t1.display();;
    }
}
class car{
    String steering;
    String gearbox;
    String axle;
    public void display_components(){
        System.out.println(steering+" "+ gearbox+" "+ axle);
    }
    public static void main(String[]args){
        car c1;
        c1 = new car();
        c1.steering="toyota";
        c1.gearbox="five gear system";
        c1.axle="front axle";
        c1.display_components();
    }
}