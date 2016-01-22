/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.employee;

import java.util.ArrayList;

/**
 *
 * @author pu
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employees;

    public EmployeeDirectory() {
        employees = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
    
    public Employee createEmployee(){
        Employee employee = new Employee();
        employees.add(employee);
        return employee;
    }
    
    public void deleteEmployee(Employee employee){
        employees.remove(employee);
    }    
    
}
