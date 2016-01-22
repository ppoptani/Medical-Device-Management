/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workarea;

import business.enterprise.Enterprise;
import business.enterprise.Enterprise.EnterpriseType;
import business.network.Network;
import business.personinfo.Person;

/**
 *
 * @author pu
 */
public class NewEnterpriseWorkRequest extends WorkRequest {

    private Person person;
    private Network network;
    private EnterpriseType enterpriseType;
    private String Description;
    private String enterpriseName;

    public NewEnterpriseWorkRequest() {
        super(WorkRequest.WorkRequestType.NewEnterpriseWorkRequestType.getValue());
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    @Override
    public String toString() {
        return enterpriseName; //To change body of generated methods, choose Tools | Templates.
    }

}
