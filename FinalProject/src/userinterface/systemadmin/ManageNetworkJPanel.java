/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.systemadmin;

import business.Business;
import business.network.Network;
import business.utility.ValidatingFields;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pu
 */
public class ManageNetworkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageNetworkJPanel
     */
    private JPanel userProcessContainer;
    private Business business;

    public ManageNetworkJPanel(JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        populateTable();
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) networkNameJTable.getModel();
        dtm.setRowCount(0);
        for (Network network : business.getSystemOrganization().getNetwork().getNetworkDirectory().getNetworks()) {
            Object[] rows = new Object[1];
            rows[0] = network.getNetworkName();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        networkNameJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        addNetworkJButton = new javax.swing.JButton();
        addJPanel = new javax.swing.JPanel();
        networkNameJLabel = new javax.swing.JLabel();
        errorNetworkNameJLabel = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        nameJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        networkNameJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name"
            }
        ));
        jScrollPane1.setViewportView(networkNameJTable);

        backJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        addNetworkJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addNetworkJButton.setText("Add New Network");
        addNetworkJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNetworkJButtonActionPerformed(evt);
            }
        });

        networkNameJLabel.setText("Network Name:");
        networkNameJLabel.setEnabled(false);

        errorNetworkNameJLabel.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        errorNetworkNameJLabel.setForeground(new java.awt.Color(204, 0, 0));
        errorNetworkNameJLabel.setEnabled(false);

        submitJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        submitJButton.setText("Create");
        submitJButton.setEnabled(false);
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        nameJTextField.setEnabled(false);

        javax.swing.GroupLayout addJPanelLayout = new javax.swing.GroupLayout(addJPanel);
        addJPanel.setLayout(addJPanelLayout);
        addJPanelLayout.setHorizontalGroup(
            addJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(networkNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(addJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addJPanelLayout.createSequentialGroup()
                        .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(errorNetworkNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        addJPanelLayout.setVerticalGroup(
            addJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameJTextField)
                    .addComponent(errorNetworkNameJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(networkNameJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Manage Network");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(309, 309, 309)
                                    .addComponent(addNetworkJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(addJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addNetworkJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(addJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        // TODO add your handling code here:
        //add network to business calss
        if (isValidFieldsValues()) {
            String name = nameJTextField.getText();
            Network network = business.getSystemOrganization().getNetwork().getNetworkDirectory().addNetwork(name);
            populateTable();
            addFormEnableDisable(false);
            JOptionPane.showMessageDialog(null, "Network "+name+" added successfully.");
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void addNetworkJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNetworkJButtonActionPerformed
        // TODO add your handling code here:
        addFormEnableDisable(true);
    }//GEN-LAST:event_addNetworkJButtonActionPerformed

    private void addFormEnableDisable(boolean flag) {
        nameJTextField.setEnabled(flag);
        errorNetworkNameJLabel.setEnabled(flag);
        submitJButton.setEnabled(flag);
        networkNameJLabel.setEnabled(flag);
    }

    private boolean isValidFieldsValues() {
        boolean isValid = true;

        if (ValidatingFields.isStringTextFieldValid(nameJTextField)) {
            errorNetworkNameJLabel.setText("Name contains only alphabest and numbers");
            isValid = false;
        } else {
            if (business.isNetworkPresent(nameJTextField.getText().trim())) {
                errorNetworkNameJLabel.setText("Network exist name already exist.");
                isValid = false;
            } else {
                errorNetworkNameJLabel.setText("");
            }
        }

        return isValid;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addJPanel;
    private javax.swing.JButton addNetworkJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel errorNetworkNameJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JLabel networkNameJLabel;
    private javax.swing.JTable networkNameJTable;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}