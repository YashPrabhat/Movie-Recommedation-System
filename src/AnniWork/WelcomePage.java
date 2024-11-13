
package AnniWork;


public class WelcomePage extends javax.swing.JFrame {


    public WelcomePage() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        Heading = new javax.swing.JLabel();
        GetStarted = new javax.swing.JButton();
        TagLine = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome");
        setPreferredSize(new java.awt.Dimension(1100, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(0, 0, 0));

        Heading.setBackground(new java.awt.Color(0, 0, 0));
        Heading.setFont(new java.awt.Font("Stencil", 0, 43)); // NOI18N
        Heading.setForeground(new java.awt.Color(255, 255, 102));
        Heading.setText("MOVIE  RECOMMENDATION  SYSTEM");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(Heading)
                .addContainerGap())
        );

        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 90));

        GetStarted.setBackground(new java.awt.Color(147, 0, 0));
        GetStarted.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        GetStarted.setForeground(new java.awt.Color(255, 255, 255));
        GetStarted.setText("Get Started!");
        GetStarted.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        GetStarted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetStartedActionPerformed(evt);
            }
        });
        getContentPane().add(GetStarted, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 230, 50));

        TagLine.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        TagLine.setForeground(new java.awt.Color(255, 255, 255));
        TagLine.setText("Let us guide you to your next favorite story on screen.");
        getContentPane().add(TagLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 660, 30));

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("1000+                                        500+                                          10+  ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, 1040, 30));

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("MOVIES                               ACTORS                              GENRES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 990, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1099, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GetStartedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetStartedActionPerformed
       Login LoginFrame = new Login();
       LoginFrame.setVisible(true);
       LoginFrame.pack();
       LoginFrame.setLocationRelativeTo(null);  // Centers the frame on the screen
       this.dispose();
    }//GEN-LAST:event_GetStartedActionPerformed

 
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GetStarted;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel Heading;
    private javax.swing.JLabel TagLine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
