package _06_DefiningClasses.company_roster;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private List<Employee> employeeList;

    public Department(String name) {
        this.name = name;
        this.employeeList = new ArrayList<>();
    }

    public int getAvgSalary() {
        // TODO
        return 0;
    }
}