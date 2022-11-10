package frontend;

import backend.AdminRole;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import backend.LibrarianUser;
import java.util.ArrayList;

public class ViewLibrarians extends javax.swing.JFrame implements Node {

    AdminRole admin = new AdminRole();
    private Node parent;

    @Override
    public Node getParentNode() {
        return parent;
    }

    @Override
    public void setParentNode(Node node) {
        this.parent = node;
    }
    
    public ViewLibrarians() {
        initComponents();
        DefaultTableModel m = (DefaultTableModel) LibrariansTable.getModel();
        LibrarianUser[] librarians = admin.getListOfLibrarians();
        for(LibrarianUser cpy : librarians) {
            m.addRow(new Object[]{cpy.getLibrarianId(), cpy.getName(), cpy.getEmail(), cpy.getAddress(), cpy.getPhoneNumber()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        LibrariansTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("View Librarians");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        LibrariansTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Librarian ID", "Name", "Email", "Address", "Phone Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(LibrariansTable);
        if (LibrariansTable.getColumnModel().getColumnCount() > 0) {
            LibrariansTable.getColumnModel().getColumn(0).setResizable(false);
            LibrariansTable.getColumnModel().getColumn(1).setResizable(false);
            LibrariansTable.getColumnModel().getColumn(2).setResizable(false);
            LibrariansTable.getColumnModel().getColumn(3).setResizable(false);
            LibrariansTable.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.setVisible(false);
        ((JFrame) getParentNode()).setVisible(true);
    }//GEN-LAST:event_formWindowClosing



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable LibrariansTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
}
