
import Control.insertController;
import Control.updateController;
import Model.DBconnecter;
import Model.DBtable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class stocks extends javax.swing.JFrame {

    public stocks() {
        initComponents();
        DefaultTableModel model = (DefaultTableModel) Table1.getModel();
        DBtable.setSoldProductsDetailsToTable(model , Table1);
    }
    DefaultTableModel model;
    
    public void getCustomerDetaild(){
            int customerID = Integer.parseInt(customerid.getText());
            
            try {
            Connection conn = DBconnecter.getConnection();
            PreparedStatement pst = conn.prepareStatement("select * from customer_details where Customer_ID = ?");
            pst.setInt(1, customerID);
            ResultSet rs =  pst.executeQuery();
            
            if(rs.next()){
                customername.setText(rs.getString("Customer_name"));
            }
              
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
 public void getProductDetaild(){
     
            int ID = Integer.parseInt(productid.getText());
            
            try {
            Connection conn = DBconnecter.getConnection();
            PreparedStatement pst = conn.prepareStatement("select * from pruduct_db2 where id =?");
            pst.setInt(1, ID);
            ResultSet rs =  pst.executeQuery();
            
            if(rs.next()){
               productname .setText(rs.getString("name"));
            }
              
        } catch (Exception e) {
            e.printStackTrace();
        }

    }   
 

  //clear book_details table
public void clearTable(){
    DefaultTableModel model= (DefaultTableModel) Table1.getModel();
    model.setRowCount(0);
} 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        updatebtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        insertbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        totle = new javax.swing.JLabel();
        productname = new javax.swing.JTextField();
        customername = new javax.swing.JTextField();
        price3 = new javax.swing.JTextField();
        customerid = new javax.swing.JTextField();
        productid = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        soldid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(255, 51, 51));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("X");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 0, 30, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("sold products");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 84, 1410, 14));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 612, 1410, 10));

        updatebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updatebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-update-48.png"))); // NOI18N
        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        getContentPane().add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 620, -1, -1));

        backbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-back-48.png"))); // NOI18N
        backbtn.setText("Back");
        backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtnMouseClicked(evt);
            }
        });
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 620, -1, -1));

        Table1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sell product ID", "Customer ID", "Customer name", "product ID", "product name", "Quntity", "price"
            }
        ));
        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 756, 474));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sold ID ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 104, 115, -1));

        insertbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        insertbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-add-32.png"))); // NOI18N
        insertbtn.setText("Insert");
        insertbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertbtnActionPerformed(evt);
            }
        });
        getContentPane().add(insertbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 622, 130, 55));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 182, 160, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Product ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 335, 160, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("price");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 160, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Product name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 416, 160, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Customer name");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 258, 160, 20));

        totle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totle.setForeground(new java.awt.Color(255, 255, 255));
        totle.setText("Quantity");
        getContentPane().add(totle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 160, -1));

        productname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(productname, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 410, 250, 37));

        customername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(customername, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 251, 250, 40));

        price3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(price3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 250, 39));

        customerid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        customerid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                customeridFocusLost(evt);
            }
        });
        getContentPane().add(customerid, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 177, 250, 36));

        productid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        productid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                productidFocusLost(evt);
            }
        });
        getContentPane().add(productid, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 327, 250, 41));

        price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, 250, 39));

        soldid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        soldid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soldidActionPerformed(evt);
            }
        });
        getContentPane().add(soldid, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 106, 250, 39));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CompressJPEG.online_1366x768-image.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertbtnActionPerformed
        insertController.addSoldProduct(soldid.getText() , customerid.getText() , customername.getText() , productid.getText(), productname.getText() , price3.getText() , price.getText() );
        clearTable();
        DBtable.setSoldProductsDetailsToTable(model, Table1);
        
    }//GEN-LAST:event_insertbtnActionPerformed

    private void soldidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soldidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soldidActionPerformed

    private void backbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseClicked
        homepage h1 = new homepage();
        h1.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbtnMouseClicked

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backbtnActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void customeridFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customeridFocusLost
        if(!customerid.getText().equals("")){
            getCustomerDetaild();
        }// TODO add your handling code here:
    }//GEN-LAST:event_customeridFocusLost

    private void productidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productidFocusLost
        if(!productid.getText().equals("")){
            getProductDetaild();
        }// TODO add your handling code here:
    }//GEN-LAST:event_productidFocusLost

    private void Table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table1MouseClicked
        int rowNo = Table1.getSelectedRow();
        TableModel model= Table1.getModel();

        soldid.setText(model.getValueAt(rowNo, 0).toString());
        customerid.setText(model.getValueAt(rowNo, 1).toString());
        customername.setText(model.getValueAt(rowNo, 2).toString());
        productid.setText(model.getValueAt(rowNo, 3).toString());
        productname.setText(model.getValueAt(rowNo, 4).toString());
        price3.setText(model.getValueAt(rowNo, 5).toString());
        price.setText(model.getValueAt(rowNo, 6).toString());
        
        // TODO add your handling code here:
    }//GEN-LAST:event_Table1MouseClicked

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
       updateController.updatesoldproduct(soldid.getText() , customerid.getText() , customername.getText() , productid.getText(), productname.getText() , price3.getText() , price.getText());
        clearTable();
        DBtable.setSoldProductsDetailsToTable(model, Table1);
    }//GEN-LAST:event_updatebtnActionPerformed

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
            java.util.logging.Logger.getLogger(stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stocks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField customerid;
    private javax.swing.JTextField customername;
    private javax.swing.JButton insertbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField price;
    private javax.swing.JTextField price3;
    private javax.swing.JTextField productid;
    private javax.swing.JTextField productname;
    private javax.swing.JTextField soldid;
    private javax.swing.JLabel totle;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
