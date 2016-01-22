/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.Business;
import business.enterprise.Enterprise;
import business.enterprise.HospitalEnterprise;
import business.network.Network;
import business.organization.Organization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.hospital.DoctorWorkAreaJPanel;

/**
 *
 * @author pu
 */
public class DoctorRole extends Role{

    public DoctorRole() {
        super(RoleType.Doctor.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Network network, Enterprise enterprise, Organization enterpriseOrganization, Business business) {
        return new DoctorWorkAreaJPanel(userProcessContainer, account,(HospitalEnterprise)enterprise); //To change body of generated methods, choose Tools | Templates.
    }
    
}
