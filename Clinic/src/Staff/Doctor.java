package Staff;

import Patients.Animal;

public class Doctor extends Personal {


    public Doctor(String nameSurname, int age) {
        super(nameSurname, age);
    }

    public Doctor() {
        super("doctor", 20);
    }

    public void doSurgery(Animal animal) {
        System.out.println("doctor " + super.nameSurname + " does surgery to " + animal.getNickName());
    }
}
