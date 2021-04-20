package LAYOUT;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author levail
 */
public class Users_L extends javax.swing.JFrame {

    /**
     * Creates new form Users
     */
     public Users_L() {
        initComponents();
        
        populateJtable();
        
        jTable_USERS.setShowGrid(true);
        
        jTable_USERS.setGridColor(Color.YELLOW);
        
        jTable_USERS.setSelectionBackground(Color.gray);
        
        JTableHeader th = jTable_USERS.getTableHeader();

        th.setFont(new Font("Tahoma", Font.PLAIN, 16));
    }
 
    public void populateJtable(){
        
        CLASSES.Users user = new CLASSES.Users();
        ArrayList<CLASSES.Users> userList = user.UsersList();
        
        String[] colNames = {"Id","username","password","fullname"};
        Object[][] rows = new Object[userList.size()][6];

        for(int i = 0; i < userList.size(); i++){
          
            rows[i][0] = userList.get(i).getId();
            rows[i][1] = userList.get(i).getUsername();
            rows[i][2] = userList.get(i).getPassword();
            rows[i][3] = userList.get(i).getFullname();
        }
        
        DefaultTableModel mmodel = new DefaultTableModel(rows, colNames);
        jTable_USERS.setModel(mmodel);
        jTable_USERS.setRowHeight(45);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_USERNAME = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_PASSWORD = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_USERS = new javax.swing.JTable();
        jButton_INSERT_ = new javax.swing.JButton();
        jButton_UPDATE_ = new javax.swing.JButton();
        jButton_DELETE_ = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField_FULLNAME = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_FULLNAME1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID:");

        jTextField_ID.setEditable(false);
        jTextField_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Felhasználónév:");

        jTextField_USERNAME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_USERNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_USERNAMEActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jelszó:");

        jTextField_PASSWORD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTable_USERS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_USERS.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jTable_USERS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_USERSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_USERS);

        jButton_INSERT_.setBackground(new java.awt.Color(0, 255, 0));
        jButton_INSERT_.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_INSERT_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_INSERT_.setLabel("Beillesztés");
        jButton_INSERT_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_INSERT_ActionPerformed(evt);
            }
        });

        jButton_UPDATE_.setBackground(new java.awt.Color(65, 131, 215));
        jButton_UPDATE_.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_UPDATE_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_UPDATE_.setLabel("Módosítás");
        jButton_UPDATE_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UPDATE_ActionPerformed(evt);
            }
        });

        jButton_DELETE_.setBackground(new java.awt.Color(255, 0, 0));
        jButton_DELETE_.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_DELETE_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_DELETE_.setLabel("Törlés");
        jButton_DELETE_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DELETE_ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Teljes név:");

        jTextField_FULLNAME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Felhasználó típusa:");

        jTextField_FULLNAME1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_INSERT_, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_UPDATE_, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_DELETE_, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_FULLNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_USERNAME)
                                    .addComponent(jTextField_PASSWORD)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField_FULLNAME1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_USERNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField_FULLNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField_FULLNAME1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_INSERT_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_UPDATE_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_DELETE_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jTable_USERSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_USERSMouseClicked

        Integer rowIndex = jTable_USERS.getSelectedRow();
        jTextField_ID.setText(jTable_USERS.getValueAt(rowIndex, 0).toString());
        jTextField_USERNAME.setText(jTable_USERS.getValueAt(rowIndex, 1).toString());
        jTextField_PASSWORD.setText(jTable_USERS.getValueAt(rowIndex, 2).toString());
        jTextField_FULLNAME.setText(jTable_USERS.getValueAt(rowIndex, 3).toString());
    }//GEN-LAST:event_jTable_USERSMouseClicked

 //adduser
    private void jButton_INSERT_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_INSERT_ActionPerformed
            if(verifFields())
        {
            String uname = jTextField_USERNAME.getText();
            String pass = jTextField_PASSWORD.getText();
            String fname = jTextField_FULLNAME.getText();

            CLASSES.Users user = new CLASSES.Users(null,uname,pass,null,fname);
            CLASSES.Users.AddUser(user);
            populateJtable();
        }
        
    }//GEN-LAST:event_jButton_INSERT_ActionPerformed
//updateuser
    private void jButton_UPDATE_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UPDATE_ActionPerformed
   
    }//GEN-LAST:event_jButton_UPDATE_ActionPerformed
//del user
    private void jButton_DELETE_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DELETE_ActionPerformed
        try{
            Integer id = Integer.valueOf(jTextField_ID.getText());
            CLASSES.Users.deleteUser(id);
            populateJtable(); 
        }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Válasszon ki egy felhasználót!", "Nincs felhasználó kiválasztva!", 1);
                }
        
    }//GEN-LAST:event_jButton_DELETE_ActionPerformed

    private void jTextField_USERNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_USERNAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_USERNAMEActionPerformed

    public boolean verifFields()
    {
        if(jTextField_USERNAME.getText().equals("") || jTextField_PASSWORD.getText().equals("") || jTextField_FULLNAME.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Egy vagy tobb mező üres!", "Minden mező üres!", 0);
            return false;
        }else{
            return true;
        }
    }
    
    
    
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
            java.util.logging.Logger.getLogger(Users_L.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Users_L.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Users_L.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Users_L.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Users_L().setVisible(true);
            }
        });
        //még komment
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_DELETE_;
    private javax.swing.JButton jButton_INSERT_;
    private javax.swing.JButton jButton_UPDATE_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_USERS;
    private javax.swing.JTextField jTextField_FULLNAME;
    private javax.swing.JTextField jTextField_FULLNAME1;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_PASSWORD;
    private javax.swing.JTextField jTextField_USERNAME;
    // End of variables declaration//GEN-END:variables
}
