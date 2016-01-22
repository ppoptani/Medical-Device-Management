/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import business.enterprise.DistributorEnterprise;
import business.organization.distributor.WarehouseManagementOrganization;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

/**
 *
 * @author pu
 */
public class ReservationCatalog {

    private ArrayList<Reservation> reservations;

    public ReservationCatalog() {
        reservations = new ArrayList<Reservation>();
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(ArrayList<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Reservation createReservation(Reservation reservation) {
        reservations.add(reservation);
        return reservation;
    }

    public void removeReservation(Reservation reservation) {
        reservations.remove(reservation);
    }

    public Reservation searchReservation(int reservationId) {

        for (Reservation reservation : reservations) {
            if (reservation.getReservationId() == reservationId) {
                return reservation;
            }
        }

        return null;
    }

    public ArrayList<Device> getAvailableDevices(DistributorEnterprise de, WarehouseManagementOrganization wmo, Category category, Date startDate, Date endDate) {
        ArrayList<Device> devices = new ArrayList<>();

        if (!de.getDevicesCatalog().getDevices().isEmpty() && !de.getCategoryCatalog().getCategories().isEmpty()) {

            for (Device device : de.getDevicesCatalog().getDevices()) {
                if (isDeviceBelongToCategory(device, category)) {
                    if (isDeviceNotInReservation(device, startDate, endDate)) {
                        if (isDeviceNotInMaintenance(wmo, device, startDate, endDate)) {
                            devices.add(device);
                        }

                    }
                }
            }
        }

        HashSet deviceHashSet = new HashSet();
        deviceHashSet.addAll(devices);
        devices.clear();
        devices.addAll(deviceHashSet);

        return devices;
    }

    public boolean isDeviceAvailableForMaintenance(DistributorEnterprise de, WarehouseManagementOrganization wmo, Device device, Category category, Date startDate, Date endDate) {

        boolean isAvailable = false;

        if (!de.getDevicesCatalog().getDevices().isEmpty() && !de.getCategoryCatalog().getCategories().isEmpty()) {

            if (isDeviceBelongToCategory(device, category)) {
                if (isDeviceNotInReservation(device, startDate, endDate)) {
                    if (isDeviceNotInMaintenance(wmo, device, startDate, endDate)) {
                        isAvailable = true;
                    }
                }
            }
        }

        return isAvailable;

    }

    public boolean isDeviceBelongToCategory(Device device, Category category) {
        return device.getCategory().equals(category);
    }

    public boolean isDeviceNotInReservation(Device device, Date startDate, Date endDate) {

        boolean isAvail = true;
        for (Reservation reservation : reservations) {
            if (reservation.getDevice().getDeviceId() == device.getDeviceId()) {
                if (((reservation.getEndTime().before(startDate)
                        || reservation.getStartTime().after(endDate)))) {
                    isAvail = true;
                } else {
                    isAvail = false;
                    break;
                }
            }
        }
        return isAvail;
    }

    public boolean isDeviceNotInMaintenance(WarehouseManagementOrganization wmo, Device device, Date startDate, Date endDate) {

        boolean isAvail = true;;
        for (DeviceMaintenance dm : wmo.getDeviceMaintenanceCatalog().getDeviceMaintenances()) {
            if (dm.getDevice().getDeviceId() == device.getDeviceId()) {
                if ((dm.getMaintenanceEndDate().before(startDate)
                        || dm.getMaintenanceStartDate().after(endDate))) {
                    isAvail = true;
                } else {
                    isAvail = false;
                    break;
                }
            }
        }
        return isAvail;
    }

    public boolean canDeviceBeRemoved(DistributorEnterprise de, WarehouseManagementOrganization wmo, Device device, Category category) {

        boolean isAvailable = false;

        if (!de.getDevicesCatalog().getDevices().isEmpty() && !de.getCategoryCatalog().getCategories().isEmpty()) {

            if (isDeviceBelongToCategory(device, category)) {
                if (isDeviceNotInReservation(device)) {
                    if (isDeviceNotInMaintenance(wmo, device)) {
                        isAvailable = true;
                    }
                }
            }
        }

        return isAvailable;

    }

    public boolean isDeviceNotInReservation(Device device) {
        Date curentDate = new Date();
        boolean isAvail = true;
        for (Reservation reservation : reservations) {
            if (reservation.getDevice().getDeviceId() == device.getDeviceId()) {
                if ((reservation.getEndTime().before(curentDate))) {
                    isAvail = true;
                } else {
                    isAvail = false;
                    break;
                }
            }
        }
        return isAvail;
    }

    public boolean isDeviceNotInMaintenance(WarehouseManagementOrganization wmo, Device device) {
        Date curentDate = new Date();
        boolean isAvail = true;;
        for (DeviceMaintenance dm : wmo.getDeviceMaintenanceCatalog().getDeviceMaintenances()) {
            if (dm.getDevice().getDeviceId() == device.getDeviceId()) {
                if (dm.getMaintenanceEndDate().before(curentDate)) {
                    isAvail = true;
                } else {
                    isAvail = false;
                    break;
                }
            }
        }
        return isAvail;
    }
}
