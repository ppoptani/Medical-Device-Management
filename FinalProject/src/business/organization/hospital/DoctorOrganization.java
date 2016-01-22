/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization.hospital;

import business.organization.Organization;
import business.role.DoctorRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author pu
 */
public class DoctorOrganization extends Organization{

    public DoctorOrganization(String organizationName, String organizationType) {
        super(organizationName, organizationType);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
          ArrayList<Role> role = new ArrayList<Role>();
        role.add(new DoctorRole());
        return role;//To change body of generated methods, choose Tools | Templates.
    }
    
}
