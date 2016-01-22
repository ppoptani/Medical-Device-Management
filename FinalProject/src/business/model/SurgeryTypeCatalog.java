/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import java.util.ArrayList;

/**
 *
 * @author pu
 */
public class SurgeryTypeCatalog {

    private ArrayList<SurgeryType> surgeryTypes;

    public SurgeryTypeCatalog() {
        surgeryTypes = new ArrayList<SurgeryType>();
    }

    public ArrayList<SurgeryType> getSurgeryTypes() {
        return surgeryTypes;
    }

    public void setSurgeryTypes(ArrayList<SurgeryType> surgeryTypes) {
        this.surgeryTypes = surgeryTypes;
    }

    public SurgeryType createSurgeryType() {
        SurgeryType surgeryType = new SurgeryType();
        surgeryTypes.add(surgeryType);
        return surgeryType;
    }

    public void removeSurgeryType(SurgeryType surgeryType) {
        surgeryTypes.remove(surgeryType);
    }

    public boolean isUniqueCategoryName(String typeName) {
        boolean isUnique = true;

        for (SurgeryType surgeryType : surgeryTypes) {
            if (surgeryType.getTypeName().equalsIgnoreCase(typeName)) {
                isUnique = false;
                break;
            }
        }
        return isUnique;
    }

}
