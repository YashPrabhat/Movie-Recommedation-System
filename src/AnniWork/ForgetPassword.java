package AnniWork;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aniru
 */
public class ForgetPassword extends javax.swing.JFrame {

   
    public ForgetPassword() {
        initComponents();
    }
    PreparedStatement pst;
    Statement st=null;
    ResultSet rs;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        image = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtarea = new javax.swing.JPanel();
        heading = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        txtfavmovie = new javax.swing.JTextField();
        verify = new javax.swing.JButton();
        newpass = new javax.swing.JLabel();
        txtnewpass = new javax.swing.JPasswordField();
        updatepass = new javax.swing.JButton();
        loginpage = new javax.swing.JButton();
        conpass = new javax.swing.JLabel();
        txtconpass = new javax.swing.JPasswordField();
        favmovie = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1100, 650));

        image.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        image.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 537, -1));

        txtarea.setBackground(new java.awt.Color(255, 204, 204));

        heading.setFont(new java.awt.Font("Stencil", 0, 42)); // NOI18N
        heading.setText("Forget Password");

        email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        email.setText("Email");

        txtfavmovie.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        verify.setBackground(new java.awt.Color(0, 153, 0));
        verify.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        verify.setForeground(new java.awt.Color(255, 255, 255));
        verify.setText("Verify");
        verify.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyActionPerformed(evt);
            }
        });

        newpass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        newpass.setText("New Password");

        txtnewpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnewpassActionPerformed(evt);
            }
        });

        updatepass.setBackground(new java.awt.Color(153, 0, 0));
        updatepass.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        updatepass.setForeground(new java.awt.Color(255, 255, 0));
        updatepass.setText("Update Password");
        updatepass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updatepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatepassActionPerformed(evt);
            }
        });

        loginpage.setBackground(new java.awt.Color(0, 102, 102));
        loginpage.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        loginpage.setForeground(new java.awt.Color(255, 255, 102));
        loginpage.setText("Back To Login Page");
        loginpage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginpageActionPerformed(evt);
            }
        });

        conpass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        conpass.setText("Confirm Password");

        txtconpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconpassActionPerformed(evt);
            }
        });

        favmovie.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        favmovie.setText("What is your Favorite Movie?");

        txtemail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout txtareaLayout = new javax.swing.GroupLayout(txtarea);
        txtarea.setLayout(txtareaLayout);
        txtareaLayout.setHorizontalGroup(
            txtareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtareaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(heading)
                .addGap(91, 91, 91))
            .addGroup(txtareaLayout.createSequentialGroup()
                .addGroup(txtareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtareaLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(txtareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfavmovie, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(conpass, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnewpass, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newpass, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(favmovie, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(txtareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, txtareaLayout.createSequentialGroup()
                                    .addComponent(updatepass, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(loginpage, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtconpass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(txtareaLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(verify, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        txtareaLayout.setVerticalGroup(
            txtareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtareaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(favmovie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfavmovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(verify, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(newpass)
                .addGap(18, 18, 18)
                .addComponent(txtnewpass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(conpass)
                .addGap(18, 18, 18)
                .addComponent(txtconpass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(txtareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updatepass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginpage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnewpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnewpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnewpassActionPerformed

    private void loginpageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginpageActionPerformed
       
       Login LoginFrame = new Login();
       LoginFrame.setVisible(true);
       LoginFrame.pack();
       LoginFrame.setLocationRelativeTo(null);  // Centers the frame on the screen
       this.dispose();
    }//GEN-LAST:event_loginpageActionPerformed

    private void txtconpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconpassActionPerformed

    private void updatepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatepassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatepassActionPerformed

    private void verifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyActionPerformed
         java.sql.Connection con = null;
        java.sql.PreparedStatement pst = null;
        java.sql.ResultSet rs = null;
    try {

        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movierecsystem", "root", "kanishka");

        String query = "SELECT * FROM movierecsystem.userlogin WHERE emailid=? AND favmovie=?";
        pst = con.prepareStatement(query);
        pst.setString(1, email.getText());
        pst.setString(2, favmovie.getText());

        rs = pst.executeQuery();
        if (rs.next()) {
            txtnewpass.setText(rs.getString("password_column_name")); // Replace with actual column name
        } else {
            JOptionPane.showMessageDialog(this, "Email ID and Security Answer are wrong.");
            txtconpass.setText("");
            txtnewpass.setText("");
        }
    } catch (ClassNotFoundException | SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "An error occurred while verifying your details.");
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
} 
    }//GEN-LAST:event_verifyActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgetPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel conpass;
    private javax.swing.JLabel email;
    private javax.swing.JLabel favmovie;
    private javax.swing.JLabel heading;
    private javax.swing.JPanel image;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginpage;
    private javax.swing.JLabel newpass;
    private javax.swing.JPanel txtarea;
    private javax.swing.JPasswordField txtconpass;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfavmovie;
    private javax.swing.JPasswordField txtnewpass;
    private javax.swing.JButton updatepass;
    private javax.swing.JButton verify;
    // End of variables declaration//GEN-END:variables
}
