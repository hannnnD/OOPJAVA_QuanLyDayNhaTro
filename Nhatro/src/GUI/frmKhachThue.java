package GUI;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import BLL.KhachThueBLL;
import GUI.loadTable;
import Entity.KhachThueEntity;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class frmKhachThue extends javax.swing.JInternalFrame {

    loadTable loadtable = new loadTable();
    KhachThueBLL khachthue = new KhachThueBLL();

    public frmKhachThue() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        // Determine the new location of the window
        int w = this.getSize().width;//Chiều dài form
        int h = this.getSize().height;//Chiều cao form
        int x = (dim.width - w) / 2;//canh chiều ngang
        int y = (dim.height - h) / 2;//canh chiều dọc

        // Đặt vị trí theo tọa độ x,y
        this.setLocation(x, y);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhachThue = new javax.swing.JTable();
        gbThongTinKhach = new javax.swing.JPanel();
        btnCapNhat = new javax.swing.JButton();
        btnThemMoi = new javax.swing.JButton();
        txtNgheNghiep = new javax.swing.JTextField();
        txtCMND = new javax.swing.JTextField();
        txtQueQuan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaKhach = new javax.swing.JTextField();
        txtTenKhach = new javax.swing.JTextField();
        cbbPhai = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txtTaiKhoan = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cbbLuaChon = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setTitle("Quản lý khách thuê phòng trọ");
        setToolTipText("");
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách thuê", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblKhachThue.setAutoCreateRowSorter(true);
        tblKhachThue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblKhachThue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachThueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhachThue);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 950, 130));

        gbThongTinKhach.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin khách", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        gbThongTinKhach.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCapNhat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.setEnabled(false);
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });
        gbThongTinKhach.add(btnCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 100, -1));

        btnThemMoi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThemMoi.setText("Thêm mới");
        btnThemMoi.setEnabled(false);
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiActionPerformed(evt);
            }
        });
        gbThongTinKhach.add(btnThemMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 50, 100, -1));

        txtNgheNghiep.setEnabled(false);
        gbThongTinKhach.add(txtNgheNghiep, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 127, -1));

        txtCMND.setEnabled(false);
        gbThongTinKhach.add(txtCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 67, -1));

        txtQueQuan.setEnabled(false);
        gbThongTinKhach.add(txtQueQuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 127, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Quê quán");
        gbThongTinKhach.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Nghề nghiệp");
        gbThongTinKhach.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("CMND");
        gbThongTinKhach.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Mã khách thuê");
        gbThongTinKhach.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Tên khách thuê");
        gbThongTinKhach.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Phái");
        gbThongTinKhach.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        txtMaKhach.setEnabled(false);
        gbThongTinKhach.add(txtMaKhach, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 127, -1));

        txtTenKhach.setEnabled(false);
        gbThongTinKhach.add(txtTenKhach, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 127, -1));

        cbbPhai.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nam", "Nữ" }));
        cbbPhai.setEnabled(false);
        gbThongTinKhach.add(cbbPhai, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 72, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Tài khoản");
        gbThongTinKhach.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, -1));

        txtTaiKhoan.setEnabled(false);
        gbThongTinKhach.add(txtTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 200, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức năng", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel2.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Xóa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 65, -1));

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel2.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        txtTimKiem.setToolTipText("Gõ tiếng Việt có dấu để tìm kiếm dễ hơn");
        txtTimKiem.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Tìm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbbLuaChon.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tên Khách", "Mã Khách", "Quê quán", "Nghề nghiệp" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Tìm kiếm theo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(cbbLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbbLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("QUẢN LÝ KHÁCH THUÊ TRỌ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 976, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(gbThongTinKhach, javax.swing.GroupLayout.PREFERRED_SIZE, 976, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(280, 280, 280)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gbThongTinKhach, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        
        
        //ẩn hiện và gán giá trị rỗng cho các textfield
        txtTenKhach.setEnabled(true);
        txtMaKhach.setEnabled(true);
        txtCMND.setEnabled(true);
        txtQueQuan.setEnabled(true);
        txtNgheNghiep.setEnabled(true);
        txtTaiKhoan.setEnabled(true);
        cbbPhai.setEnabled(true);
        gbThongTinKhach.enable(true);
        btnCapNhat.setEnabled(false);
        btnThemMoi.setEnabled(true);
        txtMaKhach.setText("");
        txtTenKhach.setText("");
        cbbPhai.setSelectedIndex(0);
        txtCMND.setText("");
        txtNgheNghiep.setText("");
        txtQueQuan.setText("");
    }//GEN-LAST:event_btnThemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            KhachThueEntity KhachThueEntity = new KhachThueEntity();
            switch (cbbLuaChon.getSelectedIndex())//lấy index của combobox
            {
                case 0://tìm kiếm theo tên            
                    KhachThueEntity.setTenKhach(txtTimKiem.getText());
                    //load dữ liệu vào bảng khachthue với điều kiện lọc theo tên nhập vào
                    loadtable.loadJtable(khachthue.TimKhachThueTheoTen(KhachThueEntity), tblKhachThue);
                    break;

                case 1://tìm kiếm theo mã khách            
                    KhachThueEntity.setMaKhach(txtTimKiem.getText());
                    //load dữ liệu vào bảng khachthue với điều kiện lọc theo mã nhập vào
                    loadtable.loadJtable(khachthue.TimKhachThueTheoMa(KhachThueEntity), tblKhachThue);
                    break;

                case 2://tìm kiếm theo quê quán            
                    KhachThueEntity.setQuequan(txtTimKiem.getText());
                    //load dữ liệu vào bảng khachthue với điều kiện lọc theo quê quán  nhập vào
                    loadtable.loadJtable(khachthue.TimKhachThueTheoQueQuan(KhachThueEntity), tblKhachThue);
                    break;

                case 3: //tìm kiếm theo nghề nghiệp           
                    KhachThueEntity.setNghenghiep(txtTimKiem.getText());
                    //load dữ liệu vào bảng khachthue với điều kiện lọc theo nghề nghiệp nhập vào
                    loadtable.loadJtable(khachthue.TimKhachThueTheoNghe(KhachThueEntity), tblKhachThue);
                    break;
            }
        } catch (Exception ex) {
            Logger.getLogger(frmKhachThue.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    //xóa
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String tenkhach = txtTenKhach.getText();
        String makhach = txtMaKhach.getText();
        //tạo biến thông báo 
        int thongbao = JOptionPane.showConfirmDialog(rootPane, "Bạn có muốn xóa khách tên " + tenkhach + ". Có mã " + makhach, "Thông báo", JOptionPane.YES_NO_OPTION);
        if (thongbao == JOptionPane.YES_OPTION)//nếu chọn yes
        {
            KhachThueEntity KhachThueEntity = new KhachThueEntity();
            KhachThueEntity.setMaKhach(txtMaKhach.getText());//lấy giá trị mã khách
            KhachThueEntity.setTaiKhoan(txtTaiKhoan.getText());//lấy giá trị tài khoản
            if (khachthue.XoaKhachThue(KhachThueEntity) > 0)//nếu xóa thành công
            {
                try {
                    JOptionPane.showMessageDialog(rootPane, "Xóa khách thuê thành công");
                    loadtable.loadJtable(khachthue.LoadKhachThue(), tblKhachThue);//load lại bảng khách thuê
                } catch (Exception ex) {
                    Logger.getLogger(frmKhachThue.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Xóa khách thuê thất bại");
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    //Sự kiện mouse Clik của bảng hóa đơn
    private void tblKhachThueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachThueMouseClicked
        //disable tất cả các textfield
        txtTenKhach.setEnabled(false);
        txtMaKhach.setEnabled(false);
        txtCMND.setEnabled(false);
        txtQueQuan.setEnabled(false);
        txtNgheNghiep.setEnabled(false);
        txtTaiKhoan.setEnabled(false);
        cbbPhai.setEnabled(false);
        int index = tblKhachThue.getSelectedRow();//lấy index của hàng được chọn
        //load tất cả dữ liệu lên các textfield và combobox khi chọn 1 hàng
        txtMaKhach.setText((String) tblKhachThue.getValueAt(index, 0));
        txtTenKhach.setText((String) tblKhachThue.getValueAt(index, 1));
        String Phai = ((String) tblKhachThue.getValueAt(index, 2));
        if (Phai.equals("Nam")) {
            cbbPhai.setSelectedIndex(0);
        } else {
            cbbPhai.setSelectedIndex(1);
        }
        txtCMND.setText((String) tblKhachThue.getValueAt(index, 3));
        txtQueQuan.setText((String) tblKhachThue.getValueAt(index, 4));
        txtNgheNghiep.setText((String) tblKhachThue.getValueAt(index, 5));
        txtTaiKhoan.setText((String) tblKhachThue.getValueAt(index, 6));
    }//GEN-LAST:event_tblKhachThueMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {//load dữ liệu vào 2 bảng vào khách thuê và khách thuê đặt phòng
            loadtable.loadJtable(khachthue.LoadKhachThue(), tblKhachThue);
          
        } catch (Exception ex) {
            Logger.getLogger(frmKhachThue.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        //Thông tin nhập vào không được để trống
        if (txtMaKhach.getText().equals("") || txtTenKhach.getText().equals("") || txtCMND.equals("") || txtNgheNghiep.getText().equals("") || txtQueQuan.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Thông tin nhập vào không được để trống");
            return;
        }
        //lấy các giá trị để thêm khách thuê
        KhachThueEntity KhachThueEntity = new KhachThueEntity();
        KhachThueEntity.setMaKhach(txtMaKhach.getText());
        KhachThueEntity.setTenKhach(txtTenKhach.getText());
        KhachThueEntity.setPhai(cbbPhai.getSelectedItem().toString());
        KhachThueEntity.setCmnd(txtCMND.getText());
        KhachThueEntity.setQuequan(txtQueQuan.getText());
        KhachThueEntity.setNghenghiep(txtNgheNghiep.getText());
        KhachThueEntity.setTaiKhoan(txtTaiKhoan.getText());

//        Nếu như chọn khách không đặt phòng
       
            if (khachthue.ThemKhachThue(KhachThueEntity) > 0) {
                try {
                    JOptionPane.showMessageDialog(rootPane, "Thêm mới khách thuê thành công");
                    //load lại các table và bỏ check các radiobutton
                    loadtable.loadJtable(khachthue.LoadKhachThue(), tblKhachThue);                    
                } catch (Exception ex) {
                    Logger.getLogger(frmKhachThue.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Thêm mới khách thuê thất bại");
            }
        

        
    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        //disbale các button và textfield khi ấn chọn nút sửa
        txtTenKhach.setEnabled(true);
        txtMaKhach.setEnabled(true);
        txtCMND.setEnabled(true);
        txtQueQuan.setEnabled(true);
        txtNgheNghiep.setEnabled(true);
        txtTaiKhoan.setEditable(true);
        cbbPhai.setEnabled(true);
//        gbThongTinKhach.enable(true);
        btnCapNhat.setEnabled(true);
        btnThemMoi.setEnabled(false);
        txtMaKhach.enable(false);
        int index = tblKhachThue.getSelectedRow();//lấy index ở hàng được chọn
        txtMaKhach.setText((String) tblKhachThue.getValueAt(index, 0));
        txtTenKhach.setText((String) tblKhachThue.getValueAt(index, 1));
        String Phai = ((String) tblKhachThue.getValueAt(index, 2));
        if (Phai.equals("Nam")) {
            cbbPhai.setSelectedIndex(0);
        } else {
            cbbPhai.setSelectedIndex(1);
        }
        txtCMND.setText((String) tblKhachThue.getValueAt(index, 3));
        txtQueQuan.setText((String) tblKhachThue.getValueAt(index, 4));
        txtNgheNghiep.setText((String) tblKhachThue.getValueAt(index, 5));
        txtTaiKhoan.setText((String) tblKhachThue.getValueAt(index, 6));
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        //thông tin nhập vào không được để trống
        if (txtTenKhach.getText().equals("") || txtCMND.equals("") || txtNgheNghiep.getText().equals("") || txtQueQuan.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Thông tin nhập vào không được để trống");
        } else {
            //gán các giá trị để sửa khách thuê
            KhachThueEntity KhachThueEntity = new KhachThueEntity();
            KhachThueEntity.setMaKhach(txtMaKhach.getText());
            KhachThueEntity.setTenKhach(txtTenKhach.getText());
            KhachThueEntity.setPhai(cbbPhai.getSelectedItem().toString());
            KhachThueEntity.setCmnd(txtCMND.getText());
            KhachThueEntity.setQuequan(txtQueQuan.getText());
            KhachThueEntity.setNghenghiep(txtNgheNghiep.getText());
            KhachThueEntity.setTaiKhoan(txtTaiKhoan.getText());

            if (khachthue.SuaKhachThue(KhachThueEntity) > 0)//nếu xoÁ thành công
            {
                try {
                    JOptionPane.showMessageDialog(rootPane, "Sửa khách thuê thành công");
                    loadtable.loadJtable(khachthue.LoadKhachThue(), tblKhachThue);//load lại bảng khachthue
                } catch (Exception ex) {
                    Logger.getLogger(frmKhachThue.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Sửa khách thuê thất bại");
            }
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbbLuaChon;
    private javax.swing.JComboBox cbbPhai;
    private javax.swing.JPanel gbThongTinKhach;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKhachThue;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtMaKhach;
    private javax.swing.JTextField txtNgheNghiep;
    private javax.swing.JTextField txtQueQuan;
    private javax.swing.JTextField txtTaiKhoan;
    private javax.swing.JTextField txtTenKhach;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

}
