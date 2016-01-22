/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import business.employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author pu
 */
public class SurgeryTeam {

    private static int count = 1;
    private ArrayList<Employee> employees;
    private String surgeryTeamType;
    private int surgeryTeamId;
    private String status;

    public SurgeryTeam() {
        surgeryTeamId = count;
        count++;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public String getSurgeryTeamType() {
        return surgeryTeamType;
    }

    public void setSurgeryTeamType(String surgeryTeamType) {
        this.surgeryTeamType = surgeryTeamType;
    }

    public int getSurgeryTeamId() {
        return surgeryTeamId;
    }

    public void setSurgeryTeamId(int surgeryTeamId) {
        this.surgeryTeamId = surgeryTeamId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return surgeryTeamType; //To change body of generated methods, choose Tools | Templates.
    }

}
