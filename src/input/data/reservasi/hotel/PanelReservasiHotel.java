package input.data.reservasi.hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelReservasiHotel extends javax.swing.JFrame {
    double lama, tarif, bayar;
    String nama, jenis;
    Statement pst;
    Connection con;
    ResultSet rs;
    

    public PanelReservasiHotel() {
        initComponents();
    }
    
    public PanelReservasiHotel(String username) {
        initComponents();
    }
    
    public void run() {
        PanelReservasiHotel h = new PanelReservasiHotel();
        new PanelReservasiHotel().setVisible(false);
    }

    public void combo() {
       
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtLama = new javax.swing.JTextField();
        btnHitung = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        totalBayar = new javax.swing.JTextField();
        hslJenis = new javax.swing.JTextField();
        hslNama = new javax.swing.JTextField();
        hslHarga = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableVisitor = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        comboName = new javax.swing.JComboBox<>();
        labelCode = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        comboRoom = new javax.swing.JComboBox<>();
        daftar = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable4);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(jTable5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Customer Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Choose Room");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Stay Duration");

        txtLama.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtLama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLamaActionPerformed(evt);
            }
        });
        txtLama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLamaKeyPressed(evt);
            }
        });

        btnHitung.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHitung.setText("Ok");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHapus.setText("Reset");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Name");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Room Type");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Total");

        totalBayar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totalBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBayarActionPerformed(evt);
            }
        });
        totalBayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                totalBayarKeyPressed(evt);
            }
        });

        hslJenis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hslJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hslJenisActionPerformed(evt);
            }
        });
        hslJenis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                hslJenisKeyPressed(evt);
            }
        });

        hslNama.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hslNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                hslNamaKeyPressed(evt);
            }
        });

        hslHarga.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hslHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hslHargaActionPerformed(evt);
            }
        });
        hslHarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                hslHargaKeyPressed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Room Price");

        tableVisitor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tableVisitor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Name", "Room Type", "Room Price", "Total"
            }
        ));
        tableVisitor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableVisitorMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tableVisitor);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Registration");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Confirmation");

        btnConfirm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConfirm.setText("Ok");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel12.setText("Hotel East Malang");

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        comboName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNameActionPerformed(evt);
            }
        });

        labelCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelCode.setText("Code");

        txtCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });
        txtCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodeKeyPressed(evt);
            }
        });

        comboRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRoomActionPerformed(evt);
            }
        });

        daftar.setText("Daftar");
        daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnExit)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBack)))
                                .addGap(209, 209, 209)
                                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelCode)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(140, 140, 140)
                                        .addComponent(btnHitung)
                                        .addGap(22, 22, 22)
                                        .addComponent(btnHapus))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(comboName, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(daftar))
                                            .addComponent(comboRoom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtLama)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(totalBayar, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                                    .addComponent(hslHarga)
                                    .addComponent(hslJenis)
                                    .addComponent(hslNama)
                                    .addComponent(txtCode))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jLabel12)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(comboRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(daftar))
                                .addGap(38, 38, 38)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHitung)
                            .addComponent(btnHapus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCode)
                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(hslNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(hslJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hslHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(totalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConfirm)
                            .addComponent(btnExit)
                            .addComponent(btnBack))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(jScrollPane6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLamaActionPerformed

    }//GEN-LAST:event_txtLamaActionPerformed

    private void txtLamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLamaKeyPressed

    }//GEN-LAST:event_txtLamaKeyPressed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        comboName.setSelectedIndex(1);
        comboRoom.setSelectedItem("");
        txtLama.setText("");
        hslNama.setText("");
        hslJenis.setText("");
        totalBayar.setText("");
   }//GEN-LAST:event_btnHapusActionPerformed

    private void hslNamaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hslNamaKeyPressed

    }//GEN-LAST:event_hslNamaKeyPressed

    private void hslJenisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hslJenisKeyPressed

    }//GEN-LAST:event_hslJenisKeyPressed

    private void hslJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hslJenisActionPerformed

    }//GEN-LAST:event_hslJenisActionPerformed

    private void totalBayarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalBayarKeyPressed

    }//GEN-LAST:event_totalBayarKeyPressed

    private void totalBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalBayarActionPerformed

    }//GEN-LAST:event_totalBayarActionPerformed

    private void hslHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hslHargaActionPerformed

    }//GEN-LAST:event_hslHargaActionPerformed

    private void hslHargaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hslHargaKeyPressed

    }//GEN-LAST:event_hslHargaKeyPressed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        nama = String.valueOf(comboName.getSelectedIndex());
        jenis = String.valueOf(comboRoom.getSelectedIndex());
        lama = Float.parseFloat(txtLama.getText());
        hslNama.setText("" + nama);

//        if (jenis == 1) {
//
//            hslJenis.setText("Standard Room");
//            hslHarga.setText("Rp. 200000/hari");
//        } else if (jenis == 2) {
//
//            hslJenis.setText("Deluxe Room");
//            hslHarga.setText("Rp. 275000/hari");
//        } else if (jenis == 3) {
//
//            hslJenis.setText("Suite Room");
//            hslHarga.setText("Rp. 300000/hari");
//        } else if (jenis == 4) {
//
//            hslJenis.setText("President Room");
//            hslHarga.setText("Rp. 350000/hari");
//        }
//
//        if (jenis == 1) {
//            tarif = lama * 200000;
//            totalBayar.setText("Rp. " + tarif);
//        } else if (jenis == 2) {
//            tarif = lama * 275000;
//            totalBayar.setText("Rp. " + tarif);
//        } else if (jenis == 3) {
//            tarif = lama * 300000;
//            totalBayar.setText("Rp. " + tarif);
//        } else if (jenis == 4) {
//            tarif = lama * 350000;
//            totalBayar.setText("Rp. " + tarif);
//        }
//        else {
//            System.out.println("Tidak termasuk dalam daftar");
//            hslNama.setText("");
//        }        

    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        DefaultTableModel model = (DefaultTableModel)tableVisitor.getModel(); 
        model.addRow(new Object[]{hslNama.getText(), hslJenis.getText(), hslHarga.getText(), totalBayar.getText()});
                                
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Login l = new Login();
        l.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void tableVisitorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableVisitorMouseClicked
        int selectedRow = tableVisitor.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)tableVisitor.getModel();
        hslNama.setText(model.getValueAt(selectedRow, 0).toString());
        hslJenis.setText(model.getValueAt(selectedRow, 1).toString());
        hslHarga.setText(model.getValueAt(selectedRow, 2).toString());
        totalBayar.setText(model.getValueAt(selectedRow, 3).toString());
        
    }//GEN-LAST:event_tableVisitorMouseClicked

    private void txtCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeKeyPressed

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        Date d = new Date();
        txtCode.setText("asd");
    }//GEN-LAST:event_txtCodeActionPerformed

    private void comboNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNameActionPerformed
        try {
            Connection con = Connector.getConnection();
            ResultSet rs = pst.executeQuery("select nama_lengkap from tamu");

            while(rs.next()) {
                comboName.addItem(rs.getString("nama_lengkap"));
            }
            //            if (namaLengkap.equals("")) {
                //                comboName.addItem("");
                //                comboName.setVisible(false);
                //            }
            //            else {
                //                comboName.addItem(rs.getString("namaLengkap"));
                //                System.out.println(rs.getString("namaLengkap"));
                //                comboName.setVisible(true);
                //            }
        }
        catch(Exception e) {
            System.out.println("");
        }
    }//GEN-LAST:event_comboNameActionPerformed

    private void comboRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRoomActionPerformed
        try {
//               Connection con = Connector.getConnection();
//                Statement pst = con.createStatement();
//                ResultSet rs = pst.executeQuery("select * from kamar");
                  
                 String sql = "select * from kamar";
                 Statement pst = con.prepareStatement(sql);
                 rs = pst.executeQuery(sql);
                
                while (rs.next()) {
                          String jenisKamar = rs.getString("tipe_kamar");
                          comboRoom.addItem(jenisKamar);
                          
//                          if (jenisKamar.equals("")) {
//                                  comboRoom.addItem("");
//                    }
//                          else {
//                              comboRoom.addItem(rs.getString("tipe_kamar"));
//                              System.out.println(rs.getString("tipe_kamar"));
//                              comboRoom.setVisible(true);
//                          }
                }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "gagal", "Koneksi error",JOptionPane.WARNING_MESSAGE);
        }

//        ComboTest c = new ComboTest();
//        c.ComboExample();
    }//GEN-LAST:event_comboRoomActionPerformed

    private void daftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarActionPerformed
        DataDiri d = new DataDiri();
        d.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_daftarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHitung;
    private javax.swing.JComboBox<String> comboName;
    private javax.swing.JComboBox<String> comboRoom;
    private javax.swing.JButton daftar;
    private javax.swing.JTextField hslHarga;
    private javax.swing.JTextField hslJenis;
    private javax.swing.JTextField hslNama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JLabel labelCode;
    private javax.swing.JTable tableVisitor;
    private javax.swing.JTextField totalBayar;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtLama;
    // End of variables declaration//GEN-END:variables
}
