package com.mycompany.schoolbookclient.teacher;

import com.mycompany.schoolbookclient.mainwindow.MainFrame;
import com.mycompany.schoolbookclient.address.ChangeAddressFrame;
import com.mycompany.schoolbookclient.data.ContentBuilder;
import com.mycompany.schoolbookclient.data.Mapper;
import static com.mycompany.schoolbookclient.mainwindow.MainFrame.session;
import java.io.IOException;

/**
 *
 * @author marcin
 */
public class TeacherProfilePanel extends javax.swing.JPanel {
    MainFrame myFrame;
    
    public TeacherProfilePanel(MainFrame myFrame) throws IOException {
        this.myFrame = myFrame;
        initComponents();
        PersonalData.append(ContentBuilder
                                .TeacherPersonalData(Mapper
                                .parseJSON(MainFrame.client
                                .makeRequestGETTeacherByID(session.getId()))));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PersonalData = new javax.swing.JTextArea();
        ChangeAddressButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));
        setForeground(new java.awt.Color(255, 255, 255));
        setFocusable(false);

        PersonalData.setEditable(false);
        PersonalData.setBackground(new java.awt.Color(70, 70, 70));
        PersonalData.setColumns(120);
        PersonalData.setForeground(new java.awt.Color(190, 190, 190));
        PersonalData.setRows(7);
        PersonalData.setFocusable(false);
        PersonalData.setMargin(new java.awt.Insets(5, 5, 5, 5));

        ChangeAddressButton.setBackground(new java.awt.Color(51, 51, 51));
        ChangeAddressButton.setForeground(new java.awt.Color(255, 255, 255));
        ChangeAddressButton.setText("Change address");
        ChangeAddressButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChangeAddressButton.setPreferredSize(new java.awt.Dimension(140, 25));
        ChangeAddressButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangeAddressButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ChangeAddressButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ChangeAddressButtonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(PersonalData, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(ChangeAddressButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChangeAddressButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PersonalData, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ChangeAddressButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeAddressButtonMouseClicked
        myFrame.setEnabled(false);
        new ChangeAddressFrame(myFrame, session).setVisible(true);
    }//GEN-LAST:event_ChangeAddressButtonMouseClicked

    private void ChangeAddressButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeAddressButtonMouseEntered
        ChangeAddressButton.setBackground(new java.awt.Color(92, 92, 92));
    }//GEN-LAST:event_ChangeAddressButtonMouseEntered

    private void ChangeAddressButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeAddressButtonMouseExited
        ChangeAddressButton.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_ChangeAddressButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangeAddressButton;
    private javax.swing.JTextArea PersonalData;
    // End of variables declaration//GEN-END:variables
}
