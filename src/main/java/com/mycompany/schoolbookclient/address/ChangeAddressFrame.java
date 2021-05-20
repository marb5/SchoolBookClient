package com.mycompany.schoolbookclient.address;

import com.mycompany.schoolbookclient.data.ContentBuilder;
import com.mycompany.schoolbookclient.data.Mapper;
import com.mycompany.schoolbookclient.mainwindow.MainFrame;
import com.mycompany.schoolbookclient.session.Session;
import com.mycompany.schoolbookclient.session.StudentSession;
import com.mycompany.schoolbookclient.session.TeacherSession;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author marcin
 */
public class ChangeAddressFrame extends javax.swing.JFrame {
    static MainFrame parentFrame;
    static Session session;
    
    public ChangeAddressFrame(MainFrame parentFrame, Session session) {
        this.parentFrame = parentFrame;
        this.session = session;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CloseButton = new javax.swing.JButton();
        CityLabel = new javax.swing.JLabel();
        StreetLabel = new javax.swing.JLabel();
        PostCodeLabel = new javax.swing.JLabel();
        CityField = new javax.swing.JTextField();
        StreetField = new javax.swing.JTextField();
        PostCodeField = new javax.swing.JTextField();
        ChangeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        CloseButton.setBackground(new java.awt.Color(51, 51, 51));
        CloseButton.setForeground(new java.awt.Color(255, 255, 255));
        CloseButton.setText("Close");
        CloseButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CloseButton.setFocusable(false);
        CloseButton.setPreferredSize(new java.awt.Dimension(60, 25));
        CloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseButtonMouseExited(evt);
            }
        });

        CityLabel.setBackground(new java.awt.Color(0, 204, 204));
        CityLabel.setForeground(new java.awt.Color(255, 255, 255));
        CityLabel.setText("City");
        CityLabel.setFocusable(false);

        StreetLabel.setBackground(new java.awt.Color(0, 204, 204));
        StreetLabel.setForeground(new java.awt.Color(255, 255, 255));
        StreetLabel.setText("Street and number");
        StreetLabel.setToolTipText("");
        StreetLabel.setFocusable(false);

        PostCodeLabel.setBackground(new java.awt.Color(0, 204, 204));
        PostCodeLabel.setForeground(new java.awt.Color(255, 255, 255));
        PostCodeLabel.setText("Post code");
        PostCodeLabel.setFocusable(false);

        CityField.setBackground(new java.awt.Color(51, 51, 51));
        CityField.setForeground(new java.awt.Color(255, 255, 255));
        CityField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CityField.setCaretColor(new java.awt.Color(255, 255, 255));
        CityField.setPreferredSize(new java.awt.Dimension(170, 25));
        CityField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CityFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CityFieldFocusLost(evt);
            }
        });

        StreetField.setBackground(new java.awt.Color(51, 51, 51));
        StreetField.setForeground(new java.awt.Color(255, 255, 255));
        StreetField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        StreetField.setCaretColor(new java.awt.Color(255, 255, 255));
        StreetField.setPreferredSize(new java.awt.Dimension(170, 25));
        StreetField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                StreetFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                StreetFieldFocusLost(evt);
            }
        });

        PostCodeField.setBackground(new java.awt.Color(51, 51, 51));
        PostCodeField.setForeground(new java.awt.Color(255, 255, 255));
        PostCodeField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PostCodeField.setCaretColor(new java.awt.Color(255, 255, 255));
        PostCodeField.setPreferredSize(new java.awt.Dimension(170, 25));
        PostCodeField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PostCodeFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PostCodeFieldFocusLost(evt);
            }
        });

        ChangeButton.setBackground(new java.awt.Color(51, 51, 51));
        ChangeButton.setForeground(new java.awt.Color(255, 255, 255));
        ChangeButton.setText("Change address");
        ChangeButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ChangeButton.setFocusable(false);
        ChangeButton.setPreferredSize(new java.awt.Dimension(140, 25));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CityLabel)
                                .addGap(126, 126, 126)
                                .addComponent(CityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StreetLabel)
                                    .addComponent(PostCodeLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PostCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(StreetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 36, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(ChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CityLabel)
                    .addComponent(CityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StreetLabel)
                    .addComponent(StreetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PostCodeLabel)
                    .addComponent(PostCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseEntered
        CloseButton.setBackground(new java.awt.Color(92, 92, 92));
    }//GEN-LAST:event_CloseButtonMouseEntered

    private void CloseButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseExited
        CloseButton.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_CloseButtonMouseExited

    private void CityFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CityFieldFocusGained
        CityField.setBackground(new java.awt.Color(92, 92, 92));
    }//GEN-LAST:event_CityFieldFocusGained

    private void CityFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CityFieldFocusLost
        CityField.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_CityFieldFocusLost

    private void StreetFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_StreetFieldFocusGained
        StreetField.setBackground(new java.awt.Color(92, 92, 92));
    }//GEN-LAST:event_StreetFieldFocusGained

    private void StreetFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_StreetFieldFocusLost
        StreetField.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_StreetFieldFocusLost

    private void PostCodeFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PostCodeFieldFocusGained
        PostCodeField.setBackground(new java.awt.Color(92, 92, 92));
    }//GEN-LAST:event_PostCodeFieldFocusGained

    private void PostCodeFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PostCodeFieldFocusLost
        PostCodeField.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_PostCodeFieldFocusLost

    private void ChangeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeButtonMouseEntered
        ChangeButton.setBackground(new java.awt.Color(92, 92, 92));
    }//GEN-LAST:event_ChangeButtonMouseEntered

    private void ChangeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeButtonMouseExited
        ChangeButton.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_ChangeButtonMouseExited

    private void CloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseButtonMouseClicked
        parentFrame.setEnabled(true);
        dispose();
    }//GEN-LAST:event_CloseButtonMouseClicked

    private void ChangeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeButtonMouseClicked
        if (!CityField.getText().isEmpty() && !StreetField.getText().isEmpty() && 
                !PostCodeField.getText().isEmpty() && PostCodeField.getText().length() <= 6) {
            try {
                if (session.getClass() == StudentSession.class) {
                    String message = ContentBuilder
                                        .ChangeAddressResponse(Mapper
                                                .parseJSON(MainFrame.client
                                                        .makeRequestCHANGEStudentAddress(session.getId(), CityField.getText(),
                                                                StreetField.getText(), PostCodeField.getText())));
                    JOptionPane.showConfirmDialog(this, message);
                }
                else if (session.getClass() == TeacherSession.class) {
                    String message = ContentBuilder
                                        .ChangeAddressResponse(Mapper
                                                .parseJSON(MainFrame.client
                                                        .makeRequestCHANGETeacherAddress(session.getId(), CityField.getText(),
                                                                StreetField.getText(), PostCodeField.getText())));
                    JOptionPane.showConfirmDialog(this, message);
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Problem with request!", "Server request error!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter data!", "Incorrect data!", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_ChangeButtonMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChangeAddressFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeAddressFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeAddressFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeAddressFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeAddressFrame(parentFrame, session).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangeButton;
    private javax.swing.JTextField CityField;
    private javax.swing.JLabel CityLabel;
    private javax.swing.JButton CloseButton;
    private javax.swing.JTextField PostCodeField;
    private javax.swing.JLabel PostCodeLabel;
    private javax.swing.JTextField StreetField;
    private javax.swing.JLabel StreetLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
