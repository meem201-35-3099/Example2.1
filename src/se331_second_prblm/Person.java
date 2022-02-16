
package se331_second_prblm;

public class Person {
    protected String id;
    protected String name;
    protected String dept;
   
    public Person(String id,String name, String dept){
        this.id = id;
        this.name = name;
        this.dept = dept;
    }
    
    public void personInfo(){
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.dept);
    }
}
