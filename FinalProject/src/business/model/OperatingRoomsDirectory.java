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
public class OperatingRoomsDirectory {

    private ArrayList<OperationalRooms> operationalRoomses;

    public OperatingRoomsDirectory() {
        operationalRoomses = new ArrayList<OperationalRooms>();
    }

    public ArrayList<OperationalRooms> getOperationalRoomses() {
        return operationalRoomses;
    }

    public void setOperationalRoomses(ArrayList<OperationalRooms> operationalRoomses) {
        this.operationalRoomses = operationalRoomses;
    }

    public OperationalRooms addOperationalRooms() {
        OperationalRooms operationalRooms = new OperationalRooms();
        operationalRoomses.add(operationalRooms);
        return operationalRooms;
    }

    public void removeOperationalRooms(OperationalRooms operationalRooms) {
        operationalRoomses.remove(operationalRooms);
    }

    public OperationalRooms searchOperationalRooms(int roomNumber) {

        for (OperationalRooms operationalRooms : operationalRoomses) {
            if (operationalRooms.getRoomNumber() == roomNumber) {
                return operationalRooms;
            }
        }

        return null;
    }
    
     public boolean isUniqueOperationalNumber(int roomNumber)
    {
        boolean isUnique = true;
        
       for(OperationalRooms operationalRooms:operationalRoomses)
        {
            if(operationalRooms.getRoomNumber() == roomNumber)
            {
                isUnique =false;
                break;
            }            
        }
       return isUnique;
    }

}
