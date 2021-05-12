package LAYOUT;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
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
public class Category_L extends javax.swing.JFrame {


    Integer position = 0;
    CLASSES.Category category = new CLASSES.Category();
    public Category_L() {
       initComponents();
        populateJtable();
        try{
            jTable_CATEGORIES_MouseClicked(null);
        }catch(Exception ex){
            
        }
            
        
        
        jTable_CATEGORIES_.setShowGrid(true);
        
        jTable_CATEGORIES_.setGridColor(Color.YELLOW);
        
        jTable_CATEGORIES_.setSelectionBackground(Color.gray);
        
        JTableHeader th = jTable_CATEGORIES_.getTableHeader();

        th.setFont(new Font("Tahoma", Font.PLAIN, 16));
    }
    
    public void populateJtable(){
        
        ArrayList<CLASSES.Category> CategoryList = category.categoriesList();
        
        String[] colNames = {"Id","Name"};
        Object[][] rows = new Object[CategoryList.size()][2];
        DefaultTableModel model = (DefaultTableModel) jTable_CATEGORIES_.getModel();
        
        for(int i = 0; i < CategoryList.size(); i++){
            rows[i][0] = CategoryList.get(i).getId();
            rows[i][1] = CategoryList.get(i).getName();
        }
        
        model.setDataVector(rows, colNames);

        jTable_CATEGORIES_.setModel(model);
        jTable_CATEGORIES_.setRowHeight(45);
    }
    public void populateProductsList(Integer categoryId){
        
        CLASSES.Product prd = new CLASSES.Product();

        ArrayList<CLASSES.Product> ProductList = prd.productsInCategoryList(categoryId);
          DefaultListModel model = new DefaultListModel(); 
        
        for(int i = 0; i < ProductList.size(); i++){
            
          model.addElement(ProductList.get(i).getName());

        }
        jList_PRODUCTS_IN_CATEGORY.setModel(model);

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_CATEGORIES_ = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList_PRODUCTS_IN_CATEGORY = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField_CATEGORY_ID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_CATEGORY_NAME = new javax.swing.JTextField();
        jButton_INSERT_CATEGORY_ = new javax.swing.JButton();
        jButton_UPDATE_CATEGORY_ = new javax.swing.JButton();
        jButton_DELETE_CATEGORY_ = new javax.swing.JButton();
        jButton_NEXT_ = new javax.swing.JButton();
        jButton_PREVIOUS_ = new javax.swing.JButton();
        jButton_SHOW_PRODUCTS_IN_CATEGORY = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        jTable_CATEGORIES_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_CATEGORIES_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_CATEGORIES_MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_CATEGORIES_);

        jScrollPane2.setViewportView(jList_PRODUCTS_IN_CATEGORY);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID:");

        jTextField_CATEGORY_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_CATEGORY_ID.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Név:");

        jTextField_CATEGORY_NAME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton_INSERT_CATEGORY_.setBackground(new java.awt.Color(0, 255, 0));
        jButton_INSERT_CATEGORY_.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_INSERT_CATEGORY_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_INSERT_CATEGORY_.setText("Új kategória hozzáadása");
        jButton_INSERT_CATEGORY_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_INSERT_CATEGORY_ActionPerformed(evt);
            }
        });

        jButton_UPDATE_CATEGORY_.setBackground(new java.awt.Color(65, 131, 215));
        jButton_UPDATE_CATEGORY_.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_UPDATE_CATEGORY_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_UPDATE_CATEGORY_.setText("Kategória módosítása");
        jButton_UPDATE_CATEGORY_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UPDATE_CATEGORY_ActionPerformed(evt);
            }
        });

        jButton_DELETE_CATEGORY_.setBackground(new java.awt.Color(255, 0, 0));
        jButton_DELETE_CATEGORY_.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_DELETE_CATEGORY_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_DELETE_CATEGORY_.setText("Kiválasztott kategória törlése");
        jButton_DELETE_CATEGORY_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DELETE_CATEGORY_ActionPerformed(evt);
            }
        });

        jButton_NEXT_.setBackground(new java.awt.Color(34, 49, 63));
        jButton_NEXT_.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_NEXT_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_NEXT_.setText("Következő");
        jButton_NEXT_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NEXT_ActionPerformed(evt);
            }
        });

        jButton_PREVIOUS_.setBackground(new java.awt.Color(34, 49, 63));
        jButton_PREVIOUS_.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_PREVIOUS_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_PREVIOUS_.setText("Előző");
        jButton_PREVIOUS_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PREVIOUS_ActionPerformed(evt);
            }
        });

        jButton_SHOW_PRODUCTS_IN_CATEGORY.setBackground(new java.awt.Color(255, 255, 0));
        jButton_SHOW_PRODUCTS_IN_CATEGORY.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_SHOW_PRODUCTS_IN_CATEGORY.setText("Minden termék ebben a kategóriában");
        jButton_SHOW_PRODUCTS_IN_CATEGORY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SHOW_PRODUCTS_IN_CATEGORYActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Termékek a kiválasztott kategóriában:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_CATEGORY_ID, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(jTextField_CATEGORY_NAME))
                                .addGap(52, 52, 52))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_PREVIOUS_, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_NEXT_, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_UPDATE_CATEGORY_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_INSERT_CATEGORY_, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                            .addComponent(jButton_DELETE_CATEGORY_, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_SHOW_PRODUCTS_IN_CATEGORY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField_CATEGORY_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_CATEGORY_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_PREVIOUS_)
                            .addComponent(jButton_NEXT_))
                        .addGap(53, 53, 53)
                        .addComponent(jButton_INSERT_CATEGORY_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_UPDATE_CATEGORY_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_DELETE_CATEGORY_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_SHOW_PRODUCTS_IN_CATEGORY)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
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

    private void jTable_CATEGORIES_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_CATEGORIES_MouseClicked
       
        Integer rowIndex = jTable_CATEGORIES_.getSelectedRow();
        jTextField_CATEGORY_ID.setText(jTable_CATEGORIES_.getValueAt(rowIndex, 0).toString());
        jTextField_CATEGORY_NAME.setText(jTable_CATEGORIES_.getValueAt(rowIndex, 1).toString());
        
        
        position = rowIndex;
    }//GEN-LAST:event_jTable_CATEGORIES_MouseClicked

    private void jButton_INSERT_CATEGORY_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_INSERT_CATEGORY_ActionPerformed
        try{
            if(!jTextField_CATEGORY_NAME.getText().equals(""))
            {
                category = new CLASSES.Category(null,jTextField_CATEGORY_NAME.getText());
                CLASSES.Category.insertCategory(category);
                populateJtable();
            }else{
                JOptionPane.showMessageDialog(null, "Adja meg a kategória nevét", "Név megadása", 2);
            }
                
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Hiba", 2);
        }  
     
    }//GEN-LAST:event_jButton_INSERT_CATEGORY_ActionPerformed

    private void jButton_UPDATE_CATEGORY_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UPDATE_CATEGORY_ActionPerformed
      try{
        
            if(!jTextField_CATEGORY_NAME.getText().equals(""))
            {
                category = new CLASSES.Category(Integer.valueOf(jTextField_CATEGORY_ID.getText()),jTextField_CATEGORY_NAME.getText());
                CLASSES.Category.updateCategory(category);
                populateJtable();
            }
            else{
                JOptionPane.showMessageDialog(null, "Adja meg a kategória nevét", "Név megadása", 2);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Nincs kategória kiválasztva!", "Hiba!", 2);
        }
    }//GEN-LAST:event_jButton_UPDATE_CATEGORY_ActionPerformed

    private void jButton_DELETE_CATEGORY_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DELETE_CATEGORY_ActionPerformed
       try{
            CLASSES.Category.deleteCategory(Integer.valueOf(jTextField_CATEGORY_ID.getText()));
            jTextField_CATEGORY_ID.setText("");
            jTextField_CATEGORY_NAME.setText("");
            position = 0;
            populateJtable();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Nincs kategória kiválasztva!", "Hiba!", 2);
        }
    }//GEN-LAST:event_jButton_DELETE_CATEGORY_ActionPerformed

    private void jButton_NEXT_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NEXT_ActionPerformed
        if(position == category.categoriesList().size() - 1)
        {
            return;
        }
        
        position ++;
        navigation(position);
        jTable_CATEGORIES_MouseClicked(null);
    }//GEN-LAST:event_jButton_NEXT_ActionPerformed

    private void jButton_PREVIOUS_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PREVIOUS_ActionPerformed
       if(position == 0)
        {
            return;
        }
        position --;
        navigation(position);
        jTable_CATEGORIES_MouseClicked(null);
    }//GEN-LAST:event_jButton_PREVIOUS_ActionPerformed

    private void jButton_SHOW_PRODUCTS_IN_CATEGORYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SHOW_PRODUCTS_IN_CATEGORYActionPerformed
      try{
        
            PROD_FROM_CAT productsInCategoryForm = new PROD_FROM_CAT();
            CLASSES.Product prd = new CLASSES.Product();
            Integer categoryId = Integer.valueOf(jTable_CATEGORIES_.getValueAt(jTable_CATEGORIES_.getSelectedRow(),0).toString());
            ArrayList<CLASSES.Product> ProductList = prd.productsInCategoryList(categoryId);

            String[] colNames = {"Azonosító","Név","Ár","Mennyiség","Raktárhely","Kategória"};
            Object[][] rows = new Object[ProductList.size()][7];

            for(int i = 0; i < ProductList.size(); i++){
                rows[i][0] = ProductList.get(i).getId();
                rows[i][1] = ProductList.get(i).getName();
                rows[i][5] = ProductList.get(i).getCategory_id();
                rows[i][2] = ProductList.get(i).getPrice();
                rows[i][3] = ProductList.get(i).getQuantity();
                rows[i][4] = ProductList.get(i).getPlace();
            }

            DefaultTableModel mmd = new DefaultTableModel(rows, colNames);
            productsInCategoryForm.jTable_PRODUCTS_IN_CATEGORY.setModel(mmd);
            productsInCategoryForm.jTable_PRODUCTS_IN_CATEGORY.setRowHeight(80);
            productsInCategoryForm.jTable_PRODUCTS_IN_CATEGORY.getColumnModel().getColumn(5).setPreferredWidth(150);
            productsInCategoryForm.jTable_PRODUCTS_IN_CATEGORY.getColumnModel().getColumn(4).setPreferredWidth(120);
            productsInCategoryForm.jLabel_CATEGORY_NAME.setText(" Termékek az adott kategóriában :  " + jTable_CATEGORIES_.getValueAt(jTable_CATEGORIES_.getSelectedRow(),1).toString());
            productsInCategoryForm.setVisible(true);
            productsInCategoryForm.pack();
            productsInCategoryForm.setLocationRelativeTo(null);
            productsInCategoryForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            
        }catch(Exception ex){
             JOptionPane.showMessageDialog(null, "Válasszon ki egy kategóriát", "Nincs kategória kiválasztva", 2);
        }
    }//GEN-LAST:event_jButton_SHOW_PRODUCTS_IN_CATEGORYActionPerformed
    
    
    public void navigation(int pos)
    {
        try{
                ArrayList<CLASSES.Category> CategoryList = category.categoriesList();
                jTextField_CATEGORY_ID.setText(CategoryList.get(pos).getId().toString());
                jTextField_CATEGORY_NAME.setText(CategoryList.get(pos).getName());
                jTable_CATEGORIES_.setRowSelectionInterval(pos,pos);
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Hiba" , 2);
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
            java.util.logging.Logger.getLogger(Category_L.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category_L.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category_L.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category_L.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category_L().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_DELETE_CATEGORY_;
    private javax.swing.JButton jButton_INSERT_CATEGORY_;
    private javax.swing.JButton jButton_NEXT_;
    private javax.swing.JButton jButton_PREVIOUS_;
    private javax.swing.JButton jButton_SHOW_PRODUCTS_IN_CATEGORY;
    private javax.swing.JButton jButton_UPDATE_CATEGORY_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList_PRODUCTS_IN_CATEGORY;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_CATEGORIES_;
    private javax.swing.JTextField jTextField_CATEGORY_ID;
    private javax.swing.JTextField jTextField_CATEGORY_NAME;
    // End of variables declaration//GEN-END:variables
}
