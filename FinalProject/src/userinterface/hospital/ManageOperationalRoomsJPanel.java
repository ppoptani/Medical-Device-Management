/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.hospital;

import business.enterprise.HospitalEnterprise;
import business.model.OperationalRooms;
import business.utility.EnumTypes;
import business.utility.ValidatingFields;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pu
 */
public class ManageOperationalRoomsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOperationalRoomsJPanel
     */
    private JPanel userProcessContainer;
    private HospitalEnterprise enterprise;

    public ManageOperationalRoomsJPanel(JPanel userProcessContainer, HospitalEnterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        populateTable();
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) operationalRoomsJTable.getModel();
        dtm.setRowCount(0);
        for (OperationalRooms operationalRooms : enterprise.getOperatingRoomsDirectory().getOperationalRoomses()) {

            Object[] rows = new Object[2];
            rows[0] = operationalRooms;
            rows[1] = operationalRooms.getRoomNumber();

            dtm.addRow(rows);
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

        jLabel4 = new javax.swing.JLabel();
        addRoomJPanel = new javax.swing.JPanel();
        roomNumberJLabel = new javax.swing.JLabel();
        roomTypeJTextField = new javax.swing.JTextField();
        createJButton = new javax.swing.JButton();
        operationalRoomJLabel = new javax.swing.JLabel();
        roomNumberJTextField = new javax.swing.JTextField();
        errorOperatingTypeJLabel = new javax.swing.JLabel();
        errorRoomNumberJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        operationalRoomsJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        removeRoomJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Operational Rooms:");

        addRoomJPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addRoomJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roomNumberJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        roomNumberJLabel.setText("Room Number:");
        roomNumberJLabel.setEnabled(false);
        addRoomJPanel.add(roomNumberJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 112, 25));

        roomTypeJTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        roomTypeJTextField.setEnabled(false);
        addRoomJPanel.add(roomTypeJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 232, 30));

        createJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        createJButton.setText("Create");
        createJButton.setEnabled(false);
        createJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJButtonActionPerformed(evt);
            }
        });
        addRoomJPanel.add(createJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 104, -1));

        operationalRoomJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        operationalRoomJLabel.setText("Operational Room type:");
        operationalRoomJLabel.setEnabled(false);
        addRoomJPanel.add(operationalRoomJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 112, 25));

        roomNumberJTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        roomNumberJTextField.setEnabled(false);
        addRoomJPanel.add(roomNumberJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 232, 30));

        errorOperatingTypeJLabel.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        errorOperatingTypeJLabel.setForeground(new java.awt.Color(204, 0, 0));
        errorOperatingTypeJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addRoomJPanel.add(errorOperatingTypeJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 170, 30));

        errorRoomNumberJLabel.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        errorRoomNumberJLabel.setForeground(new java.awt.Color(204, 0, 0));
        errorRoomNumberJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addRoomJPanel.add(errorRoomNumberJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 170, 30));

        operationalRoomsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Operational room Type", "Room Number"
            }
        ));
        jScrollPane1.setViewportView(operationalRoomsJTable);

        addJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        addJButton.setText("Add New Room");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        removeRoomJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        removeRoomJButton.setText("Remove Room");
        removeRoomJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeRoomJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Operational rooms");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(158, 158, 158)
                                .addComponent(removeRoomJButton)
                                .addGap(146, 146, 146)
                                .addComponent(addJButton))
                            .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(addRoomJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeRoomJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addRoomJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(245, 245, 245))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJButtonActionPerformed
        // TODO add your handling code here:
        if (isValidFieldsValue()) {
            int roomNumber = Integer.parseInt(roomNumberJTextField.getText());
            OperationalRooms operationalRooms = enterprise.getOperatingRoomsDirectory().addOperationalRooms();
            operationalRooms.setRoomNumber(roomNumber);
            operationalRooms.setRoomType(roomTypeJTextField.getText());
            operationalRooms.setStatus(EnumTypes.RoomStatusType.Available.getValue());
            addRoomJPanelAction(false);
            clearFields();
            populateTable();

        }
    }//GEN-LAST:event_createJButtonActionPerformed

    public boolean isValidFieldsValue() {
        boolean isValid = true;

        if (ValidatingFields.isStringTextFieldValid(roomTypeJTextField)) {
            errorOperatingTypeJLabel.setText("Enter valid values.");
            isValid = false;
        } else {
            errorOperatingTypeJLabel.setText("");
        }

        if (ValidatingFields.isNumberTextFieldValid(roomNumberJTextField)) {
            errorRoomNumberJLabel.setText("Enter valid values.");
            isValid = false;
        } else {
            int roomNumber = Integer.parseInt(roomNumberJTextField.getText());
            if (!enterprise.getOperatingRoomsDirectory().isUniqueOperationalNumber(roomNumber)) {
                isValid = false;
                errorRoomNumberJLabel.setText("Room Number already exist");
            } else {
                errorRoomNumberJLabel.setText("");
            }
        }

        return isValid;
    }

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        // TODO add your handling code here:        
        addRoomJPanelAction(true);
        clearFields();
        populateTable();
    }//GEN-LAST:event_addJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void removeRoomJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeRoomJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = operationalRoomsJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the operational room to be deleted.");
            return;
        }

        OperationalRooms operationalRooms = (OperationalRooms) operationalRoomsJTable.getValueAt(selectedRow, 0);
        if (enterprise.canRemoveOperationalRooms(operationalRooms)) {
            enterprise.getOperatingRoomsDirectory().removeOperationalRooms(operationalRooms);
            JOptionPane.showMessageDialog(null, "Room removed successfully!!");
            populateTable();
        }else{
            JOptionPane.showMessageDialog(null, "Room cannot be removed booked for surgery.");
        }
    }//GEN-LAST:event_removeRoomJButtonActionPerformed

    private void addRoomJPanelAction(boolean flag) {
        roomNumberJLabel.setEnabled(flag);
        roomNumberJTextField.setEnabled(flag);
        roomTypeJTextField.setEnabled(flag);
        operationalRoomJLabel.setEnabled(flag);
        createJButton.setEnabled(flag);
    }

    private void clearFields() {
        roomTypeJTextField.setText("");
        roomNumberJTextField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JPanel addRoomJPanel;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createJButton;
    private javax.swing.JLabel errorOperatingTypeJLabel;
    private javax.swing.JLabel errorRoomNumberJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel operationalRoomJLabel;
    private javax.swing.JTable operationalRoomsJTable;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton removeRoomJButton;
    private javax.swing.JLabel roomNumberJLabel;
    private javax.swing.JTextField roomNumberJTextField;
    private javax.swing.JTextField roomTypeJTextField;
    // End of variables declaration//GEN-END:variables
}
