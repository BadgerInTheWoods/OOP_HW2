package Patients;

import Patients.PatientsAbilities.Swimable;

import java.time.LocalDate;

public class Fish extends Animal implements Swimable {
    public Fish (String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }
    public Fish (){
        super();
    }
    public void go() {
        System.out.println(nickName + " cant go");
    }

    public void fly() {
        System.out.println(nickName + " cant fly");
    }
    @Override
    public void swim(){
        System.out.println("swimming");
    }
    @Override
    public void eat() {
        System.out.println("Рыба ест");
    }
}
