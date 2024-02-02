package Patients;

import Patients.PatientsAbilities.Flyable;
import Patients.PatientsAbilities.Goable;

import java.time.LocalDate;

public class Parrot extends Animal implements Flyable, Goable {

    public Parrot(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Parrot(){
        super();
    }

    @Override
    public void eat() {
        System.out.println(getNickName() + " Parrot eating");
    }

    public void swim() {
        System.out.println("Ошибка: Животное "+ getType()+" не может плыть");
    }


    @Override
    public void go() {
        System.out.println("parrot going");
    }
}
