/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAY14;

import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyNhanVien servive = new QuanLyNhanVien();
        
        int ct;
        do {
            System.out.println("====MENU====");
            System.out.println("1. Nhập 1 danh sách đối tượng");
            System.out.println("2. Xuất danh sách đối tượng đã nhập");
            System.out.println("3. Xóa NV theo mã NV nhập vào");
            System.out.println("4. Tìm nhân viên theo mã NV nhập vào");
            System.out.println("5. Xuất danh sách NV theo khoảng lương nhập vào");
            System.out.println("6. Ke thua");
            System.out.println("7. Sap xep theo ma tang dan");
            System.out.println("Nhap chuong trinh can chay:");
            ct = Integer.parseInt(sc.nextLine());
            switch (ct) {
                case 1 -> {
                    servive.bai1();
                    break;
                }
                case 2 -> {
                    servive.bai2();
                    break;
                }
                case 3 -> {
                    servive.bai3();
                    break;
                }
                case 4 -> {
                    servive.bai4();
                    break;
                }
                case 5 -> {
                    servive.bai5();
                    break;
                }
                case 6 -> {
                    servive.bai6();
                    break;
                }
                case 7 -> {
                    servive.bai7();
                    break;
                }
                case 0 -> {
                    System.exit(0);
                }
            }
        } while (ct != 0);
    }
}
