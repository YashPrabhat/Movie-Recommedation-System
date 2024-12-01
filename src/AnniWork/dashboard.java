
package AnniWork;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
public class dashboard extends javax.swing.JFrame {

    
    private String loggedInEmail;  // Store the logged-in email


     public dashboard(String loggedInEmail) {
        initComponents();  // Initialize the components
        this.loggedInEmail = loggedInEmail;  // Store the logged-in email
    }
    public dashboard() {
        initComponents();
        show(position);
    }
    int position=0;
    public String[] takeimage() {
    File f = new File(getClass().getResource("/posters").getFile());
    String[] Images = f.list();
    return Images;
}

    public void show(int index) {
        String[] Images = takeimage();
        String img = Images[index];
        ImageIcon icon = new ImageIcon(getClass().getResource("/posters/" + img));
        Image image = icon.getImage().getScaledInstance(slideshow.getWidth(), slideshow.getHeight(), Image.SCALE_SMOOTH);
        slideshow.setIcon(new ImageIcon(image));
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
        slideshow = new javax.swing.JLabel();
        jButton_Profile = new javax.swing.JButton();
        jButton_Watchlist = new javax.swing.JButton();
        jButton_NewRec = new javax.swing.JButton();
        jButton_Gems = new javax.swing.JButton();
        jButton_TopImdb = new javax.swing.JButton();
        jButton_Rate = new javax.swing.JButton();
        jButton_Rate1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard\n");

        Background.setBackground(new java.awt.Color(43, 41, 41));

        Header.setBackground(new java.awt.Color(0, 0, 0));

        Dashboard.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        Dashboard.setForeground(new java.awt.Color(204, 204, 204));
        Dashboard.setText("DAshboard");

        jLabel1_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dashboard.png"))); // NOI18N
        jLabel1_menu.setText("jLabel1");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
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
        jButton_leftArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_leftArrowMousePressed(evt);
            }
        });
        jButton_leftArrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_leftArrowActionPerformed(evt);
            }
        });

        jButton_rightArrow.setBackground(new java.awt.Color(0, 0, 0));
        jButton_rightArrow.setForeground(new java.awt.Color(255, 255, 255));
        jButton_rightArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/right_arrow.png"))); // NOI18N
        jButton_rightArrow.setBorder(null);
        jButton_rightArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_rightArrowMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton_rightArrowMousePressed(evt);
            }
        });
        jButton_rightArrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_rightArrowActionPerformed(evt);
            }
        });

        slideshow.setText("jLabel1");

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_leftArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(slideshow, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jButton_rightArrow, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(jLabel_heading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_fire, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_fire)
                    .addComponent(jLabel_heading))
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_rightArrow)
                        .addGap(264, 264, 264))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(slideshow, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MenuLayout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jButton_leftArrow)))
                        .addContainerGap(29, Short.MAX_VALUE))))
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
        jButton_NewRec.setText(" Recommendation");
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
        jButton_TopImdb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TopImdbActionPerformed(evt);
            }
        });

        jButton_Rate.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Rate.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButton_Rate.setForeground(new java.awt.Color(204, 204, 204));
        jButton_Rate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/videographer.png"))); // NOI18N
        jButton_Rate.setText("  Documentaries");
        jButton_Rate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton_Rate1.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Rate1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButton_Rate1.setForeground(new java.awt.Color(204, 204, 204));
        jButton_Rate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/satisfaction.png"))); // NOI18N
        jButton_Rate1.setText("  Ratings & Reviews");
        jButton_Rate1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_Profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Watchlist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_NewRec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Gems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_TopImdb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Rate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Rate1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(jButton_Rate, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Rate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void jButton_ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ProfileActionPerformed
        UserInfo UserInfoFrame = new UserInfo(loggedInEmail);
        UserInfoFrame.setVisible(true);
        UserInfoFrame.pack();
        UserInfoFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton_ProfileActionPerformed

    private void jButton_WatchlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_WatchlistActionPerformed
        WatchList watchlistFrame = new WatchList(loggedInEmail);
        watchlistFrame.setVisible(true);
        watchlistFrame.pack();
        watchlistFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton_WatchlistActionPerformed

    private void jButton_NewRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NewRecActionPerformed
//       Recommendationpage RecFrame = new Recommendationpage();
//        RecFrame.setVisible(true);
//        RecFrame.pack();
//        RecFrame.setLocationRelativeTo(null);
//        this.dispose();
    }//GEN-LAST:event_jButton_NewRecActionPerformed

    private void jButton_leftArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_leftArrowActionPerformed

    }//GEN-LAST:event_jButton_leftArrowActionPerformed

    private void jButton_rightArrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_rightArrowActionPerformed
      
    }//GEN-LAST:event_jButton_rightArrowActionPerformed

    private void jButton_rightArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_rightArrowMouseClicked
    
    }//GEN-LAST:event_jButton_rightArrowMouseClicked

    private void jButton_rightArrowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_rightArrowMousePressed
        
         new Thread();
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        int p=this.slideshow.getX();
        if (p > -1) 
        {
            Animacion.Animacion.mover_izquierda(1200, 85, 1, 2, slideshow);
        }
        position = position + 1;
        if (position >= takeimage().length) {
            position = 0; 
        }
        show(position);
    }//GEN-LAST:event_jButton_rightArrowMousePressed

    private void jButton_leftArrowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_leftArrowMousePressed
        new Thread();
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        int p=this.slideshow.getX();
        if (p > -1) 
        {
            Animacion.Animacion.mover_izquierda(1200, 85, 1, 2, slideshow);
        }
        position = position - 1;
        if (position <0 ) {
            position = takeimage().length - 1;
        }
        show(position);
        
    }//GEN-LAST:event_jButton_leftArrowMousePressed

    private void jButton_TopImdbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TopImdbActionPerformed
        topImdb topImdbFrame = new topImdb();
        topImdbFrame.setVisible(true);
        topImdbFrame.pack();
        topImdbFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton_TopImdbActionPerformed


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
    private javax.swing.JButton jButton_Rate1;
    private javax.swing.JButton jButton_TopImdb;
    private javax.swing.JButton jButton_Watchlist;
    private javax.swing.JButton jButton_leftArrow;
    private javax.swing.JButton jButton_rightArrow;
    private javax.swing.JLabel jLabel1_menu;
    private javax.swing.JLabel jLabel_fire;
    private javax.swing.JLabel jLabel_heading;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel slideshow;
    // End of variables declaration//GEN-END:variables
}
