package userinterface.CVSadmin;

import business.Pharmacy;
import business.PharmacyDirectory;
import java.awt.CardLayout;
import java.util.function.Supplier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class ManagePharmacy extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private PharmacyDirectory pharmacyDirectory;
    public ManagePharmacy(JPanel userProcessConatiner, PharmacyDirectory pharmacyDirectory) {
        initComponents();
        this.userProcessContainer = userProcessConatiner;
        this.pharmacyDirectory = pharmacyDirectory;
        populateTable();
    }
    void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) pharmacyTable.getModel();
        dtm.setRowCount(0); //to make row count 0
       // int rowCount = accountJTable.getRowCount();
        for (Pharmacy pharmacy : pharmacyDirectory.getStoreList())
        {
            Object[] row = new Object[1];
            row[0]=pharmacy;
            dtm.addRow(row);
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pharmacyTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnAddPharmacy = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        pharmacyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Pharmacy Company Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(pharmacyTable);

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnView.setText("View Pharmacy");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnAddPharmacy.setText("Add Pharmacy");
        btnAddPharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPharmacyActionPerformed(evt);
            }
        });

        jLabel1.setText("Manage Pharmacy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(29, 29, 29)
                                .addComponent(btnRemove)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnView))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddPharmacy)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnRemove)
                    .addComponent(btnView))
                .addGap(18, 18, 18)
                .addComponent(btnAddPharmacy)
                .addContainerGap(128, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPharmacyActionPerformed
        AddPharmacy aph = new AddPharmacy(userProcessContainer,pharmacyDirectory);
        userProcessContainer.add("add pharmacy",aph);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddPharmacyActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        
        int selectedRow = pharmacyTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row to view","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        Pharmacy pharmacy = (Pharmacy) pharmacyTable.getValueAt(selectedRow, 0);
        ViewPharmacyDetails viewpharmadetailsPanel = new ViewPharmacyDetails(userProcessContainer,pharmacy);
        userProcessContainer.add("viewpharmadetailsPanel",viewpharmadetailsPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int selectedRow = pharmacyTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row to view","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        int dialogResult = JOptionPane.showConfirmDialog(null, "Please confirm to delete", "Delete confirmation", JOptionPane.WARNING_MESSAGE);
             if(dialogResult == JOptionPane.YES_OPTION){
         Pharmacy pharmacy = (Pharmacy) pharmacyTable.getValueAt(selectedRow, 0);
         pharmacyDirectory.removeSupplier(pharmacy);
         populateTable();
             }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPharmacy;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pharmacyTable;
    // End of variables declaration//GEN-END:variables

}
