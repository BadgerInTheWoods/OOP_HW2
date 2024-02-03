package Staff;

import Patients.Animal;
import Patients.Parrot;
import Patients.PatientsAbilities.Flyable;
import Patients.PatientsAbilities.Goable;
import Patients.PatientsAbilities.Swimable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class VeterinaryClinic {

    protected List<Personal> employees;
    protected List<Animal> animals;

//    private int index = 0;


    public VeterinaryClinic() {
        this.employees = new ArrayList<Personal>();
        this.animals = new ArrayList<Animal>();
    }


    public void hireEmployee(Personal employee) {
        employees.add(employee);
    }

    public void fireEmployee(Personal employee) {
        employees.remove(employee);
    }

    public void addPatient(Animal animal) {
        animals.add(animal);
    }

    public void removePatient(Animal animal) {
        animals.remove(animal);
    }

    public List<Personal> getEmployees() {
        return this.employees;
    }

    public List<Animal> getPatients() {
        return this.animals;
    }

    public List<Animal> getGoables() {
        List<Animal> goables = new ArrayList<Animal>();
        for (Animal animal : animals){
            if (animal instanceof Goable) {
                goables.add(animal);
            }
        }
        return goables;
    }

    public List<Animal> getSwimables() {
        List<Animal> swimables = new ArrayList<Animal>();
        for (Animal animal : animals){
            if (animal instanceof Swimable) {
                swimables.add(animal);
            }
        }
        return swimables;
    }
    public List<Animal> getFlyables() {
        List<Animal> flyables = new ArrayList<Animal>();
        for (Animal animal : animals){
            if (animal instanceof Flyable){
                flyables.add(animal);
            }
        }
        return flyables;
    }
//    @Override
//    public boolean hasNext() {
//        return index < employees.size();
//    }
//
//    @Override
//    public Personal next() {
//        return employees.get(index++);
//    }
}
