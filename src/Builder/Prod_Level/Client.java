package Builder.Prod_Level;

import Builder.Prod_Level.Student;

public class Client {
    public static void main(String[] args) {
       // Builder builder=new Builder();
        Student student= Student.getBuilder()
                .setID(10)
                .setAge(25)
                .setName("Mohan")
                .setCompany("cognizant")
                .setPsp(98.0)
                .build();


        //Student student1=builder.Build();//Build method internally class Student constructor
        /*there chance of creating like this by someone becz Student constructor is public
        //but we need to construct student obj only using Builder
        // then we need to restrict calling of constructor from outside the class
        make student constructor private*/
       // Student student1=new Student(null);
        System.out.println(student);
    }
}
