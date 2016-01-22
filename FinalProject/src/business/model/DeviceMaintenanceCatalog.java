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
public class DeviceMaintenanceCatalog {

    private ArrayList<DeviceMaintenance> deviceMaintenances;

    public DeviceMaintenanceCatalog() {
        deviceMaintenances = new ArrayList<DeviceMaintenance>();
    }

    public ArrayList<DeviceMaintenance> getDeviceMaintenances() {
        return deviceMaintenances;
    }

    public void setDeviceMaintenances(ArrayList<DeviceMaintenance> deviceMaintenances) {
        this.deviceMaintenances = deviceMaintenances;
    }

    public DeviceMaintenance createDeviceMaintenance() {
        DeviceMaintenance deviceMaintenance = new DeviceMaintenance();
        deviceMaintenances.add(deviceMaintenance);
        return deviceMaintenance;
    }

    public void removeDeviceMaintenance(DeviceMaintenance deviceMaintenance) {
        deviceMaintenances.remove(deviceMaintenance);
    }

}
