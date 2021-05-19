package com.mycompany.schoolbookclient.mainwindow;

import static com.mycompany.schoolbookclient.mainwindow.MainFrame.session;
import com.mycompany.schoolbookclient.session.StudentSession;
import com.mycompany.schoolbookclient.student.StudentPanel;
import com.mycompany.schoolbookclient.teacher.TeacherPanel;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author marcin
 */
public class LoggingPanel extends javax.swing.JPanel {
    MainFrame myFrame;
    
    public LoggingPanel(MainFrame myFrame) {
        this.myFrame = myFrame;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ExitButton = new javax.swing.JButton();
        LoginLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        LoginField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        LogInButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));

        ExitButton.setBackground(new java.awt.Color(51, 51, 51));
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("Exit");
        ExitButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ExitButton.setFocusPainted(false);
        ExitButton.setFocusable(false);
        ExitButton.setMargin(new java.awt.Insets(5, 5, 5, 5));
        ExitButton.setName(""); // NOI18N
        ExitButton.setPreferredSize(new java.awt.Dimension(60, 25));
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitButtonMouseExited(evt);
            }
        });

        LoginLabel.setBackground(new java.awt.Color(51, 51, 51));
        LoginLabel.setForeground(new java.awt.Color(255, 255, 255));
        LoginLabel.setText("Login");
        LoginLabel.setFocusable(false);

        PasswordLabel.setBackground(new java.awt.Color(51, 51, 51));
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setText("Password");
        PasswordLabel.setFocusable(false);

        LoginField.setBackground(new java.awt.Color(51, 51, 51));
        LoginField.setForeground(new java.awt.Color(255, 255, 255));
        LoginField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LoginField.setCaretColor(new java.awt.Color(255, 255, 255));
        LoginField.setPreferredSize(new java.awt.Dimension(100, 23));
        LoginField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LoginFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LoginFieldFocusLost(evt);
            }
        });

        PasswordField.setBackground(new java.awt.Color(51, 51, 51));
        PasswordField.setForeground(new java.awt.Color(255, 255, 255));
        PasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PasswordField.setCaretColor(new java.awt.Color(255, 255, 255));
        PasswordField.setPreferredSize(new java.awt.Dimension(100, 23));
        PasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusLost(evt);
            }
        });

        LogInButton.setBackground(new java.awt.Color(51, 51, 51));
        LogInButton.setForeground(new java.awt.Color(255, 255, 255));
        LogInButton.setText("Log In");
        LogInButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LogInButton.setFocusPainted(false);
        LogInButton.setFocusable(false);
        LogInButton.setMargin(new java.awt.Insets(1, 1, 1, 1));
        LogInButton.setPreferredSize(new java.awt.Dimension(188, 25));
        LogInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogInButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogInButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogInButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(334, Short.MAX_VALUE)
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LogInButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PasswordLabel)
                                    .addComponent(LoginLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LoginField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginLabel)
                    .addComponent(LoginField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogInButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseClicked
        myFrame.dispose();
        System.exit(0);
    }//GEN-LAST:event_ExitButtonMouseClicked

    private void ExitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseEntered
        ExitButton.setBackground(new java.awt.Color(92, 92, 92));
    }//GEN-LAST:event_ExitButtonMouseEntered

    private void ExitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseExited
        ExitButton.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_ExitButtonMouseExited

    private void LogInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInButtonMouseClicked
        if (LoginField.getText().charAt(0) == 's') {
            myFrame.session = new StudentSession(LoginField.getText());
            if(session.isRunning()) {
                myFrame.getContentPane().removeAll();
                try {
                    myFrame.getContentPane().add(new StudentPanel(myFrame));
                } catch (IOException ex) {
                    Logger.getLogger(LoggingPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                myFrame.setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(myFrame, "Please enter correct login!", "Incorrect login!", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (LoginField.getText().charAt(0) == 't') {
            myFrame.getContentPane().removeAll();
            myFrame.getContentPane().add(new TeacherPanel(myFrame));
            myFrame.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(myFrame, "Please enter correct login!", "Incorrect login!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_LogInButtonMouseClicked

    private void LogInButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInButtonMouseEntered
        LogInButton.setBackground(new java.awt.Color(92, 92, 92));
    }//GEN-LAST:event_LogInButtonMouseEntered

    private void LogInButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInButtonMouseExited
        LogInButton.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_LogInButtonMouseExited

    private void PasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusGained
        PasswordField.setBackground(new java.awt.Color(92, 92, 92));
    }//GEN-LAST:event_PasswordFieldFocusGained

    private void PasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusLost
        PasswordField.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_PasswordFieldFocusLost

    private void LoginFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoginFieldFocusGained
        LoginField.setBackground(new java.awt.Color(92, 92, 92));
    }//GEN-LAST:event_LoginFieldFocusGained

    private void LoginFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoginFieldFocusLost
        LoginField.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_LoginFieldFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton LogInButton;
    private javax.swing.JTextField LoginField;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    // End of variables declaration//GEN-END:variables
}
