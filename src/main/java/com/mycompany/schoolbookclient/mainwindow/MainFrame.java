package com.mycompany.schoolbookclient.mainwindow;

import com.mycompany.schoolbookclient.Client;
import com.mycompany.schoolbookclient.session.Session;
import java.io.IOException;

/**
 *
 * @author marcin
 */
public class MainFrame extends javax.swing.JFrame {
    
    public MainFrame(Client client) {
        this.client = client;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        panel = new LoggingPanel(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SchoolBook");
        
        this.getContentPane().add(panel);
        pack();
    }

    public static void main(String args[]) throws IOException {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame(client).setVisible(true);
            }
        });
    }

    private javax.swing.JPanel panel;
    public static Client client;
    public static Session session;
}
