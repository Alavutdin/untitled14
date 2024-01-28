package seminar1.seminarDj.task1.gb.task4.task;

import jdk.jfr.DataAmount;

import java.time.LocalDate;


public class Customer {
    private String FIO;
    private LocalDate dateOfBirth;
    private String phone;

    public Customer(String FIO, LocalDate dateOfBirth, String phone) {
        this.FIO = FIO;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
