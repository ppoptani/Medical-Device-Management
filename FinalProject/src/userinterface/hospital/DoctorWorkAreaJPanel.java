/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.hospital;

import business.model.Surgery;
import business.enterprise.HospitalEnterprise;
import business.model.SurgeryType;
import business.useraccount.UserAccount;
import business.utility.ValidatingFields;
import business.workarea.NewSurgeryWorkRequest;
import business.workarea.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pu
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private HospitalEnterprise enterprise;
    private UserAccount userAccount;

    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, HospitalEnterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        populateTable();
        populateComboBox();
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) pendingApprovalJTable.getModel();
        dtm.setRowCount(0);
        for (WorkRequest workRequest : enterprise.getWorkQueue().getWorkRequests()) {
            NewSurgeryWorkRequest surgeryWorkRequest = (NewSurgeryWorkRequest) workRequest;

            Object[] rows = new Object[3];
            rows[0] = surgeryWorkRequest;
            rows[1] = surgeryWorkRequest.getRequestDate();
            rows[2] = surgeryWorkRequest.getStatus();

            dtm.addRow(rows);

            surgeryTypeJComboBox.setSelectedItem(surgeryWorkRequest.getSurgery().getSurgeryType());
            surgeryStartDateJFormattedTextField.setText(String.valueOf(surgeryWorkRequest.getSurgery().getSurgeryStartDate()));
            surgeryEndDateJFormattedTextField.setText(String.valueOf(surgeryWorkRequest.getSurgery().getSurgeryEndDate()));
        }
    }

    private void populateComboBox() {
        surgeryTypeJComboBox.removeAllItems();

        for (SurgeryType type : enterprise.getSurgeryTypeCatalog().getSurgeryTypes()) {
            surgeryTypeJComboBox.addItem(type);
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
        approvalJPanel = new javax.swing.JPanel();
        surgeryTypeJLabel = new javax.swing.JLabel();
        requestJButton = new javax.swing.JButton();
        surgeryStartDateJLabel = new javax.swing.JLabel();
        dateFormatJLabel = new javax.swing.JLabel();
        surgeryStartDateJFormattedTextField = new javax.swing.JFormattedTextField();
        messageJLabel = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        surgeryTypeJComboBox = new javax.swing.JComboBox();
        surgeryEndDateJLabel = new javax.swing.JLabel();
        surgeryEndDateJFormattedTextField = new javax.swing.JFormattedTextField();
        errorMessageJLabel = new javax.swing.JLabel();
        errorSurgeryTypeJLabel = new javax.swing.JLabel();
        errorSurgeryStartDateJLabel = new javax.swing.JLabel();
        errorSurgeryEndDateJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pendingApprovalJTable = new javax.swing.JTable();
        placeRequestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Request Status:");

        approvalJPanel.setBackground(new java.awt.Color(255, 255, 255));
        approvalJPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        approvalJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        surgeryTypeJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        surgeryTypeJLabel.setText("Surgery Type:");
        surgeryTypeJLabel.setEnabled(false);
        approvalJPanel.add(surgeryTypeJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 112, 25));

        requestJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        requestJButton.setText("Request");
        requestJButton.setEnabled(false);
        requestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestJButtonActionPerformed(evt);
            }
        });
        approvalJPanel.add(requestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 213, 150, 30));

        surgeryStartDateJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        surgeryStartDateJLabel.setText("Surgery Start Date:");
        surgeryStartDateJLabel.setEnabled(false);
        approvalJPanel.add(surgeryStartDateJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 112, 25));

        dateFormatJLabel.setText("(m/d/yy)");
        dateFormatJLabel.setEnabled(false);
        approvalJPanel.add(dateFormatJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 50, 20));

        surgeryStartDateJFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        surgeryStartDateJFormattedTextField.setEnabled(false);
        surgeryStartDateJFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surgeryStartDateJFormattedTextFieldActionPerformed(evt);
            }
        });
        approvalJPanel.add(surgeryStartDateJFormattedTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 230, 30));

        messageJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        messageJLabel.setText("Message:");
        messageJLabel.setEnabled(false);
        approvalJPanel.add(messageJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 112, 25));

        messageJTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        messageJTextField.setEnabled(false);
        approvalJPanel.add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 232, 30));

        surgeryTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        surgeryTypeJComboBox.setEnabled(false);
        approvalJPanel.add(surgeryTypeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 230, 30));

        surgeryEndDateJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        surgeryEndDateJLabel.setText("Surgery End Date:");
        surgeryEndDateJLabel.setEnabled(false);
        approvalJPanel.add(surgeryEndDateJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 112, 25));

        surgeryEndDateJFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        surgeryEndDateJFormattedTextField.setEnabled(false);
        approvalJPanel.add(surgeryEndDateJFormattedTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 230, 30));

        errorMessageJLabel.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        errorMessageJLabel.setForeground(new java.awt.Color(204, 0, 0));
        errorMessageJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        approvalJPanel.add(errorMessageJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 190, 30));

        errorSurgeryTypeJLabel.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        errorSurgeryTypeJLabel.setForeground(new java.awt.Color(204, 0, 0));
        errorSurgeryTypeJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        approvalJPanel.add(errorSurgeryTypeJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 210, 30));

        errorSurgeryStartDateJLabel.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        errorSurgeryStartDateJLabel.setForeground(new java.awt.Color(204, 0, 0));
        errorSurgeryStartDateJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        approvalJPanel.add(errorSurgeryStartDateJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 190, 30));

        errorSurgeryEndDateJLabel.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        errorSurgeryEndDateJLabel.setForeground(new java.awt.Color(204, 0, 0));
        errorSurgeryEndDateJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        approvalJPanel.add(errorSurgeryEndDateJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 190, 30));

        pendingApprovalJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sender", "Message", "Status"
            }
        ));
        jScrollPane1.setViewportView(pendingApprovalJTable);

        placeRequestJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        placeRequestJButton.setText("Place Request");
        placeRequestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeRequestJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doctor Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(placeRequestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(approvalJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(placeRequestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(approvalJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addGap(53, 53, 53))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestJButtonActionPerformed
        // TODO add your handling code here:
        if (isValidFieldsValue()) {
            if (areValidDate()) {
                WorkRequest workRequest = enterprise.getWorkQueue().createWorkRequest(WorkRequest.WorkRequestType.NewSurgeryWorkRequest.getValue());
                NewSurgeryWorkRequest request = (NewSurgeryWorkRequest) workRequest;

                request.setStatus(WorkRequest.StatusType.PendingApproval.getValue());
                Surgery surgery = new Surgery();
                SurgeryType surgeryType = (SurgeryType) surgeryTypeJComboBox.getSelectedItem();
                surgery.setSurgeryType(surgeryType.getTypeName());
                surgery.setSurgeryStartDate(new Date(surgeryStartDateJFormattedTextField.getText()));
                surgery.setSurgeryEndDate(new Date(surgeryEndDateJFormattedTextField.getText()));
                request.setSurgery(surgery);
                request.setMessage(messageJTextField.getText());
            //enterprise.getWorkQueue().getWorkRequests().add(request);
                // userAccount.getWorkQueue().getWorkRequests().add(request);
                approvalJPanelAction(false);
                clearFields();
                populateTable();
            }
        }

    }//GEN-LAST:event_requestJButtonActionPerformed

    private void placeRequestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeRequestJButtonActionPerformed
        // TODO add your handling code here: 
        approvalJPanelAction(true);
        clearFields();
    }//GEN-LAST:event_placeRequestJButtonActionPerformed

    private void surgeryStartDateJFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surgeryStartDateJFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surgeryStartDateJFormattedTextFieldActionPerformed

    private void approvalJPanelAction(boolean flag) {
        surgeryTypeJComboBox.setEnabled(flag);
        requestJButton.setEnabled(flag);
        surgeryTypeJLabel.setEnabled(flag);
        surgeryStartDateJLabel.setEnabled(flag);
        surgeryEndDateJLabel.setEnabled(flag);
        surgeryEndDateJFormattedTextField.setEnabled(flag);
        surgeryTypeJLabel.setEnabled(flag);
        surgeryStartDateJFormattedTextField.setEnabled(flag);
        messageJLabel.setEnabled(flag);
        messageJTextField.setEnabled(flag);
    }

    private void clearFields() {
        messageJTextField.setText("");
        surgeryStartDateJFormattedTextField.setText("");
        surgeryEndDateJFormattedTextField.setText("");
    }

    public boolean isValidFieldsValue() {
        boolean isValid = true;
        if (ValidatingFields.isComboBoxValid(surgeryTypeJComboBox)) {
            errorMessageJLabel.setText("Select category.");
            isValid = false;
        } else {
            errorMessageJLabel.setText("");
        }

        if (ValidatingFields.isStringTextFieldValid(surgeryEndDateJFormattedTextField)) {
            errorSurgeryEndDateJLabel.setText("Enter valid values.");
            isValid = false;
        } else {

            errorSurgeryEndDateJLabel.setText("");
        }

        if (ValidatingFields.isStringTextFieldValid(surgeryStartDateJFormattedTextField)) {
            errorSurgeryStartDateJLabel.setText("Enter valid values.");
            isValid = false;
        } else {
            errorSurgeryStartDateJLabel.setText("");
        }

        if (ValidatingFields.isStringTextFieldValid(messageJTextField)) {
            errorMessageJLabel.setText("Enter valid values.");
            isValid = false;
        } else {
            errorMessageJLabel.setText("");
        }

        return isValid;
    }

    public boolean areValidDate() {
        boolean isValid = true;
        
        Date startDate = new Date(surgeryStartDateJFormattedTextField.getText());
        Date endDate = new Date(surgeryEndDateJFormattedTextField.getText());

        if (!ValidatingFields.isValidEndDate(startDate,endDate)) {
            errorSurgeryEndDateJLabel.setText("End date should be 5 days ahead.");
            isValid = false;
        } else {

            errorSurgeryEndDateJLabel.setText("");
        }

        if (!ValidatingFields.isValidStartDate(startDate,endDate)) {
            errorSurgeryStartDateJLabel.setText("Start date should be 5 days ahead");
            isValid = false;
        } else {
            errorSurgeryStartDateJLabel.setText("");
        }

        return isValid;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel approvalJPanel;
    private javax.swing.JLabel dateFormatJLabel;
    private javax.swing.JLabel errorMessageJLabel;
    private javax.swing.JLabel errorSurgeryEndDateJLabel;
    private javax.swing.JLabel errorSurgeryStartDateJLabel;
    private javax.swing.JLabel errorSurgeryTypeJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel messageJLabel;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JTable pendingApprovalJTable;
    private javax.swing.JButton placeRequestJButton;
    private javax.swing.JButton requestJButton;
    private javax.swing.JFormattedTextField surgeryEndDateJFormattedTextField;
    private javax.swing.JLabel surgeryEndDateJLabel;
    private javax.swing.JFormattedTextField surgeryStartDateJFormattedTextField;
    private javax.swing.JLabel surgeryStartDateJLabel;
    private javax.swing.JComboBox surgeryTypeJComboBox;
    private javax.swing.JLabel surgeryTypeJLabel;
    // End of variables declaration//GEN-END:variables
}