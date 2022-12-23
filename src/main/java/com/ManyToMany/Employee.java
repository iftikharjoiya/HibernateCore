package com.ManyToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Employee {
   @Id
    private int employeeId;
    private String employeeName;
    @ManyToMany(mappedBy = "employee")
    private List<Projects> project;

    public Employee(int employeeId, String employeeName, List<Projects>  project) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.project = project;
    }

    public Employee() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public List<Projects>  getProject() {
        return project;
    }

    public void setProject(List<Projects>  project) {
        this.project = project;
    }
}
