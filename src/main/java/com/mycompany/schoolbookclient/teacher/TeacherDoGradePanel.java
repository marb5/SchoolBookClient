package com.mycompany.schoolbookclient.teacher;

import com.mycompany.schoolbookclient.data.ContentBuilder;
import com.mycompany.schoolbookclient.data.Mapper;
import com.mycompany.schoolbookclient.mainwindow.MainFrame;
import static com.mycompany.schoolbookclient.mainwindow.MainFrame.session;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author marcin
 */
public class TeacherDoGradePanel extends javax.swing.JPanel {
    MainFrame myFrame;
    
    public TeacherDoGradePanel(MainFrame myFrame) {
        this.myFrame = myFrame;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StudentLabel = new javax.swing.JLabel();
        StudentIdField = new javax.swing.JTextField();
        SubjectLabel = new javax.swing.JLabel();
        SubjectIdField = new javax.swing.JTextField();
        GradeLabel = new javax.swing.JLabel();
        GradeField = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        ChangeButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));
        setForeground(new java.awt.Color(255, 255, 255));
        setFocusable(false);

        StudentLabel.setBackground(new java.awt.Color(51, 51, 51));
        StudentLabel.setForeground(new java.awt.Color(255, 255, 255));
        StudentLabel.setText("Type student id");
        StudentLabel.setFocusable(false);
        StudentLabel.setRequestFocusEnabled(false);

        StudentIdField.setBackground(new java.awt.Color(51, 51, 51));
        StudentIdField.setForeground(new java.awt.Color(255, 255, 255));
        StudentIdField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        StudentIdField.setCaretColor(new java.awt.Color(255, 255, 255));
        StudentIdField.setPreferredSize(new java.awt.Dimension(108, 25));
        StudentIdField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                StudentIdFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                StudentIdFieldFocusLost(evt);
            }
        });

        SubjectLabel.setBackground(new java.awt.Color(51, 51, 51));
        SubjectLabel.setForeground(new java.awt.Color(255, 255, 255));
        SubjectLabel.setText("Type subject id");
        SubjectLabel.setFocusable(false);
        SubjectLabel.setRequestFocusEnabled(false);

        SubjectIdField.setBackground(new java.awt.Color(51, 51, 51));
        SubjectIdField.setForeground(new java.awt.Color(255, 255, 255));
        SubjectIdField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SubjectIdField.setCaretColor(new java.awt.Color(255, 255, 255));
        SubjectIdField.setPreferredSize(new java.awt.Dimension(108, 25));
        SubjectIdField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SubjectIdFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                SubjectIdFieldFocusLost(evt);
            }
        });

        GradeLabel.setBackground(new java.awt.Color(51, 51, 51));
        GradeLabel.setForeground(new java.awt.Color(255, 255, 255));
        GradeLabel.setText("Grade");
        GradeLabel.setFocusable(false);
        GradeLabel.setRequestFocusEnabled(false);

        GradeField.setBackground(new java.awt.Color(51, 51, 51));
        GradeField.setForeground(new java.awt.Color(255, 255, 255));
        GradeField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GradeField.setCaretColor(new java.awt.Color(255, 255, 255));
        GradeField.setPreferredSize(new java.awt.Dimension(108, 25));
        GradeField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                GradeFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                GradeFieldFocusLost(evt);
            }
        });

        AddButton.setBackground(new java.awt.Color(51, 51, 51));
        AddButton.setForeground(new java.awt.Color(255, 255, 255));
        AddButton.setText("Add");
        AddButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AddButton.setFocusPainted(false);
        AddButton.setFocusable(false);
        AddButton.setPreferredSize(new java.awt.Dimension(90, 25));
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddButtonMouseExited(evt);
            }
        });

        ChangeButton.setBackground(new java.awt.Color(51, 51, 51));
        ChangeButton.setForeground(new java.awt.Color(255, 255, 255));
        ChangeButton.setText("Change");
        ChangeButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChangeButton.setFocusPainted(false);
        ChangeButton.setFocusable(false);
        ChangeButton.setPreferredSize(new java.awt.Dimension(90, 25));
        ChangeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ChangeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ChangeButtonMouseExited(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(51, 51, 51));
        DeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteButton.setText("Delete");
        DeleteButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DeleteButton.setFocusPainted(false);
        DeleteButton.setFocusable(false);
        DeleteButton.setPreferredSize(new java.awt.Dimension(90, 25));
        DeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StudentLabel)
                            .addComponent(SubjectLabel)
                            .addComponent(GradeLabel))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GradeField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SubjectIdField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(StudentIdField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(82, 82, 82))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StudentLabel)
                    .addComponent(StudentIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubjectLabel)
                    .addComponent(SubjectIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GradeLabel)
                    .addComponent(GradeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void StudentIdFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_StudentIdFieldFocusGained
        StudentIdField.setBackground(new java.awt.Color(92, 92, 92));
    }//GEN-LAST:event_StudentIdFieldFocusGained

    private void StudentIdFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_StudentIdFieldFocusLost
        StudentIdField.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_StudentIdFieldFocusLost

    private void SubjectIdFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SubjectIdFieldFocusGained
        SubjectIdField.setBackground(new java.awt.Color(92, 92, 92));
    }//GEN-LAST:event_SubjectIdFieldFocusGained

    private void SubjectIdFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SubjectIdFieldFocusLost
        SubjectIdField.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_SubjectIdFieldFocusLost

    private void GradeFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GradeFieldFocusGained
        GradeField.setBackground(new java.awt.Color(92, 92, 92));
    }//GEN-LAST:event_GradeFieldFocusGained

    private void GradeFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GradeFieldFocusLost
        GradeField.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_GradeFieldFocusLost

    private void AddButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseEntered
        AddButton.setBackground(new java.awt.Color(92, 92, 92));
    }//GEN-LAST:event_AddButtonMouseEntered

    private void AddButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseExited
        AddButton.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_AddButtonMouseExited

    private void ChangeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeButtonMouseEntered
        ChangeButton.setBackground(new java.awt.Color(92, 92, 92));
    }//GEN-LAST:event_ChangeButtonMouseEntered

    private void ChangeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeButtonMouseExited
        ChangeButton.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_ChangeButtonMouseExited

    private void DeleteButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseEntered
        DeleteButton.setBackground(new java.awt.Color(92, 92, 92));
    }//GEN-LAST:event_DeleteButtonMouseEntered

    private void DeleteButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseExited
        DeleteButton.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_DeleteButtonMouseExited

    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        int studentId = Integer.parseInt(StudentIdField.getText());
        int subjectId = Integer.parseInt(SubjectIdField.getText());
        int grade = Integer.parseInt(GradeField.getText());
        try {
            String message = ContentBuilder
                                .AddGradeResponse(Mapper
                                        .parseJSON(MainFrame.client
                                                .makeRequestADDGrade(session.getId(), studentId,
                                                        subjectId, grade)));
            JOptionPane.showConfirmDialog(myFrame, message);
                
        } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(myFrame, "Please enter numeric data!", "Incorrect data!", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
                JOptionPane.showMessageDialog(myFrame, "Problem with request!", "Server request error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AddButtonMouseClicked

    private void ChangeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeButtonMouseClicked
        int studentId = Integer.parseInt(StudentIdField.getText());
        int subjectId = Integer.parseInt(SubjectIdField.getText());
        int grade = Integer.parseInt(GradeField.getText());
        try {
            String message = ContentBuilder
                                .ChangeGradeResponse(Mapper
                                        .parseJSON(MainFrame.client
                                                .makeRequestCHANGEGrade(session.getId(), studentId,
                                                        subjectId, grade)));
            JOptionPane.showConfirmDialog(myFrame, message);
                
        } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(myFrame, "Please enter numeric data!", "Incorrect data!", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
                JOptionPane.showMessageDialog(myFrame, "Problem with request!", "Server request error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ChangeButtonMouseClicked

    private void DeleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteButtonMouseClicked
        int studentId = Integer.parseInt(StudentIdField.getText());
        int subjectId = Integer.parseInt(SubjectIdField.getText());
        try {
            String message = ContentBuilder
                                .DeleteGradeResponse(Mapper
                                        .parseJSON(MainFrame.client
                                                .makeRequestDELETEGrade(session.getId(), studentId,
                                                        subjectId)));
            JOptionPane.showConfirmDialog(myFrame, message);
                
        } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(myFrame, "Please enter numeric data!", "Incorrect data!", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
                JOptionPane.showMessageDialog(myFrame, "Problem with request!", "Server request error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_DeleteButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton ChangeButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField GradeField;
    private javax.swing.JLabel GradeLabel;
    private javax.swing.JTextField StudentIdField;
    private javax.swing.JLabel StudentLabel;
    private javax.swing.JTextField SubjectIdField;
    private javax.swing.JLabel SubjectLabel;
    // End of variables declaration//GEN-END:variables
}
