
package main_package;

import se331_second_prblm.*;

public class Main {
    public static void main(String[] args){
        System.out.println("Teacher's Info: ");
        System.out.println("1st Teacher: "); 
        Teacher t1 = new Teacher("710001444","Mr.Md. Mostafiqur Rahman","SWE","Lecturer");
        t1.personInfo();
        t1.teacherInfo();
        
        System.out.println("\n2nd Teacher: "); 
        Teacher t2 = new Teacher("710001009","Khalid Been Md. Badruzzaman Biplob","SWE","Lecturer");
        t2.personInfo();
        t2.teacherInfo();
        
        System.out.println("\n\nStudents's Info: ");
        System.out.println("1st Student: "); 
        Student s1 = new Student("201-35-3099","Meem Khan","SWE","31");
        s1.personInfo();
        s1.studentInfo();
        
        System.out.println("\n2nd Student: "); 
        Student s2 = new Student("201-35-2990","Jannatul Ferdousi","SWE","31");
        s2.personInfo();
        s2.studentInfo();
        
    }
}
