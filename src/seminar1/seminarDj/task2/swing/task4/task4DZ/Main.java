package seminar1.seminarDj.task2.swing.task4.task4DZ;

import java.util.List;
/*
* Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри
коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
Стаж
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавление нового сотрудника в справочник
* */
public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        List<Employee> storage = employeeService.getEmployee();
        System.out.println(storage);


        System.out.println("Employee with over 10 years of experience "
                + employeeService.employeesByExperience(storage, 10));

        System.out.println("Name employee by phone number "
        +employeeService.getEmployeesByPhone(storage,"8-928-000-00-01"));

        Employee newEmployee=new Employee(6L,"8-928-000-00-06","Oleg",3);

        System.out.println("Add new employee "
                +employeeService.createEmployee(storage,newEmployee));

        System.out.println("Search by ID "
        +employeeService.getEmployeeBiId(storage,3L));
    }
}
