package seminar1.seminarDj.task1.gb.task3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String name;
    private double salary;
    private int age;

    /**
     * Конструктор сотрудника.
     *
     * @param name   Имя сотрудника
     * @param salary Зарплата сотрудника
     */
    public Employee(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    /**
     * Получить имя сотрудника.
     *
     * @return Имя сотрудника
     */
    public String getName() {
        return name;
    }

    /**
     * Получить зарплату сотрудника.
     *
     * @return Зарплата сотрудника
     */
    public double getSalary() {
        return salary;
    }
    /**
     * Получить возраст сотрудника.
     *
     * @return возраст сотрудника
     */
    public double getAge() {
        return age;
    }

    /**
     * Повысить зарплату сотрудника.
     *
     * @param amount Сумма повышения
     */
    public void increaseSalary(double amount) {
        salary += amount;
    }

    /**
     * Переопределение метода toString().
     *
     * @return Строковое представление сотрудника
     */
    @Override
    public String toString() {
        return String.format("Employee { name= '%s', , salary= %s, age %s }",name,salary,age);

    }
}