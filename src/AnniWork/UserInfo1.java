/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AnniWork;

/**
 *
 * @author alokk
 */
public class UserInfo1 extends javax.swing.JFrame {

    /**
     * Creates new form UserIcon
     */
    
    
    public UserInfo1() {
        initComponents();
        EditMailtxt.setVisible(false);
        EditNametxt.setVisible(false);
        EditNumtxt.setVisible(false);
        ConfirmPassword.setVisible(false);
        NewPassword.setVisible(false);
        ChangePass_Button.setVisible(false);
        EditBackButton.setVisible(false);
        EditProfileButton.setVisible(false);
        BackButton.setVisible(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserInfoPanel = new javax.swing.JPanel();
        UserInfoLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        NumLabel = new javax.swing.JLabel();
        MailLabel = new javax.swing.JLabel();
        Nametxt = new javax.swing.JTextField();
        Numtxt = new javax.swing.JTextField();
        Mailtxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        SidePanel = new javax.swing.JPanel();
        UserIcon = new javax.swing.JLabel();
        HeyUserLabel = new javax.swing.JLabel();
        EditButton = new javax.swing.JButton();
        ChangeButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        EditPanel = new javax.swing.JPanel();
        EditNameLabel = new javax.swing.JLabel();
        EditMailLabel = new javax.swing.JLabel();
        EditNumLabel = new javax.swing.JLabel();
        EditProfileButton = new javax.swing.JButton();
        EditBackButton = new javax.swing.JButton();
        EditNametxt = new javax.swing.JTextField();
        EditMailtxt = new javax.swing.JTextField();
        EditNumtxt = new javax.swing.JTextField();
        ChangePassPanel = new javax.swing.JPanel();
        ChangePasswordLabel = new javax.swing.JLabel();
        ConfirmLabel = new javax.swing.JLabel();
        ChangePass_Button = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        NewPassword = new javax.swing.JPasswordField();
        ConfirmPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Info");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserInfoPanel.setBackground(new java.awt.Color(204, 204, 204));

        UserInfoLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 42)); // NOI18N
        UserInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserInfoLabel.setText("User Information");
        UserInfoLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 102, 0)));

        NameLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        NameLabel.setText("Name");

        NumLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        NumLabel.setText("Mobile Number");

        MailLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        MailLabel.setText("Email");

        Nametxt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        Numtxt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Numtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumtxtActionPerformed(evt);
            }
        });

        Mailtxt.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout UserInfoPanelLayout = new javax.swing.GroupLayout(UserInfoPanel);
        UserInfoPanel.setLayout(UserInfoPanelLayout);
        UserInfoPanelLayout.setHorizontalGroup(
            UserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserInfoPanelLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(UserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserInfoPanelLayout.createSequentialGroup()
                        .addComponent(NumLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Numtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UserInfoPanelLayout.createSequentialGroup()
                        .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(UserInfoPanelLayout.createSequentialGroup()
                        .addGroup(UserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Mailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UserInfoPanelLayout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addComponent(UserInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );
        UserInfoPanelLayout.setVerticalGroup(
            UserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserInfoPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(UserInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addGroup(UserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel)
                    .addComponent(Nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(UserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Numtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumLabel))
                .addGap(75, 75, 75)
                .addGroup(UserInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MailLabel))
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(UserInfoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 0, 790, 650));

        SidePanel.setBackground(new java.awt.Color(102, 102, 102));

        UserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg/voice_13125512 (2).png"))); // NOI18N

        HeyUserLabel.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        HeyUserLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeyUserLabel.setText("HEY USER !!!");
        HeyUserLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 102, 0)));

        EditButton.setBackground(new java.awt.Color(102, 102, 102));
        EditButton.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        EditButton.setText("EDIT PROFILE");
        EditButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51), 3));
        EditButton.setPreferredSize(new java.awt.Dimension(96, 25));
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        ChangeButton.setBackground(new java.awt.Color(102, 102, 102));
        ChangeButton.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        ChangeButton.setText("CHANGE PASSWORD");
        ChangeButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 102, 0), 3));
        ChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeButtonActionPerformed(evt);
            }
        });

        ExitButton.setBackground(new java.awt.Color(102, 102, 102));
        ExitButton.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        ExitButton.setText("EXIT");
        ExitButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(225, 102, 0), 3));
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SidePanelLayout = new javax.swing.GroupLayout(SidePanel);
        SidePanel.setLayout(SidePanelLayout);
        SidePanelLayout.setHorizontalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addGroup(SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SidePanelLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(SidePanelLayout.createSequentialGroup()
                                .addComponent(HeyUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
                            .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ChangeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(EditButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(SidePanelLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(UserIcon)))
                .addGap(85, 85, 85))
        );
        SidePanelLayout.setVerticalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(UserIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HeyUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(ChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        getContentPane().add(SidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 650));

        EditPanel.setBackground(new java.awt.Color(204, 204, 204));

        EditNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EditNameLabel.setText("Name");

        EditMailLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EditMailLabel.setText("Emaill");

        EditNumLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EditNumLabel.setText("Mobile Number");

        EditProfileButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EditProfileButton.setText("Save Changes");
        EditProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditProfileButtonActionPerformed(evt);
            }
        });

        EditBackButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EditBackButton.setText("Back");
        EditBackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBackButtonMouseClicked(evt);
            }
        });

        EditNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditNametxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EditPanelLayout = new javax.swing.GroupLayout(EditPanel);
        EditPanel.setLayout(EditPanelLayout);
        EditPanelLayout.setHorizontalGroup(
            EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EditPanelLayout.createSequentialGroup()
                .addGroup(EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(EditPanelLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(EditNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EditNumLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(EditMailLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                        .addGroup(EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EditNumtxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditMailtxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditNametxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(EditPanelLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(EditProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EditBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72))
        );
        EditPanelLayout.setVerticalGroup(
            EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EditPanelLayout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addGroup(EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditMailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditMailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditNumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(138, 138, 138)
                .addGroup(EditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
        );

        getContentPane().add(EditPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 790, 650));

        ChangePassPanel.setBackground(new java.awt.Color(204, 204, 204));
        ChangePassPanel.setPreferredSize(new java.awt.Dimension(790, 444));

        ChangePasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ChangePasswordLabel.setText("Enter New Password");

        ConfirmLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ConfirmLabel.setText("Confirm Password");

        ChangePass_Button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ChangePass_Button.setText("Change Password");
        ChangePass_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePass_ButtonActionPerformed(evt);
            }
        });

        BackButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BackButton.setText("Back");
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        NewPassword.setText("jPasswordField1");

        ConfirmPassword.setText("jPasswordField2");

        javax.swing.GroupLayout ChangePassPanelLayout = new javax.swing.GroupLayout(ChangePassPanel);
        ChangePassPanel.setLayout(ChangePassPanelLayout);
        ChangePassPanelLayout.setHorizontalGroup(
            ChangePassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangePassPanelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(ChangePass_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ChangePassPanelLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(ChangePassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ChangePassPanelLayout.createSequentialGroup()
                        .addComponent(ConfirmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                        .addComponent(ConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ChangePassPanelLayout.createSequentialGroup()
                        .addComponent(ChangePasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(130, 130, 130))
        );
        ChangePassPanelLayout.setVerticalGroup(
            ChangePassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangePassPanelLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(ChangePassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChangePasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ChangePassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(195, 195, 195)
                .addGroup(ChangePassPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChangePass_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94))
        );

        getContentPane().add(ChangePassPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 790, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NumtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumtxtActionPerformed

    private void ChangePass_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePass_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChangePass_ButtonActionPerformed

    private void EditNametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditNametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditNametxtActionPerformed

    private void EditProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditProfileButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditProfileButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackButtonActionPerformed

    private void EditBackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBackButtonMouseClicked
        // TODO add your handling code here:
        UserInfoPanel.setVisible(true);
        ChangePassPanel.setVisible(false);
        EditPanel.setVisible(false);
    }//GEN-LAST:event_EditBackButtonMouseClicked

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        // TODO add your handling code here:
        UserInfoPanel.setVisible(true);
        ChangePassPanel.setVisible(false);
        EditPanel.setVisible(false);
    }//GEN-LAST:event_BackButtonMouseClicked

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed

        // TODO add your handling code here:
        UserInfoPanel.setVisible(false);
        ChangePassPanel.setVisible(false);
        EditPanel.setVisible(true);
        EditMailtxt.setVisible(true);
        EditNametxt.setVisible(true);
        EditNumtxt.setVisible(true);
        EditBackButton.setVisible(true);
        EditProfileButton.setVisible(true);
    }//GEN-LAST:event_EditButtonActionPerformed

    private void ChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeButtonActionPerformed
        // TODO add your handling code here:
        UserInfoPanel.setVisible(false);
        ChangePassPanel.setVisible(true);
        EditPanel.setVisible(false);
        ConfirmPassword.setVisible(true);
        NewPassword.setVisible(true);
        ChangePass_Button.setVisible(true);
        BackButton.setVisible(true);
    }//GEN-LAST:event_ChangeButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UserInfo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInfo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInfo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInfo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInfo1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton ChangeButton;
    private javax.swing.JPanel ChangePassPanel;
    private javax.swing.JButton ChangePass_Button;
    private javax.swing.JLabel ChangePasswordLabel;
    private javax.swing.JLabel ConfirmLabel;
    private javax.swing.JPasswordField ConfirmPassword;
    private javax.swing.JButton EditBackButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JLabel EditMailLabel;
    private javax.swing.JTextField EditMailtxt;
    private javax.swing.JLabel EditNameLabel;
    private javax.swing.JTextField EditNametxt;
    private javax.swing.JLabel EditNumLabel;
    private javax.swing.JTextField EditNumtxt;
    private javax.swing.JPanel EditPanel;
    private javax.swing.JButton EditProfileButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel HeyUserLabel;
    private javax.swing.JLabel MailLabel;
    private javax.swing.JTextField Mailtxt;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField Nametxt;
    private javax.swing.JPasswordField NewPassword;
    private javax.swing.JLabel NumLabel;
    private javax.swing.JTextField Numtxt;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JLabel UserIcon;
    private javax.swing.JLabel UserInfoLabel;
    private javax.swing.JPanel UserInfoPanel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
