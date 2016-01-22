/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.warehouse;

import business.enterprise.DistributorEnterprise;
import business.model.Category;
import business.model.Device;
import business.network.Network;
import business.organization.distributor.WarehouseManagementOrganization;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pu
 */
public class ManageDevicesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagedevicesJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private DistributorEnterprise enterprise;
    private WarehouseManagementOrganization organization;
    private Network network;

    public ManageDevicesJPanel(JPanel userProcessContainer, UserAccount userAccount, Network network, DistributorEnterprise enterprise, WarehouseManagementOrganization organization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.organization = organization;
        this.network = network;
        populateCategoryComboBox();
    }

    public void populateCategoryComboBox() {
        categoryJComboBox.removeAllItems();

        for (Category category : enterprise.getCategoryCatalog().getCategories()) {
            categoryJComboBox.addItem(category);
        }
    }

    private void populateTable(Category category) {
        DefaultTableModel model = (DefaultTableModel) devicesJTable.getModel();

        model.setRowCount(0);

        for (Device device : enterprise.getDevicesCatalog().getDevices()) {
            if (device.getCategory().equals(category)) {
                Object[] row = new Object[5];
                row[0] = device;
                row[1] = device.getCurrentLocation();
                row[2] = device.getDevicePositionInWareHouse();
                row[3] = device.getOperationalStatus();
                row[4] = device.getExpirationDate();
                model.addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        maintainDeviceJButton = new javax.swing.JButton();
        addJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        categoryJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        devicesJTable = new javax.swing.JTable();
        viewJButton = new javax.swing.JButton();
        removeJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        maintainDeviceJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        maintainDeviceJButton.setText("Maintain Device");
        maintainDeviceJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintainDeviceJButtonActionPerformed(evt);
            }
        });

        addJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        addJButton.setText("Add Device");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        categoryJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        categoryJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryJComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel4.setText("Select Category:");

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Devices");

        devicesJTable.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        devicesJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Current location", "Position in ware house", "Operational Status", "Expiration date"
            }
        ));
        jScrollPane1.setViewportView(devicesJTable);

        viewJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        viewJButton.setText("View Device");
        viewJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewJButtonActionPerformed(evt);
            }
        });

        removeJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        removeJButton.setText("Remove Device");
        removeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(categoryJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(195, 195, 195))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addJButton)
                            .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refreshJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(maintainDeviceJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maintainDeviceJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void maintainDeviceJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintainDeviceJButtonActionPerformed
        // TODO add your handling code here:
        //MaintainDeviceJPanel maintainDeviceJPanel = new MaintainDeviceJPanel(userProcessContainer, userAccount, enterprise, network, organization);
        //userProcessContainer.add("MaintainDeviceJPanel", maintainDeviceJPanel);
        //((CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);
        if (devicesJTable.getSelectedRowCount() > 0) {

            Device device = (Device) devicesJTable.getValueAt(devicesJTable.getSelectedRow(), 0);
            //device.setMaintenanceEndPeriod(new Date(device.getMaintenanceStartPeriod().getTime() + (1000 * 60 * 60 * 24)));
            PerformMaintenanceJPanel performMaintenanceJPanel = new PerformMaintenanceJPanel(userProcessContainer, device, enterprise, network, organization);
            userProcessContainer.add("ViewDevicesJPanel", performMaintenanceJPanel);
            ((CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(null, "please select device first.");
        }

    }//GEN-LAST:event_maintainDeviceJButtonActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        // TODO add your handling code here:       
        AddDevicesJPanel addDevicesJPanel = new AddDevicesJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("AddDevicesJPanel", addDevicesJPanel);
        ((CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void categoryJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryJComboBoxActionPerformed
        // TODO add your handling code here:
        refreshTable();
    }//GEN-LAST:event_categoryJComboBoxActionPerformed

    private void viewJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewJButtonActionPerformed
        // TODO add your handling code here:
        if (devicesJTable.getSelectedRowCount() > 0) {

            Device device = (Device) devicesJTable.getValueAt(devicesJTable.getSelectedRow(), 0);
            ViewDevicesJPanel viewDevicesJPanel = new ViewDevicesJPanel(userProcessContainer, device);
            userProcessContainer.add("ViewDevicesJPanel", viewDevicesJPanel);
            ((CardLayout) userProcessContainer.getLayout()).next(userProcessContainer);

        } else {
            JOptionPane.showMessageDialog(null, "Select device to be view.");
        }

    }//GEN-LAST:event_viewJButtonActionPerformed

    private void removeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeJButtonActionPerformed
        // TODO add your handling code here:
        if (devicesJTable.getSelectedRowCount() > 0) {
            Device device = (Device) devicesJTable.getValueAt(devicesJTable.getSelectedRow(), 0);
            enterprise.getDevicesCatalog().removeDevice(device);
            JOptionPane.showMessageDialog(null, "Device removed successfully");
            refreshTable();
        } else {
            JOptionPane.showMessageDialog(null, "Select device to be Remove.");
        }

    }//GEN-LAST:event_removeJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        // TODO add your handling code here:
        refreshTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void refreshTable() {
        if (categoryJComboBox.getSelectedIndex() != -1) {
            Category c = (Category) categoryJComboBox.getSelectedItem();
            populateTable(c);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox categoryJComboBox;
    private javax.swing.JTable devicesJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton maintainDeviceJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton removeJButton;
    private javax.swing.JButton viewJButton;
    // End of variables declaration//GEN-END:variables
}