
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASHOK KUMAR YADAV
 */
public class VAdmin_fn extends javax.swing.JFrame {

    
    public VAdmin_fn() {
        initComponents();
       
      
        
    }
    
    public void close()
    {
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        options = new javax.swing.JPanel();
        party = new javax.swing.JButton();
        announcements = new javax.swing.JButton();
        pollstn = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        separator = new javax.swing.JSeparator();
        GUIDE4 = new javax.swing.JLabel();
        background12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(930, 540));
        getContentPane().setLayout(null);

        options.setBackground(new java.awt.Color(51, 51, 51));

        party.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        party.setText("PARTIES");
        party.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partyActionPerformed(evt);
            }
        });

        announcements.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        announcements.setText("ANNOUNCEMENTS");
        announcements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                announcementsActionPerformed(evt);
            }
        });

        pollstn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pollstn.setText("POLL STATIONS");
        pollstn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pollstnActionPerformed(evt);
            }
        });

        EXIT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EXIT.setText("EXIT");
        EXIT.setPreferredSize(null);
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionsLayout = new javax.swing.GroupLayout(options);
        options.setLayout(optionsLayout);
        optionsLayout.setHorizontalGroup(
            optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(announcements, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(party, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pollstn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EXIT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        optionsLayout.setVerticalGroup(
            optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(party, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(announcements, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pollstn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        getContentPane().add(options);
        options.setBounds(0, 0, 230, 540);

        separator.setForeground(new java.awt.Color(255, 255, 255));
        separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        separator.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        separator.setFocusable(true);
        separator.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        separator.setOpaque(true);
        separator.setPreferredSize(new java.awt.Dimension(1, 0));
        getContentPane().add(separator);
        separator.setBounds(226, 0, 2, 540);

        GUIDE4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GUIDE4.setText("WELCOME TO THE ADMIN DASHBOARD");
        GUIDE4.setMaximumSize(new java.awt.Dimension(100, 24));
        getContentPane().add(GUIDE4);
        GUIDE4.setBounds(630, 20, 250, 15);

        background12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/bad-polling.jpg"))); // NOI18N
        getContentPane().add(background12);
        background12.setBounds(0, 0, 1030, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void partyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partyActionPerformed
        close();
       new VAdmin_fnp().setVisible(true);

    }//GEN-LAST:event_partyActionPerformed

    private void announcementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_announcementsActionPerformed
close();
       new VAdmin_fna().setVisible(true);

    }//GEN-LAST:event_announcementsActionPerformed

    private void pollstnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pollstnActionPerformed
close();
       new VAdmin_fnpl().setVisible(true);

    }//GEN-LAST:event_pollstnActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        System.exit(0);
    }//GEN-LAST:event_EXITActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        close();
        new home().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(VAdmin_fn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VAdmin_fn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VAdmin_fn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VAdmin_fn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VAdmin_fn().setVisible(true);
                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EXIT;
    private javax.swing.JLabel GUIDE4;
    private javax.swing.JButton announcements;
    private javax.swing.JLabel background12;
    private javax.swing.JButton logout;
    private javax.swing.JPanel options;
    private javax.swing.JButton party;
    private javax.swing.JButton pollstn;
    private javax.swing.JSeparator separator;
    // End of variables declaration//GEN-END:variables
}
