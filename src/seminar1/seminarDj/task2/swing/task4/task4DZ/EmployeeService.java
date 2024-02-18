package seminar1.seminarDj.task2.swing.task4.task4DZ;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    public List<Employee>getEmployee(){
        EmployeeStorage employeeStorage=new EmployeeStorage();
        return employeeStorage.getEmployee();
    }
    public List<Employee>employeesByExperience(List<Employee>storage, Integer experience){
        List<Employee>newArrayStorage=new ArrayList<>();
        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i).getExperience()>=experience){
                newArrayStorage.add(storage.get(i));
            }
        }
        return newArrayStorage;
    }

    public String getEmployeesByPhone(List<Employee> storage, String phone) {
        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i).getPhone().equals(phone)) {
                return storage.get(i).getName().toString();
            }
        }
        return "Not Employee";
    }
    public Employee getEmployeeBiId(List<Employee> storage, Long id) {
        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i).getId().equals(id)) {
                return storage.get(i);
            }
        }
        return null;
    }
    public List<Employee> createEmployee(List<Employee> staff, Employee employee) {
        staff.add(employee);
        return staff;
    }


}
