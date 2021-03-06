/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.supplier;

import business.Business;
import business.enterprise.Enterprise;
import business.enterprise.SupplierEnterprise;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author pu
 */
public class SupplierWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SupplierWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Business business;
    private SupplierEnterprise supplierEnterprise;
    private UserAccount userAccount;
    
    public SupplierWorkAreaJPanel(JPanel userProcessContainer,Business business,Enterprise enterprise,UserAccount userAccount) {
        initComponents();
        this.business = business;
        this.userAccount = userAccount;
        supplierEnterprise = (SupplierEnterprise) enterprise;  
        this.userProcessContainer = userProcessContainer;     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        reviewProductJButton = new javax.swing.JButton();
        manageProductJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("My Work Area: Supplier");

        reviewProductJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        reviewProductJButton.setText("Review Product Performance >>");
        reviewProductJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reviewProductJButtonActionPerformed(evt);
            }
        });

        manageProductJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        manageProductJButton.setText("Manage Product Catalog >>");
        manageProductJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageProductJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(manageProductJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reviewProductJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(manageProductJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(reviewProductJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void reviewProductJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviewProductJButtonActionPerformed
        // TODO add your handling code here:
        ProductPerformanceJPanel performanceJPanel = new ProductPerformanceJPanel(userProcessContainer, supplierEnterprise);
        userProcessContainer.add("ProductPerformanceJPanel", performanceJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_reviewProductJButtonActionPerformed

    private void manageProductJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageProductJButtonActionPerformed
        // TODO add your handling code here:
        ManageProductCatalogJPanel productCatalogJPanel = new ManageProductCatalogJPanel(userProcessContainer, supplierEnterprise);
        userProcessContainer.add("ManageProductCatalogJJPanel", productCatalogJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageProductJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageProductJButton;
    private javax.swing.JButton reviewProductJButton;
    // End of variables declaration//GEN-END:variables
}
