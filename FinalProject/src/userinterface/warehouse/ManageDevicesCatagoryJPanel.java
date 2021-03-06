/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.warehouse;

import business.enterprise.DistributorEnterprise;
import business.model.Category;
import business.model.CategoryCatalog;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pu
 */
public class ManageDevicesCatagoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateCatagoryJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private DistributorEnterprise enterprise;
    private CategoryCatalog categoryCatalog;
    private Category category = null;

    public ManageDevicesCatagoryJPanel(JPanel userProcessContainer, UserAccount userAccount, DistributorEnterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.categoryCatalog = enterprise.getCategoryCatalog();
        if (categoryCatalog != null) {
            populateCategoryTable();
        }
    }

    private void populateCategoryTable() {
        DefaultTableModel model = (DefaultTableModel) categoryJTable.getModel();
        model.setRowCount(0);

        for (Category category : categoryCatalog.getCategories()) {
            Object row[] = new Object[2];
            row[0] = category;
            row[1] = category.getCategoryName();
            model.addRow(row);
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
        categoryJTable = new javax.swing.JTable();
        createCategoryJButton = new javax.swing.JButton();
        viewCategoryJButton = new javax.swing.JButton();
        createUpdateJPanel = new javax.swing.JPanel();
        categoryNameJLabel = new javax.swing.JLabel();
        categoryNameJTextField = new javax.swing.JTextField();
        updateOrCreateJButton = new javax.swing.JButton();
        lblUserNameValidator = new javax.swing.JLabel();
        lblPasswordValidator = new javax.swing.JLabel();
        lblCategoryNameValidator = new javax.swing.JLabel();
        deleteJButton = new javax.swing.JButton();
        backJButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        categoryJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CategoryId", "CategoryName"
            }
        ));
        jScrollPane1.setViewportView(categoryJTable);

        createCategoryJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        createCategoryJButton.setText("Create Category");
        createCategoryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCategoryJButtonActionPerformed(evt);
            }
        });

        viewCategoryJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewCategoryJButton.setText("View Category");
        viewCategoryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCategoryJButtonActionPerformed(evt);
            }
        });

        createUpdateJPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        createUpdateJPanel.setEnabled(false);
        createUpdateJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        categoryNameJLabel.setText("Category");
        categoryNameJLabel.setEnabled(false);
        createUpdateJPanel.add(categoryNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        categoryNameJTextField.setEnabled(false);
        categoryNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryNameJTextFieldActionPerformed(evt);
            }
        });
        createUpdateJPanel.add(categoryNameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 150, -1));

        updateOrCreateJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateOrCreateJButton.setText("Update or Create");
        updateOrCreateJButton.setEnabled(false);
        updateOrCreateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateOrCreateJButtonActionPerformed(evt);
            }
        });
        createUpdateJPanel.add(updateOrCreateJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 140, 30));
        createUpdateJPanel.add(lblUserNameValidator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 60, 20));
        createUpdateJPanel.add(lblPasswordValidator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        lblCategoryNameValidator.setBackground(new java.awt.Color(250, 250, 250));
        lblCategoryNameValidator.setForeground(new java.awt.Color(240, 0, 0));
        createUpdateJPanel.add(lblCategoryNameValidator, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        deleteJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteJButton.setText("Delete");
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });

        backJButton2.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        backJButton2.setText("<< Back");
        backJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Device Category");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(createCategoryJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(120, 120, 120)
                            .addComponent(viewCategoryJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(178, 178, 178)
                            .addComponent(deleteJButton))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(138, 138, 138)
                            .addComponent(createUpdateJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(backJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createCategoryJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewCategoryJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(createUpdateJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(backJButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateOrCreateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateOrCreateJButtonActionPerformed

        if (updateOrCreateJButton.getText().equalsIgnoreCase("Create")) {
            if (categoryCatalog.isUniqueCategoryName(categoryNameJTextField.getText().trim())) {
                Category c = categoryCatalog.createCategory();
                c.setCategoryName(categoryNameJTextField.getText().trim());
                clearFields();
                JOptionPane.showMessageDialog(null, "Category added successfully", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                populateCategoryTable();
                createUpdateJPanelAction(false);
            } else {
                JOptionPane.showMessageDialog(null, "Category is already present in the database", "", JOptionPane.ERROR_MESSAGE);
            }
        } else if (updateOrCreateJButton.getText().equalsIgnoreCase("Update")) {
            //Validation of Brand Name if it gets changed
            if (!categoryCatalog.isUniqueCategoryName(categoryNameJTextField.getText().trim())) {
                JOptionPane.showMessageDialog(null, "Category already exist", "", JOptionPane.INFORMATION_MESSAGE);
                categoryNameJTextField.setEnabled(true);
                return;
            }

            //Update Operation
            category = (Category) categoryJTable.getValueAt(categoryJTable.getSelectedRow(), 0);
            categoryNameJTextField.setText(category.getCategoryName());
            JOptionPane.showMessageDialog(null, "Category updated successfully", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            populateCategoryTable();
            clearFields();
            createUpdateJPanelAction(false);
        }

    }//GEN-LAST:event_updateOrCreateJButtonActionPerformed

    private void createUpdateJPanelAction(boolean flag) {
        categoryNameJTextField.setEnabled(flag);
        updateOrCreateJButton.setEnabled(flag);
        categoryNameJLabel.setEnabled(flag);

        if (flag == false) {
            updateOrCreateJButton.setText("Update or Create");
        }
    }

    private void clearFields() {
        categoryNameJTextField.setText("");
    }

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        if (categoryJTable.getSelectedRowCount() > 0) {
            Category category = (Category) categoryJTable.getValueAt(categoryJTable.getSelectedRow(), 0);
            categoryCatalog.removeCategory(category);
            populateCategoryTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please select one row", "SELECTION ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteJButtonActionPerformed

    private void backJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton2ActionPerformed

    private void createCategoryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCategoryJButtonActionPerformed
        // TODO add your handling code here:
        updateOrCreateJButton.setText("Create");
        clearFields();
        createUpdateJPanelAction(true);
    }//GEN-LAST:event_createCategoryJButtonActionPerformed

    private void viewCategoryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCategoryJButtonActionPerformed
        // TODO add your handling code here:
        if (categoryJTable.getSelectedRowCount() > 0) {
            updateOrCreateJButton.setText("Update");
            createUpdateJPanelAction(true);

        } else {
            JOptionPane.showMessageDialog(null, "Please select one row", "SELECT", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_viewCategoryJButtonActionPerformed

    private void categoryNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryNameJTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton2;
    private javax.swing.JTable categoryJTable;
    private javax.swing.JLabel categoryNameJLabel;
    private javax.swing.JTextField categoryNameJTextField;
    private javax.swing.JButton createCategoryJButton;
    private javax.swing.JPanel createUpdateJPanel;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategoryNameValidator;
    private javax.swing.JLabel lblPasswordValidator;
    private javax.swing.JLabel lblUserNameValidator;
    private javax.swing.JButton updateOrCreateJButton;
    private javax.swing.JButton viewCategoryJButton;
    // End of variables declaration//GEN-END:variables
}
