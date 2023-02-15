/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author ThuyVT
 */
public class QuanLyNhanVien {
//    ArrayList<NhanVien> arr = new ArrayList<>();
    List<NhanVien> arr = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public QuanLyNhanVien() {
    }
    
    public void bai1() {
        int nhapNua;
        do {
//            NhanVien nv = new NhanVien();
            System.out.println("Nhap ten:");
            String ten = sc.nextLine();
            System.out.println("Nhap ma:");
            String ma = sc.nextLine();
            System.out.println("Nhap luong:");
            int luong  = Integer.parseInt(sc.nextLine());
            NhanVien nv = new NhanVien(ten, ma, luong);
            // Them doi tuong vao danh sach
            arr.add(nv);
            System.out.println("Ban co nhap tiep hay khong (1- co, 0- khong):");
            nhapNua = Integer.parseInt(sc.nextLine());
        } while (nhapNua == 1);
    }
    
    public void bai2() {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("Nhan vien thu" + (i+1));
            arr.get(i).inThongTin();
        }
    }
    
    public void bai3() {
        System.out.println("Nhap ma nhan vien can xoa");
        String ma = sc.nextLine();
        int index = getIndex(ma);
        if (index != -1) {
            // Xoa doi tuong
            arr.remove(index);
            System.out.println("Da xoa nhan vien ma " + ma);
        } else {
            System.out.println("Khong tim thay nhan vien trong ds");
        }
    }
    
    public void bai4() {
        System.out.println("Nhap ma nhan vien can tim");
        String ma = sc.nextLine();
        int index = getIndex(ma);
        if (index != -1) {
            // hien thi doi tuong tim duoc
            System.out.println("====Tim thay nhan vien====");
            arr.get(index).inThongTin();
            
        } else {
            System.out.println("Khong tim thay nhan vien trong ds");
        }
    }
    
    public int getIndex(String maNv) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getMa().trim().equalsIgnoreCase(maNv.trim()))  {
                return i;
            }
        }
        return -1;    
    }
    
    public void bai5() {
        System.out.println("Nhap vao khoang luong");
        System.out.println("Bat dau:");
        int luongBd = Integer.parseInt(sc.nextLine());
        System.out.println("Ket thuc:");
        int luongKt = Integer.parseInt(sc.nextLine());
        for (NhanVien nv : arr) {
            if (nv.tinhLuong() >= luongBd && nv.tinhLuong() <= luongKt) {
                nv.inThongTin();
            }
        }
    }
    
    public void bai6() {
        System.out.println("Nhap thong tin nhan vien bao ve");
        System.out.println("Nhap ten:");
        String ten = sc.nextLine();
        System.out.println("Nhap ma:");
        String ma = sc.nextLine();
        System.out.println("Nhap luong:");
        int luong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ca:");
        int ca = Integer.parseInt(sc.nextLine());
        NhanVien baoVe = new BaoVe(ca, ten, ma, luong);
        System.out.println("Thong tin bao ve la:");
        baoVe.inThongTin();
        System.out.println("Luong bao ve la:" + baoVe.tinhLuong());
    }
    
    public void bai7() {
        System.out.println("Sap xep danh sach nhan vien:");
        Collections.sort(arr);
        System.out.println("Danh sach sau sap xep la");
        bai2();
//          List<NhanVien> sort = arr.stream().sorted(Comparator.comparing(NhanVien::getTen)).collect(Collectors.toList());
//          for (NhanVien nv : sort) {
//            nv.inThongTin();
//        }
    }
}
