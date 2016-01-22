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

/**
 *
 * @author pu
 */
public abstract class Role {

    private String roleType;

    public Role(String roletype) {
        this.roleType = roletype;
    }

    public enum RoleType {

        SystemAdmin("System Administrator"),
        SupplierEnterpriseAdmin("Supplier Enterprise's Administrator"),
        DistributorEnterpriseAdmin("Distributor Enterprise Administrator"),
        HospitalEnterpriseAdmin("Hosptial Administrator"),
        InventoryStaff("Inventory Staff"),
        SchedulingStaff("Scheduling Staff"),
        Doctor("Doctor"),
        SurgeryStaff("Surgery Staff");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    @Override
    public String toString() {
        return roleType; //To change body of generated methods, choose Tools | Templates.
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Network network, Enterprise enterprise, Organization enterpriseOrganization, Business business);

}
