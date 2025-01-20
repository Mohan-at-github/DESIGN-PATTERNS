package Prototype_Registry;

public class Client {
    private  static void fillRegistry(StudentRegistry studentRegistry){
        //create prototype object
        Student mar2024LLDMor=new Student();
        mar2024LLDMor.setBatch("mar24Mor");
        mar2024LLDMor.setAvgBatchPsp(90.0);

        Student mar2024LLDEve=new Student();
        mar2024LLDMor.setBatch("mar24Eve");
        mar2024LLDMor.setAvgBatchPsp(78.0);

        IntelligentStudent mar2024LLDMorIS=new IntelligentStudent();
        mar2024LLDMorIS.setBatch("mar2024LLDMorIS");
        mar2024LLDMorIS.setAvgBatchPsp(99.0);
        studentRegistry.register("mar24MorIS", mar2024LLDMorIS);

        //Store it in registry
        studentRegistry.register("mar24Mor",mar2024LLDMor);
        studentRegistry.register("mar24Eve",mar2024LLDEve);

    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry=new StudentRegistry();
        fillRegistry(studentRegistry);

        //creating one student
        Student shivam= studentRegistry.getObject("mar24Mor").clone();
        shivam.setName("Shivam");
        shivam.setAge(24);
        shivam.setPsp(89.9);

        System.out.println("Debug");
    }
}
