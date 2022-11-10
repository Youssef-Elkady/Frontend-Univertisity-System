package frontend;

import backend.AdminRole;
import backend.LibrarianUser;
import backend.LibrarianUserDatabase;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RemoveLibrarian extends javax.swing.JFrame implements Node {

    private Node parent;

    @Override
    public Node getParentNode() {
        return parent;
    }

    @Override
    public void setParentNode(Node node) {
        this.parent = node;
    }
    
    public RemoveLibrarian() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LibrarianID = new javax.swing.JLabel();
        librarianIDTextField = new javax.swing.JTextField();
        Remove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Remove Librarian");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        LibrarianID.setBackground(new java.awt.Color(204, 255, 204));
        LibrarianID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LibrarianID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LibrarianID.setText("Librarian ID");
        LibrarianID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        LibrarianID.setOpaque(true);

        librarianIDTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        librarianIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                librarianIDTextFieldActionPerformed(evt);
            }
        });

        Remove.setBackground(new java.awt.Color(0, 0, 0));
        Remove.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Remove.setForeground(new java.awt.Color(255, 255, 255));
        Remove.setText("Remove");
        Remove.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(LibrarianID, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(librarianIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Remove, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LibrarianID, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Remove, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(librarianIDTextField))))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void librarianIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_librarianIDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_librarianIDTextFieldActionPerformed

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
        AdminRole admin = new AdminRole();
        String lID = librarianIDTextField.getText();
        boolean flag = false;
        LibrarianUser[] librarians = admin.getListOfLibrarians();
        
        for(LibrarianUser cpy : librarians) {
            if(lID.equals(cpy.getLibrarianId())) {
                flag = true;
            }
        }
        if(!flag) 
            JOptionPane.showMessageDialog(null, "The librarian with id = " + lID + " username doesn't exist!");
        else {
            admin.removeLibrarian(lID);
            librarianIDTextField.setText("");
            JOptionPane.showMessageDialog(null, "The librarian with id = " + lID + " has been deleted.");
        }
//        
//        
//        for (int i = 0; i < admin.getListOfLibrarians().length; i++) {            
//           String librarianId;
//            librarianId = ((LibrarianUser)(admin.getListOfLibrarians[i])).getLibrarianId();
//            if (librarianId ==lID) {
//                flag = true;
//                admin.removeLibrarian(lID);
//                JOptionPane.showMessageDialog(null, "The Librarian with ID= " + lID + " has been deleted");
//                break;
//            }
//        }
//        if (flag == false) {
//            JOptionPane.showMessageDialog(null, "The Librarian with ID= " + ID + " already exists");
//        }

    }//GEN-LAST:event_RemoveActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setVisible(false);
        ((JFrame) getParentNode()).setVisible(true);
    }//GEN-LAST:event_formWindowClosing

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
//            java.util.logging.Logger.getLogger(RemoveLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RemoveLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RemoveLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RemoveLibrarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RemoveLibrarian().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LibrarianID;
    private javax.swing.JButton Remove;
    private javax.swing.JTextField librarianIDTextField;
    // End of variables declaration//GEN-END:variables

}