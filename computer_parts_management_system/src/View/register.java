
import Model.DBconnecter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


public class register extends javax.swing.JFrame {

  
    public register() {
        initComponents();
    }

    //method to insert value into register table
    public void insertSignupDetails(){
        
        String name = unamebtn.getText();
        String email = emailbtn.getText();
        String pword = new String (pwordbtn.getPassword());
        String contact = contactbtn.getText();
        
        try {
            Connection conn = (Connection) DBconnecter.getConnection();
            String sql = "INSERT INTO register (user_name,password,contact_NO,email) VALUES (?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, pword);
            pst.setString(3, contact);
            pst.setString(4, email);
            
            
            int updatedRowCount= pst.executeUpdate();
            
            if(updatedRowCount > 0){
                JOptionPane.showMessageDialog(this, "Recorded Inserted Successfully!!");
                login l1 = new login();
                l1.setVisible(true);
                dispose();
            }else {
                JOptionPane.showMessageDialog(this, "Recorded Insertion Failure !!");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //validation method
    public boolean validateSignup(){
        String name = unamebtn.getText();
        String email = emailbtn.getText();
        String pword = new String (pwordbtn.getPassword());
        String contact = contactbtn.getText();
        
        if(name.equals("")){
            JOptionPane.showMessageDialog(this, "please enter username");
            return false;
        }
         
        if(email.equals("") || email.matches ("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,6}$")){
            JOptionPane.showMessageDialog(this, "please enter valid email ");
            return false;
        }
      
        if(pword.equals("")){
            JOptionPane.showMessageDialog(this, "please enter pword");
            return false;
        }
      
        if(contact.equals("")){
            JOptionPane.showMessageDialog(this, "please enter contact number");
            return false;
        }
        return true;
    }
    
    //check duplicate username
    public boolean checkDuplicateUsername (){
        String name = unamebtn.getText();
        boolean isExist = false;
        
        try {
            Connection conn = (Connection) DBconnecter.getConnection();
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM register WHERE user_name = ?");
            pst.setString(1, name);
            ResultSet rs = pst.executeQuery();
            if ( rs.next()){
                isExist = true ;
            }else {
                isExist = false; 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isExist;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        unamebtn = new javax.swing.JTextField();
        pwordbtn = new javax.swing.JPasswordField();
        contactbtn = new javax.swing.JTextField();
        emailbtn = new javax.swing.JTextField();
        signinbtn = new javax.swing.JButton();
        loginbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Register Form");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 279, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("User Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 164, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 248, 102, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Contact No");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 342, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("E-mail");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 425, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 589, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 583, 10));

        unamebtn.setBackground(new java.awt.Color(204, 204, 255));
        unamebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        unamebtn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                unamebtnFocusLost(evt);
            }
        });
        getContentPane().add(unamebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 158, 234, 38));

        pwordbtn.setBackground(new java.awt.Color(204, 204, 255));
        pwordbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(pwordbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 242, 234, 38));

        contactbtn.setBackground(new java.awt.Color(204, 204, 255));
        contactbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(contactbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 336, 234, 38));

        emailbtn.setBackground(new java.awt.Color(204, 204, 255));
        emailbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(emailbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 420, 234, 38));

        signinbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        signinbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-login-48 (1).png"))); // NOI18N
        signinbtn.setText("Sign");
        signinbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinbtnActionPerformed(evt);
            }
        });
        getContentPane().add(signinbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 530, 130, 50));

        loginbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        loginbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-login-48.png"))); // NOI18N
        loginbtn.setText("login");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, 130, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ALL BACHGROUND.jpg"))); // NOI18N
        jLabel7.setText("X");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 590, 570));

        jLabel8.setBackground(new java.awt.Color(255, 51, 51));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("X");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 30, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signinbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinbtnActionPerformed
        if ( validateSignup() == true ){
            if (checkDuplicateUsername() == false){
                insertSignupDetails ();
            }else {
                JOptionPane.showMessageDialog(this, "username already exist");
            }
        }
    
    }//GEN-LAST:event_signinbtnActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
         login l1 = new login();
        l1.setVisible(true);
        dispose();  
    }//GEN-LAST:event_loginbtnActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void unamebtnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unamebtnFocusLost
        if (checkDuplicateUsername() == true){
            JOptionPane.showMessageDialog(this, "username already exist");
        }
    }//GEN-LAST:event_unamebtnFocusLost

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contactbtn;
    private javax.swing.JTextField emailbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField pwordbtn;
    private javax.swing.JButton signinbtn;
    private javax.swing.JTextField unamebtn;
    // End of variables declaration//GEN-END:variables
}
