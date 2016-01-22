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
public class DevicesCatalog {

    private ArrayList<Device> devices;

    public DevicesCatalog() {
        devices = new ArrayList<Device>();
    }

    public ArrayList<Device> getDevices() {
        return devices;
    }

    public void setDevices(ArrayList<Device> devices) {
        this.devices = devices;
    }

    public Device addDevice() {
        Device device = new Device();
        devices.add(device);
        return device;
    }

    public void removeDevice(Device device) {
        devices.remove(device);
    }

    public Device searchDevice(int deviceId) {

        for (Device device : devices) {
            if (device.getDeviceId() == deviceId) {
                return device;
            }
        }
        return null;
    }
    
    public ArrayList<Device> getDeviceOnBaisOfCategory(Category category) {

        ArrayList<Device> arrayList = new ArrayList<>();
        
        for(Device device: devices){
            if(device.getCategory().equals(category)){
                arrayList.add(device);
            }            
        }
        
        return arrayList;
    }

}
