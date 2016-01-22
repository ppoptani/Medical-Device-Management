/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import business.Business;
import business.db4outil.DB4OUtil;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.useraccount.UserAccount;
import business.utility.ValidatingFields;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import userinterface.systemadmin.NewEnterpriseRequestJPanel;

/**
 *
 * @author pu
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private Business business;
    private DB4OUtil b4OUtil = DB4OUtil.getInstance();

    public MainJFrame() {
        initComponents();
        //business = ConfigureABusiness.configure();
        business = b4OUtil.retrieveSystem();
        enableDisableField(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        usernameJLabel = new javax.swing.JLabel();
        userNameJTextField = new javax.swing.JTextField();
        passwordJLabel = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        loginJButton = new javax.swing.JButton();
        logoutJButton = new javax.swing.JButton();
        newEnterpriseJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        errorUserNameJLabel = new javax.swing.JLabel();
        errorPasswordJLabel = new javax.swing.JLabel();
        userProcessJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(200);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        usernameJLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        usernameJLabel.setText("User Name:");

        userNameJTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        userNameJTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        passwordJLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passwordJLabel.setText("Password:");

        passwordJPasswordField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passwordJPasswordField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        loginJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        logoutJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logoutJButton.setText("Log Out");
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        newEnterpriseJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newEnterpriseJButton.setText("New Enterprise Request!!");
        newEnterpriseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEnterpriseJButtonActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Welcome!!");

        errorUserNameJLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        errorUserNameJLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorUserNameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        errorPasswordJLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        errorPasswordJLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorPasswordJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoutJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(newEnterpriseJButton)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(errorPasswordJLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(errorUserNameJLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(passwordJPasswordField)
                        .addComponent(passwordJLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                        .addComponent(userNameJTextField)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(usernameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorUserNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorPasswordJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(logoutJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(newEnterpriseJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        userProcessJPanel.setBackground(new java.awt.Color(255, 255, 255));
        userProcessJPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(userProcessJPanel);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // TODO add your handling code here:
        if (validateFields()) {
            String userName = userNameJTextField.getText();
            char[] passwordCharArray = passwordJPasswordField.getPassword();
            String password = String.valueOf(passwordCharArray);

            Enterprise enterprise = null;
            Organization organization = null;
            Network n = null;

            UserAccount userAccount = business.getSystemOrganization().getUserAccountDirectory().authenticateUser(userName, password);

            if (userAccount == null) {
            //not a system admin
                //check if that is an enterprise admin
                for (Network network : business.getSystemOrganization().getNetwork().getNetworkDirectory().getNetworks()) {
                    for (Enterprise e : network.getEnterpriseDirectory().getEnterprises()) {
                        //check if enterprise user account
                        userAccount = e.getUserAccountDirectory().authenticateUser(userName, password);
                        if (userAccount == null) {
                            //not an enterprise
                            for (Organization o : e.getOrganizationDirectory().getOrganizations()) {
                                //check for user account in organization
                                userAccount = o.getUserAccountDirectory().authenticateUser(userName, password);

                                if (userAccount != null) {
                                    enterprise = e;
                                    organization = o;
                                    n = network;
                                    break;
                                }
                            }
                        } else {
                            //found user account in enterprise
                            n = network;
                            enterprise = e;
                            break;
                        }
                        //found organization user acount
                        if (organization != null) {
                            break;
                        }
                    }

                    if (enterprise != null) {
                        break;
                    }
                }
            }

            if (userAccount == null) {
                JOptionPane.showMessageDialog(null, "Invalid Credentials");
            } else {
                userProcessJPanel.removeAll();
                enableDisableField(false);
                CardLayout layout = (CardLayout) userProcessJPanel.getLayout();
                userProcessJPanel.add("workArea", userAccount.getRole().createWorkArea(userProcessJPanel, userAccount, n, enterprise, organization, business));
                layout.next(userProcessJPanel);

            }
        }
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        // TODO add your handling code here:  
        enableDisableField(true);
        userProcessJPanel.removeAll();        
        userNameJTextField.setText("");
        passwordJPasswordField.setText("");        
        b4OUtil.storeSystem(business);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void newEnterpriseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEnterpriseJButtonActionPerformed
        // TODO add your handling code here:
        NewEnterpriseRequestJPanel newSupplierRequestJPanel = new NewEnterpriseRequestJPanel(userProcessJPanel, business);
        userProcessJPanel.add("NewSupplierRequestJPanel", newSupplierRequestJPanel);
        CardLayout layout = (CardLayout) userProcessJPanel.getLayout();
        layout.next(userProcessJPanel);
    }//GEN-LAST:event_newEnterpriseJButtonActionPerformed

    public void enableDisableField(boolean flag) {
        usernameJLabel.setEnabled(flag);
        userNameJTextField.setEnabled(flag);
        passwordJLabel.setEnabled(flag);
        passwordJPasswordField.setEnabled(flag);
        loginJButton.setEnabled(flag);
        logoutJButton.setEnabled(!flag);
        newEnterpriseJButton.setEnabled(flag);
    }

    private boolean validateFields() {
        boolean isValid = true;
        if (ValidatingFields.isStringTextFieldValid(userNameJTextField)) {
            errorUserNameJLabel.setText("Invalid user name.");
            isValid = false;
        } else {
            errorUserNameJLabel.setText("");
        }

        if (passwordJPasswordField.getPassword().length == 0) {
            errorPasswordJLabel.setText("Enter password");
            isValid = false;
        } else {
            errorPasswordJLabel.setText("");
        }
        return isValid;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorPasswordJLabel;
    private javax.swing.JLabel errorUserNameJLabel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JButton newEnterpriseJButton;
    private javax.swing.JLabel passwordJLabel;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JTextField userNameJTextField;
    private javax.swing.JPanel userProcessJPanel;
    private javax.swing.JLabel usernameJLabel;
    // End of variables declaration//GEN-END:variables
}
