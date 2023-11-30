/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author 
 */
public class ThuySan extends SanPham{
    private String NgayNhapKhooo;
    private int TinhTranggg;

    public ThuySan(String NgayNhapKhooo, int TinhTranggg) {
        this.NgayNhapKhooo = NgayNhapKhooo;
        this.TinhTranggg = TinhTranggg;
    }

    public ThuySan(String NgayNhapKhooo, int TinhTranggg, String maSanPham, String tenSanPham, int soLuong, double gia, String HanSuDung, String SDT, String xuatXu, String Website, String NhaCungCap, int trangThai) {
        super(maSanPham, tenSanPham, soLuong, gia, HanSuDung, SDT, xuatXu, Website, NhaCungCap,trangThai);
        this.NgayNhapKhooo = NgayNhapKhooo;
        this.TinhTranggg = TinhTranggg;
    }

    public ThuySan() {
        
    }

    public String getNgayNhapKhooo() {
        return NgayNhapKhooo;
    }

    public void setNgayNhapKhooo(String NgayNhapKhooo) {
        this.NgayNhapKhooo = NgayNhapKhooo;
    }

    public int getTinhTranggg() {
        return TinhTranggg;
    }

    public void setTinhTranggg(int TinhTranggg) {
        this.TinhTranggg = TinhTranggg;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.NgayNhapKhooo);
        hash = 43 * hash + Objects.hashCode(this.TinhTranggg);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ThuySan other = (ThuySan) obj;
        if (!Objects.equals(this.NgayNhapKhooo, other.NgayNhapKhooo)) {
            return false;
        }
        return Objects.equals(this.TinhTranggg, other.TinhTranggg);
    }

    @Override
    public String toString() {
        return "Thủy Sản{" + "NgayNhapKho=" + NgayNhapKhooo + ", TinhTrang=" + TinhTranggg + '}';
    }
    
    
}
