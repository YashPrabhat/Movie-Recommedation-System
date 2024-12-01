package AnniWork;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WatchList extends javax.swing.JFrame {

  
    private DefaultListModel<String> watchlistModel = new DefaultListModel<>();
    static private String loggedInEmail;
    
    public WatchList(String loggedInEmail) {
        initComponents();
        this.loggedInEmail = loggedInEmail;  // Store logged-in email
        watchlistJList.setModel(watchlistModel);
        
        loadWatchlistFromDatabase();
        
       

    }
    
    // Load user's watchlist from the database based on the email
    private void loadWatchlistFromDatabase() {
        
        try (Connection conn = Connect.ConnectToDB()) {
            String query = "SELECT movie_name FROM watchlist WHERE email = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, loggedInEmail);
                ResultSet rs = stmt.executeQuery();
                
                // Clear any existing items
                watchlistModel.clear();

                while (rs.next()) {
                    String movie = rs.getString("movie_name");
                    watchlistModel.addElement(movie);  // Add movie to the list
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error loading watchlist: " + ex.getMessage());
        }
    }
    
    private void addMovieToWatchlist(String movieName) {
    if (movieName == null || movieName.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Movie name cannot be empty.");
        return;
    }

    try (Connection conn = Connect.ConnectToDB()) {
       
        String checkQuery = "SELECT COUNT(*) FROM watchlist WHERE email = ? AND movie_name = ?";
        try (PreparedStatement checkStmt = conn.prepareStatement(checkQuery)) {
            checkStmt.setString(1, loggedInEmail);
            checkStmt.setString(2, movieName);
            ResultSet rs = checkStmt.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                JOptionPane.showMessageDialog(this, "This movie is already in your watchlist.");
                return;
            }
        }

        // Insert the movie into the watchlist
        String query = "INSERT INTO watchlist (email, movie_name) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, loggedInEmail);
            stmt.setString(2, movieName);
            stmt.executeUpdate();
            watchlistModel.addElement(movieName); // Add movie to the JList
            JOptionPane.showMessageDialog(this, "Movie added to watchlist!");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error adding movie: " + ex.getMessage());
    }
}

     
    // Remove movie from watchlist
    private void removeMovieFromWatchlist(String movieName) {
        try (Connection conn = Connect.ConnectToDB()) {
            String query = "DELETE FROM watchlist WHERE email = ? AND movie_name = ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, loggedInEmail);
                stmt.setString(2, movieName);
                stmt.executeUpdate();
                watchlistModel.removeElement(movieName);  // Remove from JList
                JOptionPane.showMessageDialog(this, "Movie removed from watchlist.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error removing movie: " + ex.getMessage());
        }
    }
    
    
   private void searchMovies(String searchQuery) {
    String[] genreTables = {"action", "adventure", "drama", "horror", "scifi"};
    
    try (Connection conn = Connect.ConnectToDB()) {
        
        jComboBox.removeAllItems();
        
        // Loop through each genre table
        for (String table : genreTables) {
            String query = "SELECT movie_name FROM " + table + " WHERE movie_name LIKE ?";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, "%" + searchQuery + "%");  // Search query for matching movie names
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    String movie = rs.getString("movie_name");
                    jComboBox.addItem(movie); // Add movie to ComboBox suggestions
                }
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error searching for movies: " + ex.getMessage());
    }
}

    
   
private boolean isMovieAlreadyInComboBox(String movie) {
    for (int i = 0; i < jComboBox.getItemCount(); i++) {
        if (jComboBox.getItemAt(i).equals(movie)) {
            return true; // Movie already exists
        }
    }
    return false; // Movie not found
}


  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        empty = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        watchlistJList = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        searchtxt = new javax.swing.JTextField();
        searchicon = new javax.swing.JLabel();
        SearchButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        RemoveButton = new javax.swing.JButton();
        jComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Castellar", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("MOVIE WATCHLIST");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                        .addContainerGap(264, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181)))
                .addComponent(jLabel2)
                .addGap(41, 41, 41))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );

        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1100, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Your Watchlist");

        empty.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        empty.setForeground(new java.awt.Color(204, 204, 204));
        empty.setText("This list is empty");

        watchlistJList.setBackground(new java.awt.Color(153, 153, 153));
        watchlistJList.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jScrollPane1.setViewportView(watchlistJList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(empty)
                .addGap(46, 46, 46))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(empty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 129, 770, 520));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        searchtxt.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        searchtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchtxt.setText("Type here..");
        searchtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        searchtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchtxtMouseClicked(evt);
            }
        });
        searchtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtxtActionPerformed(evt);
            }
        });
        searchtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchtxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtxtKeyReleased(evt);
            }
        });

        SearchButton.setBackground(new java.awt.Color(0, 0, 0));
        SearchButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        SearchButton.setForeground(new java.awt.Color(255, 255, 51));
        SearchButton.setText("Search...");
        SearchButton.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 0)));
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        AddButton.setBackground(new java.awt.Color(51, 153, 0));
        AddButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AddButton.setText("Add");
        AddButton.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 0)));
        AddButton.setPreferredSize(new java.awt.Dimension(62, 26));
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        RemoveButton.setBackground(new java.awt.Color(204, 0, 0));
        RemoveButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RemoveButton.setText("Remove");
        RemoveButton.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 0, 0)));
        RemoveButton.setPreferredSize(new java.awt.Dimension(62, 26));
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No result yet" }));
        jComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxItemStateChanged(evt);
            }
        });
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 51));
        jButton1.setText("BACK TO DASHBOARD");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(searchicon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddButton, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(RemoveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchtxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchicon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(searchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 330, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchtxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchtxtMouseClicked
        // TODO add your handling code here:
        searchtxt.setText("");
    }//GEN-LAST:event_searchtxtMouseClicked

    private void searchtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtxtActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_searchtxtActionPerformed

    private void searchtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtKeyPressed

    }//GEN-LAST:event_searchtxtKeyPressed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
        String movie = searchtxt.getText();
        if(!movie.isEmpty())
        {
            watchlistModel.addElement(movie); //TO ADD MOVIE
            searchtxt.setText("");
            empty.setText("");

        }
        else
        {
            JOptionPane.showMessageDialog(this,"Please Enter a movie name");
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
        int selectedIndex = watchlistJList.getSelectedIndex();

        if (selectedIndex != -1)
        {
            int response = JOptionPane.showConfirmDialog(this,"Are you sure you want to delete this movie ?");

            if ( response == JOptionPane.YES_OPTION)
            {
                watchlistModel.remove(selectedIndex); //remove the movie selected
                if (watchlistModel.getSize() ==  0)
                {
                    empty.setText("This list is empty");
                }

            }
            else
            {
                JOptionPane.showMessageDialog(this, "Please select a movie to remove","ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_RemoveButtonActionPerformed

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        // TODO add your handling code here:
        // Set the selected movie from ComboBox to the search text field
    String selectedMovie = (String) jComboBox.getSelectedItem();
    if (selectedMovie != null) {
        searchtxt.setText(selectedMovie);  // Set selected movie in search text field
        jComboBox.removeAllItems(); // Optionally clear ComboBox after selection
    }
    }//GEN-LAST:event_jComboBoxActionPerformed

    private void searchtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtKeyReleased
        // TODO add your handling code here:
       String searchQuery = searchtxt.getText().trim();
    if (!searchQuery.isEmpty()) {
        searchMovies(searchQuery); // Search movies based on user input
    } else {
        jComboBox.removeAllItems(); // Clear dropdown if search query is empty
    }
    }//GEN-LAST:event_searchtxtKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dashboard dashboardFrame = new dashboard(loggedInEmail);  // Corrected the typo to Dashboard
        dashboardFrame.setVisible(true);              // Makes the frame visible
        dashboardFrame.pack();                       // Adjusts the frame size to fit its components
        dashboardFrame.setLocationRelativeTo(null);  // Centers the frame on the screen
    this.dispose(); 

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxItemStateChanged

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
            java.util.logging.Logger.getLogger(WatchList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WatchList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WatchList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WatchList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WatchList(loggedInEmail).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JPanel Header;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JLabel empty;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel searchicon;
    private javax.swing.JTextField searchtxt;
    private javax.swing.JList<String> watchlistJList;
    // End of variables declaration//GEN-END:variables
}