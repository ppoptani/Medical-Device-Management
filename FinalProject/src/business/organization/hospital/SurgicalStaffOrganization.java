/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization.hospital;

import business.organization.Organization;
import business.role.Role;
import business.role.SurgeryStaffRole;
import java.util.ArrayList;

/**
 *
 * @author pu
 */
public class SurgicalStaffOrganization extends Organization{

    public SurgicalStaffOrganization(String organizationName, String organizationType) {
        super(organizationName, organizationType);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
          ArrayList<Role> role = new ArrayList<Role>();
        role.add(new SurgeryStaffRole());
        return role; //To change body of generated methods, choose Tools | Templates.
    }
    
}
