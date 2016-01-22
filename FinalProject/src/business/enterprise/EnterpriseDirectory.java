/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.organization.Organization;
import java.util.ArrayList;

/**
 *
 * @author pu
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterprises;

    public EnterpriseDirectory() {
        this.enterprises = new ArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getEnterprises() {
        return enterprises;
    }

    public Enterprise createEnterprise(String enterpriseName, Enterprise.EnterpriseType enterpriseType) {
        Enterprise enterprise = null;

        //based on enterprise type, create the enterprise
        if (enterpriseType.equals(Enterprise.EnterpriseType.Distributor)) {
            enterprise = new DistributorEnterprise(enterpriseName);

        } else if (enterpriseType.equals(Enterprise.EnterpriseType.Hospital)) {
            enterprise = new HospitalEnterprise(enterpriseName);

        } else if (enterpriseType.equals(Enterprise.EnterpriseType.Supplier)) {
            enterprise = new SupplierEnterprise(enterpriseName);
        }

        enterprises.add(enterprise);

        return enterprise;
    }

    public boolean isOrganizationNamePresent(String userName) {
        for (Enterprise enterprise : enterprises) {
            //Organizations inside the enterprise, UserName  check
            if(enterprise.getOrganizationName().equals(userName)){
                return true;
            }                
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizations()) {
                if (organization.getOrganizationName().equalsIgnoreCase(userName)) {
                    return true;
                }
            }
        }
        return false;
    }

}
