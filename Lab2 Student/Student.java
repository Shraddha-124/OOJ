import java.util.Scanner;
class Subject
{
    int marks;
    int credits;
    int grades;
}
class Student{
    String name;
    String USN;
    double SGPA;
    Scanner s;
    Subject[] subjects;

    Student(){
        int i;
        subjects= new Subject[8];
        for(i=0;i<8;i++)
        subjects[i] = new Subject();
    s = new Scanner(System.in);
    }
    void getStudentDetails(){
        System.out.println("Enter Student Name:");
        name=s.next();
        System.out.println("Enter USN:");
        USN=s.next();
    }
    void getMarks(){
        for(int i=0;i<8;i++){
            System.out.println("Enter details of Subject:");
            System.out.println("Enter Marks:");
            subjects[i].marks=s.nextInt();
            System.out.println("Enter Credits:");
            subjects[i].credits=s.nextInt();
            if(subjects[i].marks>=90)
            {
                subjects[i].grades=10;
            }
            else if(subjects[i].marks>=80)
            {
                subjects[i].grades=9;
            }
            else if(subjects[i].marks>=70)
            {
                subjects[i].grades=8;
            }
            else if(subjects[i].marks>=60)
            {
                subjects[i].grades=7;
            }
            else if(subjects[i].marks>=50)
            {
                subjects[i].grades=6;
            }
            else if(subjects[i].marks>=40)
            {
                subjects[i].grades=5;
            }
            else
            {
                subjects[i].grades=0;
            }
        }
    }
    void computeSGPA(){
        double totalCredits=0;
        double weightedSum=0;
        for(int i=0;i<8;i++){
            totalCredits += subjects[i].credits;
            weightedSum += subjects[i].grades*subjects[i].credits;
        }
        SGPA=weightedSum/totalCredits;
    }
    void displayDetails(){
        System.out.println("Student Details");
        System.out.println("Name:"+name);
        System.out.println("USN:"+USN);
        System.out.println("SGPA:"+SGPA);
    }
    public static void main(String[]args){
        Student s1=new Student();
        s1.getStudentDetails();
        s1.getMarks();
        s1.computeSGPA();
        s1.displayDetails();
    }
}