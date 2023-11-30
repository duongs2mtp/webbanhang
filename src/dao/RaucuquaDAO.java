/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Raucuqua;
import model.SanPham;

/**
 *
 * @author 
 */
public class RaucuquaDAO implements DAOInterface<Raucuqua> {

    public static RaucuquaDAO getInstance() {
        return new RaucuquaDAO();
    }

    @Override
    public int insert(Raucuqua t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO SanPham (maSanPham, tenSanPham, soLuong, HanSuDung, SDT, Website, gia, TinhTrang, NgayNhapKho, xuatXu, loaiSanPham, NhaCungCap, trangThai) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getmaSanPham());
            pst.setString(2, t.gettenSanPham());
            pst.setInt(3, t.getsoLuong());
            pst.setString(4, t.getHanSuDung());
            pst.setString(5, t.getSDT());
            pst.setString(6, t.getWebsite());
            pst.setDouble(7, t.getGia());
            pst.setString(8, t.getTinhTrangg());
            pst.setDouble(9, t.getNgayNhapKhoo());
            pst.setString(10, t.getxuatXu());
            pst.setString(11, "Rau củ quả");
            pst.setString(12, t.getNhaCungCap());
            pst.setInt(13, t.gettrangThai());
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thêm được " + t.getmaSanPham(),"Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return ketQua;
    }

    @Override
    public int update(Raucuqua t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            //String sql = "INSERT INTO maSanPham (maSanPham, tenSanPham, soLuong, HanSuDung, SDT, Website, gia, TinhTrangg, TinhTrangg, TinhTrangg, loaiMay, NhaCungCap) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            String sql = "UPDATE SanPham SET maSanPham=?, tenSanPham=?, soLuong=?, HanSuDung=?, SDT=?, Website=?, gia=?, TinhTrang=?, NgayNhapKho=?, xuatXu=?, loaiSanPham = ?,NhaCungCap = ?, trangThai = ? WHERE maSanPham=? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getmaSanPham());
            pst.setString(2, t.gettenSanPham());
            pst.setInt(3, t.getsoLuong());
            pst.setString(4, t.getHanSuDung());
            pst.setString(5, t.getSDT());
            pst.setString(6, t.getWebsite());
            pst.setDouble(7, t.getGia());
            pst.setString(8, t.getTinhTrangg());
            pst.setDouble(9, t.getNgayNhapKhoo());
            pst.setString(10, t.getxuatXu());
            pst.setString(11, "Rau củ quả");
            pst.setString(12, t.getNhaCungCap());
            pst.setInt(13, t.gettrangThai());
            pst.setString(14, t.getmaSanPham());
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int delete(Raucuqua t) {
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
    public ArrayList<Raucuqua> selectAll() {
        ArrayList<Raucuqua> ketQua = new ArrayList<Raucuqua>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM SanPham";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maSanPham = rs.getString("maSanPham");
                String tenSanPham = rs.getString("tenSanPham");
                int soLuong = rs.getInt("soLuong");
                String HanSuDung = rs.getString("HanSuDung");
                String SDT = rs.getString("SDT");
                String Website = rs.getString("Website");
                double gia = rs.getDouble("gia");
                double NgayNhapKhoo = rs.getDouble("NgayNhapKho");
                String TinhTrangg = rs.getString("TinhTrang");
                String NhaCungCap = rs.getString("NhaCungCap");
                String xuatXu = rs.getString("xuatXu");
                int trangThai = rs.getInt("trangThai");
                Raucuqua mt = new Raucuqua(NgayNhapKhoo, TinhTrangg, maSanPham, tenSanPham, soLuong, gia, HanSuDung, SDT, xuatXu, Website, NhaCungCap, trangThai);
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
    public Raucuqua selectById(String t) {
        Raucuqua ketQua = null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM SanPham WHERE maSanPham=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maSanPham = rs.getString("maSanPham");
                String tenSanPham = rs.getString("tenSanPham");
                int soLuong = rs.getInt("soLuong");
                String HanSuDung = rs.getString("HanSuDung");
                String SDT = rs.getString("SDT");
                String Website = rs.getString("Website");
                double gia = rs.getDouble("gia");
                double NgayNhapKhoo = rs.getDouble("NgayNhapKho");
                String TinhTrangg = rs.getString("TinhTrang");
                String NhaCungCap = rs.getString("NhaCungCap");
                String xuatXu = rs.getString("xuatXu");
                int trangThai = rs.getInt("trangThai");
                //Raucuqua(String NgayNhapKhoo, String TinhTrangg, String maSanPham, String tenSanPham, int soLuong, double gia, String HanSuDung, String SDT, String xuatXu, String Website, String Rom)
                ketQua = new Raucuqua(NgayNhapKhoo, TinhTrangg, maSanPham, tenSanPham, soLuong, gia, HanSuDung, SDT, xuatXu, Website, NhaCungCap, trangThai);
            }
            JDBCUtil.closeConnection(con);

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    public boolean isRaucuqua(String id) {
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM SanPham WHERE maSanPham= ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();
            String tl = null;
            while (rs.next()) {
                tl = rs.getString("loaiSanPham");
            }
            if (tl.equals("Rau củ quả")) {
                return true;
            }
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return false;
    }
}
