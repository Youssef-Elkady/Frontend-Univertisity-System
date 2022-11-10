package frontend;

import backend.AdminRole;
import backend.LibrarianUser;
import javax.swing.JFrame;

public class AdminRoleFE extends javax.swing.JFrame implements Node {
    
    private Node parent;

    /**
     * Creates new form AdminRole
     */
    public AdminRoleFE() {
        initComponents();
    }
    
    @Override
    public Node getParentNode() {
        return parent;
    }
    
    @Override
    public void setParentNode(Node node) {
        this.parent = node;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddLibrarian = new javax.swing.JButton();
        ViewLibrarians = new javax.swing.JButton();
        RemoveLibrarians = new javax.swing.JButton();
        Logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Admin Role");
        setPreferredSize(new java.awt.Dimension(580, 375));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        AddLibrarian.setBackground(new java.awt.Color(0, 0, 0));
        AddLibrarian.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        AddLibrarian.setForeground(new java.awt.Color(255, 255, 255));
        AddLibrarian.setText("Add Librarian");
        AddLibrarian.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddLibrarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddLibrarianActionPerformed(evt);
            }
        });

        ViewLibrarians.setBackground(new java.awt.Color(0, 0, 0));
        ViewLibrarians.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ViewLibrarians.setForeground(new java.awt.Color(255, 255, 255));
        ViewLibrarians.setText("View Librarians");
        ViewLibrarians.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewLibrariansActionPerformed(evt);
            }
        });

        RemoveLibrarians.setBackground(new java.awt.Color(0, 0, 0));
        RemoveLibrarians.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        RemoveLibrarians.setForeground(new java.awt.Color(255, 255, 255));
        RemoveLibrarians.setText("Remove Librarian");
        RemoveLibrarians.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveLibrariansActionPerformed(evt);
            }
        });

        Logout.setBackground(new java.awt.Color(0, 0, 0));
        Logout.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setText("Logout");
        Logout.setOpaque(true);
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RemoveLibrarians, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewLibrarians, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddLibrarian, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(AddLibrarian, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewLibrarians, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RemoveLibrarians, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddLibrarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddLibrarianActionPerformed
        AddLibrarian aL = new AddLibrarian();
        aL.setParentNode(this);
        aL.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddLibrarianActionPerformed
    

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
//        this.setVisible(false);
//        ((JFrame) getParentNode()).setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        AdminRole admin = new AdminRole();
        admin.logout();       //for saving
        this.setVisible(false);
        LibrarySystem ls = new LibrarySystem();
        ls.setVisible(true);
        //((JFrame) getParentNode()).setVisible(true);
        
    }//GEN-LAST:event_LogoutActionPerformed

    private void RemoveLibrariansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveLibrariansActionPerformed
        RemoveLibrarian rL = new RemoveLibrarian();
        rL.setParentNode(this);
        rL.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RemoveLibrariansActionPerformed

    private void ViewLibrariansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewLibrariansActionPerformed
        ViewLibrarians vL = new ViewLibrarians();
        vL.setParentNode(this);
        vL.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_ViewLibrariansActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AdminRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AdminRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AdminRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AdminRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Admin_Role().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddLibrarian;
    private javax.swing.JButton Logout;
    private javax.swing.JButton RemoveLibrarians;
    private javax.swing.JButton ViewLibrarians;
    // End of variables declaration//GEN-END:variables
}
