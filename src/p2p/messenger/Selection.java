/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2p.messenger;

import static java.awt.Color.black;
import static java.awt.Color.cyan;
import static java.awt.Color.red;
import javax.swing.JOptionPane;

/**
 *
 * @author harshitbudhraja
 */
public class Selection extends javax.swing.JFrame {
    
    public static Messaging m = new Messaging();

    /**
     * Creates new form Selection
     */
    public Selection() {
        initComponents();
        getContentPane().setBackground( new java.awt.Color(59, 89, 152) );
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomelabel = new javax.swing.JLabel();
        sendbutton = new javax.swing.JButton();
        receivebutton = new javax.swing.JButton();
        about = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomelabel.setBackground(new java.awt.Color(255, 255, 0));
        welcomelabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        welcomelabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomelabel.setText("Welcome to P2P messenger");

        sendbutton.setBackground(new java.awt.Color(255, 255, 255));
        sendbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sendbutton.setForeground(new java.awt.Color(51, 0, 153));
        sendbutton.setText("SEND REQUEST");
        sendbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendbuttonActionPerformed(evt);
            }
        });

        receivebutton.setBackground(new java.awt.Color(255, 255, 255));
        receivebutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        receivebutton.setForeground(new java.awt.Color(51, 0, 153));
        receivebutton.setText("RECEIVE REQUEST");
        receivebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receivebuttonActionPerformed(evt);
            }
        });

        about.setBackground(new java.awt.Color(255, 255, 255));
        about.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        about.setForeground(new java.awt.Color(51, 0, 153));
        about.setText("ABOUT");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(51, 0, 153));
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(about, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(receivebutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sendbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(welcomelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sendbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(receivebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(about, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendbuttonActionPerformed
        // TODO add your handling code here:
        P2PMessenger.hostIP = JOptionPane.showInputDialog("Enter the destination computer's local IP address(generally in the form of 10.x.x.x or 192.168.x.x)");
        //System.out.println(LM.hostIP);
        if(P2PMessenger.hostIP != null && !"".equals(P2PMessenger.hostIP)){
            m.setVisible(true);
            this.dispose();
        }
        else{
            System.exit(1);
        }
    }//GEN-LAST:event_sendbuttonActionPerformed

    private void receivebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receivebuttonActionPerformed
        // TODO add your handling code here:
        new Server();
        
    }//GEN-LAST:event_receivebuttonActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(null, "P2P Messenger is a chat application where people can chat with\n others connected to the same network, without using the internet. \n The Project was developed by Monir Moniruzzaman(2014331055) \n and Ridoy Akanda(2014331001) under the supervision of \nDr. Farida Chowdhury (Assistant Professor, CSE, SUST, Bangladesh)", "About", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_aboutActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Selection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about;
    private javax.swing.JButton exit;
    private javax.swing.JButton receivebutton;
    private javax.swing.JButton sendbutton;
    private javax.swing.JLabel welcomelabel;
    // End of variables declaration//GEN-END:variables
}
