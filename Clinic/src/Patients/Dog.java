package Patients;

import Patients.PatientsAbilities.Goable;

import java.time.LocalDate;

public class Dog extends Animal implements Goable {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Dog(){
        super();
    }
    public void fly() {
        System.out.println(nickName + " cant fly");
    }
    @Override
    public void eat() {
        System.out.println("Собака ест с миски");
    }
    @Override
    public void go() {
        System.out.println("Животное " + nickName + " пошло куда-то");
    }
}
