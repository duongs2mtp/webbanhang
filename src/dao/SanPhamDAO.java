/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import database.JDBCUtil;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.Raucuqua;
import model.SanPham;

public class SanPhamDAO implements DAOInterface<SanPham> {

    public static SanPhamDAO getInstance() {
        return new SanPhamDAO();
    }

    @Override
    public int insert(SanPham t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(SanPham t) {
        int ketqua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE SanPham SET tenSanPham = ?,soLuong=?,gia=?,HanSuDung=?,SDT=?,xuatXu=?,Website=?,NhaCungCap=?,trangThai=? WHERE maSanPham=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.gettenSanPham());
            pst.setInt(2, t.getsoLuong());
            pst.setDouble(3, t.getGia());
            pst.setString(4, t.getHanSuDung());
            pst.setString(5, t.getSDT());
            pst.setString(6, t.getxuatXu());
            pst.setString(7, t.getWebsite());
            pst.setString(8, t.getNhaCungCap());
            pst.setInt(9, t.gettrangThai());
            pst.setString(10, t.getmaSanPham());
            ketqua = pst.executeUpdate(sql);
            JDBCUtil.closeConnection(con);
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ketqua;
    }

    @Override
    public int delete(SanPham t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "DELETE FROM SanPham WHERE maSanPham=? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getmaSanPham());
            ketQua = pst.executeUpdate();

            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ArrayList<SanPham> selectAll() {
        ArrayList<SanPham> ketQua = new ArrayList<SanPham>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT maSanPham,tenSanPham,soLuong,gia,HanSuDung,SDT,xuatXu,Website,NhaCungCap,trangThai FROM SanPham";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                 String maSanPham = rs.getString("maSanPham");
                String tenSanPham = rs.getString("tenSanPham");
                int soLuong = rs.getInt("soLuong");
                double gia = rs.getDouble("gia");
                String HanSuDung = rs.getString("HanSuDung");
                String SDT = rs.getString("SDT");
                String xuatXu = rs.getString("xuatXu");
                String Website = rs.getString("Website");
                String NhaCungCap = rs.getString("NhaCungCap");
                int trangThai = rs.getInt("trangThai");
                SanPham mt = new SanPham(maSanPham, tenSanPham, soLuong, gia, HanSuDung, SDT, xuatXu, Website, NhaCungCap, trangThai);
                ketQua.add(mt);
            }
            JDBCUtil.closeConnection(con);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public SanPham selectById(String t) {
        SanPham ketQua = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT maSanPham,tenSanPham,soLuong,gia,HanSuDUNG,SDT,xuatXu,Website,NhaCungCap,trangThai FROM SanPham WHERE maSanPham = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maSanPham = rs.getString("maSanPham");
                String tenSanPham = rs.getString("tenSanPham");
                int soLuong = rs.getInt("soLuong");
                double gia = rs.getDouble("gia");
                String HanSuDung = rs.getString("HanSuDung");
                String SDT = rs.getString("SDT");
                String xuatXu = rs.getString("xuatXu");
                String Website = rs.getString("Website");
                String NhaCungCap = rs.getString("NhaCungCap");
                int trangThai = rs.getInt("trangThai");
                ketQua = new SanPham(maSanPham, tenSanPham, soLuong, gia, HanSuDung, SDT, xuatXu, Website, NhaCungCap, trangThai);
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    public int updateSoLuong(String maSanPham, int soluong) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            //String sql = "INSERT INTO SanPham (maSanPham, tenSanPham, soLuong, HanSuDung, SDT, Website, gia, dungLuongPin, dungLuongPin, dungLuongPin, loaiMay, NhaCungCap) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            String sql = "UPDATE SanPham SET soLuong=? WHERE maSanPham=? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, soluong);
            pst.setString(2, maSanPham);
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQua;
    }
    
    public int deleteTrangThai(String maSanPham){
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            //String sql = "INSERT INTO SanPham (maSanPham, tenSanPham, soLuong, HanSuDung, SDT, Website, gia, dungLuongPin, dungLuongPin, dungLuongPin, loaiMay, NhaCungCap) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            String sql = "UPDATE SanPham SET trangThai=0 WHERE maSanPham=? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, maSanPham);
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    public ArrayList<SanPham> selectAllE() {
        ArrayList<SanPham> ketQua = new ArrayList<SanPham>();
        ArrayList<SanPham> ketQuaTonKho = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT maSanPham,tenSanPham,soLuong,gia,HanSuDung,SDT,xuatXu,Website,NhaCungCap,trangThai FROM SanPham";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maSanPham = rs.getString("maSanPham");
                String tenSanPham = rs.getString("tenSanPham");
                int soLuong = rs.getInt("soLuong");
                double gia = rs.getDouble("gia");
                String HanSuDung = rs.getString("HanSuDung");
                String SDT = rs.getString("SDT");
                String xuatXu = rs.getString("xuatXu");
                String Website = rs.getString("Website");
                String NhaCungCap = rs.getString("NhaCungCap");
                int trangThai = rs.getInt("trangThai");
                SanPham mt = new SanPham(maSanPham, tenSanPham, soLuong, gia, HanSuDung, SDT, xuatXu, Website, NhaCungCap, trangThai);
                ketQua.add(mt);
            }
            for (SanPham SanPham : ketQua) {
                if (SanPham.getsoLuong() > 0) {
                    ketQuaTonKho.add(SanPham);
                }
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQuaTonKho;
    }
    
        public ArrayList<SanPham> selectAllExist() {
        ArrayList<SanPham> ketQua = new ArrayList<SanPham>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT maSanPham,tenSanPham,soLuong,gia,HanSuDung,SDT,xuatXu,Website,NhaCungCap,trangThai FROM SanPham WHERE trangThai = 1";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maSanPham = rs.getString("maSanPham");
                String tenSanPham = rs.getString("tenSanPham");
                int soLuong = rs.getInt("soLuong");
                double gia = rs.getDouble("gia");
                String HanSuDung = rs.getString("HanSuDung");
                String SDT = rs.getString("SDT");
                String xuatXu = rs.getString("xuatXu");
                String Website = rs.getString("Website");
                String NhaCungCap = rs.getString("NhaCungCap ");
                int trangThai = rs.getInt("trangThai");
                SanPham mt = new SanPham(maSanPham, tenSanPham, soLuong, gia, HanSuDung, SDT, xuatXu, Website, NhaCungCap, trangThai);
                ketQua.add(mt);
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
        
    public int getSl() {
        int soluong = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM SanPham  WHERE trangThai = 1";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                soluong++;
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return soluong;
    }
}
