package Staff;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class VeterinaryClinic implements Iterator {

    protected List<Personal> employees;

    private int index = 0;


    public VeterinaryClinic() {
        this.employees = new ArrayList<Personal>();
    }


    public void hireEmployee(Personal employee) {
        employees.add(employee);
    }

    public void fireEmployee(Personal employee) {
        employees.remove(employee);
    }

    public void getEmployees(VeterinaryClinic employees) {
        Iterator<Personal> it = employees;
        while (it.hasNext()) {
            System.out.println(employees.next().toString());
        }
        this.index = 0;
    }


    @Override
    public boolean hasNext() {
        return index < employees.size();
    }

    @Override
    public Personal next() {
        return employees.get(index++);
    }
}
