package Patients.PatientsAbilities;

public interface Flyable {

    void fly();

    default double getFlySpeed(){
        return Math.random() * 10;
    }
}
