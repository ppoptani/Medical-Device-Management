/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.employee;

import business.personinfo.Person;

/**
 *
 * @author pu
 */
public class Employee extends Person {

    private static int employeeCount = 1;
    private int employeeId;
    private String employeeType;
    private int teamId;

    public Employee() {
        employeeCount++;
        employeeId = employeeCount;
        teamId = 0;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    @Override
    public String toString() {
        return this.getFirstName(); //To change body of generated methods, choose Tools | Templates.
    }

}
