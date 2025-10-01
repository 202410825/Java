import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        Student[] students =new Student[3];

        for(int i = 0;i<3;i++){
            System.out.println("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            String inputLine = sc.nextLine();


            String[] studentInfo = inputLine.split(" ");

            Student student = new Student();
            student.setName(studentInfo[1]);
            student.setMajor(studentInfo[2]);
            student.setStudentId(Long.parseLong(studentInfo[0]));
            student.setPhoneNum(Long.parseLong(studentInfo[3]));

            students[i] = student;
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        for(int i = 0;i<3;i++){
            long phoneNum = students[i].getPhoneNum();
            String phoneStr = "0" + String.valueOf(phoneNum);

            String part1 = phoneStr.substring(0,3);
            String part2 = phoneStr.substring(3,7);
            String part3 = phoneStr.substring(7);
            String fromattedPhone = part1 + "-" + part2 + "-" + part3;

            System.out.println((i+1) + "번째 학생: " + students[i].getStudentId() + " " + students[i].getName()+ " " + students[i].getMajor() +" " + fromattedPhone);
        }
        //Long.parseLong(studentInfo[0]); Long.parseLong(studentInfo[3])

    }

}

class Student{
    long StudentId;
    String name;
    String Major;
    long PhoneNum;

    public void setName(String newName){this.name = newName;}
    public void setMajor(String newMajor){this.Major = newMajor;}
    public void setStudentId(long newSI){this.StudentId = newSI;}
    public void setPhoneNum(long newPN){this.PhoneNum = newPN;}

    public String getName(){return this.name;}
    public String getMajor(){return this.Major;}
    public long getStudentId(){return this.StudentId;}
    public long getPhoneNum() {return this.PhoneNum;}

}