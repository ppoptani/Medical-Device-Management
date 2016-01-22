/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.employee.EmployeeDirectory;
import business.role.Role;
import business.useraccount.UserAccountDirectory;
import business.workarea.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author pu
 */
public abstract class Organization {

    private static int orgCounter;
    private String organizationName;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private String organizationType;
    private int organizationId;

    public Organization(String organizationName, String organizationType) {
        this.organizationName = organizationName;
        this.organizationId = orgCounter++;
        this.organizationName = organizationName;
        this.organizationType = organizationType;
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        workQueue = new WorkQueue();
    }

    public enum OrganizationType {

        Enterprise("Enterprise"),
        //organization of hospital
        Doctor("Doctor Organization"),
        Expertises("Surgery Expertise Organization"),
        Assistent("Hospital Staff Organization"),
        //organization of supplier

        //organization of distributor system

        WarehouseManagement("Warehouse Management Organization"),
        DistributorAdmin("Distributor Admin Organization"),
        ReservationManagement("Reservation Management Organization");

        private String value;

        private OrganizationType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }

    }

    public abstract ArrayList<Role> getSupportedRole();

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    @Override
    public String toString() {
        return organizationName; //To change body of generated methods, choose Tools | Templates.
    }

}
