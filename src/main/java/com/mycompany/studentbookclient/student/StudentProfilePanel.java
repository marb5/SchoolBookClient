/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studentbookclient.student;

import com.mycompany.studentbookclient.MainFrame;

/**
 *
 * @author marcin
 */
public class StudentProfilePanel extends javax.swing.JPanel {
    MainFrame myFrame;
    /**
     * Creates new form StudentProfilePanel
     */
    public StudentProfilePanel(MainFrame myFrame) {
        this.myFrame = myFrame;
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

        PersonalData = new javax.swing.JTextArea();
        ChangeAddressButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));
        setForeground(new java.awt.Color(255, 255, 255));

        PersonalData.setEditable(false);
        PersonalData.setBackground(new java.awt.Color(70, 70, 70));
        PersonalData.setColumns(120);
        PersonalData.setForeground(new java.awt.Color(190, 190, 190));
        PersonalData.setRows(8);
        PersonalData.setText("Id: \nFirst name: \nLast_name: \nBirth_date: \nClass_number: \nCity:\nAddress:\nPost code:");
        PersonalData.setFocusable(false);
        PersonalData.setMargin(new java.awt.Insets(5, 5, 5, 5));

        ChangeAddressButton.setBackground(new java.awt.Color(51, 51, 51));
        ChangeAddressButton.setForeground(new java.awt.Color(255, 255, 255));
        ChangeAddressButton.setText("Change address");
        ChangeAddressButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChangeAddressButton.setPreferredSize(new java.awt.Dimension(140, 25));
        ChangeAddressButton.addMouseListener(new java.awt.event.MouseAdapter() {
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
