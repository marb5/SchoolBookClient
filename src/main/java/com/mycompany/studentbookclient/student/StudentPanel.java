package com.mycompany.studentbookclient.student;

import com.mycompany.studentbookclient.LoggingPanel;
import com.mycompany.studentbookclient.MainFrame;
import java.awt.Color;

/**
 *
 * @author marcin
 */
public class StudentPanel extends javax.swing.JPanel {
    MainFrame myFrame;
    
    public StudentPanel(MainFrame myFrame) {
        this.myFrame = myFrame;
        initComponents();
        initMenu();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuBar = new javax.swing.JMenuBar();
        Profile = new javax.swing.JMenu();
        MyGrades = new javax.swing.JMenu();
        SearchForGrade = new javax.swing.JMenu();
        Logout = new javax.swing.JMenu();

        MenuBar.setBackground(new java.awt.Color(51, 51, 51));
        MenuBar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        MenuBar.setForeground(new java.awt.Color(255, 255, 255));

        Profile.setBackground(new java.awt.Color(51, 51, 51));
        Profile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Profile.setForeground(new java.awt.Color(255, 255, 255));
        Profile.setText("Profile");
        Profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProfileMouseExited(evt);
            }
        });
        MenuBar.add(Profile);

        MyGrades.setBackground(new java.awt.Color(51, 51, 51));
        MyGrades.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MyGrades.setForeground(new java.awt.Color(255, 255, 255));
        MyGrades.setText("My grades");
        MyGrades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MyGradesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MyGradesMouseExited(evt);
            }
        });
        MenuBar.add(MyGrades);

        SearchForGrade.setBackground(new java.awt.Color(51, 51, 51));
        SearchForGrade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SearchForGrade.setForeground(new java.awt.Color(255, 255, 255));
        SearchForGrade.setText("Search for grade");
        SearchForGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SearchForGradeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SearchForGradeMouseExited(evt);
            }
        });
        MenuBar.add(SearchForGrade);

        Logout.setBackground(new java.awt.Color(51, 51, 51));
        Logout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setText("Logout");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutMouseExited(evt);
            }
        });
        MenuBar.add(Logout);

        setBackground(new java.awt.Color(0, 204, 204));
        setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileMouseEntered
        Profile.setBackground(new java.awt.Color(92, 92, 92));
    }//GEN-LAST:event_ProfileMouseEntered

    private void ProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileMouseExited
        Profile.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_ProfileMouseExited

    private void MyGradesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MyGradesMouseEntered
        MyGrades.setBackground(new java.awt.Color(92, 92, 92));
    }//GEN-LAST:event_MyGradesMouseEntered

    private void MyGradesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MyGradesMouseExited
        MyGrades.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_MyGradesMouseExited

    private void SearchForGradeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchForGradeMouseEntered
        SearchForGrade.setBackground(new java.awt.Color(92, 92, 92));
    }//GEN-LAST:event_SearchForGradeMouseEntered

    private void SearchForGradeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchForGradeMouseExited
        SearchForGrade.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_SearchForGradeMouseExited

    private void LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseEntered
        Logout.setBackground(new java.awt.Color(92, 92, 92));
    }//GEN-LAST:event_LogoutMouseEntered

    private void LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseExited
        Logout.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_LogoutMouseExited

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        myFrame.setJMenuBar(null);
        myFrame.getContentPane().removeAll();
        myFrame.getContentPane().add(new LoggingPanel(myFrame));
        myFrame.setVisible(true);
    }//GEN-LAST:event_LogoutMouseClicked

    private void initMenu() {
        myFrame.setJMenuBar(MenuBar);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Logout;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MyGrades;
    private javax.swing.JMenu Profile;
    private javax.swing.JMenu SearchForGrade;
    // End of variables declaration//GEN-END:variables
}
