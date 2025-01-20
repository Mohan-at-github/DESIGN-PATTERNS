package Prototype_Registry;

public class IntelligentStudent extends Student{ 
    int iq;
public IntelligentStudent(IntelligentStudent intelligentStudent){
   super(intelligentStudent);
   //this.iq=IntelligentStudent.iq;
}
public IntelligentStudent(){
    
}

    @Override
    public Student clone() {
        return new IntelligentStudent(this);
    }
}
