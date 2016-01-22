/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.Business;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.systemadmin.SystemAdminWorkAreaJPanel;

/**
 *
 * @author pu
 */
public class SystemAdminRole extends Role{

    public SystemAdminRole() {
        super(RoleType.SystemAdmin.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Network network, Enterprise enterprise, Organization enterpriseOrganization, Business business) {
         return new SystemAdminWorkAreaJPanel(userProcessContainer,account,network,business); //To change body of generated methods, choose Tools | Templates.
    }
    
}
