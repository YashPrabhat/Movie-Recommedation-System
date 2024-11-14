
package AnniWork;


public class dashboard extends javax.swing.JFrame {


    public dashboard() {
        initComponents();
      
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Background = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        Dashboard = new javax.swing.JLabel();
        jLabel1_menu = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        jLabel_heading = new javax.swing.JLabel();
        jLabel_fire = new javax.swing.JLabel();
        jButton_leftArrow = new javax.swing.JButton();
        jButton_rightArrow = new javax.swing.JButton();
        jButton_Profile = new javax.swing.JButton();
        jButton_Watchlist = new javax.swing.JButton();
        jButton_NewRec = new javax.swing.JButton();
        jButton_Gems = new javax.swing.JButton();
        jButton_TopImdb = new javax.swing.JButton();
        jButton_Rate = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard\n");

        Background.setBackground(new java.awt.Color(43, 41, 41));

        Header.setBackground(new java.awt.Color(0, 0, 0));

        Dashboard.setFont(new java.awt.Font("Castellar", 1, 30)); // NOI18N
        Dashboard.setForeground(new java.awt.Color(204, 204, 204));
        Dashboard.setText("DAshboard");

        jLabel1_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dashboard.png"))); // NOI18N
        jLabel1_menu.setText("jLabel1");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1_menu)
                .addContainerGap())
        );

        Menu.setBackground(new java.awt.Color(0, 0, 0));

        jLabel_heading.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel_heading.setForeground(new java.awt.Color(255, 255, 153));
        jLabel_heading.setText("MUST WATCH !");

        jLabel_fire.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flames.png"))); // NOI18N

        jButton_leftArrow.setBackground(new java.awt.Color(0, 0, 0));
        jButton_leftArrow.setForeground(new java.awt.Color(255, 255, 255));
        jButton_leftArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left_arrow.png"))); // NOI18N
        jButton_leftArrow.setBorder(null);
        jButton_leftArrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_leftArrowActionPerformed(evt);
            }
        });

        jButton_rightArrow.setBackground(new java.awt.Color(0, 0, 0));
        jButton_rightArrow.setForeground(new java.awt.Color(255, 255, 255));
        jButton_rightArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/right_arrow.png"))); // NOI18N
        jButton_rightArrow.setBorder(null);
        jButton_rightArrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_rightArrowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel_heading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_fire, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(MenuLayout.createSequentialGroup()
                .addComponent(jButton_leftArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_rightArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_heading)
                    .addComponent(jLabel_fire))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_leftArrow)
                    .addComponent(jButton_rightArrow))
                .addGap(209, 209, 209))
        );

        jButton_Profile.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Profile.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButton_Profile.setForeground(new java.awt.Color(204, 204, 204));
        jButton_Profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile.png"))); // NOI18N
        jButton_Profile.setText("   Your Profile");
        jButton_Profile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ProfileActionPerformed(evt);
            }
        });

        jButton_Watchlist.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Watchlist.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButton_Watchlist.setForeground(new java.awt.Color(204, 204, 204));
        jButton_Watchlist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/watchlist.png"))); // NOI18N
        jButton_Watchlist.setText("    Watchlist");
        jButton_Watchlist.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Watchlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_WatchlistActionPerformed(evt);
            }
        });

        jButton_NewRec.setBackground(new java.awt.Color(0, 0, 0));
        jButton_NewRec.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButton_NewRec.setForeground(new java.awt.Color(204, 204, 204));
        jButton_NewRec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new.png"))); // NOI18N
        jButton_NewRec.setText("Recommendation");
        jButton_NewRec.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_NewRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NewRecActionPerformed(evt);
            }
        });

        jButton_Gems.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Gems.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButton_Gems.setForeground(new java.awt.Color(204, 204, 204));
        jButton_Gems.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gemstone.png"))); // NOI18N
        jButton_Gems.setText("   Hidden Gems");
        jButton_Gems.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton_TopImdb.setBackground(new java.awt.Color(0, 0, 0));
        jButton_TopImdb.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButton_TopImdb.setForeground(new java.awt.Color(204, 204, 204));
        jButton_TopImdb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/top_imdb.png"))); // NOI18N
        jButton_TopImdb.setText("  Top IMDB");
        jButton_TopImdb.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton_Rate.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Rate.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButton_Rate.setForeground(new java.awt.Color(204, 204, 204));
        jButton_Rate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/satisfaction.png"))); // NOI18N
        jButton_Rate.setText("  Ratings & Reviews");
        jButton_Rate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Watchlist, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_NewRec, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Gems, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_TopImdb, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Rate, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(jButton_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Watchlist, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_NewRec, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Gems, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_TopImdb, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Rate, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void jButton_ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_ProfileActionPerformed

    private void jButton_WatchlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_WatchlistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_WatchlistActionPerformed

    private void jButton_NewRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NewRecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_NewRecActionPerformed

    private void jButton_leftArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_leftArrowActionPerformed

    }//GEN-LAST:event_jButton_leftArrowActionPerformed

    private void jButton_rightArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_rightArrowActionPerformed
      
    }//GEN-LAST:event_jButton_rightArrowActionPerformed


    public static void main(String args[]) {
 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Dashboard;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Gems;
    private javax.swing.JButton jButton_NewRec;
    private javax.swing.JButton jButton_Profile;
    private javax.swing.JButton jButton_Rate;
    private javax.swing.JButton jButton_TopImdb;
    private javax.swing.JButton jButton_Watchlist;
    private javax.swing.JButton jButton_leftArrow;
    private javax.swing.JButton jButton_rightArrow;
    private javax.swing.JLabel jLabel1_menu;
    private javax.swing.JLabel jLabel_fire;
    private javax.swing.JLabel jLabel_heading;
    // End of variables declaration//GEN-END:variables
}
