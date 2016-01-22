/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.order.MasterOrderCatalog;
import business.role.DistributorAdminRole;
import business.role.Role;
import business.model.CategoryCatalog;
import business.model.DevicesCatalog;
import java.util.ArrayList;

/**
 *
 * @author pu
 */
public class DistributorEnterprise extends Enterprise {

    private CategoryCatalog categoryCatalog;
    private MasterOrderCatalog catalog;
    private DevicesCatalog devicesCatalog;               

    public DistributorEnterprise(String orgName) {
        super(orgName, EnterpriseType.Distributor);
        categoryCatalog = new CategoryCatalog();
        catalog = new MasterOrderCatalog();
        devicesCatalog = new DevicesCatalog();
    }

    public CategoryCatalog getCategoryCatalog() {
        return categoryCatalog;
    }

    public void setCategoryCatalog(CategoryCatalog categoryCatalog) {
        this.categoryCatalog = categoryCatalog;
    }

    public MasterOrderCatalog getCatalog() {
        return catalog;
    }

    public void setCatalog(MasterOrderCatalog catalog) {
        this.catalog = catalog;
    }

    public DevicesCatalog getDevicesCatalog() {
        return devicesCatalog;
    }

    public void setDevicesCatalog(DevicesCatalog devicesCatalog) {
        this.devicesCatalog = devicesCatalog;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList<Role>();
        role.add(new DistributorAdminRole());
        return role;//To change body of generated methods, choose Tools | Templates.
    }

}
