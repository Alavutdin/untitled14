package seminar1.seminarDj.task1.gbPractice.lesson3.task1;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    String name;
    String nidName;
    String surName;
    String position;
    String phone;
    int salary;
    int birth;

    public Employee(String name, String nidName, String surName, String position, String phone, int salary, int birth) {
        this.name = name;
        this.nidName = nidName;
        this.surName = surName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.birth = birth;
    }
    //public void setBirthDate(LocalDate birthDate){
//        this.birthDate = birthDate;
//    }

    @Override
    public String toString() {
        LocalDate localDate = LocalDate.now();
        //int age = Period.between(birthDate, localDate).getYears();

        return "Employee{" +
                "name='" + name + '\'' +
                ", nidName='" + nidName + '\'' +
                ", surName='" + surName + '\'' +
                ", position='" + position + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", birth=" + birth +
                '}';
    }
}
