package Patients.PatientsAbilities;

public interface Goable {
    void go();
    default double getRunSpeed(){
        return Math.random() * 10;
    }

}
