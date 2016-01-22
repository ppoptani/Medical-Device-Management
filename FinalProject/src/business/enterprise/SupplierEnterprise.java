/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.role.Role;
import business.role.SupplierAdminRole;
import business.model.ProductCatalog;
import java.util.ArrayList;

/**
 *
 * @author pu
 */
public class SupplierEnterprise extends Enterprise {

    private ProductCatalog productCatalog;
    private String status;

    public SupplierEnterprise(String orgName) {
        super(orgName, EnterpriseType.Supplier);
        productCatalog = new ProductCatalog();
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }   
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList<Role>();
        role.add(new SupplierAdminRole());
        return role;
    }

}
