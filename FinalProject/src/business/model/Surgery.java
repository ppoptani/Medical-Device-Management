/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import java.util.Date;

/**
 *
 * @author pu
 */
public class Surgery {

    private SurgeryTeam surgeryTeam;
    private OperationalRooms operatingRoom;
    private Device devices;
    private String surgeryType;
    private Date surgeryStartDate;
    private Date surgeryEndDate;
    private static int count = 1;
    private int surgeryId;

    public Surgery() {
        surgeryId = count;
        count++;
    }

    public SurgeryTeam getSurgeryTeam() {
        return surgeryTeam;
    }

    public void setSurgeryTeam(SurgeryTeam surgeryTeam) {
        this.surgeryTeam = surgeryTeam;
    }

    public OperationalRooms getOperatingRoom() {
        return operatingRoom;
    }

    public void setOperatingRoom(OperationalRooms operatingRoom) {
        this.operatingRoom = operatingRoom;
    }

    public Device getDevices() {
        return devices;
    }

    public void setDevices(Device devices) {
        this.devices = devices;
    }

    public String getSurgeryType() {
        return surgeryType;
    }

    public void setSurgeryType(String surgeryType) {
        this.surgeryType = surgeryType;
    }

    public Date getSurgeryStartDate() {
        return surgeryStartDate;
    }

    public void setSurgeryStartDate(Date surgeryStartDate) {
        this.surgeryStartDate = surgeryStartDate;
    }

    public Date getSurgeryEndDate() {
        return surgeryEndDate;
    }

    public void setSurgeryEndDate(Date surgeryEndDate) {
        this.surgeryEndDate = surgeryEndDate;
    }

    public int getSurgeryId() {
        return surgeryId;
    }

    public void setSurgeryId(int surgeryId) {
        this.surgeryId = surgeryId;
    }

    @Override
    public String toString() {
        return surgeryType; //To change body of generated methods, choose Tools | Templates.
    }

}
