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
import model.Raucuqua;
import model.ThuySan;

/**
 *
 * @author Tran Nhat Sinh
 */
public class ThuySanDAO implements DAOInterface<ThuySan> {

    public static ThuySanDAO getInstance() {
        return new ThuySanDAO();
    }

    @Override
    public int insert(ThuySan t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO Sanpham (maSanPham, tenSanPham, soLuong, HanSuDung, SDT, Website, gia,NgayNhapKhoo, TinhTrang, xuatXu, loaiSanPham, NhaCungCap, trangThai) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getmaSanPham());
            pst.setString(2, t.gettenSanPham());
            pst.setInt(3, t.getsoLuong());
            pst.setString(4, t.getHanSuDung());
            pst.setString(5, t.getSDT());
            pst.setString(6, t.getWebsite());
            pst.setDouble(7, t.getGia());
            pst.setString(8, t.getNgayNhapKhooo());
            pst.setInt(9, t.getTinhTranggg());
            pst.setString(10, t.getxuatXu());
            pst.setString(11, "Thủy Sản");
            pst.setString(12, t.getNhaCungCap());
            pst.setInt(13, t.gettrangThai());
            ketQua = pst.executeUpdate();
            JDBCUtil.closeConnection(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public int update(ThuySan t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            //String sql = "INSERT INTO SanPham (maSanPham, tenSanPham, soLuong, HanSuDung, SDT, Website, gia, dungLuongPin, dungLuongPin, dungLuongPin, loaiMay, NhaCungCap) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            String sql = "UPDATE SanPham SET maSanPham=?, tenSanPham=?, soLuong=?, HanSuDung=?, SDT=?, Website=?, gia=?, NgayNhapKhoo=?, TinhTrang=?, xuatXu=?, loaiSanPham = ?, NhaCungCap= ?, trangThai = ? WHERE maSanPham= ? ";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getmaSanPham()); 
            pst.setString(2, t.gettenSanPham());
            pst.setInt(3, t.getsoLuong());
            pst.setString(4, t.getHanSuDung());
            pst.setString(5, t.getSDT());
            pst.setString(6, t.getWebsite());
            pst.setDouble(7, t.getGia());
            pst.setString(8, t.getNgayNhapKhooo());
            pst.setInt(9, t.getTinhTranggg());
            pst.setString(10, t.getxuatXu());
            pst.setString(11, "Thủy Sản");
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
    public int delete(ThuySan t) {
        int ketQua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "DELETE FROM SanPham WHERE SanPham=? ";
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
    public ArrayList<ThuySan> selectAll() {
        ArrayList<ThuySan> ketQua = new ArrayList<ThuySan>();
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
                String NgayNhapKhooo = rs.getString("NgayNhapKho");
                int TinhTranggg = rs.getInt("congSuatNguon");
                String NhaCungCap = rs.getString("NhaCungCap");
                String xuatXu = rs.getString("xuatXu");
                int trangThai = rs.getInt("trangThai");
                ThuySan mt = new ThuySan(NgayNhapKhooo, TinhTranggg, maSanPham, tenSanPham, soLuong, gia, HanSuDung, SDT, xuatXu, Website, NhaCungCap,trangThai);
                ketQua.add(mt);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }

    @Override
    public ThuySan selectById(String t) {
        ThuySan ketQua = null;
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
                String NgayNhapKhooo = rs.getString("NgayNhapKho");
                int TinhTranggg = rs.getInt("congSuatNguon");
                String NhaCungCap = rs.getString("NhaCungCap");
                String xuatXu = rs.getString("xuatXu");
                int trangThai = rs.getInt("trangThai");
                //ThuySan(String kichThuocMan, String dungLuongPin, String maSanPham, String tenSanPham, int soLuong, double gia, String HanSuDung, String SDT, String xuatXu, String Website, String Rom)
                ketQua = new ThuySan(NgayNhapKhooo, TinhTranggg, maSanPham, tenSanPham, soLuong, gia, HanSuDung, SDT, xuatXu, Website, NhaCungCap,trangThai);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return ketQua;
    }
}
