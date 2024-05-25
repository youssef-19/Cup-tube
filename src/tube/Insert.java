package tube;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.awt.Desktop;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author lenovo
 */
public class Insert extends javax.swing.JFrame {
String Name;
String Link;
Linkedlist list=new Linkedlist();
    /**
     * Creates new form Insert
     */
    public Insert() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        Textlink = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mytable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        Textname = new javax.swing.JTextField();
        txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        play = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        next = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        search = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ubdate = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(941, 612));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 48)); // NOI18N
        jLabel2.setText("Choise Operation");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/phptp 2/operation (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(359, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 950, 70);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/phptp 2/exit (1).png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(870, 540, 60, 60);
        getContentPane().add(Textlink);
        Textlink.setBounds(370, 140, 180, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Link");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(280, 140, 60, 30);

        mytable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Link", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        mytable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mytableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(mytable);
        if (mytable.getColumnModel().getColumnCount() > 0) {
            mytable.getColumnModel().getColumn(0).setResizable(false);
            mytable.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(330, 370, 340, 250);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 90, 70, 30);

        Textname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextnameActionPerformed(evt);
            }
        });
        getContentPane().add(Textname);
        Textname.setBounds(370, 90, 180, 30);
        getContentPane().add(txt);
        txt.setBounds(180, 370, 140, 30);

        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/phptp 2/WhatsApp Image 2022-12-21 at 03.58.15 (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 70, 800, 550);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/phptp 2/undo (1).png"))); // NOI18N
        back.setText("jLabel4");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backMousePressed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(20, 470, 60, 60);

        add.setBackground(new java.awt.Color(0, 0, 0));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                addMouseReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Add");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/jo/add-button (1).png"))); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout addLayout = new javax.swing.GroupLayout(add);
        add.setLayout(addLayout);
        addLayout.setHorizontalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        addLayout.setVerticalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        jPanel1.add(add);
        add.setBounds(0, 0, 150, 60);

        delete.setBackground(new java.awt.Color(0, 0, 0));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteMousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Delete");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/jo/delete (1).png"))); // NOI18N
        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout deleteLayout = new javax.swing.GroupLayout(delete);
        delete.setLayout(deleteLayout);
        deleteLayout.setHorizontalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        deleteLayout.setVerticalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(delete);
        delete.setBounds(0, 70, 150, 60);

        play.setBackground(new java.awt.Color(0, 0, 0));
        play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                playMousePressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Play");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/jo/camera (1).png"))); // NOI18N
        jLabel11.setText("jLabel11");

        javax.swing.GroupLayout playLayout = new javax.swing.GroupLayout(play);
        play.setLayout(playLayout);
        playLayout.setHorizontalGroup(
            playLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        playLayout.setVerticalGroup(
            playLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(play);
        play.setBounds(0, 140, 150, 60);

        next.setBackground(new java.awt.Color(0, 0, 0));
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nextMousePressed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/jo/next (1).png"))); // NOI18N
        jLabel12.setText("Next");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Next");

        javax.swing.GroupLayout nextLayout = new javax.swing.GroupLayout(next);
        next.setLayout(nextLayout);
        nextLayout.setHorizontalGroup(
            nextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nextLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        nextLayout.setVerticalGroup(
            nextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nextLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13))
                .addContainerGap())
        );

        jPanel1.add(next);
        next.setBounds(0, 210, 150, 60);

        search.setBackground(new java.awt.Color(0, 0, 0));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchMousePressed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photo/jo/search (1).png"))); // NOI18N
        jLabel15.setText("Next");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Search");

        javax.swing.GroupLayout searchLayout = new javax.swing.GroupLayout(search);
        search.setLayout(searchLayout);
        searchLayout.setHorizontalGroup(
            searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addContainerGap())
        );
        searchLayout.setVerticalGroup(
            searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(search);
        search.setBounds(0, 280, 150, 60);

        ubdate.setBackground(new java.awt.Color(0, 0, 0));
        ubdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ubdateMousePressed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/phptp 2/operation (1).png"))); // NOI18N
        jLabel14.setText("Next");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Update");

        javax.swing.GroupLayout ubdateLayout = new javax.swing.GroupLayout(ubdate);
        ubdate.setLayout(ubdateLayout);
        ubdateLayout.setHorizontalGroup(
            ubdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ubdateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );
        ubdateLayout.setVerticalGroup(
            ubdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ubdateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ubdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17))
                .addContainerGap())
        );

        jPanel1.add(ubdate);
        ubdate.setBounds(0, 350, 150, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 70, 150, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMousePressed
        // TODO add your handling code here:
        new Home().show();
        dispose();
    }//GEN-LAST:event_backMousePressed

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit ?", "World Cap Highlights Tube", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitMousePressed

    private void mytableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mytableMousePressed
        // TODO add your handling code here:
        DefaultTableModel tb1Model = (DefaultTableModel) mytable.getModel();
        String tb1name=tb1Model.getValueAt(mytable.getSelectedRow(), 0).toString();
        String test=list.search(tb1name);
        
        Textname.setText(tb1name);
        Textlink.setText(test);
        Link=test;        
        
    }//GEN-LAST:event_mytableMousePressed

    private void addMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseReleased
        // TODO add your handling code here:///////////////////////////////////////////////////////////////////////////
    }//GEN-LAST:event_addMouseReleased

    private void addMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMousePressed
        // TODO add your handling code here:
        Name=Textname.getText();
        Link=Textlink.getText();
        if( Link.equals("")||Name.equals("")) {
        JOptionPane.showMessageDialog(this, "Invalied insertion");
        }else {
            list.insert(Textname.getText(), Textlink.getText());
            String data[ ]={Textlink.getText(),Textname.getText()};
            DefaultTableModel tb1Model=(DefaultTableModel)mytable.getModel();
            tb1Model.addRow(data);
            list.print();
          Textlink.setText("");
          Textname.setText("");
          JOptionPane.showMessageDialog(this, "Inserted Successfully");
        }

    }//GEN-LAST:event_addMousePressed

    private void deleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMousePressed
        // TODO add your handling code here:
             DefaultTableModel tb1Model=(DefaultTableModel)mytable.getModel();
         
         if (mytable.getSelectedRowCount()==1){
             
             String test=tb1Model.getValueAt(mytable.getSelectedRow(), 0).toString();
             tb1Model.removeRow(mytable.getSelectedRow());
             list.delete(test);
             JOptionPane.showMessageDialog(this,"Deleted successfully ");
             Textname.setText("");
             Textlink.setText("");
         }else if (mytable.getSelectedRowCount()>1){
              JOptionPane.showMessageDialog(this ,"Please Select Single Row For Delete.. !");
         }
        list.print();

    }//GEN-LAST:event_deleteMousePressed

    private void playMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playMousePressed
        // TODO add your handling code here:
        Link=Textlink.getText();
//        Link=Textlink.getText();
       
            try {
                Desktop.getDesktop().open(new File(Link));
            } catch (Exception ex) {
                 JOptionPane.showMessageDialog(this, "No Video");
            }

    }//GEN-LAST:event_playMousePressed

    private void nextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMousePressed
        // TODO add your handling code here:
           list.next();
        Textname.setText("");
        Textlink.setText("");

    }//GEN-LAST:event_nextMousePressed

    private void searchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMousePressed
        // TODO add your handling code here:
        Name=txt.getText();
        if(Name.equals("")) JOptionPane.showMessageDialog(this,"Enter Video Name !");
        else {
            String test=list.search(Name);
            if(test==null){
                JOptionPane.showMessageDialog(this,"Not found");
            }
            else{
                Textlink.setText(test);
                        Name=test;
                        ubdate.setEnabled(true);
                    
            }
        }

    }//GEN-LAST:event_searchMousePressed

    private void ubdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ubdateMousePressed
        // TODO add your handling code here:
        Name=Textname.getText();
        if(Textname.equals("")) 
            JOptionPane.showMessageDialog(this,"Empty Name");
        else{
            list.update(Name, Link);
            JOptionPane.showMessageDialog(this,"Update Successfully ");
            Textname.setText("");
            Textlink.setText("");
        }

    }//GEN-LAST:event_ubdateMousePressed

    private void TextnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextnameActionPerformed

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
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Textlink;
    private javax.swing.JTextField Textname;
    private javax.swing.JPanel add;
    private javax.swing.JLabel back;
    private javax.swing.JPanel delete;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mytable;
    private javax.swing.JPanel next;
    private javax.swing.JPanel play;
    private javax.swing.JPanel search;
    private javax.swing.JTextField txt;
    private javax.swing.JPanel ubdate;
    // End of variables declaration//GEN-END:variables
}
