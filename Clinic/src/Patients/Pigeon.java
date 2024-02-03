package Patients;

import java.time.LocalDate;
import Patients.PatientsAbilities.Flyable;
import Patients.PatientsAbilities.Goable;

public class Pigeon extends Animal implements Goable, Flyable {
    public Pigeon(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Pigeon(){
        super();
    }


    @Override
    public void eat() {
        System.out.println(getNickName() + " pigeon eating");
    }

    public void swim() {
        System.out.println("Ошибка: Животное "+ getType()+" не может плыть");
    }


    @Override
    public void go() {
        System.out.println("pigeon going");
    }

    @Override
    public double getFlySpeed() {
        return Flyable.super.getFlySpeed();
    }

}
