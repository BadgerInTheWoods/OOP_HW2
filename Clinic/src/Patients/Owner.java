package Patients;

public class Owner {
    String fullName;

    public Owner(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Patients.Owner{" +
                "fullName='" + fullName + '\'' +
                '}';
    }
}
