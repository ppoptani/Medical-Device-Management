/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.network;

import business.enterprise.DistributorEnterprise;
import business.enterprise.Enterprise;
import business.enterprise.SupplierEnterprise;
import business.organization.Organization;
import business.system.SystemOrganization;
import java.util.ArrayList;

/**
 *
 * @author pu
 */
public class NetworkDirectory {

    private ArrayList<Network> networks;
    private SystemOrganization systemOrganization = business.Business.getInstance().getSystemOrganization();

    public NetworkDirectory() {
        networks = new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworks() {
        return networks;
    }

    public Network addNetwork(String networkName) {
        Network network = new Network(networkName);
        networks.add(network);
        return network;
    }

    public void deleteNetwork(Network network) {
        networks.add(network);
    }

    public ArrayList<SupplierEnterprise> getApprovedSupplier(Network network) {
        ArrayList<SupplierEnterprise> enterprises = new ArrayList<>();
        for (Enterprise e : network.getEnterpriseDirectory().getEnterprises()) {
            if (e instanceof SupplierEnterprise) {
                enterprises.add((SupplierEnterprise) e);
            }
        }
        return enterprises;
    }

    public ArrayList<DistributorEnterprise> getDistributorEnterprise(Network network) {
        ArrayList<DistributorEnterprise> enterprises = new ArrayList<>();
        for (Enterprise e : network.getEnterpriseDirectory().getEnterprises()) {
            if (e instanceof DistributorEnterprise) {
                enterprises.add((DistributorEnterprise) e);
            }
        }
        return enterprises;
    }

    public boolean checkIfUserNameIsPresent(String userName) {
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
}
