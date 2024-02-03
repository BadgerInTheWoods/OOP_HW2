package Staff;

import Patients.Animal;

public class Nurse  extends Personal {
    public Nurse(String nameSurname, int age) {
        super(nameSurname, age);
    }
    public Nurse() {
        super("nurse", 20);
    }

    public void doPrescription(Animal animal) {
        System.out.println("nurse " + super.nameSurname + " creates list of medication for " + animal.getNickName());
    }
}
