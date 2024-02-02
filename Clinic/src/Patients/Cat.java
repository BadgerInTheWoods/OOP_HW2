package Patients;

import Patients.PatientsAbilities.Goable;

import java.time.LocalDate;

public class Cat extends Animal implements Goable {
    Double discount;
    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness);
        this.discount = discount;
    }
    public Cat() {
        super();
        this.discount = 10D;
    }

    @Override
    public void eat() {
        System.out.println("Кошка поймала мышку и ест");
    }

    public void fly() {
        System.out.println(nickName + " cant fly");
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
    public void meow(){
        System.out.println("Мяяяу!");
    }
    @Override
    public void go() {
        System.out.println("Животное " + nickName + " пошло куда-то");
    }

    @Override
    public String toString() {
        return super.toString()+"Discount("+discount+")";
    }

}