package pro.sky.skyprospringexception.controller;

import net.minidev.json.JSONNavi;
import org.apache.catalina.util.ErrorPageSupport;
import org.apache.tomcat.jni.Directory;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringexception.service.Employee;
import pro.sky.skyprospringexception.service.EmployeeService;

import java.util.Collection;
<<<<<<< HEAD
=======
import java.util.Set;
>>>>>>> Vtoray_vetka

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

//    private final EmployeeService employeeService;

//    public EmployeeController(EmployeeService employees) {
//        this.employees = employees;




    @GetMapping("/add")
    public String add(@RequestParam String firstName, @RequestParam String lastName){
        Employee result = employeeService.add(firstName, lastName);
        return generateMesage(result, "успешно создан");
    }

    @GetMapping("/remove")
    public String remove(@RequestParam String firstName, @RequestParam String lastName) {
        Employee result = employeeService.remove(firstName, lastName);
        return generateMesage(result, "удалён");
    }

    @GetMapping("/find")
    public Employee find(@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.find(firstName, lastName);
    }

    @GetMapping("/all")
<<<<<<< HEAD
    public Collection<Employee> all(){
=======
    public Collection<Employee> all() {
>>>>>>> Vtoray_vetka
        return employeeService.getAll();
    }

    private String generateMesage(Employee employee, String status) {
        return  String.format("Сотрудник %s %s %s.",
                employee.getLastName(),
                employee.getFirstName(),
                status
        );
    }

}
