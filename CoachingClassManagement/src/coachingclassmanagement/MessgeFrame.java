/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coachingclassmanagement;

import com.teknikindustries.bulksms.SMS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author yogesh
 */
public class MessgeFrame extends javax.swing.JFrame {

    /**
     * Creates new form MessgeFrame
     */
     Connection con=null;
       PreparedStatement pstmt=null;
       
        ResultSet rs=null;
   
    public MessgeFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Class ");

        jComboBox1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Class VI", "Class VII", "Class VIII", "Class IX", "Class X", "Class XI", "Class XII" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 310, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
         try {
             // TODO add your handling code here:
             Class.forName("com.mysql.jdbc.Driver");
             String url="jdbc:mysql://localhost:3306/demo?useSSL=false";
             String username="root";
             String password="YOGESH";
             con=DriverManager.getConnection(url,username,password);
             System.out.println("connection established");
             
             String val =jComboBox1.getSelectedItem().toString();
             
             switch (val)
             {
                 case "Class VI":
                     String sql="select id,first_name,last_name,contact1 from students.studentvi";
                     pstmt=con.prepareStatement(sql);
                     
                     break;
                     
                 case "Class VII":
                     String sql1="select id,first_name,last_name,contact1 from students.studentvii";
                     pstmt=con.prepareStatement(sql1);
                     break;
                     
                 case "Class VIII":
                     String sql2="select id,first_name,last_name,contact1  from students.studentviii";
                     pstmt=con.prepareStatement(sql2);
                     break;
                 case "Class IX":
                     String sql3="select id,first_name,last_name,contact1  from students.studentix";
                     pstmt=con.prepareStatement(sql3);
                     break;
                 case "Class X":
                     String sql4="select id,first_name,last_name,contact1  from students.studentx";
                     pstmt=con.prepareStatement(sql4);
                     break;
                     
                 case "Class XI":
                     String sql5="select id,first_name,last_name,contact1  from students.studentxi";
                     pstmt=con.prepareStatement(sql5);
                     break;
                     
                 case "Class XII":
                     String sql6="select id,first_name,last_name,contact1  from students.studentxii";
                     pstmt=con.prepareStatement(sql6);
                     break;
                     
                     //please continue from here
             }
             rs=pstmt.executeQuery();
             
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(MessgeFrame.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(MessgeFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
           
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
             // TODO add your handling code here:
             int rows=jTable1.getRowCount();
             int[] testarray = new int[100];

             Class.forName("com.mysql.jdbc.Driver");
             String url="jdbc:mysql://localhost:3306/demo?useSSL=false";
             String username="root";
             String password="YOGESH";
             con=DriverManager.getConnection(url,username,password);
             System.out.println("connection established");
             con.setAutoCommit(false);
            for(int i=0;i<rows;i++)
            {
                String number=(String)jTable1.getValueAt(i, 3);
                String fname= (String)jTable1.getValueAt(i, 1);
                String lname= (String)jTable1.getValueAt(i, 2);
                String Message="Mr "+fname+" "+lname+"Your child has been given result of the test conducted";
                     SMS defalutersms = new SMS();
             defalutersms.SendSMS("bhaskarmargam09", "bhaskar@123", Message, number, "https://bulksms.vsms.net/eapi/submission/send_sms/2/2.0");
       
            
            }
             con.commit();
            
             
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(MessgeFrame.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(MessgeFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
            
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MessgeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MessgeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MessgeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MessgeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MessgeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
