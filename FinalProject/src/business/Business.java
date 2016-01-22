/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.system.SystemOrganization;

/**
 *
 * @author pu
 */
public class Business {

    private static Business business;
    private SystemOrganization systemOrganization;

    public static Business getInstance() {
        if (business == null) {
            business = new Business();
        }
        return business;
    }

    public SystemOrganization getSystemOrganization() {
        return systemOrganization;
    }

    public void setSystemOrganization(SystemOrganization systemOrganization) {
        this.systemOrganization = systemOrganization;
    }
    
    public boolean isUserNamePresent(String userName) {
        for (Network network : systemOrganization.getNetwork().getNetworkDirectory().getNetworks()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterprises()) {
                //Enterprise level User Name check
                if (enterprise.getUserAccountDirectory().isUserNameExist(userName)) {
                    return true;
                }

                //Organizations inside the enterprise, UserName  check
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizations()) {
                    if (organization.getUserAccountDirectory().isUserNameExist(userName)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
     public boolean isNetworkPresent(String networkName) {
        for (Network network : systemOrganization.getNetwork().getNetworkDirectory().getNetworks()) {
            if(network.getNetworkName().equalsIgnoreCase(networkName)){
                return true;
            }                
        }
        return false;
    }

}
