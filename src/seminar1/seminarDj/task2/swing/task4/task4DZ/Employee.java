package seminar1.seminarDj.task2.swing.task4.task4DZ;

public class Employee {
    private Long id;
    private String phone;
    private String name;
    private Integer experience; // Стаж

    public Employee(Long id, String phone, String name, Integer experience) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return String.format("Employee {id=%s, phone=%s, name=%s, experience=%s"
                ,id,phone,name,experience+"\n");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }
}
