/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY9;

/**
 *
 * @author ThuyVT
 */
public class NguoiYeuCu {
    private String ten;
    private int tuoi;
    private String soDienThoai;

    public NguoiYeuCu() {
    }

    public NguoiYeuCu(String ten, int tuoi, String soDienThoai) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.soDienThoai = soDienThoai;
    }

    public NguoiYeuCu(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
     
    public void inThongTin() {
        System.out.println("Ten: " + this.ten);
        String message = this.tuoi >= 18 ? "ok" : "Cẩn thận đi tù";
        System.out.println("Thông báo :" + message);
    }
    
}
