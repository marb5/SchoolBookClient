package com.mycompany.schoolbookclient.student;

import com.mycompany.schoolbookclient.data.ContentBuilder;
import com.mycompany.schoolbookclient.data.Mapper;
import com.mycompany.schoolbookclient.mainwindow.MainFrame;
import static com.mycompany.schoolbookclient.mainwindow.MainFrame.session;
import java.io.IOException;

/**
 *
 * @author marcin
 */
public class StudentGradesPanel extends javax.swing.JPanel {
    MainFrame myFrame;

    public StudentGradesPanel(MainFrame myFrame) throws IOException {
        this.myFrame = myFrame;
        initComponents();
        jTextArea1.setText(ContentBuilder
                                .StudentGrades(Mapper
                                .parseJSONlist(MainFrame.client
                                .makeRequestGETStudentByIDGrades(session.getId()))));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(0, 204, 204));
        setForeground(new java.awt.Color(255, 255, 255));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(70, 70, 70));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(190, 190, 190));
        jTextArea1.setRows(10);
        jTextArea1.setFocusable(false);
        jTextArea1.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
