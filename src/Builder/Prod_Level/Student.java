package Builder.Prod_Level;

public class Student {
    int ID;
    String name;
    int age;
    String company;
    double psp;

    private Student(Builder builder){
        //keep this in Builder class or can here also
//        //Validation starts
//        if(builder.age<18){
//            throw new RuntimeException("Age cannot be less than 18");
//        }
//        //validation ends
        this.age=builder.getAge();
        this.ID= builder.getID();
        this.name=builder.getName();
    }

    /*when Student obj created
    1. create builder class and its object
    2. create copy constructor of student class which takes builder object as input
    3. create the student obj pass the builder object
    here Builder is helping student class to build it
    so here we need to reach builder class via student class only
     */

    //static becz to access this method with student object
  public static Builder getBuilder(){
      //static method can only access static attributes of the class
      //mark Builder class static
      return new Builder();
  }

    //Inner class
    public static class Builder {
        int ID;
        String name;
        int age;
        String company;
        double psp;

        public Student build(){
            //Validation starts
            if(this.age<18){
                throw new RuntimeException("Age cannot be less than 18");
            }
            //validation ends
            return new Student(this); //passing current build object
        }

        public int getID() {
            return ID;
        }

        public Builder setID(int ID) {
            this.ID=ID;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name=name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public String getCompany() {
            return company;
        }

        public Builder setCompany(String company) {
            this.company = company;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp=psp;
            return this;
        }
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
