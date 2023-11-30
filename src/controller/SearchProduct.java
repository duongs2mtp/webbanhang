package controller;

import dao.SanPhamDAO;
import java.util.ArrayList;
import model.SanPham;

/**
 *
 * @author sinh
 */
public class SearchProduct {

    public static SearchProduct getInstance() {
        return new SearchProduct();
    }

    public ArrayList<SanPham> searchTatCa(String text) {
        ArrayList<SanPham> result = new ArrayList<>();
        ArrayList<SanPham> armt = SanPhamDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.gettrangThai() == 1) {
                if (mt.getmaSanPham().toLowerCase().contains(text.toLowerCase()) || mt.gettenSanPham().toLowerCase().contains(text.toLowerCase())
                        || mt.getHanSuDung().toLowerCase().contains(text.toLowerCase())
                        || mt.getWebsite().toLowerCase().contains(text.toLowerCase())
                        || mt.getxuatXu().toLowerCase().contains(text.toLowerCase())) {
                    result.add(mt);
                }
            }
        }
        return result;
    }

    public ArrayList<SanPham> searchMaSanPham(String text) {
        ArrayList<SanPham> result = new ArrayList<>();
        ArrayList<SanPham> armt = SanPhamDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.gettrangThai() == 1) {
                if (mt.getmaSanPham().toLowerCase().contains(text.toLowerCase())) {
                    result.add(mt);
                }
            }
        }
        return result;
    }

    public ArrayList<SanPham> searchTenSanPham(String text) {
        ArrayList<SanPham> result = new ArrayList<>();
        ArrayList<SanPham> armt = SanPhamDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.gettrangThai() == 1) {
                if (mt.gettenSanPham().toLowerCase().contains(text.toLowerCase())) {
                    result.add(mt);
                }
            }
        }
        return result;
    }

    public ArrayList<SanPham> searchSoLuong(String text) {
        ArrayList<SanPham> result = new ArrayList<>();
        ArrayList<SanPham> armt = SanPhamDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.gettrangThai() == 1) {
                if (text.length() != 0) {
                    if (mt.getsoLuong() > Integer.parseInt(text)) {
                        result.add(mt);
                    }
                } else {
                    result.add(mt);
                }
            }
        }
        return result;
    }

    public ArrayList<SanPham> searchDonGia(String text) {
        ArrayList<SanPham> result = new ArrayList<>();
        ArrayList<SanPham> armt = SanPhamDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.gettrangThai() == 1) {

                if (text.length() != 0) {
                    if (mt.getGia() > Integer.parseInt(text)) {
                        result.add(mt);
                    }
                }
                else {
                    result.add(mt);
                }
            } 
        }
        return result;
    }

    public ArrayList<SanPham> searchSDT(String text) {
        ArrayList<SanPham> result = new ArrayList<>();
        ArrayList<SanPham> armt = SanPhamDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getSDT().toLowerCase().contains(text.toLowerCase())) {
                result.add(mt);
            }
        }
        return result;
    }

    public ArrayList<SanPham> searchhHanSuDung(String text) {
        ArrayList<SanPham> result = new ArrayList<>();
        ArrayList<SanPham> armt = SanPhamDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getHanSuDung().toLowerCase().contains(text.toLowerCase())) {
                result.add(mt);
            }
        }
        return result;
    }

    public ArrayList<SanPham> searchNhaCungCap(String text) {
        ArrayList<SanPham> result = new ArrayList<>();
        ArrayList<SanPham> armt = SanPhamDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getNhaCungCap().toLowerCase().contains(text.toLowerCase())) {
                result.add(mt);
            }
        }
        return result;
    }

    public ArrayList<SanPham> searchWebsite(String text) {
        ArrayList<SanPham> result = new ArrayList<>();
        ArrayList<SanPham> armt = SanPhamDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getWebsite().toLowerCase().contains(text.toLowerCase())) {
                result.add(mt);
            }
        }
        return result;
    }


    public ArrayList<SanPham> searchXuatXu(String text) {
        ArrayList<SanPham> result = new ArrayList<>();
        ArrayList<SanPham> armt = SanPhamDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getxuatXu().toLowerCase().contains(text.toLowerCase())) {
                result.add(mt);
            }
        }
        return result;
    }

    public ArrayList<SanPham> searchDaXoa(String text) {
        ArrayList<SanPham> result = new ArrayList<>();
        ArrayList<SanPham> armt = SanPhamDAO.getInstance().selectAll();
        for (var mt : armt) {
            if (mt.gettrangThai() == 0) {
                if (mt.getmaSanPham().toLowerCase().contains(text.toLowerCase())) {
                    result.add(mt);
                }
            }
        }
        return result;
    }

    public SanPham searchId(String text) {
        SanPham result = new SanPham();
        ArrayList<SanPham> armt = SanPhamDAO.getInstance().selectAllExist();
        for (var mt : armt) {
            if (mt.getmaSanPham().toLowerCase().contains(text.toLowerCase())) {
                return mt;
            }
        }
        return null;
    }
}
