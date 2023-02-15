/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY14;

/**
 *
 * @author ThuyVT
 */
public class NhanVien implements Comparable<NhanVien> {
    private String ten;
    private String ma;
    private int luong;

    public NhanVien() {
    }

    public NhanVien(String ten, String ma, int luong) {
        this.ten = ten;
        this.ma = ma;
        this.luong = luong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }
    
    public void inThongTin() {
        System.out.println("Ten:" + this.ten);
        System.out.println("Ma:" + this.ma);
        System.out.println("luong:" + this.luong);
    }
    
    public int tinhLuong() {
        return this.luong * 22;
    }

    @Override
    public int compareTo(NhanVien o) {
        
//        return this.ma.compareTo(o.getMa());
//        Sap xep giam
//        return o.getMa().compareTo(this.ma);
          return this.luong - o.getLuong();
    }
}
