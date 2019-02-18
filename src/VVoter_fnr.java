
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASHOK KUMAR YADAV
 */
public class VVoter_fnr extends javax.swing.JFrame {
Connection con=null;
    PreparedStatement pst1=null;
    ResultSet rs=null;
    /**
     * Creates new form voter_fn
     */
    public VVoter_fnr() {
        initComponents();
       
     res.removeAll();
        
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
        result = new javax.swing.JButton();
        manifesto = new javax.swing.JButton();
        pollstn = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        vote = new javax.swing.JButton();
        logout1 = new javax.swing.JButton();
        separator = new javax.swing.JSeparator();
        GUIDE6 = new javax.swing.JLabel();
        background12 = new javax.swing.JLabel();
        res = new javax.swing.JPanel();
        background13 = new javax.swing.JLabel();
        polres = new javax.swing.JPanel();
        votingres1 = new javax.swing.JScrollPane();
        voteres1 = new javax.swing.JTable();
        GUIDE7 = new javax.swing.JLabel();
        background14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(930, 540));
        getContentPane().setLayout(null);

        options.setBackground(new java.awt.Color(51, 51, 51));

        result.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        result.setText("RESULTS");
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });

        manifesto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        manifesto.setText("MANIFESTO");
        manifesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manifestoActionPerformed(evt);
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

        vote.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        vote.setText("CAST VOTE");
        vote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voteActionPerformed(evt);
            }
        });

        logout1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        logout1.setText("LOGOUT");
        logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionsLayout = new javax.swing.GroupLayout(options);
        options.setLayout(optionsLayout);
        optionsLayout.setHorizontalGroup(
            optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionsLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(manifesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pollstn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EXIT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vote, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );
        optionsLayout.setVerticalGroup(
            optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(manifesto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pollstn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(vote, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logout1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
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

        GUIDE6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GUIDE6.setForeground(new java.awt.Color(255, 255, 255));
        GUIDE6.setText("WELCOME TO THE VOTER DASHBOARD");
        GUIDE6.setMaximumSize(new java.awt.Dimension(100, 24));
        getContentPane().add(GUIDE6);
        GUIDE6.setBounds(630, 20, 290, 15);

        background12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/50-Beautiful-and-Minimalist-Presentation-Backgrounds-013.jpg"))); // NOI18N
        background12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        background12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        background12.setInheritsPopupMenu(false);
        background12.setMaximumSize(new java.awt.Dimension(930, 540));
        background12.setMinimumSize(new java.awt.Dimension(0, 0));
        background12.setPreferredSize(new java.awt.Dimension(930, 540));
        getContentPane().add(background12);
        background12.setBounds(-10, -10, 970, 560);

        res.setLayout(new java.awt.CardLayout());

        background13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/50-Beautiful-and-Minimalist-Presentation-Backgrounds-013.jpg"))); // NOI18N
        background13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        background13.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        background13.setInheritsPopupMenu(false);
        background13.setMaximumSize(new java.awt.Dimension(930, 540));
        background13.setMinimumSize(new java.awt.Dimension(0, 0));
        background13.setPreferredSize(new java.awt.Dimension(930, 540));
        res.add(background13, "card2");

        polres.setLayout(null);

        voteres1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Candidate ID", "Total Votes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        votingres1.setViewportView(voteres1);

        polres.add(votingres1);
        votingres1.setBounds(110, 70, 530, 300);

        GUIDE7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        GUIDE7.setForeground(new java.awt.Color(255, 255, 255));
        GUIDE7.setText("VOTING RESULTS");
        GUIDE7.setMaximumSize(new java.awt.Dimension(100, 24));
        polres.add(GUIDE7);
        GUIDE7.setBounds(540, 20, 380, 15);

        background14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/50-Beautiful-and-Minimalist-Presentation-Backgrounds-013.jpg"))); // NOI18N
        background14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        background14.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        background14.setInheritsPopupMenu(false);
        background14.setMaximumSize(new java.awt.Dimension(930, 540));
        background14.setMinimumSize(new java.awt.Dimension(0, 0));
        background14.setPreferredSize(new java.awt.Dimension(930, 540));
        polres.add(background14);
        background14.setBounds(-10, -10, 970, 560);

        res.add(polres, "card3");

        getContentPane().add(res);
        res.setBounds(230, 0, 730, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manifestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manifestoActionPerformed
       close();
       new VVoter_fnm().setVisible(true);
       
    }//GEN-LAST:event_manifestoActionPerformed

    private void pollstnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pollstnActionPerformed
       close();
       new VVoter_fnpl().setVisible(true);
       
    }//GEN-LAST:event_pollstnActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        System.exit(0);
    }//GEN-LAST:event_EXITActionPerformed

    private void voteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voteActionPerformed
    close();
    new VVoter_fncv().setVisible(true);        
    }//GEN-LAST:event_voteActionPerformed

    private void logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout1ActionPerformed
       
       close();
       
        new home().setVisible(true);
       
        // TODO add your handling code here:
    }//GEN-LAST:event_logout1ActionPerformed

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed
        res.removeAll();
        res.add(polres);
        res.repaint();
        res.revalidate();
        con=connect.ConnectDB();
    CallableStatement cs;
       try {
       
               String sql1="select * from votestot";
               cs=con.prepareCall("{ call votes_tot}");
             cs.executeUpdate();
            DefaultTableModel tb1= (DefaultTableModel) voteres1.getModel();
        tb1.setRowCount(0);
       
            String rg[]=new String[2];
         pst1=con.prepareStatement(sql1);
          rs= pst1.executeQuery();
          
          if(rs.next())
          {
              
              do
              {
                rg[0]=rs.getString(1);
                rg[1]=rs.getString(2);
                
                tb1.addRow(rg);
                
              }while(rs.next());
          }
              
    
    }
   catch(SQLException | HeadlessException e){
         JOptionPane.showMessageDialog(null, e); 
          
    } 
               
    }//GEN-LAST:event_resultActionPerformed

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
            java.util.logging.Logger.getLogger(VVoter_fn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VVoter_fn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VVoter_fn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VVoter_fn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VVoter_fn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EXIT;
    private javax.swing.JLabel GUIDE6;
    private javax.swing.JLabel GUIDE7;
    private javax.swing.JLabel background12;
    private javax.swing.JLabel background13;
    private javax.swing.JLabel background14;
    private javax.swing.JButton logout1;
    private javax.swing.JButton manifesto;
    private javax.swing.JPanel options;
    private javax.swing.JButton pollstn;
    private javax.swing.JPanel polres;
    private javax.swing.JPanel res;
    private javax.swing.JButton result;
    private javax.swing.JSeparator separator;
    private javax.swing.JButton vote;
    private javax.swing.JTable voteres1;
    private javax.swing.JScrollPane votingres1;
    // End of variables declaration//GEN-END:variables
}
