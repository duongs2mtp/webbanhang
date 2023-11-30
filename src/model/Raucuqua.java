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
public class Raucuqua extends SanPham{
    private double NgayNhapKhoo;
    private String TinhTrangg;

    public Raucuqua(double NgayNhapKhoo, String TinhTrangg, String maSanPham, String tenSanPham, int soLuong, double gia, String HanSuDung, String SDT, String xuatXu, String Website, String NhaCungCap, int trangThai) {
        super(maSanPham, tenSanPham, soLuong, gia, HanSuDung, SDT, xuatXu, Website, NhaCungCap,trangThai);
        this.NgayNhapKhoo = NgayNhapKhoo;
        this.TinhTrangg = TinhTrangg;
    }

    public Raucuqua() {
        
    }

    public double getNgayNhapKhoo() {
        return NgayNhapKhoo;
    }

    public void setNgayNhapKhoo(double NgayNhapKhoo) {
        this.NgayNhapKhoo = NgayNhapKhoo;
    }

    public String getTinhTrangg() {
        return TinhTrangg;
    }

    public void setTinhTrangg(String TinhTrangg) {
        this.TinhTrangg = TinhTrangg;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.NgayNhapKhoo);
        hash = 67 * hash + Objects.hashCode(this.TinhTrangg);
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
        final Raucuqua other = (Raucuqua) obj;
        if (!Objects.equals(this.NgayNhapKhoo, other.NgayNhapKhoo)) {
            return false;
        }
        return Objects.equals(this.TinhTrangg, other.TinhTrangg);
    }

    @Override
    public String toString() {
        return "Rau củ quả{" + "NgayNhapKho=" + NgayNhapKhoo + ", TinhTrang=" + TinhTrangg + '}';
    }


    
    
}
