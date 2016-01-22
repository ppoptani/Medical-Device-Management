/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.Business;
import business.enterprise.DistributorEnterprise;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.organization.distributor.WarehouseManagementOrganization;
import business.useraccount.UserAccount;
import javax.swing.JPanel;
import userinterface.warehouse.WareHouseWorkAreaJPanel;

/**
 *
 * @author pu
 */
public class InventoryStaffRole extends Role{

    public InventoryStaffRole() {
        super(RoleType.InventoryStaff.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Network network, Enterprise enterprise, Organization enterpriseOrganization, Business business) {
        return new WareHouseWorkAreaJPanel(userProcessContainer,account,network,(DistributorEnterprise) enterprise,(WarehouseManagementOrganization)enterpriseOrganization,business); //To change body of generated methods, choose Tools | Templates.
    }
    
}
