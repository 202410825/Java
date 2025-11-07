public class Homework6 {
    public static void main(String[] args){
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Objected Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming");
        System.out.println(course1);
        System.out.println(course2);
    }
}

class Course{
    String code;
    String name;

    Course(String code,String name){
        this.code = code;
        this.name = name;
    }

    public String getCode(){ return code;}

    public String getName(){return name;}

}

class OnlineCourse extends Course{

    OnlineCourse(String code, String name){
        super(code, name);
    }
    @Override
    public String toString(){
        String A = "Code: " + code + ", Name: " + name + ", Type: Online";
        return A;
    }
}

class OfflineCourse extends Course{

    OfflineCourse(String code, String name){
        super(code, name);
    }
    @Override
    public String toString(){
        String B = "Code: " + code + ", Name: " + name + ", Type: Offline";
        return B;
    }
}

