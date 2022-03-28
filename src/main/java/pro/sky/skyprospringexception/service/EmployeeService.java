package pro.sky.skyprospringexception.service;

import java.util.Collection;

public interface EmployeeService {


    Employee add(String firstName, String lastName);
    Employee add(Employee employee);
    Employee remove(String firstName, String lastName);
    Employee remove(Employee employee);
    Employee find(String firstName, String lastName);
<<<<<<< HEAD
    Collection<Employee> getAll();
=======

    Employee all();

    Collection<Employee> getAll();



>>>>>>> Vtoray_vetka
}
