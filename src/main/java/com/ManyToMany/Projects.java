package com.ManyToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Projects {
    @Id
    private int projectId;
    private String projectName;
    @ManyToMany
    private List<Employee> employee;

    public Projects(int projectId, String projectName, List<Employee> employee) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.employee = employee;
    }

    public Projects() {
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }
}
