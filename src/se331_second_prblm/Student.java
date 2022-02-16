
package se331_second_prblm;

public class Student extends Person {
    private String batch;
    
    public Student(String id,String name, String dept, String batch){
        super(id, name,dept);
        this.batch = batch;
    }
    public void studentInfo(){
        System.out.println("Batch: " +batch);
    }
    
}
