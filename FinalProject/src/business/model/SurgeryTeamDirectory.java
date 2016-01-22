/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import business.employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author pu
 */
public class SurgeryTeamDirectory {

    private ArrayList<SurgeryTeam> surgeryTeams;

    public SurgeryTeamDirectory() {
        surgeryTeams = new ArrayList<SurgeryTeam>();
    }

    public ArrayList<SurgeryTeam> getSurgeryTeams() {
        return surgeryTeams;
    }

    public void setSurgeryTeams(ArrayList<SurgeryTeam> surgeryTeams) {
        this.surgeryTeams = surgeryTeams;
    }

    public SurgeryTeam addSurgeryTeam() {
        SurgeryTeam surgeryTeam = new SurgeryTeam();
        surgeryTeams.add(surgeryTeam);
        return surgeryTeam;
    }

    public void removeSurgeryTeam(SurgeryTeam surgeryTeam) {
        releasePersonsFromTeam(surgeryTeam.getEmployees());
        surgeryTeams.remove(surgeryTeam);
    }

    public SurgeryTeam searchSurgeryTeam(int surgeryTeamId) {

        for (SurgeryTeam surgeryTeam : surgeryTeams) {
            if (surgeryTeam.getSurgeryTeamId() == surgeryTeamId) {
                return surgeryTeam;
            }
        }

        return null;
    }

    public void releasePersonsFromTeam(ArrayList<Employee> arrayList) {
        for (Employee e : arrayList) {
            e.setTeamId(0);
        }
    }

    public void removePersonsFromTeam(SurgeryTeam surgeryTeam, Employee employee) {
        surgeryTeam.getEmployees().remove(employee);
    }

}
