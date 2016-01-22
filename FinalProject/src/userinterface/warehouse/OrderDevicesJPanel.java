/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.warehouse;

import business.Business;
import business.enterprise.DistributorEnterprise;
import business.enterprise.SupplierEnterprise;
import business.network.Network;
import business.order.Order;
import business.order.OrderItem;
import business.organization.Organization;
import business.organization.distributor.WarehouseManagementOrganization;
import business.role.Role;
import business.model.Product;
import business.useraccount.UserAccount;
import business.workarea.NewDeviceOrderRequest;
import business.workarea.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.supplier.ViewProductJPanel;

/**
 *
 * @author pu
 */
public class OrderDevicesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderDevicesJPanel
     */
    private JPanel userProcessContainer;
    private DistributorEnterprise enterprise;
    private UserAccount userAccount;
    private WarehouseManagementOrganization organization;
    private Business business;
    private Network network;
    private Order order;
    boolean isCheckedOut = false;

    public OrderDevicesJPanel(JPanel userProcessContainer, UserAccount account, Network network, DistributorEnterprise enterprise, WarehouseManagementOrganization organization, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        this.network = network;
        if (!isCheckedOut) {
            order = new Order();
        }

        populateSuppliers();
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
        productsJTable = new javax.swing.JTable();
        modifiedJTextField = new javax.swing.JTextField();
        modifiedJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        checkOutJButton = new javax.swing.JButton();
        searchProductJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        searchJTextField = new javax.swing.JTextField();
        removeJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        viewProductJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        viewItemJButton = new javax.swing.JButton();
        quantityJSpinner = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        addToCartJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderJTable = new javax.swing.JTable();
        supplierJComboBox = new javax.swing.JComboBox();

        productsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "product Name", "Product ID", "Price", "Availability"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productsJTable);

        modifiedJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        modifiedJButton.setText("Modify Quantity");
        modifiedJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifiedJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Supplier Product Catalog");

        checkOutJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        checkOutJButton.setText("Request Order");
        checkOutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutJButtonActionPerformed(evt);
            }
        });

        searchProductJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        searchProductJButton.setText("Search Product");
        searchProductJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProductJButtonActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        searchJTextField.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N

        removeJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        removeJButton.setText("Remove");
        removeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeJButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel3.setText("Quantity:");

        viewProductJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        viewProductJButton.setText("View product Details");
        viewProductJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProductJButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Shopping Cart");

        viewItemJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        viewItemJButton.setText("View item details");
        viewItemJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewItemJButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Place Order");

        addToCartJButton.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        addToCartJButton.setText("Add to Cart");
        addToCartJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Supplier");

        orderJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "price", "Quantity", "Total Amount"
            }
        ));
        jScrollPane2.setViewportView(orderJTable);

        supplierJComboBox.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        supplierJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        supplierJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierJComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(viewItemJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(removeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkOutJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(supplierJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(searchProductJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(quantityJSpinner))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(addToCartJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(modifiedJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(modifiedJButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(278, 278, 278)
                                .addComponent(viewProductJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchProductJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(supplierJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewProductJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addToCartJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(modifiedJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(modifiedJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(quantityJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkOutJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewItemJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void modifiedJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifiedJButtonActionPerformed
        // TODO add your handling code here: int selectedRow =
        int selectedRow = orderJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a item from shopping cart first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //modify the item
        OrderItem orderItem = (OrderItem) orderJTable.getValueAt(selectedRow, 0);
        int oldQuantity = orderItem.getQuantity();
        int oldAvailable = orderItem.getProduct().getAvailability();

        int newQuantity = 0;
        try {
            newQuantity = Integer.parseInt(modifiedJTextField.getText());
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(null, "Please enter a valid quantity.");
            return;
        }

        //judge the quantity
        if (newQuantity <= 0 || newQuantity > oldQuantity + oldAvailable) {
            JOptionPane.showMessageDialog(null, "Please enter a valid quantity.");
            return;
        }
        orderItem.setQuantity(newQuantity);
        //popup window
        String message = "The quantity of " + orderItem.getProduct().getName() + " has changed from " + oldQuantity + " to " + newQuantity;
        JOptionPane.showMessageDialog(null, message);

        orderItem.getProduct().setAvailability(oldAvailable + oldQuantity - newQuantity);

        //Refresh the tables
        displaySupplierProduct();
        refreshOrderTable();
    }//GEN-LAST:event_modifiedJButtonActionPerformed

    private void populateSuppliers() {
        supplierJComboBox.removeAllItems();

        for (SupplierEnterprise se : network.getNetworkDirectory().getApprovedSupplier(network)) {
            supplierJComboBox.addItem(se);
        }
    }

    private void displaySupplierProduct() {

        DefaultTableModel dtm = (DefaultTableModel) productsJTable.getModel();

        dtm.setRowCount(0);

        SupplierEnterprise se = (SupplierEnterprise) supplierJComboBox.getSelectedItem();
        if (se == null) {
            return;
        }

        for (Product product : se.getProductCatalog().getProductDirectory()) {
            Object[] row = new Object[4];
            row[0] = product;
            row[1] = product.getProductId();
            row[2] = product.getPrice();
            row[3] = product.getAvailability();

            dtm.addRow(row);
        }

    }

    private void refreshOrderTable() {
        int rowCount = orderJTable.getRowCount();

        DefaultTableModel dtm = (DefaultTableModel) orderJTable.getModel();

        for (int i = rowCount - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }

        //populate table
        for (OrderItem orderItem : order.getOrderItemList()) {
            Object[] rows = new Object[4];
            rows[0] = orderItem;
            rows[1] = orderItem.getProduct().getPrice();
            rows[2] = orderItem.getQuantity();
            rows[3] = orderItem.getProduct().getPrice() * orderItem.getQuantity();

            dtm.addRow(rows);
        }
    }

    private void checkOutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutJButtonActionPerformed
        // TODO add your handling code here:
        if (!order.getOrderItemList().isEmpty()) {
            WorkRequest workRequest = enterprise.getWorkQueue().createWorkRequest(WorkRequest.WorkRequestType.NewDeviceOrderRequestType.getValue());
            workRequestAction((NewDeviceOrderRequest) workRequest);

            order.setStatus("Pending");
            // order.setDeliveryDate(new Date());
            //enterprise.getCatalog().addOrder(order);
            Order addOrderitem = organization.getOrderCatalog().addOrder(order); //addOrderItem can be used for payemtn
            JOptionPane.showMessageDialog(null, "your order has been successfully added!.");
        } else {
            JOptionPane.showMessageDialog(null, "Error occured when trying to check out.");
        }
        isCheckedOut = true;

        order = new Order();

        //Refresh all tables
        displaySupplierProduct();
        refreshOrderTable();
    }//GEN-LAST:event_checkOutJButtonActionPerformed

    private void searchProductJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProductJButtonActionPerformed
        // TODO add your handling code here:
        String searchKeyword = searchJTextField.getText();
        searchProduct(searchKeyword);
    }//GEN-LAST:event_searchProductJButtonActionPerformed

    private void searchProduct(String searchString) {

        int rowCount = productsJTable.getRowCount();

        DefaultTableModel dtm = (DefaultTableModel) productsJTable.getModel();

        for (int i = rowCount - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }

        for (SupplierEnterprise se : network.getNetworkDirectory().getApprovedSupplier(network)) {

            for (Product product : se.getProductCatalog().getProductDirectory()) {
                if (searchString.equalsIgnoreCase(product.getName())) {
                    Object[] row = new Object[4];
                    row[0] = product;
                    row[1] = product.getProductId();
                    row[2] = product.getPrice();
                    row[3] = product.getAvailability();

                    dtm.addRow(row);
                }
            }
        }
    }

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here: //if u didn't check out add quantity
        if (!isCheckedOut) {
            for (OrderItem orderItem : order.getOrderItemList()) {
                Product product = orderItem.getProduct();
                int oldAvailability = product.getAvailability();
                int orderQuantity = orderItem.getQuantity();
                int newAvailability = oldAvailability + orderQuantity;
                //set to the product
                product.setAvailability(newAvailability);
            }
            JOptionPane.showMessageDialog(null, "Your order request cancelled, so all your previous order will be cancelled");
        } else {
            JOptionPane.showMessageDialog(null, "Your order has already been requested!!");
        }

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void removeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeJButtonActionPerformed

        int selectedRow = orderJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a item from shopping cart first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //modify the item
        OrderItem orderItem = (OrderItem) orderJTable.getValueAt(selectedRow, 0);

        int oldQuantity = orderItem.getQuantity();
        int oldAvailable = orderItem.getProduct().getAvailability();
        int newAvailability = oldQuantity + oldAvailable;
        orderItem.getProduct().setAvailability(newAvailability);

        order.removeOrder(orderItem);
        //Refresh all tables
        displaySupplierProduct();
        refreshOrderTable();
    }//GEN-LAST:event_removeJButtonActionPerformed

    private void viewProductJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProductJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = productsJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select Product first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Product product = (Product) productsJTable.getValueAt(selectedRow, 0);

        SupplierEnterprise se = (SupplierEnterprise) supplierJComboBox.getSelectedItem();
        ViewProductJPanel viewProductPanel = new ViewProductJPanel(userProcessContainer, product, se);
        userProcessContainer.add("ViewProductDetailsJPanel", viewProductPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewProductJButtonActionPerformed

    private void viewItemJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewItemJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = orderJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select order to view first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        OrderItem orderItem = (OrderItem) orderJTable.getValueAt(selectedRow, 0);
        ViewOrderDetailsJPanel orderDetailsJPanel = new ViewOrderDetailsJPanel(userProcessContainer, orderItem);

        userProcessContainer.add("ViewOrderDetailsJPanel", orderDetailsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewItemJButtonActionPerformed

    private void addToCartJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartJButtonActionPerformed
        // TODO add your handling code here: int quantity
        int quantity = (Integer) quantityJSpinner.getValue();
        int selectedRow = productsJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select Product first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Product product = (Product) productsJTable.getValueAt(selectedRow, 0);

        if (quantity <= 0 || quantity > product.getAvailability()) {
            JOptionPane.showMessageDialog(null, "Something wrong with the quantity", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        boolean flag = true;
        ArrayList<OrderItem> orders = order.getOrderItemList();

        for (OrderItem orderItem : orders) {
            if (orderItem.getProduct().equals(product)) {
                int oldQuantity = orderItem.getQuantity();
                int newQuantity = oldQuantity + quantity;
                orderItem.setQuantity(newQuantity);
                flag = false;
            }
        }
        isCheckedOut = false;
        //Add to cart
        if (flag) {
            OrderItem orderItem = order.addOrderItem(product, quantity);
            orderItem.setSupplierName((SupplierEnterprise) supplierJComboBox.getSelectedItem());
        }

        String message = Integer.toString(quantity) + " " + product.getName() + " has added to the cart.";
        JOptionPane.showMessageDialog(null, message);
        product.setAvailability(product.getAvailability() - quantity);

        //Refresh the tables
        displaySupplierProduct();
        refreshOrderTable();
        searchJTextField.setText("");
    }//GEN-LAST:event_addToCartJButtonActionPerformed

    private NewDeviceOrderRequest workRequestAction(NewDeviceOrderRequest request) {
        request.setMessage("Order Placed");
        request.setStatus("Pending");
        request.setSender(userAccount);
        request.setOrder(order);
        userAccount.getWorkQueue().getWorkRequests().add(request);

        return request;
    }


    private void supplierJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierJComboBoxActionPerformed
        // TODO add your handling code here:
        displaySupplierProduct();
    }//GEN-LAST:event_supplierJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton checkOutJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modifiedJButton;
    private javax.swing.JTextField modifiedJTextField;
    private javax.swing.JTable orderJTable;
    private javax.swing.JTable productsJTable;
    private javax.swing.JSpinner quantityJSpinner;
    private javax.swing.JButton removeJButton;
    private javax.swing.JTextField searchJTextField;
    private javax.swing.JButton searchProductJButton;
    private javax.swing.JComboBox supplierJComboBox;
    private javax.swing.JButton viewItemJButton;
    private javax.swing.JButton viewProductJButton;
    // End of variables declaration//GEN-END:variables
}
