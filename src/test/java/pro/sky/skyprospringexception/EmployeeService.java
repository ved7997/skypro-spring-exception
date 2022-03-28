package pro.sky.skyprospringexception;

import pro.sky.skyprospringexception.service.Employee;

public interface EmployeeService {
    pro.sky.skyprospringexception.service.Employee add(String firstName, String lastName);
    pro.sky.skyprospringexception.service.Employee add(pro.sky.skyprospringexception.service.Employee employee);
    pro.sky.skyprospringexception.service.Employee remove(String firstName, String lastName);
    pro.sky.skyprospringexception.service.Employee remove(pro.sky.skyprospringexception.service.Employee employee);
    Employee find(String firstName, String lastName);



}
