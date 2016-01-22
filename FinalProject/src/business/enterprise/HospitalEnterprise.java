/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.enterprise;

import business.model.OperatingRoomsDirectory;
import business.model.OperationalRooms;
import business.model.Surgery;
import business.model.SurgeryDirectory;
import business.model.SurgeryTeam;
import business.model.SurgeryTeamDirectory;
import business.model.SurgeryTypeCatalog;
import business.role.HospitalAdminRole;
import business.role.Role;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

/**
 *
 * @author pu
 */
public class HospitalEnterprise extends Enterprise {

    private OperatingRoomsDirectory operatingRoomsDirectory;
    private SurgeryTeamDirectory surgeryTeamDirectory;
    private SurgeryDirectory surgeryDirectory;
    private SurgeryTypeCatalog surgeryTypeCatalog;

    public HospitalEnterprise(String orgName) {
        super(orgName, EnterpriseType.Hospital);
        this.operatingRoomsDirectory = new OperatingRoomsDirectory();
        this.surgeryDirectory = new SurgeryDirectory();
        this.surgeryTeamDirectory = new SurgeryTeamDirectory();
        this.surgeryTypeCatalog = new SurgeryTypeCatalog();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList<Role>();
        role.add(new HospitalAdminRole());
        return role; //To change body of generated methods, choose Tools | Templates.
    }

    public OperatingRoomsDirectory getOperatingRoomsDirectory() {
        return operatingRoomsDirectory;
    }

    public void setOperatingRoomsDirectory(OperatingRoomsDirectory operatingRoomsDirectory) {
        this.operatingRoomsDirectory = operatingRoomsDirectory;
    }

    public SurgeryTeamDirectory getSurgeryTeamDirectory() {
        return surgeryTeamDirectory;
    }

    public void setSurgeryTeamDirectory(SurgeryTeamDirectory surgeryTeamDirectory) {
        this.surgeryTeamDirectory = surgeryTeamDirectory;
    }

    public SurgeryDirectory getSurgeryDirectory() {
        return surgeryDirectory;
    }

    public void setSurgeryDirectory(SurgeryDirectory surgeryDirectory) {
        this.surgeryDirectory = surgeryDirectory;
    }

    public SurgeryTypeCatalog getSurgeryTypeCatalog() {
        return surgeryTypeCatalog;
    }

    public void setSurgeryTypeCatalog(SurgeryTypeCatalog surgeryTypeCatalog) {
        this.surgeryTypeCatalog = surgeryTypeCatalog;
    }

    public ArrayList<OperationalRooms> getAvailableOperationalRooms(Date startDate, Date endDate) {
        ArrayList<OperationalRooms> roomses = new ArrayList<>();
        for (OperationalRooms operationalRooms : operatingRoomsDirectory.getOperationalRoomses()) {
            if (isOperationalRoomsPresent(operationalRooms)) {
                boolean flag = false;
                for (Surgery surgery : surgeryDirectory.getSurgerys()) {
                    if (surgery.getOperatingRoom().equals(operationalRooms)) {
                        if ((surgery.getSurgeryEndDate().before(startDate)
                                || surgery.getSurgeryStartDate().after(endDate))) {
                            flag = true;
                        } else {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag == true) {
                    roomses.add(operationalRooms);
                }
            } else {
                roomses.add(operationalRooms);
            }
        }

        HashSet roomsesHashSet = new HashSet();
        roomsesHashSet.addAll(roomses);
        roomses.clear();
        roomses.addAll(roomsesHashSet);

        return roomses;
    }

    public boolean isOperationalRoomsPresent(OperationalRooms operationalRooms) {

        for (Surgery surgery : surgeryDirectory.getSurgerys()) {
            if (surgery.getOperatingRoom().equals(operationalRooms)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<SurgeryTeam> getAvailableSurgeryTeam(String type, Date startDate, Date endDate) {
        ArrayList<SurgeryTeam> surgeryTeams = new ArrayList<>();

        for (SurgeryTeam surgeryTeam : surgeryTeamDirectory.getSurgeryTeams()) {
            if (isTeamBelongToCategory(type, surgeryTeam)) {
                if (isOperationalTeamPresent(surgeryTeam)) {
                    boolean flag = false;

                    for (Surgery surgery : surgeryDirectory.getSurgerys()) {
                        if (surgery.getSurgeryTeam().getSurgeryTeamId() == surgeryTeam.getSurgeryTeamId()) {
                            if ((surgery.getSurgeryEndDate().before(startDate)
                                    || surgery.getSurgeryStartDate().after(endDate))) {
                                flag = true;
                            } else {
                                flag = false;
                                break;
                            }
                        }
                    }
                    if (flag == true) {
                        surgeryTeams.add(surgeryTeam);
                    }
                } else {
                    surgeryTeams.add(surgeryTeam);
                }
            }
        }

        HashSet surgeryTeamsHashSet = new HashSet();
        surgeryTeamsHashSet.addAll(surgeryTeams);
        surgeryTeams.clear();
        surgeryTeams.addAll(surgeryTeamsHashSet);

        return surgeryTeams;
    }

    public boolean isTeamBelongToCategory(String type, SurgeryTeam surgeryTeam) {
        return type.equals(surgeryTeam.getSurgeryTeamType());
    }

    public boolean isOperationalTeamPresent(SurgeryTeam surgeryTeam) {

        for (Surgery surgery : surgeryDirectory.getSurgerys()) {
            if (surgery.getSurgeryTeam().equals(surgeryTeam)) {
                return true;
            }
        }
        return false;
    }

    public boolean canRemoveOperationalRooms(OperationalRooms operationalRooms) {

        Date currentDate = new Date();
        if (isOperationalRoomsPresent(operationalRooms)) {
            for (Surgery surgery : surgeryDirectory.getSurgerys()) {
                if (surgery.getOperatingRoom().equals(operationalRooms)) {
                    if (!(surgery.getSurgeryEndDate().before(currentDate))) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public boolean canRemoveUpdateOperationalTeam(SurgeryTeam surgeryTeam) {

        Date currentDate = new Date();
        if (isOperationalTeamPresent(surgeryTeam)) {
            for (Surgery surgery : surgeryDirectory.getSurgerys()) {
                if (surgery.getSurgeryTeam().getSurgeryTeamId() == surgeryTeam.getSurgeryTeamId()) {
                    if (!(surgery.getSurgeryEndDate().before(currentDate))) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
