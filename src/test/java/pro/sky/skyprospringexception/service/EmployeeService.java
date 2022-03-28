package pro.sky.skyprospringexception.service;

import java.util.Collection;

public interface EmployeeService {


    Employee add(String firstName, String lastName);
    Employee add(Employee employee);
    Employee remove(String firstName, String lastName);
    Employee remove(Employee employee);
<<<<<<< HEAD
    Employee find(String firstName, String lastName);
=======

    default Employee find(String firstName, String lastName) {
        return null;
    }

    Employee all();

>>>>>>> Vtoray_vetka

    Collection<Employee> getAll();
}
