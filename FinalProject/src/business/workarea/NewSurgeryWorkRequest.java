/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workarea;

import business.model.Surgery;

/**
 *
 * @author pu
 */
public class NewSurgeryWorkRequest extends WorkRequest {

    private Surgery surgery;

    public NewSurgeryWorkRequest() {
        super(WorkRequest.WorkRequestType.NewSurgeryWorkRequest.getValue());
        surgery = new Surgery();
    }

    public Surgery getSurgery() {
        return surgery;
    }

    public void setSurgery(Surgery surgery) {
        this.surgery = surgery;
    }

}
