/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workarea;

import business.model.Reservation;

/**
 *
 * @author pu
 */
public class NewReservationWorkRequest extends WorkRequest {

    public Reservation reservation;

    public NewReservationWorkRequest() {
        super(WorkRequest.WorkRequestType.NewReservationWorkRequest.getValue());
        reservation = new Reservation();
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

}
