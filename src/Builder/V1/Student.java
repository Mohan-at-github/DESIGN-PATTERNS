package Builder.V1;

public class Student {
    int ID;
    String name;
    int age;
    String company;
    double psp;

    public Student(Builder builder){
        //Validation starts
        if(builder.age<18){
            throw new RuntimeException("Age cannot be less than 18");
        }
        //validation ends
        this.age=builder.getAge();
        this.ID= builder.getID();
        this.name=builder.getName();
        this.company=builder.getCompany();
        this.psp=builder.getPsp();
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", company='" + company + '\'' +
                ", psp=" + psp +
                '}';
    }
}
