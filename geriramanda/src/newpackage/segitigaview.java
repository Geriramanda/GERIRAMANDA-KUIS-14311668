/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author acerOne14
 */
public class segitigaview extends javax.swing.JPanel {

    /**
     * Creates new form segitigaview
     */
    public segitigaview() {
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

        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("hasil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 175, -1, -1));

        jLabel3.setText("=");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 242, 120, 30));

        jLabel1.setText("masukan alas");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 53, -1, -1));

        jLabel2.setText("masukan tinggi");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 119, -1, -1));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 50, 64, -1));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 119, 64, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        segitiga irw = new segitiga();
        double a =Double.parseDouble(jTextField1.getText());
        double b =Double.parseDouble(jTextField2.getText());
        double hasil=irw.Lsegitiga(a,b);
        jLabel3.setText("Luas="+hasil);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
