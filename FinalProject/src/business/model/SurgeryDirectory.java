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
public class SurgeryDirectory {

    private ArrayList<Surgery> surgerys;

    public SurgeryDirectory() {
        surgerys = new ArrayList<Surgery>();
    }

    public ArrayList<Surgery> getSurgerys() {
        return surgerys;
    }

    public void setSurgerys(ArrayList<Surgery> surgerys) {
        this.surgerys = surgerys;
    }

    public Surgery createSurgery() {
        Surgery surgery = new Surgery();
        surgerys.add(surgery);
        return surgery;
    }

    public void removeSurgery(Surgery surgery) {
        surgerys.remove(surgery);
    }

    public Surgery searchSurgery(int surgeryId) {

        for (Surgery surgery : surgerys) {
            if (surgery.getSurgeryId() == surgeryId) {
                return surgery;
            }
        }

        return null;
    }

}
