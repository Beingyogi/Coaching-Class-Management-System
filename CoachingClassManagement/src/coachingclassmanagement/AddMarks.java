/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coachingclassmanagement;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author yogesh
 */
public class AddMarks extends javax.swing.JPanel {

    /**
     * Creates new form AddMarks
     */
    
    Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        PreparedStatement pstmt=null;
    
    public AddMarks() {
        initComponents();
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
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
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Date");

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Class");

        jComboBox1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Class VI", "Class VII", "Class VIII", "Class IX", "Class X", "Class XI", "Class XII" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Subject");

        jComboBox2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Id");

        jTextField1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("First Name");

        jTextField2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Last Name");

        jTextField3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Marks");

        jTextField4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Total Marks");

        jTextField5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Clear");

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 85, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
        try {
            // TODO add your handling code here:

            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/demo?useSSL=false";
            String username="root";
            String password="YOGESH";
            con=DriverManager.getConnection(url,username,password);
            System.out.println("connection established");
            
             
        String val =jComboBox1.getSelectedItem().toString();
            jComboBox2.removeAllItems();
             String d1  = ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
           
            switch(val)
            {
                case "Class VI":
                    
                    String sql="select s.subject_name as subject_name from subjects1.classvi s join tests1.classvi t on s.id = t.subject_id where t.date=?";
                    pstmt=con.prepareStatement(sql);
                    pstmt.setString(1, d1);
                    rs=pstmt.executeQuery();
                    
                    break;
                    
                case "Class VII":
                    String sql1="select s.subject_name as subject_name from subjects1.classvii s join tests1.classvii t on s.id = t.subject_id where t.date=?";
                    pstmt=con.prepareStatement(sql1);
                    pstmt.setString(1, d1);
                    rs=pstmt.executeQuery();
                    
                    break;
                    
                case "Class VIII":
                    String sql2="select s.subject_name as subject_name from subjects1.classviii s join tests1.classviii t on s.id = t.subject_id where t.date=?";
                    pstmt=con.prepareStatement(sql2);
                    pstmt.setString(1, d1);
                    rs=pstmt.executeQuery();
                    
                    break;
            case "Class IX":
                    String sql3="select s.subject_name as subject_name from subjects1.classix s join tests1.classix t on s.id = t.subject_id where t.date=?";
                    pstmt=con.prepareStatement(sql3);
                    pstmt.setString(1, d1);
                    rs=pstmt.executeQuery();
                    
                    break;
                    
                case "Class X":
                    String sql4="select s.subject_name as subject_name from subjects1.classx s join tests1.classx t on s.id = t.subject_id where t.date=?";
                    pstmt=con.prepareStatement(sql4);
                    pstmt.setString(1, d1);
                    rs=pstmt.executeQuery();
                    
                    break;
                case "Class XI":
                    String sql5="select s.subject_name as subject_name from subjects1.classxi s join tests1.classxi t on s.id = t.subject_id where t.date=?";
                    pstmt=con.prepareStatement(sql5);
                    pstmt.setString(1, d1);
                    rs=pstmt.executeQuery();
                    
                    break;
                    
                case "Class XII":
                    String sql6="select s.subject_name as subject_name from subjects1.classxii s join tests1.classxii t on s.id = t.subject_id where t.date=?";
                    pstmt=con.prepareStatement(sql6);
                    pstmt.setString(1, d1);
                    rs=pstmt.executeQuery();
                    
                    break;
            }
            
           while(rs.next())
            {
                
                jComboBox2.addItem(rs.getString("subject_name"));
            }
       
            
           switch (val)
                        {
                            case "Class VI":
                                String sql="select id,first_name,last_name from students.studentvi";
                                pstmt=con.prepareStatement(sql);
                                
                                break;
                                
                            case "Class VII":
                                String sql1="select id,first_name,last_name from students.studentvii";
                                pstmt=con.prepareStatement(sql1);
                                break;
                                
                            case "Class VIII":
                                String sql2="select id,first_name,last_name from students.studentviii";
                                pstmt=con.prepareStatement(sql2);
                                break;
                                
                            case "Class IX":
                                String sql3="select id,first_name,last_name from students.studentix";
                                pstmt=con.prepareStatement(sql3);
                                break;
                                
                            case "Class X":
                                String sql4="select  id,first_name,last_name from students.studentx";
                                pstmt=con.prepareStatement(sql4);
                                break;
                                
                            case "Class XI":
                                String sql5="select id,first_name,last_name from students.studentxi";
                                pstmt=con.prepareStatement(sql5);
                                break;
                                
                            case "Class XII":
                                String sql6="select id,first_name,last_name from students.studentxii";
                                pstmt=con.prepareStatement(sql6);
                                break;
                        }
                        
                        rs=pstmt.executeQuery();
                        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                        
           
           
           
            
        } catch (ClassNotFoundException ex) { 
            Logger.getLogger(AddMarks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddMarks.class.getName()).log(Level.SEVERE, null, ex);
        }
        
 try {
            pstmt.close();
        } catch (SQLException ex) { 
            Logger.getLogger(AddMarks.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddMarks.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
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
                                String sql="insert into results1.classvi(student_id,subject_id,marks,total_marks,date) "
                                        + "values((select id from students.studentvi where first_name=? and last_name=?),"
                                        + "(select id from subjects1.classvi as subject_id where subject_name=?),?,?,?)";
                                pstmt=con.prepareStatement(sql);
                                break;
                                
                            case "Class VII":
                                String sql1="insert into results1.classvii(student_id,subject_id,marks,total_marks,date) "
                                        + "values((select id from students.studentvii where first_name=? and last_name=?),"
                                        + "(select id from subjects1.classvii as subject_id where subject_name=?),?,?,?)";
                                pstmt=con.prepareStatement(sql1);
                                break;
                                
                            case "Class VIII":
                                String sql2="insert into results1.classviii(student_id,subject_id,marks,total_marks,date) "
                                        + "values((select id from students.studentviii where first_name=? and last_name=?),"
                                        + "(select id from subjects1.classviii as subject_id where subject_name=?),?,?,?)";
                                pstmt=con.prepareStatement(sql2);
                                break; 
         
                            case "Class IX":
                                String sql3="insert into results1.classix(student_id,subject_id,marks,total_marks,date) "
                                        + "values((select id from students.studentix where first_name=? and last_name=?),"
                                        + "(select id from subjects1.classix as subject_id where subject_name=?),?,?,?)";
                                pstmt=con.prepareStatement(sql3);
                             
                            case "Class X":
                                String sql4="insert into results1.classx(student_id,subject_id,marks,total_marks,date) "
                                        + "values((select id from students.studentx where first_name=? and last_name=?),"
                                        + "(select id from subjects1.classx as subject_id where subject_name=?),?,?,?)";
                                pstmt=con.prepareStatement(sql4);
                                
                            case "Class XI":
                                String sql5="insert into results1.classxi(student_id,subject_id,marks,total_marks,date) "
                                        + "values((select id from students.studentxi where first_name=? and last_name=?),"
                                        + "(select id from subjects1.classxi as subject_id where subject_name=?),?,?,?)";
                                pstmt=con.prepareStatement(sql5);
                                
                            case "Class XII":
                                String sql6="insert into results1.classxii(student_id,subject_id,marks,total_marks,date) "
                                        + "values((select id from students.studentxii where first_name=? and last_name=?),"
                                        + "(select id from subjects1.classxii as subject_id where subject_name=?),?,?,?)";
                                pstmt=con.prepareStatement(sql6);
                                
        }
         
            pstmt.setString(1, jTextField2.getText());
            pstmt.setString(2, jTextField3.getText());
            pstmt.setString(3, jComboBox2.getSelectedItem().toString());
            pstmt.setString(4, jTextField4.getText());
            pstmt.setString(5, jTextField5.getText()); 
            pstmt.setString(6, ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText());

            int n=pstmt.executeUpdate();
            System.out.println("rows affected ="+n);
                jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddMarks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddMarks.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        int selectedRowIndex =jTable1.getSelectedRow();
        jTextField1.setText(model.getValueAt(selectedRowIndex, 0).toString());
        jTextField2.setText(model.getValueAt(selectedRowIndex, 1).toString());
        jTextField3.setText(model.getValueAt(selectedRowIndex, 2).toString());
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
