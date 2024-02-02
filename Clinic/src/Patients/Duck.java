package Patients;

import Patients.PatientsAbilities.Flyable;
import Patients.PatientsAbilities.Goable;
import Patients.PatientsAbilities.Swimable;

import java.time.LocalDate;
public class Duck extends Animal implements Goable, Swimable, Flyable {
    public Duck (String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }
    public Duck(){
        super();
    }
    @Override
    public void go() {
        System.out.println(nickName + "going...");
    }
    @Override
    public void eat() {
        System.out.println("Утка ест");
    }
}
