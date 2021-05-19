package com.mycompany.studentbookclient.student;

import com.mycompany.studentbookclient.MainFrame;

/**
 *
 * @author marcin
 */
public class StudentGradeFromPanel extends javax.swing.JPanel {
    MainFrame myFrame;

    public StudentGradeFromPanel(MainFrame myFrame) {
        this.myFrame = myFrame;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        SubjectLabel = new javax.swing.JLabel();
        SubjectIdField = new javax.swing.JTextField();
        SubjectIdButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));
        setForeground(new java.awt.Color(255, 255, 255));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(70, 70, 70));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(190, 190, 190));
        jTextArea1.setRows(5);
        jTextArea1.setText("Your grade from subject");
        jTextArea1.setFocusable(false);
        jTextArea1.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jTextArea1.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

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

        SubjectIdButton.setBackground(new java.awt.Color(51, 51, 51));
        SubjectIdButton.setForeground(new java.awt.Color(255, 255, 255));
        SubjectIdButton.setText("Find my grade");
        SubjectIdButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SubjectIdButton.setFocusPainted(false);
        SubjectIdButton.setFocusable(false);
        SubjectIdButton.setPreferredSize(new java.awt.Dimension(120, 25));
        SubjectIdButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SubjectIdButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SubjectIdButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SubjectLabel)
                                .addGap(18, 18, 18)
                                .addComponent(SubjectIdField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(SubjectIdButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubjectLabel)
                    .addComponent(SubjectIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SubjectIdButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SubjectIdFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SubjectIdFieldFocusGained
        SubjectIdField.setBackground(new java.awt.Color(92, 92, 92));
    }//GEN-LAST:event_SubjectIdFieldFocusGained

    private void SubjectIdFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SubjectIdFieldFocusLost
        SubjectIdField.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_SubjectIdFieldFocusLost

    private void SubjectIdButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubjectIdButtonMouseEntered
        SubjectIdButton.setBackground(new java.awt.Color(92, 92, 92));
    }//GEN-LAST:event_SubjectIdButtonMouseEntered

    private void SubjectIdButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubjectIdButtonMouseExited
        SubjectIdButton.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_SubjectIdButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SubjectIdButton;
    private javax.swing.JTextField SubjectIdField;
    private javax.swing.JLabel SubjectLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
