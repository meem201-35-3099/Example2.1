
package se331_second_prblm;

public class Teacher extends Person{
    private String designation;
    
 
    public Teacher(String id,String name, String dept,String designation){
        super(id, name,dept);
        this.designation = designation;
        
    }
    public void teacherInfo(){
        System.out.println("Designation: " +designation);
        
    }
}
