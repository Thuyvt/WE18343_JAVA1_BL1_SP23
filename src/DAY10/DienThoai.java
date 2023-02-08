/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY10;

/**
 *
 * @author ThuyVT
 */
public class DienThoai {
    private String ma;
    private String ten;
    private String thuongHieu;
    private double gia;

    public DienThoai() {
    }

    public DienThoai(String ma, String ten, String thuongHieu, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.thuongHieu = thuongHieu;
        this.gia = gia;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    public void inThongTin() {
        System.out.println("Ten: " + this.ten);
        System.out.println("Ma: " + this.ma);
        System.out.println("Thuong hieu: " + this.thuongHieu);
        System.out.println("Gia: " + this.gia);
    }
    
}
