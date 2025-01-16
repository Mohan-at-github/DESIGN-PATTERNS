package Builder.V1;

public class Client {
    public static void main(String[] args) {
        Builder builder=new Builder();
        builder.ID=1;
        builder.name="Mohan";
        builder.age=26;
        Student student=new Student(builder);

        System.out.println(student);
    }
}
