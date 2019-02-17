/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coachingclassmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author yogesh
 */
public class DashboardLecturePanel extends javax.swing.JPanel {

    /**
     * Creates new form DashboardLecturePanel
     */
    String val;
    
    public DashboardLecturePanel() {
        initComponents();
        
        
    }
    Connection con=null;
    PreparedStatement pstmt=null;
    ResultSet rs=null;
    
    
    public DashboardLecturePanel(String s)
    {
        initComponents();
        this.val=s;
        
        
        
       System.out.println("the date is" +s);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/demo?useSSL=false";
            String username="root";
            String password="YOGESH";
            con=DriverManager.getConnection(url,username,password);
            System.out.println("connection established");
            
            String sql= "select l.time as Start_Time ,l.etime as End_Time,l.date,l.class,s.subject_name as lecture,concat(t.first_name,' ',t.last_name ) as teacher_name\n" +
"from lectures1.class l join subjects1.classvi s on l.subject_id = s.id \n" +
"join teacher1.teacher_info t on l.teacher_id= t.id\n" +
"where l.date=? and class=\"Class VI\" \n" +
"union\n" +
"select l.time as Start_Time ,l.etime,l.date,l.class,s.subject_name as lecture,concat(t.first_name,' ',t.last_name ) as teacher_name\n" +
"from lectures1.class l join subjects1.classvii s on l.subject_id = s.id \n" +
"join teacher1.teacher_info t on l.teacher_id= t.id\n" +
"where l.date=? and class=\"Class VII\" \n" +
"union\n" +
"select l.time as Start_Time ,l.etime,l.date,l.class,s.subject_name as lecture,concat(t.first_name,' ',t.last_name ) as teacher_name\n" +
"from lectures1.class l join subjects1.classviii s on l.subject_id = s.id \n" +
"join teacher1.teacher_info t on l.teacher_id= t.id\n" +
"where l.date=? and class=\"Class VIII\"  \n" +
"union\n" +
"select l.time as Start_Time ,l.etime,l.date,l.class,s.subject_name as lecture,concat(t.first_name,' ',t.last_name ) as teacher_name\n" +
"from lectures1.class l join subjects1.classix s on l.subject_id = s.id \n" +
"join teacher1.teacher_info t on l.teacher_id= t.id\n" +
"where l.date=? and class=\"Class IX\" \n" +
"union\n" +
"select l.time as Start_Time ,l.etime,l.date,l.class,s.subject_name as lecture,concat(t.first_name,' ',t.last_name ) as teacher_name\n" +
"from lectures1.class l join subjects1.classx s on l.subject_id = s.id \n" +
"join teacher1.teacher_info t on l.teacher_id= t.id\n" +
"where l.date=? and class=\"Class X\" \n" +
"union\n" +
"select l.time as Start_Time ,l.etime,l.date,l.class,s.subject_name as lecture,concat(t.first_name,' ',t.last_name ) as teacher_name\n" +
"from lectures1.class l join subjects1.classxi s on l.subject_id = s.id \n" +
"join teacher1.teacher_info t on l.teacher_id= t.id\n" +
"where l.date=? and class=\"Class XI\"  \n" +
"union\n" +
"select l.time as Start_Time ,l.etime,l.date,l.class,s.subject_name as lecture,concat(t.first_name,' ',t.last_name ) as teacher_name\n" +
"from lectures1.class l join subjects1.classxii s on l.subject_id = s.id \n" +
"join teacher1.teacher_info t on l.teacher_id= t.id\n" +
"where l.date=? and class=\"Class XII\""
                    + "order by 1 \n";
             pstmt=con.prepareStatement(sql);
             pstmt.setString(1, s);
             pstmt.setString(2, s);
pstmt.setString(3, s);
pstmt.setString(4, s);
pstmt.setString(5, s);
pstmt.setString(6, s);
pstmt.setString(7, s);

                   rs= pstmt.executeQuery();
                   
                   jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 
                   
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DashboardLecturePanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DashboardLecturePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            
        }
        
        try {
            pstmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DashboardLecturePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DashboardLecturePanel.class.getName()).log(Level.SEVERE, null, ex);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
