/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.hospital;

import business.employee.Employee;
import business.enterprise.HospitalEnterprise;
import business.model.SurgeryTeam;
import business.model.SurgeryType;
import business.organization.Organization;
import business.organization.hospital.SurgicalStaffOrganization;
import business.utility.EnumTypes;
import business.utility.EnumTypes.RoomStatusType;
import business.utility.ValidatingFields;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pu
 */
public class ManageSurgeryTeamJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSurgeryTeamJPanel
     */
    private JPanel userProcessContainer;
    private HospitalEnterprise enterprise;
    private SurgicalStaffOrganization organization;
    private ArrayList<Employee> employees;
    private boolean isUpdate = false;

    public ManageSurgeryTeamJPanel(JPanel userProcessContainer, HospitalEnterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        for (Organization o : enterprise.getOrganizationDirectory().getOrganizations()) {
            if (o instanceof SurgicalStaffOrganization) {
                this.organization = (SurgicalStaffOrganization) o;
            }
        }

        populateTable();
        populatePersonTypeComboBox();
        populateComboBox();
    }

    private void populatePersonTypeComboBox() {
        personTypeJComboBox.removeAllItems();
        personTypeJComboBox.setModel(new DefaultComboBoxModel(EnumTypes.EmployeeType.values()));
        if (personTypeJComboBox.getSelectedIndex() != -1) {
            populateEmployeeComboBox((EnumTypes.EmployeeType) personTypeJComboBox.getSelectedItem());
        }
    }

    private void populateEmployeeComboBox(EnumTypes.EmployeeType type) {
        employeeListJComboBox.removeAllItems();
        if (organization != null) {
            for (Employee employee : organization.getEmployeeDirectory().getEmployees()) {
                if (employee.getEmployeeType().equals(type.getValue())
                        && employee.getTeamId() == 0) {
                    employeeListJComboBox.addItem(employee);
                }
            }
        }
    }

    private void populateComboBox() {
        surgeryTypeJComboBox.removeAllItems();

        for (SurgeryType type : enterprise.getSurgeryTypeCatalog().getSurgeryTypes()) {
            surgeryTypeJComboBox.addItem(type);
        }
    }

    private void populateTeamPersonComboBox(SurgeryTeam st) {
        addedPersonJComboBox.removeAllItems();
        if (st != null) {
            for (Employee e : st.getEmployees()) {
                addedPersonJComboBox.addItem(e);
            }
        }
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) operationalStaffJTable.getModel();
        dtm.setRowCount(0);
        for (SurgeryTeam surgeryTeam : enterprise.getSurgeryTeamDirectory().getSurgeryTeams()) {

            Object[] rows = new Object[2];
            rows[0] = surgeryTeam;
            rows[1] = surgeryTeam.getSurgeryTeamId();

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

        backJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        addJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        operationalStaffJTable = new javax.swing.JTable();
        addTeamJPanel = new javax.swing.JPanel();
        employeeJLabel = new javax.swing.JLabel();
        createUpdateJButton = new javax.swing.JButton();
        surgeryTypeJLabel = new javax.swing.JLabel();
        surgeryTypeJComboBox = new javax.swing.JComboBox();
        employeeListJComboBox = new javax.swing.JComboBox();
        personTypeJLabel = new javax.swing.JLabel();
        personTypeJComboBox = new javax.swing.JComboBox();
        addPersonJButton = new javax.swing.JButton();
        removePersonJButton = new javax.swing.JButton();
        addedPersonJLabel = new javax.swing.JLabel();
        addedPersonJComboBox = new javax.swing.JComboBox();
        errorPersonTypeJLabel = new javax.swing.JLabel();
        errorPersonListJLabel = new javax.swing.JLabel();
        errorAddedPersonJLabel = new javax.swing.JLabel();
        errorSurgeryTeamJLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        removeTeamJButton = new javax.swing.JButton();
        updateTeamJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        backJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        addJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        addJButton.setText("Add Surgery Team");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        operationalStaffJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Team type", "Team Id"
            }
        ));
        jScrollPane1.setViewportView(operationalStaffJTable);

        addTeamJPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addTeamJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        employeeJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        employeeJLabel.setText("Person List:");
        employeeJLabel.setEnabled(false);
        addTeamJPanel.add(employeeJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 112, 25));

        createUpdateJButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        createUpdateJButton.setText("Create/Update");
        createUpdateJButton.setEnabled(false);
        createUpdateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUpdateJButtonActionPerformed(evt);
            }
        });
        addTeamJPanel.add(createUpdateJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 110, 30));

        surgeryTypeJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        surgeryTypeJLabel.setText("Surgery Team Type:");
        surgeryTypeJLabel.setEnabled(false);
        addTeamJPanel.add(surgeryTypeJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 112, 25));

        surgeryTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        surgeryTypeJComboBox.setEnabled(false);
        addTeamJPanel.add(surgeryTypeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 230, 30));

        employeeListJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        employeeListJComboBox.setEnabled(false);
        addTeamJPanel.add(employeeListJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 230, 30));

        personTypeJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        personTypeJLabel.setText("Person Type:");
        personTypeJLabel.setEnabled(false);
        addTeamJPanel.add(personTypeJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 112, 25));

        personTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        personTypeJComboBox.setEnabled(false);
        personTypeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personTypeJComboBoxActionPerformed(evt);
            }
        });
        addTeamJPanel.add(personTypeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 230, 30));

        addPersonJButton.setText("+");
        addPersonJButton.setEnabled(false);
        addPersonJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPersonJButtonActionPerformed(evt);
            }
        });
        addTeamJPanel.add(addPersonJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 50, 30));

        removePersonJButton.setText("-");
        removePersonJButton.setEnabled(false);
        removePersonJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePersonJButtonActionPerformed(evt);
            }
        });
        addTeamJPanel.add(removePersonJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 50, 30));

        addedPersonJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addedPersonJLabel.setText("Added person:");
        addedPersonJLabel.setEnabled(false);
        addTeamJPanel.add(addedPersonJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 112, 25));

        addedPersonJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        addedPersonJComboBox.setEnabled(false);
        addTeamJPanel.add(addedPersonJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 230, 30));

        errorPersonTypeJLabel.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        errorPersonTypeJLabel.setForeground(new java.awt.Color(204, 0, 0));
        errorPersonTypeJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addTeamJPanel.add(errorPersonTypeJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 170, 30));

        errorPersonListJLabel.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        errorPersonListJLabel.setForeground(new java.awt.Color(204, 0, 0));
        errorPersonListJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addTeamJPanel.add(errorPersonListJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 170, 30));

        errorAddedPersonJLabel.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        errorAddedPersonJLabel.setForeground(new java.awt.Color(204, 0, 0));
        errorAddedPersonJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addTeamJPanel.add(errorAddedPersonJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 170, 30));

        errorSurgeryTeamJLabel.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        errorSurgeryTeamJLabel.setForeground(new java.awt.Color(204, 0, 0));
        errorSurgeryTeamJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addTeamJPanel.add(errorSurgeryTeamJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 170, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Operational Team Staff:");

        removeTeamJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        removeTeamJButton.setText("Remove Surgery Team");
        removeTeamJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTeamJButtonActionPerformed(evt);
            }
        });

        updateTeamJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        updateTeamJButton.setText("Update Team");
        updateTeamJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTeamJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Surgery Team");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(removeTeamJButton)
                        .addGap(40, 40, 40)
                        .addComponent(updateTeamJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addJButton)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(addTeamJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeTeamJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateTeamJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addTeamJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        // TODO add your handling code here:
        employees = new ArrayList<>();
        isUpdate = false;
        addStaffJPanelAction(true);
        populateTable();
        populateTeamPersonComboBox(null);
    }//GEN-LAST:event_addJButtonActionPerformed

    private void createUpdateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUpdateJButtonActionPerformed
        // TODO add your handling code here:
        if (isValidFieldsValue()) {
            SurgeryTeam surgeryTeam = null;
            if (!isUpdate) {
                surgeryTeam = enterprise.getSurgeryTeamDirectory().addSurgeryTeam();
                surgeryTeam.setStatus(RoomStatusType.Available.getValue());
            } else {
                surgeryTeam = (SurgeryTeam) operationalStaffJTable.getValueAt(operationalStaffJTable.getSelectedRow(), 0);
            }

            if (surgeryTeam != null) {
                setEmployeesTeamId(surgeryTeam);
                SurgeryType surgeryType = (SurgeryType) surgeryTypeJComboBox.getSelectedItem();
                surgeryTeam.setSurgeryTeamType(surgeryType.getTypeName());
                surgeryTeam.setEmployees(employees);

            }
            addStaffJPanelAction(false);
            populateTable();
        }
    }//GEN-LAST:event_createUpdateJButtonActionPerformed

    private void removeTeamJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTeamJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = operationalStaffJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the team to be removed.");
            return;
        }

        SurgeryTeam surgeryTeam = (SurgeryTeam) operationalStaffJTable.getValueAt(selectedRow, 0);
        if (enterprise.canRemoveUpdateOperationalTeam(surgeryTeam)) {
            enterprise.getSurgeryTeamDirectory().removeSurgeryTeam(surgeryTeam);
            JOptionPane.showMessageDialog(null, "Team removed successfully!!");
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Team cannot be removed, booked for surgery.");
        }


    }//GEN-LAST:event_removeTeamJButtonActionPerformed

    private void personTypeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personTypeJComboBoxActionPerformed
        // TODO add your handling code here:
        if (personTypeJComboBox.getSelectedIndex() != -1) {
            populateEmployeeComboBox((EnumTypes.EmployeeType) personTypeJComboBox.getSelectedItem());
        }
    }//GEN-LAST:event_personTypeJComboBoxActionPerformed

    private void addPersonJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPersonJButtonActionPerformed
        // TODO add your handling code here:
        Employee e = (Employee) employeeListJComboBox.getSelectedItem();
        employees.add(e);
        addedPersonJComboBox.addItem(e);
        employeeListJComboBox.removeItem(e);
    }//GEN-LAST:event_addPersonJButtonActionPerformed

    private void removePersonJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePersonJButtonActionPerformed
        // TODO add your handling code here:
        if (addedPersonJComboBox.getSelectedIndex() != -1) {
            Employee e = (Employee) addedPersonJComboBox.getSelectedItem();
            e.setTeamId(0);
            employees.remove(e);
            addedPersonJComboBox.removeItem(e);
            employeeListJComboBox.addItem(e);
        }
    }//GEN-LAST:event_removePersonJButtonActionPerformed

    private void updateTeamJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTeamJButtonActionPerformed
        // TODO add your handling code here:
        if (operationalStaffJTable.getSelectedRowCount() > 0) {
            SurgeryTeam st = (SurgeryTeam) operationalStaffJTable.getValueAt(operationalStaffJTable.getSelectedRow(), 0);
            if (enterprise.canRemoveUpdateOperationalTeam(st)) {
                isUpdate = true;
                addStaffJPanelAction(true);
                employees = new ArrayList<>();
                employees = st.getEmployees();
                populateTeamPersonComboBox(st);
            } else {
                JOptionPane.showMessageDialog(null, "Cannot be updated booked for surgery.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select team to be updted.");
        }


    }//GEN-LAST:event_updateTeamJButtonActionPerformed

    private void addStaffJPanelAction(boolean flag) {
        employeeJLabel.setEnabled(flag);
        surgeryTypeJComboBox.setEnabled(flag);
        employeeListJComboBox.setEnabled(flag);
        surgeryTypeJLabel.setEnabled(flag);
        createUpdateJButton.setEnabled(flag);
        personTypeJComboBox.setEnabled(flag);
        personTypeJLabel.setEnabled(flag);
        addPersonJButton.setEnabled(flag);
        addedPersonJLabel.setEnabled(flag);
        addedPersonJComboBox.setEnabled(flag);
        removePersonJButton.setEnabled(flag);
        if (isUpdate == true) {
            createUpdateJButton.setText("Update");
        } else {
            createUpdateJButton.setText("Create");
        }
    }

    private void setEmployeesTeamId(SurgeryTeam st) {
        for (Employee e : employees) {
            e.setTeamId(st.getSurgeryTeamId());
        }
    }

    public boolean isValidFieldsValue() {
        boolean isValid = true;
        if (ValidatingFields.isComboBoxValid(surgeryTypeJComboBox)) {
            errorSurgeryTeamJLabel.setText("Select surgery Type.");
            isValid = false;
        } else {
            errorSurgeryTeamJLabel.setText("");
        }

        if (ValidatingFields.isComboBoxValid(personTypeJComboBox)) {
            errorPersonTypeJLabel.setText("Enter valid values.");
            isValid = false;
        } else {

            errorPersonTypeJLabel.setText("");
        }

        if (ValidatingFields.isComboBoxValid(addedPersonJComboBox)) {
            errorAddedPersonJLabel.setText("Enter valid values.");
            isValid = false;
        } else {
            errorAddedPersonJLabel.setText("");
        }

        return isValid;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton addPersonJButton;
    private javax.swing.JPanel addTeamJPanel;
    private javax.swing.JComboBox addedPersonJComboBox;
    private javax.swing.JLabel addedPersonJLabel;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createUpdateJButton;
    private javax.swing.JLabel employeeJLabel;
    private javax.swing.JComboBox employeeListJComboBox;
    private javax.swing.JLabel errorAddedPersonJLabel;
    private javax.swing.JLabel errorPersonListJLabel;
    private javax.swing.JLabel errorPersonTypeJLabel;
    private javax.swing.JLabel errorSurgeryTeamJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable operationalStaffJTable;
    private javax.swing.JComboBox personTypeJComboBox;
    private javax.swing.JLabel personTypeJLabel;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton removePersonJButton;
    private javax.swing.JButton removeTeamJButton;
    private javax.swing.JComboBox surgeryTypeJComboBox;
    private javax.swing.JLabel surgeryTypeJLabel;
    private javax.swing.JButton updateTeamJButton;
    // End of variables declaration//GEN-END:variables
}
