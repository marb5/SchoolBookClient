package com.mycompany.schoolbookclient.teacher;

import com.mycompany.schoolbookclient.LoggingPanel;
import com.mycompany.schoolbookclient.MainFrame;

/**
 *
 * @author marcin
 */
public class TeacherPanel extends javax.swing.JPanel {
    MainFrame myFrame;

    public TeacherPanel(MainFrame myFrame) {
        this.myFrame = myFrame;
        initComponents();
        initMenu();
        myFrame.getContentPane().removeAll();
        myFrame.getContentPane().add(new TeacherProfilePanel(myFrame));
        myFrame.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuBar = new javax.swing.JMenuBar();
        Profile = new javax.swing.JMenu();
        Grades = new javax.swing.JMenu();
        FindGrades = new javax.swing.JMenu();
        DoGrade = new javax.swing.JMenu();
        Logout = new javax.swing.JMenu();

        MenuBar.setBackground(new java.awt.Color(51, 51, 51));
        MenuBar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        MenuBar.setForeground(new java.awt.Color(255, 255, 255));
        MenuBar.setFocusable(false);

        Profile.setBackground(new java.awt.Color(51, 51, 51));
        Profile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Profile.setForeground(new java.awt.Color(255, 255, 255));
        Profile.setText("Profile");
        Profile.setFocusable(false);
        Profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProfileMouseExited(evt);
            }
        });
        MenuBar.add(Profile);

        Grades.setBackground(new java.awt.Color(51, 51, 51));
        Grades.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Grades.setForeground(new java.awt.Color(255, 255, 255));
        Grades.setText("Grades");
        Grades.setFocusable(false);
        Grades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GradesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GradesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GradesMouseExited(evt);
            }
        });
        MenuBar.add(Grades);

        FindGrades.setBackground(new java.awt.Color(51, 51, 51));
        FindGrades.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FindGrades.setForeground(new java.awt.Color(255, 255, 255));
        FindGrades.setText("Find grades");
        FindGrades.setFocusable(false);
        FindGrades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FindGradesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FindGradesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FindGradesMouseExited(evt);
            }
        });
        MenuBar.add(FindGrades);

        DoGrade.setBackground(new java.awt.Color(51, 51, 51));
        DoGrade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DoGrade.setForeground(new java.awt.Color(255, 255, 255));
        DoGrade.setText("Do grade");
        DoGrade.setFocusable(false);
        DoGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoGradeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DoGradeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DoGradeMouseExited(evt);
            }
        });
        MenuBar.add(DoGrade);

        Logout.setBackground(new java.awt.Color(51, 51, 51));
        Logout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setText("Logout");
        Logout.setFocusable(false);
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
        setFocusable(false);

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

    private void ProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileMouseClicked
        myFrame.getContentPane().removeAll();
        myFrame.getContentPane().add(new TeacherProfilePanel(myFrame));
        myFrame.setVisible(true);
    }//GEN-LAST:event_ProfileMouseClicked

    private void ProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileMouseEntered
        Profile.setBackground(new java.awt.Color(92, 92, 92));
    }//GEN-LAST:event_ProfileMouseEntered

    private void ProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileMouseExited
        Profile.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_ProfileMouseExited

    private void GradesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GradesMouseClicked
        myFrame.getContentPane().removeAll();
        myFrame.getContentPane().add(new TeacherGradesPanel(myFrame));
        myFrame.setVisible(true);
    }//GEN-LAST:event_GradesMouseClicked

    private void GradesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GradesMouseEntered
        Grades.setBackground(new java.awt.Color(92, 92, 92));
    }//GEN-LAST:event_GradesMouseEntered

    private void GradesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GradesMouseExited
        Grades.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_GradesMouseExited

    private void FindGradesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FindGradesMouseClicked
        myFrame.getContentPane().removeAll();
        myFrame.getContentPane().add(new TeacherFindGradesPanel(myFrame));
        myFrame.setVisible(true);
    }//GEN-LAST:event_FindGradesMouseClicked

    private void FindGradesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FindGradesMouseEntered
        FindGrades.setBackground(new java.awt.Color(92, 92, 92));
    }//GEN-LAST:event_FindGradesMouseEntered

    private void FindGradesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FindGradesMouseExited
        FindGrades.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_FindGradesMouseExited

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        myFrame.setJMenuBar(null);
        myFrame.getContentPane().removeAll();
        myFrame.getContentPane().add(new LoggingPanel(myFrame));
        myFrame.setVisible(true);
    }//GEN-LAST:event_LogoutMouseClicked

    private void LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseEntered
        Logout.setBackground(new java.awt.Color(92, 92, 92));
    }//GEN-LAST:event_LogoutMouseEntered

    private void LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseExited
        Logout.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_LogoutMouseExited

    private void DoGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoGradeMouseClicked
        myFrame.getContentPane().removeAll();
        myFrame.getContentPane().add(new TeacherDoGradePanel(myFrame));
        myFrame.setVisible(true);
    }//GEN-LAST:event_DoGradeMouseClicked

    private void DoGradeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoGradeMouseEntered
        DoGrade.setBackground(new java.awt.Color(92, 92, 92));
    }//GEN-LAST:event_DoGradeMouseEntered

    private void DoGradeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoGradeMouseExited
        DoGrade.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_DoGradeMouseExited

    private void initMenu() {
        myFrame.setJMenuBar(MenuBar);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu DoGrade;
    private javax.swing.JMenu FindGrades;
    private javax.swing.JMenu Grades;
    private javax.swing.JMenu Logout;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu Profile;
    // End of variables declaration//GEN-END:variables
}
