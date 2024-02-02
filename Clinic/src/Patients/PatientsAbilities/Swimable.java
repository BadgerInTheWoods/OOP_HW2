package Patients.PatientsAbilities;

public interface Swimable {
    void swim();

    default double getSwimSpeed(){
        return Math.random() * 10;
    }
}
