/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.systemadmin;

import business.Business;
import business.employee.Employee;
import business.enterprise.Enterprise;
import business.enterprise.Enterprise.EnterpriseType;
import business.network.Network;
import business.role.DistributorAdminRole;
import business.role.HospitalAdminRole;
import business.role.Role;
import business.role.SupplierAdminRole;
import business.useraccount.UserAccount;
import business.utility.ValidatingFields;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pu
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEnterpriseAdminJPanel
     */
    private JPanel userProcessContainer;
    private Business business;

    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, Business business) {
        initComponents();
        this.business = business;
        this.userProcessContainer = userProcessContainer;
        populateTable();
        populateNetworkComboBox();
    }

    private void populateEnterpriseComboBox(Network network) {
        enterpriseTypeJComboBox.removeAllItems();

        ArrayList<EnterpriseType> enterprises = new ArrayList<EnterpriseType>();
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterprises()) {
            enterprises.add(enterprise.getEnterpriseType());
        }

        HashSet enterpriseHashSet = new HashSet();
        enterpriseHashSet.addAll(enterprises);
        enterprises.clear();
        enterprises.addAll(enterpriseHashSet);

        for (EnterpriseType enterpriseType : enterprises) {
            enterpriseTypeJComboBox.addItem(enterpriseType);
        }

    }

    private void populateEnterpriseNameComboBox(Network network) {
        enterpriseNameJComboBox.removeAllItems();

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterprises()) {
            if (enterprise.getEnterpriseType().equals(enterpriseTypeJComboBox.getSelectedItem())) {
                enterpriseNameJComboBox.addItem(enterprise);
            }
        }

    }

    private void populateNetworkComboBox() {
        networkJComboBox.removeAllItems();

        for (Network network : business.getSystemOrganization().getNetwork().getNetworkDirectory().getNetworks()) {
            networkJComboBox.addItem(network);
        }

    }

    private Role getRoleType(Enterprise enterprise) {

        if (enterprise.getEnterpriseType().equals(EnterpriseType.Distributor)) {
            return new DistributorAdminRole();
        } else if (enterprise.getEnterpriseType().equals(EnterpriseType.Supplier)) {
            return new SupplierAdminRole();
        } else if (enterprise.getEnterpriseType().equals(EnterpriseType.Hospital)) {
            return new HospitalAdminRole();
        }
        return null;
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) manageEnterpriseJTable.getModel();
        dtm.setRowCount(0);
        for (Network network : business.getSystemOrganization().getNetwork().getNetworkDirectory().getNetworks()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterprises()) {
                for (UserAccount account : enterprise.getUserAccountDirectory().getUserAccounts()) {
                    Object[] rows = new Object[4];
                    rows[0] = enterprise.getOrganizationName();
                    rows[1] = network.getNetworkName();
                    rows[2] = account.getUserName();
                    rows[3] = account.getPassword();
                    dtm.addRow(rows);
                }
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

        passwordJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        networkJComboBox = new javax.swing.JComboBox();
        usernameJTextField = new javax.swing.JTextField();
        nameJTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        manageEnterpriseJTable = new javax.swing.JTable();
        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        enterpriseNameJComboBox = new javax.swing.JComboBox();
        sysWorkAreaJLabel = new javax.swing.JLabel();
        errorNetworkJLabel = new javax.swing.JLabel();
        errorEnterpriseJLabel = new javax.swing.JLabel();
        errorEnterpriseNameJLabel = new javax.swing.JLabel();
        errorUserNameJLabel = new javax.swing.JLabel();
        errorPasswordJLabel = new javax.swing.JLabel();
        errorNameJLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        passwordJTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Enterprise Type:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Username:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Password:");

        enterpriseTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseTypeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseTypeJComboBoxActionPerformed(evt);
            }
        });

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });

        usernameJTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        nameJTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        manageEnterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network", "Username", "Password"
            }
        ));
        jScrollPane1.setViewportView(manageEnterpriseJTable);

        submitJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Network:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Enterprise Name:");

        enterpriseNameJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        sysWorkAreaJLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sysWorkAreaJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sysWorkAreaJLabel.setText("Manage Enterprise Admin");

        errorNetworkJLabel.setForeground(new java.awt.Color(204, 0, 0));
        errorNetworkJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        errorEnterpriseJLabel.setForeground(new java.awt.Color(204, 0, 0));
        errorEnterpriseJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        errorEnterpriseNameJLabel.setForeground(new java.awt.Color(204, 0, 0));
        errorEnterpriseNameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        errorUserNameJLabel.setForeground(new java.awt.Color(204, 0, 0));
        errorUserNameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        errorPasswordJLabel.setForeground(new java.awt.Color(204, 0, 0));
        errorPasswordJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        errorNameJLabel.setForeground(new java.awt.Color(204, 0, 0));
        errorNameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(sysWorkAreaJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(backJButton)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(networkJComboBox, 0, 167, Short.MAX_VALUE)
                                    .addComponent(enterpriseTypeJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(usernameJTextField)
                                    .addComponent(nameJTextField)
                                    .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordJTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(enterpriseNameJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(errorNetworkJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(errorEnterpriseJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(errorEnterpriseNameJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(errorUserNameJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(errorPasswordJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(errorNameJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(sysWorkAreaJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterpriseTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(errorNetworkJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(errorEnterpriseJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterpriseNameJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameJTextField)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(errorEnterpriseNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(errorUserNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(errorPasswordJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(errorNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        // TODO add your handling code here:
        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null) {
            populateEnterpriseComboBox(network);
        }
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        // TODO add your handling code here:
        //create enterprise admin
        if (isValidFields()) {
            Network network = (Network) networkJComboBox.getSelectedItem();
            Enterprise enterprise = (Enterprise) enterpriseNameJComboBox.getSelectedItem();

            if (network == null || enterprise == null) {
                return;
            }

            //create the employee
            String name = nameJTextField.getText();
            Employee employee = enterprise.getEmployeeDirectory().createEmployee();
            employee.setFirstName(name);

            String username = usernameJTextField.getText();

            String password = passwordJTextField.getText();
            JOptionPane.showMessageDialog(null, username+" created");

            UserAccount userAccount = enterprise.getUserAccountDirectory().createUserAccount();
            userAccount.setEmployee(employee);
            userAccount.setUserName(username);
            userAccount.setPassword(password);
            userAccount.setRole(getRoleType(enterprise));
            populateTable();
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void enterpriseTypeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseTypeJComboBoxActionPerformed
        // TODO add your handling code here:
        Network network = (Network) networkJComboBox.getSelectedItem();
        if (enterpriseTypeJComboBox.getSelectedIndex() != -1) {
            populateEnterpriseNameComboBox(network);
        }
    }//GEN-LAST:event_enterpriseTypeJComboBoxActionPerformed

    public boolean isValidFields() {
        boolean isValid = true;
        if (ValidatingFields.isComboBoxValid(networkJComboBox)) {
            errorNetworkJLabel.setText("Select network.");
            isValid = false;
        } else {
            errorNetworkJLabel.setText("");
        }

        if (ValidatingFields.isComboBoxValid(enterpriseTypeJComboBox)) {
            errorEnterpriseJLabel.setText("Select enterprise.");
            isValid = false;
        } else {
            errorEnterpriseJLabel.setText("");
        }

        if (ValidatingFields.isComboBoxValid(enterpriseNameJComboBox)) {
            errorNameJLabel.setText("Select enterprise name.");
            isValid = false;
        } else {
            errorNameJLabel.setText("");
        }

        if (ValidatingFields.isStringTextFieldValid(usernameJTextField)) {
            errorUserNameJLabel.setText("Invalid first name.");
            isValid = false;
        } else {
            if (business.isUserNamePresent(usernameJTextField.getText())) {
                errorUserNameJLabel.setText("User name already exist.");
                isValid = false;
            } else {
                errorUserNameJLabel.setText("");
            }
        }

        if (passwordJTextField.getText().isEmpty() || !(passwordJTextField.getText().matches("^\\s*[a-zA-Z0-9,\\s]+\\s*$"))) {
            errorPasswordJLabel.setText("Password contains only alphabest and numbers");
            isValid = false;
        } else {
            if (passwordJTextField.getText().length() < 6) {
                errorPasswordJLabel.setText("Password should be of 6 character");
                isValid = false;
            } else {
                errorPasswordJLabel.setText("");
            }
        }

        return isValid;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox enterpriseNameJComboBox;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JLabel errorEnterpriseJLabel;
    private javax.swing.JLabel errorEnterpriseNameJLabel;
    private javax.swing.JLabel errorNameJLabel;
    private javax.swing.JLabel errorNetworkJLabel;
    private javax.swing.JLabel errorPasswordJLabel;
    private javax.swing.JLabel errorUserNameJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable manageEnterpriseJTable;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JTextField passwordJTextField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JLabel sysWorkAreaJLabel;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
