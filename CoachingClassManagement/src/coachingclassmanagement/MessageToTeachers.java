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
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author yogesh
 */
public class MessageToTeachers extends javax.swing.JFrame {

    /**
     * Creates new form MessageToTeachers
     */
     Connection con=null;
       PreparedStatement pstmt=null;
       
        ResultSet rs=null;
   
    public MessageToTeachers() {
        try {
            initComponents();
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/demo?useSSL=false";
            String username="root";
            String password="YOGESH";
            con=DriverManager.getConnection(url,username,password);
            System.out.println("connection established");
            
            String sql="select l.id,l.date,l.class,s.subject_name,t.first_name,t.last_name,t.contact1,l.time,l.etime\n" +
"from lectures1.class l join subjects1.classvi s on l.subject_id=s.id\n" +
"join teacher1.teacher_info t on l.teacher_id=t.id\n" +
"where l.date = CURDATE() + INTERVAL 1 DAY and l.class=\"Class VI\"\n" +
"union\n" +
"select l.id,l.date,l.class,s.subject_name,t.first_name,t.last_name,t.contact1,l.time,l.etime\n" +
"from lectures1.class l join subjects1.classvii s on l.subject_id=s.id\n" +
"join teacher1.teacher_info t on l.teacher_id=t.id\n" +
"where l.date = CURDATE() + INTERVAL 1 DAY and l.class=\"Class VII\"\n" +
"union\n" +
"select l.id,l.date,l.class,s.subject_name,t.first_name,t.last_name,t.contact1,l.time,l.etime\n" +
"from lectures1.class l join subjects1.classviii s on l.subject_id=s.id\n" +
"join teacher1.teacher_info t on l.teacher_id=t.id\n" +
"where l.date = CURDATE() + INTERVAL 1 DAY and l.class=\"Class VIII\"\n" +
"union\n" +
"select l.id,l.date,l.class,s.subject_name,t.first_name,t.last_name,t.contact1,l.time,l.etime\n" +
"from lectures1.class l join subjects1.classix s on l.subject_id=s.id\n" +
"join teacher1.teacher_info t on l.teacher_id=t.id\n" +
"where l.date = CURDATE() + INTERVAL 1 DAY and l.class=\"Class IX\"\n" +
"union\n" +
"select l.id,l.date,l.class,s.subject_name,t.first_name,t.last_name,t.contact1,l.time,l.etime\n" +
"from lectures1.class l join subjects1.classx s on l.subject_id=s.id\n" +
"join teacher1.teacher_info t on l.teacher_id=t.id\n" +
"where l.date = CURDATE() + INTERVAL 1 DAY and l.class=\"Class X\"\n" +
"union\n" +
"select l.id,l.date,l.class,s.subject_name,t.first_name,t.last_name,t.contact1,l.time,l.etime\n" +
"from lectures1.class l join subjects1.classxi s on l.subject_id=s.id\n" +
"join teacher1.teacher_info t on l.teacher_id=t.id\n" +
"where l.date = CURDATE() + INTERVAL 1 DAY and l.class=\"Class XI\"\n" +
"union\n" +
"select l.id,l.date,l.class,s.subject_name,t.first_name,t.last_name,t.contact1,l.time,l.etime\n" +
"from lectures1.class l join subjects1.classxii s on l.subject_id=s.id\n" +
"join teacher1.teacher_info t on l.teacher_id=t.id\n" +
"where date = CURDATE() + INTERVAL 1 DAY and l.class=\"Class XII\" ";
             pstmt=con.prepareStatement(sql);
             rs= pstmt.executeQuery();
                   
                   jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 
                  
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MessageToTeachers.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MessageToTeachers.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                 String clas=(String)jTable1.getValueAt(i, 2);
                 String sub=(String)jTable1.getValueAt(i, 3);
                 int st=(int)jTable1.getValueAt(i, 7);
                 int et=(int)jTable1.getValueAt(i, 8);
                 String number=(String)jTable1.getValueAt(i, 6);
                 String fname=(String)jTable1.getValueAt(i, 4);
                 String Message="Dear Mam/Sir "+fname+" tomorrow lecture "+sub+" "+clas+" from "+st+" to "+et+" ";
                     SMS defalutersms = new SMS();
             defalutersms.SendSMS("bhaskarmargam09", "bhaskar@123", Message, number, "https://bulksms.vsms.net/eapi/submission/send_sms/2/2.0");
       
             }    con.commit();
                 
                 
                 } catch (ClassNotFoundException ex) {
             Logger.getLogger(MessageToTeachers.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(MessageToTeachers.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(MessageToTeachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MessageToTeachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MessageToTeachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MessageToTeachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MessageToTeachers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
