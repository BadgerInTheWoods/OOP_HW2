package Staff;

public class Doctor extends Personal {


    public Doctor(String nameSurname, int age) {
        super(nameSurname, age);
    }

    public Doctor() {
        super("doctor", 20);
    }
}
