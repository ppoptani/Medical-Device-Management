/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.organization.Organization;
import business.organization.OrganizationDirectory;
import business.personinfo.Contact;

/**
 *
 * @author pu
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private Contact contact;

    public Enterprise(String orgName, EnterpriseType enterpriseType) {
        super(orgName, Organization.OrganizationType.Enterprise.getValue());
        this.enterpriseType = enterpriseType;
        this.organizationDirectory = new OrganizationDirectory();
        this.contact = new Contact();
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public enum EnterpriseType {

        Hospital("Hospital"),
        Distributor("Distributor"),
        Supplier("Supplier");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }

    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

}
