import Patients.Animal;
import Patients.Fish;
import Patients.Parrot;
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

        Personal doc = new Doctor("aleksey",55);
        Personal doctor = new Doctor();
        Personal nur = new Nurse();

        Animal fish = new Parrot();
        System.out.println(fish.getFlySpeed());
        doc.getinfo();

        em.hireEmployee(doc);
        em.hireEmployee(doctor);
        em.hireEmployee(nur);

        em.getEmployees(em);
        System.out.println();

        em.fireEmployee(doctor);

        em.getEmployees(em); // тут проблема незнаю как сделать так чтобы не передавалось ничего в метод

        

    }
}




