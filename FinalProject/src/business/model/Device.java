/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author pu
 */
public class Device {

    private Product product;
    private Category category;
    private int deviceId;
    private String operationalStatus;
    private int maxUsabilityCount;
    private int maxUsabilityCountRemaining;
    private String currentLocation;
    private Date purchasedDate;
    private String serviceRequirementDescription;
    private String devicePositionInWareHouse;
    private Date expirationDate;
    private static int count = 1;
    private Date nextExpectedMaintenanceDate;
    private Date lastMaintenanceDate;
    private Map<String, ArrayList<String>> problemsAndFixes;
    private boolean isMaintenanceRequired;
    private int availability;

    public Device() {
        deviceId = count++;
        problemsAndFixes = new HashMap<>();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getOperationalStatus() {
        return operationalStatus;
    }

    public void setOperationalStatus(String operationalStatus) {
        this.operationalStatus = operationalStatus;
    }

    public int getMaxUsabilityCount() {
        return maxUsabilityCount;
    }

    public void setMaxUsabilityCount(int maxUsabilityCount) {
        this.maxUsabilityCount = maxUsabilityCount;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Date getPurchasedDate() {
        return purchasedDate;
    }

    public void setPurchasedDate(Date purchasedDate) {
        this.purchasedDate = purchasedDate;
    }

    public String getServiceRequirementDescription() {
        return serviceRequirementDescription;
    }

    public void setServiceRequirementDescription(String serviceRequirementDescription) {
        this.serviceRequirementDescription = serviceRequirementDescription;
    }

    public String getDevicePositionInWareHouse() {
        return devicePositionInWareHouse;
    }

    public void setDevicePositionInWareHouse(String devicePositionInWareHouse) {
        this.devicePositionInWareHouse = devicePositionInWareHouse;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Map<String, ArrayList<String>> getProblemsAndFixes() {
        return problemsAndFixes;
    }

    public void setProblemsAndFixes(String problems, ArrayList<String> fixes) {
        this.problemsAndFixes.put(problems,fixes);
    }  

    public boolean isIsMaintenanceRequired() {
        return isMaintenanceRequired;
    }

    public void setIsMaintenanceRequired(boolean isMaintenanceRequired) {
        this.isMaintenanceRequired = isMaintenanceRequired;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public int getMaxUsabilityCountRemaining() {
        return maxUsabilityCountRemaining;
    }

    public void setMaxUsabilityCountRemaining(int maxUsabilityCountRemaining) {
        this.maxUsabilityCountRemaining = maxUsabilityCountRemaining;
    }

    public Date getNextMaintenanceDate() {
        return nextExpectedMaintenanceDate;
    }

    public void setNextMaintenanceDate(Date nextExpectedMaintenanceDate) {
        this.nextExpectedMaintenanceDate = nextExpectedMaintenanceDate;
    }

    public Date getLastMaintenanceDate() {
        return lastMaintenanceDate;
    }

    public void setLastMaintenanceDate(Date lastMaintenanceDate) {
        this.lastMaintenanceDate = lastMaintenanceDate;
    }   

    @Override
    public String toString() {
        return product.getName(); //To change body of generated methods, choose Tools | Templates.
    }

}
