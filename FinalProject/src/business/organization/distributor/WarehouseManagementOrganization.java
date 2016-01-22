/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization.distributor;

import business.model.DeviceMaintenanceCatalog;
import business.order.MasterOrderCatalog;
import business.organization.Organization;
import business.role.InventoryStaffRole;
import business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author pu
 */
public class WarehouseManagementOrganization extends Organization {

    private MasterOrderCatalog orderCatalog;
    private DeviceMaintenanceCatalog deviceMaintenanceCatalog;

    public WarehouseManagementOrganization(String organizationName, String organizationType) {
        super(organizationName, organizationType);
        orderCatalog = new MasterOrderCatalog();
        deviceMaintenanceCatalog = new DeviceMaintenanceCatalog();
    }

    public MasterOrderCatalog getOrderCatalog() {
        return orderCatalog;
    }

    public void setOrderCatalog(MasterOrderCatalog orderCatalog) {
        this.orderCatalog = orderCatalog;
    }

    public DeviceMaintenanceCatalog getDeviceMaintenanceCatalog() {
        return deviceMaintenanceCatalog;
    }

    public void setDeviceMaintenanceCatalog(DeviceMaintenanceCatalog deviceMaintenanceCatalog) {
        this.deviceMaintenanceCatalog = deviceMaintenanceCatalog;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList<Role>();
        role.add(new InventoryStaffRole());
        return role; //To change body of generated methods, choose Tools | Templates.
    }

}
