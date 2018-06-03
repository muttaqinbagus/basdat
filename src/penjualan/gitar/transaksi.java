package penjualan.gitar;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import static penjualan.gitar.koneksi.getConnection;

/**
 *
 * @author taqbagus
 */
public class transaksi extends javax.swing.JFrame {

    koneksi db = new koneksi();
    Connection conn = getConnection();
    String t = "";
    public String idkasir;

    private transaksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void setid(String idnya)
    {
        this.idkasir=idnya;
    }
    public transaksi(String id) {
        initComponents();
        setLocationRelativeTo(null);
        tableload(jTable2);
        kodeload (jTextField1);
        setid(id);
        jTextField2.setText(id);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        txtotal = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jumlahi = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        cbb = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("TRANSAKSI");

        jLabel2.setText("no_transaksi");

        jLabel3.setText("id_kasir");

        jLabel4.setText("id_barang");

        jLabel5.setText("jumlah_item");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel6.setText("waktu_transaksi");

        jLabel7.setText("total_harga");

        jLabel8.setText("pembayaran");

        jLabel9.setText("kembalian");

        jTextField5.setEditable(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField8.setEditable(false);

        jumlahi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", " " }));
        jumlahi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahiActionPerformed(evt);
            }
        });

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "no_transaksi", "id_kasir", "id_barang", "jumlah_item", "waktu_transaksi", "total_harga", "pembayaran", "kembalian"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        cbb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", " " }));
        cbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(jTextPane1);

        jButton4.setText("PRINT STRUCK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("REFRES");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addContainerGap(805, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(102, 102, 102)
                                .addComponent(jButton4)
                                .addGap(104, 104, 104)
                                .addComponent(jButton3)
                                .addGap(60, 60, 60)
                                .addComponent(jButton5)
                                .addGap(46, 46, 46))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(463, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jumlahi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34))))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jumlahi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton3)
                        .addComponent(jButton4)
                        .addComponent(jButton5)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jumlahiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahiActionPerformed
        String cbbb = cbb.getSelectedItem().toString();
        String jumlah =  jumlahi.getSelectedItem().toString();
               
        if(jumlah.equals("1")){
            try{
                String sql = "SELECT sum(harga_barang * " + 1 + ") from barang WHERE id_barang = " + cbb.getSelectedItem();
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet rset = pst.executeQuery(sql);
                while(rset.next()){
                    t = rset.getString(1);
                }
                txtotal.setText(t);
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Tes");
            }
        }else if(jumlah.equals("2")){
            try{
                String sql = "SELECT sum(harga_barang * " + 2 + ") from barang WHERE id_barang = " + cbb.getSelectedItem();
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet rset = pst.executeQuery(sql);
                while(rset.next()){
                    t = rset.getString(1);
                }
                txtotal.setText(t);
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Tes");
            }
        }else if(jumlah.equals("3")){
            try{
                String sql = "SELECT sum(harga_barang * " + 3 + ") from barang WHERE id_barang = " + cbb.getSelectedItem();
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet rset = pst.executeQuery(sql);
                while(rset.next()){
                    t = rset.getString(1);
                }
                txtotal.setText(t);
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Tes");
            }
        }else if(jumlah.equals("4")){
            try{
                String sql = "SELECT sum(harga_barang * " + 4 + ") from barang WHERE id_barang = " + cbb.getSelectedItem();
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet rset = pst.executeQuery(sql);
                while(rset.next()){
                    t = rset.getString(1);
                }
                txtotal.setText(t);
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Tes");
            }
        }else if(jumlah.equals("5")){
            try{
                String sql = "SELECT sum(harga_barang * " + 5 + ") from barang WHERE id_barang = " + cbb.getSelectedItem();
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet rset = pst.executeQuery(sql);
                while(rset.next()){
                    t = rset.getString(1);
                }
                txtotal.setText(t);
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Tes");
            }
        }
        
    }//GEN-LAST:event_jumlahiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int to = 0;
        try{
            String sql = "INSERT INTO transaksi VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setString(1, jTextField1.getText());
            pst.setString(2, jTextField2.getText());
            pst.setString(3, cbb.getSelectedItem().toString());
            pst.setString(4, jumlahi.getSelectedItem().toString());
            pst.setDate(5, new java.sql.Date(System.currentTimeMillis()));
            pst.setString(6, txtotal.getText());
            pst.setString(7, jTextField7.getText());
            to = Integer.parseInt(jTextField7.getText()) - Integer.parseInt(t);
            pst.setInt(8, to);
            
            pst.execute();
            tableload(jTable2);
            JOptionPane.showMessageDialog(null, "Transaksi Success");
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          try {
            String sql = "delete from transaksi where no_transaksi = "+ jTextField1.getText();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute(); 

            tableload(jTable2);
            JOptionPane.showMessageDialog(null, "Delete sukses");
        
          } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try {
            String sql = "update transaksi set jumlah_item = "
                    + jumlahi.getSelectedItem()+ " where no_transaksi = "+ jTextField1.getText();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute(); 

            tableload(jTable2);
            //JOptionPane.showMessageDialog(null, "Update berhasil");
        } catch (Exception ex) {
            System.out.println(ex);
            //JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
           try {
            String sql = "update transaksi set id_kasir = "
                    + jTextField2.getText()+ " where no_transaksi = "+ jTextField1.getText();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute(); 

            tableload(jTable2);
            JOptionPane.showMessageDialog(null, "Update berhasil");
        } catch (Exception ex) {
            System.out.println(ex);
            //JOptionPane.showMessageDialog(null, ex.getMessage());
        }
             try {
            String sql = "update transaksi set id_barang = "
                    + cbb.getSelectedItem()+ " where no_transaksi = "+ jTextField1.getText();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute(); 

            tableload(jTable2);
            JOptionPane.showMessageDialog(null, "Update berhasil");
        } catch (Exception ex) {
            System.out.println(ex);
            //JOptionPane.showMessageDialog(null, ex.getMessage());
        }
                 try {
            String sql = "update transaksi set jumlah_item = "
                    + jumlahi.getSelectedItem()+ " where no_transaksi = "+ jTextField1.getText();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute(); 

            tableload(jTable2);
            JOptionPane.showMessageDialog(null, "Update berhasil");
        } catch (Exception ex) {
            System.out.println(ex);
            //JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        try {
            String sql = "update transaksi set total_harga = "
                    + txtotal.getText()+ " where no_transaksi = "+ jTextField1.getText();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute(); 

            tableload(jTable2);
            JOptionPane.showMessageDialog(null, "Update berhasil");
        } catch (Exception ex) {
            System.out.println(ex);
            //JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        try {
            String sql = "update transaksi set pembayaran = "
                    + jTextField7.getText()+ " where no_transaksi = "+ jTextField1.getText();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute(); 

            tableload(jTable2);
            JOptionPane.showMessageDialog(null, "Update berhasil");
        } catch (Exception ex) {
            System.out.println(ex);
            //JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
          jTextPane1.print();
        }catch(PrinterException e){
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        jTextField1.setText(String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 0)));
        jTextField2.setText(String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 1)));
        cbb.setSelectedItem(String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 2)));
        jumlahi.setSelectedItem(String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 3)));
        jTextField5.setText(String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 4)));
        txtotal.setText(String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 5)));
        jTextField7.setText(String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 6)));
        jTextField8.setText(String.valueOf(jTable2.getValueAt(jTable2.getSelectedRow(), 7)));
        viewStruct();
    }//GEN-LAST:event_jTable2MouseClicked

    private void cbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         jTextField1.setText(null);
         jTextPane1.setText(null);
         jTextField2.setText(null);
         jTextField7.setText("");
         txtotal.setText("");
         jTextField5.setText("");
         jTextField8.setText("");
         cbb.setSelectedItem("");
         jumlahi.setSelectedItem("");
    }//GEN-LAST:event_jButton5ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JComboBox jumlahi;
    private javax.swing.JTextField txtotal;
    // End of variables declaration//GEN-END:variables
private void kodeload (JTextField j){
    try {
        ResultSet rset = db.getData("SELECT max(no_transaksi) FROM transaksi");
        while(rset.next()){
            int i = rset.getInt(1);
            i +=1;
            j.setText(String.valueOf(i));
        }
    }catch (Exception ex){
                    
    }
    
}
private void tableload(JTable jt) {
        DefaultTableModel dt = (DefaultTableModel) jt.getModel();
        dt.setRowCount(0);
        try {
            ResultSet rset = db.getData("SELECT * FROM transaksi");
            while(rset.next()){
                Vector v = new Vector();
                v.add(rset.getString(1));
                v.add(rset.getString(2));
                v.add(rset.getString(3));
                v.add(rset.getString(4));
                v.add(rset.getString(5));
                v.add(rset.getString(6));
                v.add(rset.getString(7));
                v.add(rset.getString(8));
                dt.addRow(v);
            }
        } catch (Exception ex) {
            
        }
    }

       private void viewStruct(){
        jTextPane1.setText(String.valueOf("\t   -- Toko Gitar Surabaya -- \n " 
                + "\t  Penjualan Gitar Surabaya \n"
                + "\t           Jl.Sukosemolo No.165,Semolowaru,sukolilo,kota SBY,Jawa Timur 60119\n"
                + " - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n\n No Transaksi \t : "
                + jTable2.getValueAt(jTable2.getSelectedRow(), 0) + " \n ID Kasir \t\t : "
                + jTable2.getValueAt(jTable2.getSelectedRow(), 1) + " \n ID Barang \t\t : "
                + jTable2.getValueAt(jTable2.getSelectedRow(), 2) + " \n Jumlah Iem \t\t : "
                + jTable2.getValueAt(jTable2.getSelectedRow(), 3) + " \n Waktu transaksi \t : "
                + jTable2.getValueAt(jTable2.getSelectedRow(), 4) + " \n Total Harga\t\t : " 
                + jTable2.getValueAt(jTable2.getSelectedRow(), 5) + " \n"
                + " - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
                + " Pembayaran \t : " + jTable2.getValueAt(jTable2.getSelectedRow(), 6) + " \n"
                + " - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -"
                + " \n *Kembalian \t : " + jTable2.getValueAt(jTable2.getSelectedRow(), 7) + " \n\t"
        ));
        
    }

}
