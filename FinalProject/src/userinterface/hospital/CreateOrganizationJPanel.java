/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.hospital;

import business.enterprise.HospitalEnterprise;
import business.network.Network;
import business.organization.Organization;
import business.organization.Organization.OrganizationType;
import business.organization.OrganizationDirectory;
import business.utility.ValidatingFields;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pu
 */
public class CreateOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateOrganizationJPanel
     */
    private OrganizationDirectory organizationDirectory;
    private JPanel userProcessContainer;
    private Network network;

    public CreateOrganizationJPanel(JPanel userProcessContainer, Network network, HospitalEnterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDirectory = enterprise.getOrganizationDirectory();
        this.network =network;
        populateTable();
        populateComboBox();
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) organizationDisplayTable.getModel();

        dtm.setRowCount(0);

        for (Organization organization : organizationDirectory.getOrganizations()) {
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationId();
            row[1] = organization.getOrganizationName();

            dtm.addRow(row);
        }
    }

    private void populateComboBox() {
        orgTypeJComboBox.removeAllItems();

        for (Organization.OrganizationType type : Organization.OrganizationType.values()) {
            if (type.getValue().equals(Organization.OrganizationType.Doctor.getValue())
                    || type.getValue().equals(Organization.OrganizationType.Assistent.getValue())) {
                orgTypeJComboBox.addItem(type);
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

        addOrganizationJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        orgNameJTextField = new javax.swing.JTextField();
        orgTypeJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationDisplayTable = new javax.swing.JTable();
        errorNameJLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        addOrganizationJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        addOrganizationJButton.setText("Add Organization");
        addOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrganizationJButtonActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel3.setText("Choose organization Type:");

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel4.setText("Organization Name:");

        orgTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel2.setText("Add Organization:");

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Organization");

        organizationDisplayTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organization Id", "Organization Type"
            }
        ));
        jScrollPane1.setViewportView(organizationDisplayTable);

        errorNameJLabel.setForeground(new java.awt.Color(255, 51, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addOrganizationJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orgTypeJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(orgNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(errorNameJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(445, 445, 445))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE))
                        .addGap(28, 28, 28))))
            .addGroup(layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orgTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addOrganizationJButton)
                            .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orgNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrganizationJButtonActionPerformed
        // TODO add your handling code here:
       if (isValidFieldsValues()) {
            String orgName = orgNameJTextField.getText();
            OrganizationType type = (OrganizationType) orgTypeJComboBox.getSelectedItem();
            organizationDirectory.createOrganization(orgName, type);
            populateTable();
            JOptionPane.showMessageDialog(null, orgName+" added successfully!");
        }
    }//GEN-LAST:event_addOrganizationJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private boolean isValidFieldsValues() {
        boolean isValid = true;        

        if (ValidatingFields.isStringTextFieldValid(orgNameJTextField)) {
            errorNameJLabel.setText("Name contains only alphabest and numbers");
            isValid = false;
        } else {
            if (network.getEnterpriseDirectory().isOrganizationNamePresent(orgNameJTextField.getText().trim())) {
                errorNameJLabel.setText("Organization name already exist.");
                isValid = false;
            } else {
                errorNameJLabel.setText("");
            }
        }
        
         if (ValidatingFields.isComboBoxValid(orgTypeJComboBox)) {
             isValid =false;
         }

        return isValid;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrganizationJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel errorNameJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField orgNameJTextField;
    private javax.swing.JComboBox orgTypeJComboBox;
    private javax.swing.JTable organizationDisplayTable;
    // End of variables declaration//GEN-END:variables
}
