/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author sinh
 */
public class ThongKeProduct {
    private String maSanPham;
    private String tenSanPham;
    private int slNhap;
    private int slXuat;

    public ThongKeProduct() {
    }

    public ThongKeProduct(String maSanPham, String tenSanPham, int slNhap, int slXuat) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.slNhap = slNhap;
        this.slXuat = slXuat;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getSlNhap() {
        return slNhap;
    }

    public void setSlNhap(int slNhap) {
        this.slNhap = slNhap;
    }

    public int getSlXuat() {
        return slXuat;
    }

    public void setSlXuat(int slXuat) {
        this.slXuat = slXuat;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.maSanPham);
        hash = 53 * hash + Objects.hashCode(this.tenSanPham);
        hash = 53 * hash + this.slNhap;
        hash = 53 * hash + this.slXuat;
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
        final ThongKeProduct other = (ThongKeProduct) obj;
        if (this.slNhap != other.slNhap) {
            return false;
        }
        if (this.slXuat != other.slXuat) {
            return false;
        }
        if (!Objects.equals(this.maSanPham, other.maSanPham)) {
            return false;
        }
        return Objects.equals(this.tenSanPham, other.tenSanPham);
    }

    @Override
    public String toString() {
        return "ThongKeProduct{" + "maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", slNhap=" + slNhap + ", slXuat=" + slXuat + '}';
    }
    
    
}
