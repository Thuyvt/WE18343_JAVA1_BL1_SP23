/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY10;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class QLDT {
    // Khai baos mang dt
    DienThoai mangDt[];
    Scanner sc = new Scanner(System.in);
    int soLuong;
    public QLDT() {
    }
    
    // Bai 1
    public void bai1() {
        System.out.println("Nhap so luong:");
        // De xoa bo nho dem
        soLuong = Integer.parseInt(sc.nextLine());
        // Khoi tao mang dt co ...
        mangDt = new DienThoai[soLuong];
        for (int i = 0; i < mangDt.length; i++) {
            DienThoai dt = new DienThoai();
            System.out.println("Nhap ma:");
            dt.setMa(sc.nextLine());
            System.out.println("Nhap ten:");
            dt.setTen(sc.nextLine());
            System.out.println("Nhap thuong hieu:");
            dt.setThuongHieu(sc.nextLine());
            System.out.println("Nhap gia:");
            dt.setGia(Double.parseDouble(sc.nextLine()));
            
            mangDt[i] = dt;
        }
    }
    // Bai 2
    public void bai2() {
        for (int i = 0; i < mangDt.length; i++) {
            System.out.println("======");
            DienThoai dt = mangDt[i];
            dt.inThongTin();
        }
    }
    // Bai 3
    public void bai3() {
        DienThoai max = mangDt[0];
        for (int i = 1; i < mangDt.length; i++) {
            if (max.getGia() < mangDt[i].getGia()) {
                max = mangDt[i];
            }
        }
        max.inThongTin();
    }
}
