package seminar1.seminarDj.task2.swing.task4.task4DZ;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStorage {
    public List<Employee> getEmployee(){
        List<Employee> storage = new ArrayList<>();
        storage.add(new Employee(1L,"8-928-000-00-01","Djon",11));
        storage.add(new Employee(2L,"8-928-000-00-02","Nick",10));
        storage.add(new Employee(3L,"8-928-000-00-03","Ivan",15));
        storage.add(new Employee(4L,"8-928-000-00-04","Dima",9));
        storage.add(new Employee(5L,"8-928-000-00-05","Oly",8));

        return storage;
    }
}
