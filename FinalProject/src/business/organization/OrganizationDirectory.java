/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.organization;

import business.organization.Organization.OrganizationType;
import business.organization.distributor.ReservationManagementOrganization;
import business.organization.distributor.WarehouseManagementOrganization;
import business.organization.hospital.DoctorOrganization;
import business.organization.hospital.SurgicalStaffOrganization;
import java.util.ArrayList;

/**
 *
 * @author pu
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizations;

    public OrganizationDirectory() {
        organizations = new ArrayList<Organization>();
    }

    public ArrayList<Organization> getOrganizations() {
        return organizations;
    }

    public Organization createOrganization(String organizationName, OrganizationType organizationType) {
        Organization organization = null;

        if (organizationType.getValue().equals(OrganizationType.ReservationManagement.getValue())) {
            organization = new ReservationManagementOrganization(organizationName, organizationType.getValue());
            organizations.add(organization);
        } else if (organizationType.getValue().equals(OrganizationType.WarehouseManagement.getValue())) {
            organization = new WarehouseManagementOrganization(organizationName, organizationType.getValue());
            organizations.add(organization);
        } else if (organizationType.getValue().equals(OrganizationType.Doctor.getValue())) {
            organization = new DoctorOrganization(organizationName, organizationType.getValue());
            organizations.add(organization);
        } else if (organizationType.getValue().equals(OrganizationType.Assistent.getValue())) {
            organization = new SurgicalStaffOrganization(organizationName, organizationType.getValue());
            organizations.add(organization);
        }

        return organization;
    }
}
