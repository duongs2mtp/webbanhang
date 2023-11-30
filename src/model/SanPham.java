/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

public class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private int soLuong;
    private double gia;
    private String HanSuDung;
    private String SDT;
    private String xuatXu;
    private String Website;
    private String NhaCungCap;
    private int trangThai;
    

    public SanPham() {
        
    }
    
    public SanPham(String maSanPham, String tenSanPham, int soLuong, double donGia, String HanSuDung, String loaiSanPham, int trangThai){
        
    }

    public SanPham(String maSanPham, String tenSanPham, int soLuong, double gia, String HanSuDung, String SDT, String xuatXu, String Website, String NhaCungCap,int trangThai) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.gia = gia;
        this.HanSuDung = HanSuDung;
        this.SDT = SDT;
        this.xuatXu = xuatXu;
        this.Website = Website;
        this.NhaCungCap = NhaCungCap;
        this.trangThai = trangThai;
    }

    public int gettrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public SanPham(String maSanPham, String tenSanPham, int soLuong, double gia,String HanSuDung, String SDT,String NhaCungCap) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.gia = gia;
        this.HanSuDung = HanSuDung;
        this.SDT = SDT;
        this.NhaCungCap = NhaCungCap;
    }

    public String getmaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String gettenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getsoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getHanSuDung() {
        return HanSuDung;
    }

    public void setHanSuDung(String HanSuDung) {
        this.HanSuDung = HanSuDung;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getxuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String Website) {
        this.Website = Website;
    }

    public String getNhaCungCap() {
        return NhaCungCap;
    }

    public void setNhaCungCap(String NhaCungCap) {
        this.NhaCungCap = NhaCungCap;
    }

    public void xuatHang(int sl) {
        this.soLuong -= sl;
    }
    
    @Override
    public String toString() {
        return "SanPham{" + "maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", soLuong=" + soLuong + ", gia=" + gia + ", HanSuDung=" + HanSuDung + ", SDT=" + SDT + ", xuatXu=" + xuatXu + ", Website=" + Website + ", NhaCungCap=" + NhaCungCap + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.maSanPham);
        hash = 37 * hash + Objects.hashCode(this.tenSanPham);
        hash = 37 * hash + this.soLuong;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.gia) ^ (Double.doubleToLongBits(this.gia) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.HanSuDung);
        hash = 37 * hash + Objects.hashCode(this.SDT);
        hash = 37 * hash + Objects.hashCode(this.xuatXu);
        hash = 37 * hash + Objects.hashCode(this.Website);
        hash = 37 * hash + Objects.hashCode(this.NhaCungCap);
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
        final SanPham other = (SanPham) obj;
        if (this.soLuong != other.soLuong) {
            return false;
        }
        if (Double.doubleToLongBits(this.gia) != Double.doubleToLongBits(other.gia)) {
            return false;
        }
        if (!Objects.equals(this.maSanPham, other.maSanPham)) {
            return false;
        }
        if (!Objects.equals(this.tenSanPham, other.tenSanPham)) {
            return false;
        }
        if (!Objects.equals(this.HanSuDung, other.HanSuDung)) {
            return false;
        }
        if (!Objects.equals(this.SDT, other.SDT)) {
            return false;
        }
        if (!Objects.equals(this.xuatXu, other.xuatXu)) {
            return false;
        }
        if (!Objects.equals(this.Website, other.Website)) {
            return false;
        }
        return Objects.equals(this.NhaCungCap, other.NhaCungCap);
    }
}
