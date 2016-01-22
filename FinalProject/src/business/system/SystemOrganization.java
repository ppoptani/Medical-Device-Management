/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.system;

import business.network.Network;
import business.organization.Organization;
import business.role.Role;
import business.role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author pu
 */
public class SystemOrganization extends Organization {

    private Network network;

    public SystemOrganization(String organizationName, String networkName) {
        super(organizationName, "System");
        this.network = new Network(networkName);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles;
        roles = new ArrayList<>();
        roles.add(new SystemAdminRole());
        return roles;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

}
