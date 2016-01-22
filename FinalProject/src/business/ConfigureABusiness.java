/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.employee.Employee;
import business.enterprise.Enterprise;
import business.network.Network;
import business.role.DistributorAdminRole;
import business.role.SystemAdminRole;
import business.system.SystemOrganization;
import business.useraccount.UserAccount;

/**
 *
 * @author pu
 */
public class ConfigureABusiness {
    
    public static Business configure(){
        
        Business business = Business.getInstance();
        
        SystemOrganization systemOrganization = new SystemOrganization("PHS", "Global");
        business.setSystemOrganization(systemOrganization);
        
        //Employee
        Employee employee = systemOrganization.getEmployeeDirectory().createEmployee();
        employee.setFirstName("emp");
        employee.setLastName("emp");
        
        //user account for sysadmin
        UserAccount sysAdminUserAccount = systemOrganization.getUserAccountDirectory().createUserAccount();
        sysAdminUserAccount.setEmployee(employee);
        sysAdminUserAccount.setUserName("sysadmin");
        sysAdminUserAccount.setPassword("sysadmin");
        sysAdminUserAccount.setRole(new SystemAdminRole());
        
        
        Network india = systemOrganization.getNetwork().getNetworkDirectory().addNetwork("India");
       
        //global
        Network globalNetwork = systemOrganization.getNetwork();
        Enterprise global = globalNetwork.getEnterpriseDirectory().createEnterprise("PHS Distributor", Enterprise.EnterpriseType.Distributor);
            Employee employee1 = global.getEmployeeDirectory().createEmployee();
            UserAccount distributor = global.getUserAccountDirectory().createUserAccount();
            distributor.setEmployee(employee1);
            distributor.setUserName("dist");
            distributor.setPassword("dist");
            distributor.setRole(new DistributorAdminRole());
            
        
        
        
        return business;
    }
    
}
