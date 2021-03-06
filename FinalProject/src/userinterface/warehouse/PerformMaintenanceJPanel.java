/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.warehouse;

import business.enterprise.DistributorEnterprise;
import business.model.Device;
import business.model.DeviceMaintenance;
import business.network.Network;
import business.organization.distributor.WarehouseManagementOrganization;
import business.utility.ValidatingFields;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author pu
 */
public class PerformMaintenanceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PerformMaintenanceJPanel
     */
    private JPanel userProcessContainer;
    private Device device;
    private DistributorEnterprise enterprise;
    private Network network;
    private WarehouseManagementOrganization organization;

    public PerformMaintenanceJPanel(JPanel userProcessContainer, Device device, DistributorEnterprise enterprise, Network network, WarehouseManagementOrganization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.device = device;
        this.enterprise = enterprise;
        this.organization = organization;
        this.network = network;
        populateFields();
    }

    public void populateFields() {
        deviceIdJTextField.setText(String.valueOf(device.getDeviceId()));
        currentLocationJTextField.setText(device.getCurrentLocation());
        usabilityCountJTextField.setText(String.valueOf(device.getMaxUsabilityCount()));
        reqDescriptionjTextArea.setText(device.getServiceRequirementDescription());
        devicePositionJTextField.setText(device.getDevicePositionInWareHouse());
        lastMaintenanceDateJFormattedTextField.setText(String.valueOf(device.getLastMaintenanceDate()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deviceIdJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reqDescriptionjTextArea = new javax.swing.JTextArea();
        usabilityCountJTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        saveJButton = new javax.swing.JButton();
        checkAvailabilityJButton = new javax.swing.JButton();
        devicePositionJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        errorServiceReqJLabel = new javax.swing.JLabel();
        currentLocationJTextField = new javax.swing.JTextField();
        errorMaintenancestartDateJLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        maintenanceEndDateJFormattedTextField = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        maintenanceStartDateJFormattedTextField = new javax.swing.JFormattedTextField();
        errorMaintenanceEndDateJLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lastMaintenanceDateJFormattedTextField = new javax.swing.JFormattedTextField();
        operationalStatusJTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        problemsJTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        fixesJTextField = new javax.swing.JTextField();
        dateFormatJLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        deviceIdJTextField.setEditable(false);
        deviceIdJTextField.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        deviceIdJTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        deviceIdJTextField.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Current Location:");

        jLabel7.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Device position in Ware House:");

        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Max Usability Count:");

        jLabel8.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("service Requirement \nDescription");

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Device Id:");

        reqDescriptionjTextArea.setColumns(20);
        reqDescriptionjTextArea.setRows(5);
        reqDescriptionjTextArea.setEnabled(false);
        jScrollPane1.setViewportView(reqDescriptionjTextArea);

        usabilityCountJTextField.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        usabilityCountJTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        usabilityCountJTextField.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Operational Status:");

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Maintain Device");

        saveJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        saveJButton.setText("Schedule Maintenance");
        saveJButton.setEnabled(false);
        saveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJButtonActionPerformed(evt);
            }
        });

        checkAvailabilityJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        checkAvailabilityJButton.setText("Check Availability");
        checkAvailabilityJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAvailabilityJButtonActionPerformed(evt);
            }
        });

        devicePositionJTextField.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        devicePositionJTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        devicePositionJTextField.setEnabled(false);

        backJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        errorServiceReqJLabel.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        errorServiceReqJLabel.setForeground(new java.awt.Color(204, 0, 0));
        errorServiceReqJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        currentLocationJTextField.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        currentLocationJTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        currentLocationJTextField.setEnabled(false);
        currentLocationJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentLocationJTextFieldActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Maintenance End Date:");

        maintenanceEndDateJFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        maintenanceEndDateJFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintenanceEndDateJFormattedTextFieldActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Maintenance Start Date:");

        maintenanceStartDateJFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabel12.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Last Maintenance Date:");

        lastMaintenanceDateJFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        lastMaintenanceDateJFormattedTextField.setEnabled(false);

        operationalStatusJTextField.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Problem:");

        problemsJTextField.setEnabled(false);

        jLabel14.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Fixes:");

        fixesJTextField.setEnabled(false);

        dateFormatJLabel.setText("(m/d/yy)");
        dateFormatJLabel.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(229, 229, 229)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(operationalStatusJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(deviceIdJTextField)
                                    .addComponent(usabilityCountJTextField))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(jLabel12)))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastMaintenanceDateJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(devicePositionJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                        .addComponent(currentLocationJTextField))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(251, 251, 251)
                                .addComponent(saveJButton)
                                .addGap(54, 54, 54)
                                .addComponent(checkAvailabilityJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fixesJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(maintenanceStartDateJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(maintenanceEndDateJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(errorMaintenanceEndDateJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(errorMaintenancestartDateJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(dateFormatJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(problemsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addComponent(errorServiceReqJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deviceIdJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentLocationJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usabilityCountJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(devicePositionJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(operationalStatusJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastMaintenanceDateJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(errorServiceReqJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(problemsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fixesJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(errorMaintenancestartDateJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateFormatJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errorMaintenanceEndDateJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maintenanceStartDateJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maintenanceEndDateJFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkAvailabilityJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJButtonActionPerformed
        // TODO add your handling code here:

        try {

            device.setDevicePositionInWareHouse(devicePositionJTextField.getText());
            device.setMaxUsabilityCount(Integer.parseInt(usabilityCountJTextField.getText()));
            device.setCurrentLocation(currentLocationJTextField.getText());
            device.setServiceRequirementDescription(reqDescriptionjTextArea.getText());
            device.setNextMaintenanceDate(new Date(maintenanceStartDateJFormattedTextField.getText()));
            DeviceMaintenance deviceMaintenance = organization.getDeviceMaintenanceCatalog().createDeviceMaintenance();
            deviceMaintenance.setDevice(device);
            deviceMaintenance.setMaintenanceEndDate(new Date(maintenanceEndDateJFormattedTextField.getText()));
            deviceMaintenance.setMaintenanceStartDate(new Date(maintenanceStartDateJFormattedTextField.getText()));

            fieldEnableDisable(false);
            JOptionPane.showMessageDialog(null, "Device updated successfully!!");

        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "Enter valid values");
        }
    }//GEN-LAST:event_saveJButtonActionPerformed

    private void checkAvailabilityJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAvailabilityJButtonActionPerformed
        // TODO add your handling code here:  
        if (isValidFieldsValue()) {
            if (areValidDate()) {
                Date startDate = new Date(maintenanceStartDateJFormattedTextField.getText());
                Date endDate = new Date(maintenanceEndDateJFormattedTextField.getText());
                if (network.getReservationCatalog().isDeviceAvailableForMaintenance(enterprise, organization, device, device.getCategory(), startDate, endDate)) {
                    saveJButton.setEnabled(true);
                } else {
                    saveJButton.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Device in use for requested Start and end date.");
                }
            }
        }
    }//GEN-LAST:event_checkAvailabilityJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void currentLocationJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentLocationJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentLocationJTextFieldActionPerformed

    private void maintenanceEndDateJFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintenanceEndDateJFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maintenanceEndDateJFormattedTextFieldActionPerformed

    private void fieldEnableDisable(boolean isEnable) {
        maintenanceEndDateJFormattedTextField.setEnabled(isEnable);
        maintenanceStartDateJFormattedTextField.setEnabled(isEnable);
        checkAvailabilityJButton.setEnabled(!isEnable);
        saveJButton.setEnabled(isEnable);
    }

    public boolean isValidFieldsValue() {
        boolean isValid = true;

        if (ValidatingFields.isStringTextFieldValid(maintenanceEndDateJFormattedTextField)) {
            errorMaintenanceEndDateJLabel.setText("Enter valid values.");
            isValid = false;
        } else {
            errorMaintenanceEndDateJLabel.setText("");
        }

        if (ValidatingFields.isStringTextFieldValid(maintenanceStartDateJFormattedTextField)) {
            errorMaintenancestartDateJLabel.setText("Enter valid values.");
            isValid = false;
        } else {
            errorMaintenancestartDateJLabel.setText("");
        }

        return isValid;
    }

    public boolean areValidDate() {
        boolean isValid = true;

        Date startDate = new Date(maintenanceStartDateJFormattedTextField.getText());
        Date endDate = new Date(maintenanceEndDateJFormattedTextField.getText());

        if (!ValidatingFields.isValidEndDateForMaintenance(startDate, endDate)) {
            errorMaintenanceEndDateJLabel.setText("End date ahead of current date.");
            isValid = false;
        } else {

            errorMaintenanceEndDateJLabel.setText("");
        }

        if (!ValidatingFields.isValidStartDateForMaintenance(startDate, endDate)) {
            errorMaintenancestartDateJLabel.setText("Start date ahead of current date");
            isValid = false;
        } else {
            errorMaintenancestartDateJLabel.setText("");
        }

        return isValid;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton checkAvailabilityJButton;
    private javax.swing.JTextField currentLocationJTextField;
    private javax.swing.JLabel dateFormatJLabel;
    private javax.swing.JTextField deviceIdJTextField;
    private javax.swing.JTextField devicePositionJTextField;
    private javax.swing.JLabel errorMaintenanceEndDateJLabel;
    private javax.swing.JLabel errorMaintenancestartDateJLabel;
    private javax.swing.JLabel errorServiceReqJLabel;
    private javax.swing.JTextField fixesJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField lastMaintenanceDateJFormattedTextField;
    private javax.swing.JFormattedTextField maintenanceEndDateJFormattedTextField;
    private javax.swing.JFormattedTextField maintenanceStartDateJFormattedTextField;
    private javax.swing.JTextField operationalStatusJTextField;
    private javax.swing.JTextField problemsJTextField;
    private javax.swing.JTextArea reqDescriptionjTextArea;
    private javax.swing.JButton saveJButton;
    private javax.swing.JTextField usabilityCountJTextField;
    // End of variables declaration//GEN-END:variables
}
