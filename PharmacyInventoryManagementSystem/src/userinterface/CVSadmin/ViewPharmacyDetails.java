package userinterface.CVSadmin;

import business.Drug;
import business.DrugCatalog;
import business.Pharmacy;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class ViewPharmacyDetails extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Pharmacy pharmacy;
    public ViewPharmacyDetails(JPanel userProcessConatiner, Pharmacy pharmacy) {
        initComponents();
        this.userProcessContainer =  userProcessConatiner;
        this.pharmacy = pharmacy;
//        addDrugsJButton.setEnabled(false);
        populateTable();
        pharmacyNameLabelName.setText(pharmacy.getStoreName()); //to get supplier name as label above the abv
    }
    
    public void populateTable()
    {
        DefaultTableModel dtm = (DefaultTableModel) drugsCatalogJTable.getModel();
        dtm.setRowCount(0); //to make row count 0
       // int rowCount = accountJTable.getRowCount();
        for (Drug drugs : pharmacy.getDrugCatalog().getDrugList())
        {
            if(drugs!=null){
            Object[] row = new Object[3];
            row[0]=drugs;
            row[1]=drugs.getDrugID();
            row[2]=drugs.getDrugAvailibility();
            
            dtm.addRow(row);
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pharmacyNameLabelName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        drugsCatalogJTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        pharmacyNameLabelName.setText("jLabel1");

        drugsCatalogJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Drug Name", "Drug Id", "Drug Availibility"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(drugsCatalogJTable);

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(pharmacyNameLabelName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(pharmacyNameLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(btnBack)
                .addContainerGap(48, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JTable drugsCatalogJTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pharmacyNameLabelName;
    // End of variables declaration//GEN-END:variables
}
