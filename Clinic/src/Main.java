import Patients.*;
import Staff.Doctor;
import Staff.Nurse;
import Staff.Personal;
import Staff.VeterinaryClinic;


//Создать класс Doctor и подумать над его состоянием и поведением. Создать класс Nurse(медсестра) и подумать над его состоянием и поведением.
//Создайте интерфейсы Patients.Goable, Flyable, Swimable. У интерфейсов должны быть
//методы получения скорости заданного действия: double run(), double fly(), double swim()
//Добавьте наследников этим интерфейсам, но таким образом,
//чтобы у каждого интерфейса было минимум по два наследника (при необходимости, добавьте в приложение новые классы)
//Создать класс ВетеринарнаяКлиника (VeterinaryClinic)
//У ветеринарной клиники добавьте методы получения всех бегающих, всех плавающих и всех летающих, а также методы для работы с персоналом клиники.

public class Main {
    public static void main(String[] args){

        VeterinaryClinic em = new VeterinaryClinic();

        Doctor doc = new Doctor("aleksey", 55);
        Doctor doctor = new Doctor();
        Nurse nur = new Nurse();

        Parrot parrot = new Parrot();
        Fish fish = new Fish();
        Duck duck = new Duck();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Pigeon pigeon = new Pigeon();
        System.out.println(dog.getRunSpeed());
        pigeon.fly();
        doc.getinfo();

        em.hireEmployee(doc);
        em.hireEmployee(doctor);
        em.hireEmployee(nur);

        em.addPatient(parrot);
        em.addPatient(fish);
        em.addPatient(duck);
        em.addPatient(dog);
        em.addPatient(cat);
        em.addPatient(pigeon);

        System.out.println(em.getSwimables());

        //System.out.println(em.getPatients());


        //System.out.println(em.getEmployees());

        //System.out.println();

        em.fireEmployee(doctor);

        //System.out.println(em.getEmployees());

        doc.doSurgery(parrot);

        nur.doPrescription(parrot);
        

    }
}




